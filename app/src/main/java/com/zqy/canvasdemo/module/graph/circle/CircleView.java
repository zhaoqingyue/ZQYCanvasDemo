package com.zqy.canvasdemo.module.graph.circle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by zhaoqy on 2018/7/17.
 */

public class CircleView extends View {

    private Paint paint;

    public CircleView(Context context) {
        super(context);
        initPaint();
    }

    public CircleView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    public CircleView(Context context, AttributeSet attrs, int defStyleAttr) {
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
        canvas.drawCircle(500, 500, 400, paint);
    }
}
