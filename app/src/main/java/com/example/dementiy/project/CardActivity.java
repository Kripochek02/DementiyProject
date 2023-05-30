package com.example.dementiy.project;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dementiy.R;
import com.example.dementiy.project.Card;

import java.util.ArrayList;
import java.util.Random;
import android.os.Handler;

public class CardActivity extends AppCompatActivity {

    ArrayList<Card> cards = new ArrayList<Card>();
    ArrayList<Card> cards1 = new ArrayList<Card>();
    ArrayList<Card> botCards = new ArrayList<Card>();
    ArrayList<Card> botCards1 = new ArrayList<Card>();
    ArrayList<Card> boylist = new ArrayList<Card>();
    ArrayList<Card> playerSelectedCard = new ArrayList<Card>();
    private Card playerSelectedCard1;
    private Card playerSelectedCard2;
    private Card botSelectedCard;
    TextView botcardssize;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card2);
        RecyclerView recyclerView = findViewById(R.id.list);
        RecyclerView recyclerView2 = findViewById(R.id.boylist);
        TextView botcardssize = findViewById(R.id.botcardssize);
        setInitialData();
        botcardssize.setText("Количество карт бота: " + botCards.size());
        CardAdapter.OnCardClickListener cardClickListener = new CardAdapter.OnCardClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.P)
            @SuppressLint("NotifyDataSetChanged")
            @Override
            public void onCardClick(Card card, int position) throws InterruptedException {
                boylist.add(card);
                cards.remove(card);
                recyclerView.getAdapter().notifyDataSetChanged();
                recyclerView2.getAdapter().notifyDataSetChanged();

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Random random = new Random();
                        botSelectedCard = botCards.get(random.nextInt(botCards.size()));
                        boylist.add(botSelectedCard);
                        botCards.remove(botSelectedCard);
                        recyclerView.getAdapter().notifyDataSetChanged();
                        recyclerView2.getAdapter().notifyDataSetChanged();
                    }
                }, 3000);
                recyclerView.getAdapter().notifyDataSetChanged();
                recyclerView2.getAdapter().notifyDataSetChanged();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if (card.getLvl() > botSelectedCard.getLvl()) {
                            boylist.remove(botSelectedCard);
                            boylist.remove(card);
                            cards.add(card);
                            Toast.makeText(getApplicationContext(), "Ваша карта выиграла",
                                    Toast.LENGTH_SHORT).show();
                            recyclerView.getAdapter().notifyDataSetChanged();
                            recyclerView2.getAdapter().notifyDataSetChanged();
                        } else if (card.getLvl() == botSelectedCard.getLvl()){
                            boylist.remove(botSelectedCard);
                            boylist.remove(card);
                            Toast.makeText(getApplicationContext(), "Одинаковый уровень карт",
                                    Toast.LENGTH_SHORT).show();
                            recyclerView.getAdapter().notifyDataSetChanged();
                            recyclerView2.getAdapter().notifyDataSetChanged();
                        } else {
                            boylist.remove(botSelectedCard);
                            boylist.remove(card);
                            botCards.add(botSelectedCard);
                            Toast.makeText(getApplicationContext(), "Ваша карта проиграла",
                                    Toast.LENGTH_SHORT).show();
                            recyclerView.getAdapter().notifyDataSetChanged();
                            recyclerView2.getAdapter().notifyDataSetChanged();
                        }
                        botcardssize.setText("Количество карт бота:" + botCards.size());
                        recyclerView.getAdapter().notifyDataSetChanged();
                        recyclerView2.getAdapter().notifyDataSetChanged();
                    }
                }, 4000);
                if (botCards.size() == 0 && boylist.size() == 0) {
                    Toast.makeText(getApplicationContext(), "Вы выиграли",
                            Toast.LENGTH_SHORT).show();
                } else if (cards.size() == 0 && boylist.size() == 0) {
                    Toast.makeText(getApplicationContext(), "Вы проиграли",
                            Toast.LENGTH_SHORT).show();
                } else if (cards.size() == 0 && botCards.size() == 0) {
                    Toast.makeText(getApplicationContext(), "Ничья",
                            Toast.LENGTH_SHORT).show();
                }
                recyclerView.getAdapter().notifyDataSetChanged();
                recyclerView2.getAdapter().notifyDataSetChanged();
            }
        };
        CardAdapter adapter = new CardAdapter(cardClickListener, this, cards);
        BotCardAdapter adapter1 = new BotCardAdapter(this, botCards);
        BoyAdapter adapter2 = new BoyAdapter(this, boylist);
        recyclerView.setAdapter(adapter);
        recyclerView2.setAdapter(adapter2);
    }


    private void setInitialData() {
        Random random = new Random();
        cards.add(new Card("Вода", "Вода", random.nextInt(10)));
        cards.add(new Card("Огонь", "Огонь", random.nextInt(10)));
        cards.add(new Card("Земля", "Земля", random.nextInt(10)));
        cards.add(new Card("Воздух", "Воздух", random.nextInt(10)));
        cards.add(new Card("Лёд", "Лёд", random.nextInt(10)));
        botCards.add(new Card("Вода", "Вода", random.nextInt(10)));
        botCards.add(new Card("Огонь", "Огонь", random.nextInt(10)));
        botCards.add(new Card("Земля", "Земля", random.nextInt(10)));
        botCards.add(new Card("Воздух", "Воздух", random.nextInt(10)));
        botCards.add(new Card("Лёд", "Лёд", random.nextInt(10)));
    }


}
