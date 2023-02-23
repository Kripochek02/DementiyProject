
package com.example.dementiy.placeholder;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.example.dementiy.R;

public class Activity2 extends AppCompatActivity {
Button but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        this.but = findViewById(R.id.but);
        this.but.setBackgroundColor(Color.RED);
        Toast.makeText(Activity2.this, "Красный", Toast.LENGTH_SHORT).show();
    }
}