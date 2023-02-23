package com.example.dementiy.Class2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

import com.example.dementiy.R;

public class GameView extends View {
    private int viewWidth;
    private int viewHeight;
    private int points;
    private Paint paint = new Paint();
    private Sprite player, enemy;

    public GameView(Context context, Sprite player) {
        super(context);
        this.player = player;
        Bitmap b = BitmapFactory.decodeResource(getResources(), R.drawable.enemy);
        enemy = new Sprite(b, 1000, 500, -20, 0, player.getFrames().get(0));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawARGB(128, 0, 0, 255);
        paint.setColor(Color.WHITE);
        paint.setTextSize(150);
        canvas.drawText("" + points, viewWidth - 400, 110, paint);
        player.draw(canvas);
        enemy.draw(canvas);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        viewHeight = h;
        viewWidth = w;
    }
    public void update(){
        points++;
        player.update();
        enemy.update();
        if(player.intersect(enemy)){
            points -= 50;

            invalidate();
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction() == MotionEvent.ACTION_DOWN){
            if(event.getY() > player.getY()){
                player.setVelocityY(Math.abs(player.getVelocityY()));
            }
            else{
                player.setVelocityY(-Math.abs(player.getVelocityY()));
            }
        }
        return super.onTouchEvent(event);
    }
}
