package com.example.dementiy.Class2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dementiy.R;

public class PictureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new PictureView(this));
    }
}