package com.zqy.canvasdemo.module.graph.rect;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by zhaoqy on 2018/7/17.
 */

public class RectView extends View {

    private Paint paint;

    public RectView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    public RectView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }

    public RectView(Context context) {
        super(context);
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

        // 方法1：直接传入两个顶点的坐标
        // 两个顶点坐标分别是：（100,100），（800,800）
        canvas.drawRect(100, 100, 800, 800, paint);

        // 方法2：将两个顶点坐标封装为Rect
        // Rect rect = new Rect(100,100,200,200);
        // canvas.drawRect(rect, paint);

        // 方法3：将两个顶点坐标封装为RectF
        // RectF rectF = new RectF(100,100,200,200);
        // canvas.drawRect(rectF, paint);
    }
}
