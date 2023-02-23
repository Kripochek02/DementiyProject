package com.example.dementiy.placeholder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

import com.example.dementiy.R;

public class GameView1 extends View {
    private Sprite playerBird;
    private Paint paint = new Paint();
    private int points = 0;
    private int viewWidth;
    private int viewHeight;
    public Sprite player, enemy;
    public GameView1(Context context, Sprite sprite) {
        super(context);
        player = sprite;
        Bitmap b = BitmapFactory.decodeResource(getResources(), R.drawable.enemy);
        Rect r = player.getFrames().get(0);
        enemy = new Sprite(b, 1500, 500, -20, 0, r);
    }

    public GameView1(Context context) {
        super(context);
    }
    protected void onDraw(Canvas canvas) {
        paint.setColor(Color.argb(127,50,50,228));
        canvas.drawPaint(paint);
        paint.setColor(Color.WHITE);
        paint.setTextSize(100);
        canvas.drawText("" + points, getWidth() - 300, 100, paint);
        player.onDraw(canvas);
        enemy.onDraw(canvas);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
    }

        public void update(long ms){
            player.update(ms);
            enemy.update(ms);
            invalidate();
            points++;
        }

        @Override
        public boolean onTouchEvent (MotionEvent event){

            if (event.getAction() == MotionEvent.ACTION_UP) {
                if (event.getY() > player.getY()) {
                    player.setVelocityY(Math.abs(player.getVelocityY()));
                } else {
                    player.setVelocityY(-Math.abs(player.getVelocityY()));
                }
            }
            return super.onTouchEvent(event);
        }
    }
