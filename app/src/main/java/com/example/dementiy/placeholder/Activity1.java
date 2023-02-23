package com.example.dementiy.placeholder;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.dementiy.R;

public class Activity1 extends AppCompatActivity {
    Button Button;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activtiy1);
        this.Button = findViewById(R.id.Button);
        this.Button.setBackgroundColor(Color.BLACK);
        Toast.makeText(Activity1.this, "Черный", Toast.LENGTH_SHORT).show();
    }
}