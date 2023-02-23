package com.example.dementiy.Class2;

import android.content.Context;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import androidx.annotation.NonNull;

public class PictureView extends SurfaceView implements SurfaceHolder.Callback{
    PictureThread picture;
    public PictureView(Context context) {
        super(context);
        getHolder().addCallback(this);
    }

    @Override
    public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
        picture = new PictureThread(getHolder(), getContext());
        picture.start();
    }

    @Override
    public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
        picture.setStop(true);
        boolean stopped = false;
        while (!stopped) {
            try {
                picture.join();
                stopped = true;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        picture.setEventX((int) event.getX());
        picture.setEventY((int) event.getY());
        return super.onTouchEvent(event);
    }
}
