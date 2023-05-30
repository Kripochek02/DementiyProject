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


import java.util.ArrayList;
import java.util.List;

public class BotCardAdapter  extends RecyclerView.Adapter<BotCardAdapter.ViewHolder>{

    private final LayoutInflater inflater;
    private final List<Card> botCards;
    private Card playerSelectedCard;
    private Card botSelectedCard;

    public BotCardAdapter(Context context, ArrayList<Card> botCards) {
        this.botCards = botCards;
        this.inflater = LayoutInflater.from(context);
    }


    @Override
    public BotCardAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.cards_item, parent, false);

        return new ViewHolder(view);

    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Card botCard = botCards.get(position);
        holder.nameView.setText(botCard.getName());
        holder.lvlView.setText(botCard.getLvl() + "");
        holder.elementView.setText(botCard.getElement());

    }


    @Override
    public int getItemCount() {
        return botCards.size();
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
