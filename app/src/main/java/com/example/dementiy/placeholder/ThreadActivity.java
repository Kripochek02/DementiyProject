package com.example.dementiy.placeholder;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

import com.example.dementiy.R;

public class ThreadActivity extends AppCompatActivity {
    String str;
    TextView textView;
    Handler h;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.Text);
        Thread thread = new Thread(new AnotherRunnable());
        thread.start();
        h = new Handler() {
            @Override
            public void handleMessage(@NonNull Message msg) {
                textView.setText(str);
            }
        };

    }

    class AnotherRunnable implements Runnable {
        @Override
        public void run() {
                try{
                    Thread.sleep(2000);
                    str = "" + Math.random();
                    h.sendEmptyMessage(1);
                } catch(
                InterruptedException e)

                {
                  e.printStackTrace();
                }
        }
    }
}