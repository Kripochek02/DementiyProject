package com.example.dementiy.Class2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

import com.example.dementiy.R;

public class SamsungDraw extends View {
    Paint paint = new Paint();
    public SamsungDraw(Context context){
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(0, 0, canvas.getWidth(), 300, paint);
        paint.setColor(Color.WHITE);
        paint.setTextSize(100);
        canvas.drawText("Hello world!", 200, 50, paint);
        Bitmap b = BitmapFactory.decodeResource(getResources(), R.drawable.sitelogo);
        Rect src = new Rect(0, 0, b.getWidth(), b.getHeight());
        int w = getWidth();
        int h = getHeight();
        Rect dst = new Rect(w-300, h-50, w, h);
        canvas.drawBitmap(b, src, dst, paint);
        paint.setColor(Color.BLACK);
        paint.setTextSize(100);
        canvas.save();
        canvas.rotate(45);
        canvas.drawText("Hello world!", 200, 500, paint);
        canvas.restore();
    }
}
