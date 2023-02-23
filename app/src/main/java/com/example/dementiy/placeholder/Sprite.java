package com.example.dementiy.placeholder;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class Sprite {
    private Bitmap bitmap;
    private List<Rect> frames = new ArrayList<>();
    private int frameWidth;
    private int frameHeight;
    private int currentFrame;
    private double frameTime = 0.1;
    private double timeForCurrentFrame;

    private double x;
    private double y;

    private double velocityX;
    private double velocityY;

    private int padding = 20;
    private Canvas canvas;
    private Object teleport;

    public Sprite(Bitmap b, int x, int y, int vx, int vy, Rect init) {
        this.bitmap = b;
        this.x = x;
        this.y = y;
        this.velocityX = vx;
        this.velocityY = vy;
        frameWidth = init.width();
        frameHeight = init.height();

        for (int i = 0; i < 5; i++) {
            for(int j = 0; j <3; j++) {
                Rect r = new Rect(i*frameWidth, j * frameHeight, (i+1) * frameWidth, (j+1) * frameHeight);
                frames.add(r);
                if (i != 4 && j != 2) frames.add(r);


            }
        }
    }

    public void onDraw(Canvas canvas) {
        this.canvas = canvas;
        canvas.drawBitmap(bitmap, frames.get(currentFrame),
                new Rect((int) x,(int) y,(int) x + frameWidth, (int) (y+ frameHeight)  ),
                new Paint()
        );
    }

    public void update(long ms) {
        x += velocityX;
        y += velocityY;
        if (canvas != null) {
            if(x < 0) {
                this.teleport();
            }
            if (y > canvas.getHeight() - frameHeight || y <= 0) velocityY *= -1;
        }
        currentFrame++;
        currentFrame = currentFrame % frames.size();
    }
    public void teleport() {
        x = canvas.getWidth();
        y = canvas.getHeight() * Math.random();
    }

    public Rect getBoundingBoxRect () {
        return new Rect((int)x+padding, (int)y+padding, (int)(x + frameWidth - 2 *padding),
                (int)(y + frameHeight - 2* padding));
    }
    public boolean intersect (Sprite s) {
        return getBoundingBoxRect().intersect(s.getBoundingBoxRect());
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getVelocityY() {
        return velocityY;
    }

    public void setVelocityY(double velocityY) {
        this.velocityY = velocityY;
    }

    public void setFrames(List<Rect> frames) {
        this.frames = frames;
    }

    public List<Rect> getFrames() {
        return frames;
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }
}
