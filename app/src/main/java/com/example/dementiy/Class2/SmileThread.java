package com.example.dementiy.Class2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceHolder;

import com.example.dementiy.R;

public class SmileThread extends Thread{
    private boolean stop;
    private SurfaceHolder holder;
    private Context context;
    private int x = 100, y = 100;
    private int dx = 15;
    private int dy = 15;
    private int eventX = x;
    private int eventY = y;
    private Paint p = new Paint();
    {
        p.setColor(Color.BLUE);
        p.setStyle(Paint.Style.FILL);
    }
    public SmileThread(SurfaceHolder holder, Context ctx){
        this.holder = holder;
        this.context = ctx;
    }
    @Override
    public void run() {
        Bitmap b = BitmapFactory.decodeResource(context.getResources(), R.drawable.smile);
        int bw = b.getWidth();
        int bh = b.getHeight();
        while (!stop){
            Canvas canvas = holder.lockCanvas();
            if(canvas != null){
                canvas.drawColor(Color.BLUE);
                canvas.drawRect(0,0,0,0, p);
                if(eventX > x + bw/2) x+=dx;
                if(eventX < x + bw/2) x-=dx;
                if(eventY < y + bh/2) y-=dy;
                if(eventY > y + bh/2) y+=dy;
                canvas.drawBitmap(b, x, y, p);
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
