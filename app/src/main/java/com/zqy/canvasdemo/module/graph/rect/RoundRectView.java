package com.zqy.canvasdemo.module.graph.rect;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by zhaoqy on 2018/7/17.
 */

public class RoundRectView extends View {

    private Paint paint;

    public RoundRectView(Context context) {
        super(context);
        initPaint();
    }

    public RoundRectView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    public RoundRectView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }

    private void initPaint() {
        paint = new Paint();
        // 在绘制点之前，需要设置画笔的宽度，否则不能画出来
        paint.setStrokeWidth(10);
        // 设置画笔的样式，来指定所画的点的样式，圆形还是方形
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(Color.BLUE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = new RectF(100, 100, 800, 400);
        canvas.drawRoundRect(rectF, 30, 30, paint);
    }
}
