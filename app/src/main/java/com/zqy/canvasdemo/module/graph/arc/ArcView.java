package com.zqy.canvasdemo.module.graph.arc;

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

public class ArcView extends View {

    private Paint paint;

    public ArcView(Context context) {
        super(context);
        initPaint();
    }

    public ArcView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    public ArcView(Context context, AttributeSet attrs, int defStyleAttr) {
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
        // 绘制圆弧1(无使用中心)
        RectF rectF = new RectF(100, 100, 800,400);
        // 绘制背景矩形
        canvas.drawRect(rectF, paint);
        // 绘制圆弧
        paint.setColor(Color.RED);
        canvas.drawArc(rectF, 0, 90, false, paint);

        // 绘制圆弧2(使用中心)
        RectF rectF2 = new RectF(100, 600, 800, 900);
        // 绘制背景矩形
        paint.setColor(Color.BLUE);
        canvas.drawRect(rectF2, paint);
        // 绘制圆弧
        paint.setColor(Color.RED);
        canvas.drawArc(rectF2, 0, 90, true, paint);
    }
}
