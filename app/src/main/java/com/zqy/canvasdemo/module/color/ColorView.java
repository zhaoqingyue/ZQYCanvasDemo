package com.zqy.canvasdemo.module.color;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by zhaoqy on 2018/7/17.
 */

public class ColorView extends View {

    private int type = 0;

    public ColorView(Context context) {
        super(context);
    }

    public ColorView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ColorView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        switch (type) {
            case 1:{
                canvas.drawColor(Color.BLUE);
                break;
            }
            case 2:{
                canvas.drawRGB(0, 255, 0);
                break;
            }
            case 3:{
                canvas.drawARGB(255, 255, 0, 0);
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
        // requestLayout();
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
