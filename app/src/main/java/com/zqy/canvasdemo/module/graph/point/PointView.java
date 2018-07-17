package com.zqy.canvasdemo.module.graph.point;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by zhaoqy on 2018/7/17.
 */

public class PointView extends View {

    private Paint paint;
    private int type = 0;

    public PointView(Context context) {
        super(context);
        initPaint();
    }

    public PointView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    public PointView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }

    private void initPaint() {
        paint = new Paint();
        // 在绘制点之前，需要设置画笔的宽度，否则不能画出来
        paint.setStrokeWidth(10);
        // 设置画笔的样式，来指定所画的点的样式，圆形还是方形
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        switch (type) {
            case 1:{
                // 描绘一个点
                // 坐标(200,200)
                paint.setColor(Color.BLUE);
                canvas.drawPoint(200, 200, paint);
                break;
            }
            case 2:{
                // 绘制一组点，坐标位置由float数组指定
                // 此处画了3个点，位置分别是：（400, 400）、（400,500）、（400,600）
                paint.setColor(Color.RED);
                canvas.drawPoints(new float[]{
                        400, 400,
                        400, 500,
                        400, 600
                }, paint);
                break;
            }
        }
    }

    public void update(int type) {
        this.type = type;

        /**
         * requestLayout()
         * view 会执行 onMeasure（先）及 onLayout（后）方法
         */
         requestLayout();
        /**
         *  invalidate()
         *  view 会调用 onDraw()方法
         */
        invalidate();

        /**
         * 注意：
         * 先调用 requestLayout()方法，再调用 invalidate()方法
         *
         * 若只改变宽高调用 requestLayout() 方法即可
         * 若只更新内容调用 invalidate()方法
         */
    }
}
