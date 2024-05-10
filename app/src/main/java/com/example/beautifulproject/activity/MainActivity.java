package com.example.beautifulproject.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.beautifulproject.R;
import com.example.beautifulproject.fragments.ActivityFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.container , new ActivityFragment()).commit();
    }
}