package com.example.dementiy.placeholder;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.dementiy.R;

public class Activity6 extends AppCompatActivity {
Button but2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);
        this.but2 = findViewById(R.id.but2);
        this.but2.setBackgroundColor(Color.RED);
        Toast.makeText(Activity6.this, "Красный", Toast.LENGTH_SHORT).show();
    }
}