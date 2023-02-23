package com.example.dementiy.Class2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceHolder;

import com.example.dementiy.R;

public class PictureThread extends Thread{
    private boolean stop;
    private SurfaceHolder holder;
    private Context context;
    private int x = 100, y = 100;
    private int dx = 15;
    private int dy = 15;
    private int eventX = x;
    private int eventY = y;
    private Paint p = new Paint();
    public PictureThread(SurfaceHolder holder, Context ctx){
        this.holder = holder;
        this.context = ctx;
    }

    @Override
    public void run() {
        while (!stop) {
            Canvas canvas = holder.lockCanvas();
            if (canvas != null) {
                canvas.drawColor(Color.BLUE);
                p.setColor(Color.GREEN);
                canvas.drawRect(0, 1200, 2000, 2500,p);
                p.setColor(Color.DKGRAY);
                canvas.drawRect(50, 400, 500, 1400, p);
                p.setColor(Color.YELLOW);
                canvas.drawOval(800, -100, 1200, 300, p);
                p.setColor(Color.BLUE);
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

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getEventX() {
        return eventX;
    }

    public void setEventX(int eventX) {
        this.eventX = eventX;
    }

    public int getEventY() {
        return eventY;
    }

    public void setEventY(int eventY) {
        this.eventY = eventY;
    }
}
