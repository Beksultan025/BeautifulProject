package com.example.beautifulproject.recycler_view;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.beautifulproject.R;

import java.util.ArrayList;

public class CrushIsAdapter extends RecyclerView.Adapter<CrushIsViewHolder> {

    private final ArrayList<Integer> lists;
    public CrushIsAdapter(ArrayList<Integer> lists) {
        this.lists = lists;
    }

    @NonNull
    @Override
    public CrushIsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CrushIsViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_image , parent , false));
    }

    @Override
    public void onBindViewHolder(@NonNull CrushIsViewHolder holder, int position) {
        holder.bind(lists.get(position));
    }

    @Override
    public int getItemCount() {
        return lists.size();
    }
}
