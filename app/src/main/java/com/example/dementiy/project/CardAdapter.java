package com.example.dementiy.project;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.dementiy.R;

import java.util.List;

public class CardAdapter  extends RecyclerView.Adapter<CardAdapter.ViewHolder>{



    interface OnCardClickListener{
        void onCardClick(Card card, int position) throws InterruptedException;

    }
    private final OnCardClickListener onClickListener;
    private final LayoutInflater inflater;
    private List<Card> cards;
    private List<Card> cards1;
    private List<Card> botCards;
    private Card playerSelectedCard;
    private Card botSelectedCard;
    CardAdapter adapter;

    CardAdapter(OnCardClickListener onClickListener, Context context, List<Card> cards) {
        this.onClickListener = onClickListener;
        this.cards = cards;
        this.inflater = LayoutInflater.from(context);
    }


    @Override
    public CardAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.cards_item, parent, false);


        return new ViewHolder(view);

    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Card card = cards.get(position);
        holder.nameView.setText(card.getName());
        holder.lvlView.setText(card.getLvl() + "");
        holder.elementView.setText(card.getElement());
        holder.itemView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                try {
                    onClickListener.onCardClick(card, position);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });
    }


    @Override
    public int getItemCount() {
        return cards.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView card;
        final TextView nameView, elementView, lvlView;

        ViewHolder(View view){
            super(view);
            card = view.findViewById(R.id.card);
            nameView = view.findViewById(R.id.name);
            elementView = view.findViewById(R.id.element);
            lvlView = view.findViewById(R.id.lvl);

        }
    }


}