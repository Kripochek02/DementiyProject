package com.example.dementiy.Class2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.CountDownTimer;

import java.util.ArrayList;
import java.util.List;

public class Sprite {
    private Bitmap bitmap;
    private List<Rect> frames;
    private int frameWidth = 110;
    private int frameHeight = 100;
    private int currentFrame = 0;
    private double frameTime = 20;
    private double timeForCurrentFrame;

    private double x;
    private double y;

    private double velocityX;
    private double velocityY;
    private Canvas canvas;
    private int padding;
    public Sprite(Bitmap b, double x, double y, double vx, double vy, Rect init){
        this.bitmap = b;
        frames = new ArrayList<>();
        this.x = x;
        this.y = y;
        this.velocityX = vx;
        this.velocityY = vy;
        frameWidth = init.width();
        frameHeight = init.height();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                Rect r = new Rect(j * frameWidth, i * frameHeight,
                        (j+1) * frameWidth, (i + 1) * frameHeight);
                if(i != 2 && j != 4) frames.add(r);
            }

        }
    }
    public void draw(Canvas canvas){
        canvas.drawBitmap(bitmap, frames.get(currentFrame), new Rect((int)x, (int)y, (int)(x+ frameWidth), (int) (frameHeight + y)), new Paint());
        this.canvas = canvas;
    }
    public void update() {
        x += velocityX;
        y += velocityY;
        if(canvas != null){
            if(y > canvas.getHeight() - frameHeight || y <= 0){
                velocityY *= -1;
            }
            if(x < -frameWidth){
                teleport();
            }
        }
        currentFrame++;
        currentFrame = currentFrame % frames.size();
    }

    private void teleport() {
        x = canvas.getWidth();
        y = canvas.getHeight() * Math.random();
    }

    public List<Rect> getFrames() {
        return frames;
    }

    public void setFrames(List<Rect> frames) {
        this.frames = frames;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getVelocityX() {
        return velocityX;
    }

    public void setVelocityX(double velocityX) {
        this.velocityX = velocityX;
    }

    public double getVelocityY() {
        return velocityY;
    }

    public void setVelocityY(double velocityY) {
        this.velocityY = velocityY;
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }
    public Rect getBoundingBoxRect(){
        return new Rect(
                (int)(x+padding),
                (int)(y+padding),
                (int)(x+ frameWidth - 2*padding),
                (int)(y+ frameHeight - 2*padding)
        );
    }
    public final boolean intersect(Sprite s) {
        return s.getBoundingBoxRect().intersect(this.getBoundingBoxRect());
    }
}
