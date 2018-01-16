package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint = new Paint();
    Path path = new Path();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        int pointX = getWidth() / 2;
        int pointY = getHeight() / 2;

        int x = 1000;
        int y = 600;

        int startX = pointX - x / 2;
        int startY = pointY + y / 2;

        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(2);

        float[] lineX = new float[]{startX, startY, pointX - x / 2, pointY - y / 2};
        float[] lineY = new float[]{startX, startY, pointX + x / 2, pointY + y / 2};

        float[] XY = new float[]{lineX[0], lineX[1], lineX[2], lineX[3],
                lineY[0], lineY[1], lineY[2], lineY[3]};

        canvas.drawLines(XY, paint);

        paint.setTextSize(40);
        String[] sdk = new String[]{"F", "G", "I", "J", "K", "L", "M"};

        canvas.drawText(sdk[0], startX + (1000 / 8), startY + 30, paint);
        canvas.drawText(sdk[1], startX + (1000 / 8) * 2, startY + 30, paint);
        canvas.drawText(sdk[2], startX + (1000 / 8) * 3, startY + 30, paint);
        canvas.drawText(sdk[3], startX + (1000 / 8) * 4, startY + 30, paint);
        canvas.drawText(sdk[4], startX + (1000 / 8) * 5, startY + 30, paint);
        canvas.drawText(sdk[5], startX + (1000 / 8) * 6, startY + 30, paint);
        canvas.drawText(sdk[6], startX + (1000 / 8) * 7, startY + 30, paint);


        float[] sdkPercent = new float[]{0.01f, 0.03f, 0.03f, 0.16f, 0.27f, 0.34f, 0.16f};
        float[] lines = new float[]{
                startX + (1000 / 8), startY, startX + (1000 / 8), startY - y * 2 * sdkPercent[0],
                startX + (1000 / 8) * 2, startY, startX + (1000 / 8) * 2, startY - y * 2 * sdkPercent[1],
                startX + (1000 / 8) * 3, startY, startX + (1000 / 8) * 3, startY - y * 2 * sdkPercent[2],
                startX + (1000 / 8) * 4, startY, startX + (1000 / 8) * 4, startY - y * 2 * sdkPercent[3],
                startX + (1000 / 8) * 5, startY, startX + (1000 / 8) * 5, startY - y * 2 * sdkPercent[4],
                startX + (1000 / 8) * 6, startY, startX + (1000 / 8) * 6, startY - y * 2 * sdkPercent[5],
                startX + (1000 / 8) * 7, startY, startX + (1000 / 8) * 7, startY - y * 2 * sdkPercent[6],
        };

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(100);

        canvas.drawLines(lines, paint);
    }
}
