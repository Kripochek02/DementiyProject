package com.example.dementiy.placeholder;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.CountDownTimer;

import com.example.dementiy.R;

public class DrawActivity1 extends AppCompatActivity {
private Sprite s;
private GameView1 gv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar bar = getSupportActionBar();
        if (bar != null) bar.hide();
        Bitmap frames = BitmapFactory.decodeResource(getResources(), R.drawable.player);
        s = new Sprite(frames, 0, 500, 0, 20, new Rect(0, 0, frames.getWidth()/5, frames.getHeight() / 3));
        setContentView(gv = new GameView1(this, s));
        Timer t = new Timer(Long.MAX_VALUE, 100);
        t.start();
    }
    class Timer extends CountDownTimer {

        public Timer(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long l) {
            gv.update(l);
        }

        @Override
        public void onFinish() {

        }
    }
}