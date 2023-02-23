package com.example.dementiy.placeholder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

import com.example.dementiy.R;

public class SamsungView extends View {
    private Paint paint = new Paint();
    public SamsungView(Context context) {
        super(context);
    }
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        int[] data = {100, 400, 150, 50, 300, 200, 250};
        //int step = paint() / data.
        paint.setColor(Color.BLUE);
        canvas.drawRect(0,0, getWidth(), 500, paint);
        paint.setColor((Color.WHITE));
        paint.setTextSize(150);
        canvas.drawText("Hello world", 0, 250, paint);
        Bitmap b = BitmapFactory.decodeResource(getResources(), R.drawable.player);
        int w = b.getWidth();
        int h = b.getHeight();
        Rect src = new Rect(551, 304, w, h);
        Rect dest = new Rect(getWidth() - 551, getHeight() - 304,  getWidth(), getHeight());
        canvas.drawBitmap(b, src, dest , paint);
        canvas.save();
        canvas.rotate(45);
        paint.setColor(Color.BLACK);
        canvas.drawText("Hello world", 0, 250, paint);
        canvas.restore();

    }
}
