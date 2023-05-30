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

public class BoyAdapter  extends RecyclerView.Adapter<BoyAdapter.ViewHolder>{
    private final LayoutInflater inflater;
    private final List<Card> boylist;
    public BoyAdapter(Context context, ArrayList<Card> boylist) {
        this.boylist = boylist;
        this.inflater = LayoutInflater.from(context);
    }
    @Override
    public BoyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.cards_item, parent, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Card fyight = boylist.get(position);
        holder.nameView.setText(fyight.getName());
        holder.lvlView.setText(fyight.getLvl() + "");
        holder.elementView.setText(fyight.getElement() + "");
    }
    @Override
    public int getItemCount() {
        return boylist.size();
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

