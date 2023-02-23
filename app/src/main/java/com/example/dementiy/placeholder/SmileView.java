package com.example.dementiy.placeholder;

import android.content.Context;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import androidx.annotation.NonNull;

public class SmileView extends SurfaceView implements SurfaceHolder.Callback {
    private SmiltThread smiltThread;
    public SmileView(Context context){
        super(context);
        getHolder().addCallback(this);
    }

    @Override
    public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
        smiltThread = new SmiltThread(surfaceHolder, getContext());
        smiltThread.start();
    }

    @Override
    public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
        smiltThread.setStop(true);
        boolean stopped = false;
        while (!stopped) {
            try {
                smiltThread.join();
                stopped = true;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        smiltThread.setEventX((int) event.getX());
        smiltThread.setEventY((int) event.getY());
        return super.onTouchEvent(event);
    }
}
