package com.example.dementiy.placeholder;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dementiy.R;

public class StartActivity extends AppCompatActivity {
    Button button;
    Button but;
    Button but2;
    Button but3;
    Button but4;
    Button but5;

    public void action(View v) {
        switch(v.getId()) {
            case(R.id.Button):
                Intent i = new Intent(getBaseContext(), LessonActivity.class);
                this.startActivity(i);
            break;
            case(R.id.but):
                Intent b = new Intent(getBaseContext(), Activity1.class);
                this.startActivity(b);
                break;
            case(R.id.but2):
                Intent c = new Intent(getBaseContext(), Activity2.class);
                this.startActivity(c);
                break;
            case(R.id.but3):
                Intent d = new Intent(getBaseContext(), Activity3.class);
                this.startActivity(d);
                break;
            case(R.id.but4):
                Intent g = new Intent(getBaseContext(), Activity4.class);
                this.startActivity(g);
                break;
            case(R.id.but5):
                Intent a = new Intent(getBaseContext(), Activity3.class);
                this.startActivity(a);
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        this.button = findViewById(R.id.Button);
        this.button.setOnClickListener(this::action);
        this.but = findViewById(R.id.but);
        this.but.setOnClickListener(this::action);
        this.but2 = findViewById(R.id.but2);
        this.but2.setOnClickListener(this::action);
        this.but3 = findViewById(R.id.but3);
        this.but3.setOnClickListener(this::action);
        this.but4 = findViewById(R.id.but4);
        this.but4.setOnClickListener(this::action);
        this.but5 = findViewById(R.id.but5);
        this.but5.setOnClickListener(this::action);
    }
}