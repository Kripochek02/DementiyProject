package com.example.dementiy.placeholder;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.dementiy.R;

public class Activity5 extends AppCompatActivity {
Button but1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
        this.but1 = findViewById(R.id.but1);
        this.but1.setBackgroundColor(Color.RED);
        Toast.makeText(Activity5.this, "Красный", Toast.LENGTH_SHORT).show();
    }
}