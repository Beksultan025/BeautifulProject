package com.example.beautifulproject.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.beautifulproject.R;


public class ActivityFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_activty, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Button btnNext = requireActivity().findViewById(R.id.btn_next);

        btnNext.setOnClickListener(view1 -> requireActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.container , new SecondFragment()).addToBackStack(null).commit());

    }
}