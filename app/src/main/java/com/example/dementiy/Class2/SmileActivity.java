package com.example.dementiy.Class2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SmileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new SmileView(this));
    }
}