package com.example.project5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AppleAdapter extends RecyclerView.Adapter<AppleAdapter.AppleViewHolder> {

    private Context context;
    private ArrayList<Apple> appleList;

    public AppleAdapter(Context context, ArrayList<Apple> appleList) {
        this.context = context;
        this.appleList = appleList;
    }

    @NonNull
    @Override
    public AppleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_apple, parent, false);
        return new AppleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AppleViewHolder holder, int position) {
        Apple apple = appleList.get(position);
        holder.textView.setText(apple.getName());
        holder.imageView.setImageResource(apple.getImageResource());
    }

    @Override
    public int getItemCount() {
        return appleList.size();
    }

    public static class AppleViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;

        public AppleViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textViewApple);
            imageView = itemView.findViewById(R.id.imageViewApple);
        }
    }
}
