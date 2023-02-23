package com.example.dementiy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {
    TextView emailTV;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Intent receIvedConvert = this.getIntent();
        String receIvedEmail = receIvedConvert.getStringExtra("Email");
        emailTV = findViewById(R.id.emailTV);
        emailTV.setText(receIvedEmail);

    }
}