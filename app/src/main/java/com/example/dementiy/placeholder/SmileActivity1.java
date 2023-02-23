package com.example.dementiy.placeholder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.SurfaceView;

import com.example.dementiy.Class2.SmileThread;
import com.example.dementiy.R;

public class SmileActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new SmileView(this));
    }
}