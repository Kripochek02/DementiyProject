package com.example.dementiy.Class2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Window;

import com.example.dementiy.R;
import com.example.dementiy.placeholder.GameView1;

public class DrawActivity extends AppCompatActivity {
    private GameView1 gv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        ActionBar ab = getSupportActionBar();
        if(ab != null){
            ab.hide();
        }


        Bitmap b = BitmapFactory.decodeResource(getResources(), R.drawable.player);
        Rect init = new Rect(0, 0, b.getWidth(), b.getHeight());
        Sprite p = new Sprite(b, 0, 300, 0, 20, init);
        setContentView(new GameView(this, p));
        Timer t = new Timer();
        t.start();
    }

    class Timer extends CountDownTimer {
        public Timer(){
            super(Long.MAX_VALUE, 40);
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