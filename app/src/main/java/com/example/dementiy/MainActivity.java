package com.example.dementiy;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onStart() {
        super.onStart();
        System.out.println("started");
    }

    @Override

    protected void onPause() {
        super.onPause();;
        System.out.println("paused");
        System.out.println(getResources().getColor(R.color.purple_700));
        System.out.println(R.string.app_name);
        System.out.println(getResources().getString(R.string.app_name));
        Toast.makeText(this, "paused", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("resume");
        Toast.makeText(this, "resumed", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("destroyed");
    }
}

