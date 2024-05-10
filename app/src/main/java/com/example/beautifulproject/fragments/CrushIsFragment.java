package com.example.beautifulproject.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.beautifulproject.R;
import com.example.beautifulproject.recycler_view.CrushIsAdapter;

import java.util.ArrayList;

public class CrushIsFragment extends Fragment {

    private final ArrayList<Integer> lists = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_crush_is, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        loadData();
        CrushIsAdapter adapter = new CrushIsAdapter(lists);
        RecyclerView rvImage = requireActivity().findViewById(R.id.rv_image);
        rvImage.setAdapter(adapter);

    }

    private void loadData() {
        lists.add(R.drawable.beksultan);
        lists.add(R.drawable.beks);
        lists.add(R.drawable.beks_admins);
        lists.add(R.drawable.beka_admin);
        lists.add(R.drawable.beka_teams);
        lists.add(R.drawable.beksultan_is_teams);
    }

}