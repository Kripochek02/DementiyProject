package com.example.dementiy.Class2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.dementiy.R;

public class SamsungFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samsung_fragment);
        LinearLayout l = findViewById(R.id.container);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        FragmentCheck fragment = FragmentCheck.newInstance("female", "male");
        ft.add(R.id.container, fragment);
        ft.commit();
    }
}