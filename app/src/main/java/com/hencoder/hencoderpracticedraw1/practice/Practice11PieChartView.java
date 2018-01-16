package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint = new Paint();
    Path path = new Path();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        int pointX = getWidth() / 2;
        int pointY = getHeight() / 2;

        double[] sdkPercent = new double[]{0.01, 0.03, 0.03, 0.16, 0.27, 0.34, 0.16};
        String[] sdk = new String[]{"Froyo", "Gingerbread", "Ice Cream Sandwich", "Jelly Bean", "KitKat", "Lollipop", "Marshmallow"};

        RectF normalArc = new RectF(pointX - 300, pointY - 300, pointX + 300, pointY + 300);
        int normalRedius = 300;

        RectF mostArc = new RectF(pointX - 340, pointY - 340, pointX + 280, pointY + 280);
        int mostRedius = 320;

        float startAngle = 0;

        double tempY = 0;
        double tempX = 0;

        paint.setColor(Color.parseColor("#3f51b5"));
        canvas.drawArc(normalArc, startAngle - 1, (float) (360 * sdkPercent[0]) - 1, true, paint);
        startAngle += 360 * sdkPercent[0];
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
        paint.setTextSize(40);

        tempY = normalRedius * (Math.sin(Math.toRadians(360 * sdkPercent[0] / 2)));
        tempX = normalRedius * (Math.cos(Math.toRadians(360 * sdkPercent[0] / 2)));
        path.moveTo(pointX + (float) tempX, pointY + (float) tempY);
        path.lineTo(pointX + (float) tempX + 20, pointY + (float) tempY + 20);
        path.lineTo(pointX + (float) tempX + 90, pointY + (float) tempY + 20);
        canvas.drawPath(path, paint);
        canvas.drawText(sdk[0], pointX + (float) tempX + 100, pointY + (float) tempY + 20, paint);

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#303f9f"));
        canvas.drawArc(normalArc, startAngle - 1, (float) (360 * sdkPercent[1]) - 1, true, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
        tempY = normalRedius * (Math.sin(Math.toRadians(startAngle + 360 * sdkPercent[1] / 2)));
        tempX = normalRedius * (Math.cos(Math.toRadians(startAngle + 360 * sdkPercent[1] / 2)));
        startAngle += 360 * sdkPercent[1];
        path.moveTo(pointX + (float) tempX, pointY + (float) tempY);
        path.lineTo(pointX + (float) tempX + 20, pointY + (float) tempY + 20);
        path.lineTo(pointX + (float) tempX + 90, pointY + (float) tempY + 20);
        canvas.drawPath(path, paint);
        canvas.drawText(sdk[1], pointX + (float) tempX + 100, pointY + (float) tempY + 20, paint);

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#808080"));
        canvas.drawArc(normalArc, startAngle - 1, (float) (360 * sdkPercent[2]) - 1, true, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
        tempY = normalRedius * (Math.sin(Math.toRadians(startAngle + 360 * sdkPercent[2] / 2)));
        tempX = normalRedius * (Math.cos(Math.toRadians(startAngle + 360 * sdkPercent[2] / 2)));
        startAngle += 360 * sdkPercent[2];
        path.moveTo(pointX + (float) tempX, pointY + (float) tempY);
        path.lineTo(pointX + (float) tempX + 20, pointY + (float) tempY + 20);
        path.lineTo(pointX + (float) tempX + 90, pointY + (float) tempY + 20);
        canvas.drawPath(path, paint);
        canvas.drawText(sdk[2], pointX + (float) tempX + 100, pointY + (float) tempY + 20, paint);

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#19d0a2"));
        canvas.drawArc(normalArc, startAngle - 1, (float) (360 * sdkPercent[3]) - 1, true, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
        tempY = normalRedius * (Math.sin(Math.toRadians(startAngle + 360 * sdkPercent[3] / 2)));
        tempX = normalRedius * (Math.cos(Math.toRadians(startAngle + 360 * sdkPercent[3] / 2)));
        startAngle += 360 * sdkPercent[3];
        path.moveTo(pointX + (float) tempX, pointY + (float) tempY);
        path.lineTo(pointX + (float) tempX + 20, pointY + (float) tempY + 20);
        path.lineTo(pointX + (float) tempX + 90, pointY + (float) tempY + 20);
        canvas.drawPath(path, paint);
        canvas.drawText(sdk[3], pointX + (float) tempX + 100, pointY + (float) tempY + 20, paint);

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#38acff"));
        canvas.drawArc(normalArc, startAngle - 1, (float) (360 * sdkPercent[4]) - 1, true, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
        tempY = normalRedius * (Math.sin(Math.toRadians(startAngle + 360 * sdkPercent[4] / 2)));
        tempX = normalRedius * (Math.cos(Math.toRadians(startAngle + 360 * sdkPercent[4] / 2)));
        startAngle += 360 * sdkPercent[4];
        path.moveTo(pointX + (float) tempX, pointY + (float) tempY);
        path.lineTo(pointX + (float) tempX - 20, pointY + (float) tempY + 20);
        path.lineTo(pointX + (float) tempX - 90, pointY + (float) tempY + 20);
        canvas.drawPath(path, paint);
        canvas.drawText(sdk[4], pointX + (float) tempX - 240, pointY + (float) tempY + 20, paint);

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#ff4444"));
        canvas.drawArc(mostArc, startAngle - 1, (float) (360 * sdkPercent[5]) - 1, true, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
        tempY = mostRedius * (Math.sin(Math.toRadians(startAngle + 360 * sdkPercent[5] / 2)));
        tempX = mostRedius * (Math.cos(Math.toRadians(startAngle + 360 * sdkPercent[5] / 2)));
        startAngle += 360 * sdkPercent[5];
        path.moveTo(pointX - 20 + (float) tempX, pointY - 20 + (float) tempY);
        path.lineTo(pointX + (float) tempX - 80, pointY + (float) tempY - 40);
        path.lineTo(pointX + (float) tempX - 150, pointY + (float) tempY - 40);
        canvas.drawPath(path, paint);
        canvas.drawText(sdk[5], pointX + (float) tempX - 300, pointY + (float) tempY - 40, paint);

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#fff344"));
        canvas.drawArc(normalArc, startAngle - 1, (float) (360 * sdkPercent[6]) - 1, true, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
        tempY = normalRedius * (Math.sin(Math.toRadians(startAngle + 360 * sdkPercent[6] / 2)));
        tempX = normalRedius * (Math.cos(Math.toRadians(startAngle + 360 * sdkPercent[6] / 2)));
        path.moveTo(pointX + (float) tempX, pointY + (float) tempY);
        path.lineTo(pointX + (float) tempX + 20, pointY + (float) tempY - 20);
        path.lineTo(pointX + (float) tempX + 90, pointY + (float) tempY - 20);
        canvas.drawPath(path, paint);
        canvas.drawText(sdk[6], pointX + (float) tempX + 100, pointY + (float) tempY - 20, paint);
    }
}
