package com.example.dementiy.placeholder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceHolder;

import com.example.dementiy.Class2.SmileThread;
import com.example.dementiy.R;

public class SmiltThread extends Thread {
    private final Context context;
    private SurfaceHolder holder;
    private boolean stop;
    private int x = 100;
    private int y = 100;
    private int eventX = x;
    private int eventY = y;
    private int dx = 10;

    public SmiltThread(SurfaceHolder holder, Context context) {
        this.holder = holder;
        this.context = context;
    }
    @Override
    public void run() {
        Bitmap b = BitmapFactory.decodeResource(context.getResources(), R.drawable.smile);
        while(!stop) {
            Canvas canvas = holder.lockCanvas();
            if (canvas != null) {
                canvas.drawColor(Color.BLUE);
                if (eventX > x) x += dx;
                if (eventX > x) x -= dx;
                if (eventY > y) y += dx;
                if (eventY > y) y -= dx;
                canvas.drawBitmap(b,x - b.getWidth()/2,y - b.getHeight()/2, new Paint());
                holder.unlockCanvasAndPost(canvas);
            }
        }
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    public int getEventY() {
        return eventY;
    }

    public void setEventY(int eventY) {
        this.eventY = eventY;
    }

    public int getEventX() {
        return eventX;
    }

    public void setEventX(int eventX) {
        this.eventX = eventX;
    }
}
