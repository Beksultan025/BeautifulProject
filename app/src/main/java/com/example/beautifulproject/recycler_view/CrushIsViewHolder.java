package com.example.beautifulproject.recycler_view;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.beautifulproject.R;

public class CrushIsViewHolder extends RecyclerView.ViewHolder {
    private final ImageView pictures;
    public CrushIsViewHolder(@NonNull View itemView) {
        super(itemView);
        pictures = itemView.findViewById(R.id.img_picture);
    }

    public void bind(Integer picture){
        pictures.setImageResource(picture);
        pictures.setOnClickListener(view -> {

        });
    }
}
