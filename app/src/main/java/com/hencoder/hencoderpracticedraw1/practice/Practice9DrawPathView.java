package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint = new Paint();
    Path path = new Path();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形
        int pointX = getWidth() / 2;
        int pointY = getHeight() / 2;

        RectF lHeart = new RectF(pointX - 200, pointY - 100, pointX, pointY + 100);
        path.addArc(lHeart, 0, -225);
        path.lineTo(pointX, pointY + 250);
        path.moveTo(pointX, pointY);

        RectF rHeart = new RectF(pointX, pointY - 100, pointX + 200, pointY + 100);
        path.addArc(rHeart, -180, 225);
        path.lineTo(pointX, pointY + 250);
        path.close();

        canvas.drawPath(path, paint);
    }
}
