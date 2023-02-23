package com.example.dementiy.placeholder;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dementiy.R;

public class LessonActivity extends AppCompatActivity {
    Button ded;
    Button sas;
    TextView gdg;
    TextView olo;
    TextView pdp;
    Button btn = findViewById(R.id.button);
    EditText et = findViewById(R.id.editText);
    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);
        this.ded = findViewById(R.id.ded);
        this.sas = findViewById(R.id.sas);
        this.ded.setOnClickListener(this::action);
        this.sas.setOnClickListener(this::action);
        String text = et.getText().toString();
    }

    public void action(View v) {
        switch (v.getId()) {
            case R.id.ded:
                ded.setBackgroundColor(Color.RED);
                Toast.makeText(this, "овыофывл", Toast.LENGTH_SHORT).show();
                break;
            case R.id.sas:
                sas.setBackgroundColor(Color.BLACK);
                Toast.makeText(LessonActivity.this, "gfd", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}