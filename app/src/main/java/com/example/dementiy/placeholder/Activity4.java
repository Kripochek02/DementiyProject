package com.example.dementiy.placeholder;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.dementiy.R;

public class Activity4 extends AppCompatActivity {
Button but5;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        this.but5 = findViewById(R.id.but5);
        this.but5.setBackgroundColor(Color.BLACK);
        Toast.makeText(Activity4.this, "Черный", Toast.LENGTH_SHORT).show();
    }
}