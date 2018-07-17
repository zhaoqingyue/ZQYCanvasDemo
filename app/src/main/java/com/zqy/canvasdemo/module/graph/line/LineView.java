package com.zqy.canvasdemo.module.graph.line;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by zhaoqy on 2018/7/17.
 */

public class LineView extends View {

    private Paint paint;
    private int type = 0;

    public LineView(Context context) {
        super(context);
        initpaint();
    }

    public LineView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initpaint();
    }

    public LineView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initpaint();
    }

    private void initpaint() {
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
                // 画一条直线
                // 在坐标(100,200)，(700,200)之间绘制一条直线
                paint.setColor(Color.BLUE);
                canvas.drawLine(100, 200, 700, 200, paint);
                break;
            }
            case 2:{

                // 绘制一组线
                // 在坐标(400, 500)，(500, 500)之间绘制直线1
                // 在坐标(400, 600)，(500, 600)之间绘制直线2
                paint.setColor(Color.RED);
                canvas.drawLines(new float[]{
                        400, 500, 500, 500,
                        400, 600, 500, 600
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
