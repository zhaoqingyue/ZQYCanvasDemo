package com.zqy.canvasdemo.module.text;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by zhaoqy on 2018/7/17.
 */

public class TextView extends View {

    private int type = 0;
    private Paint paint;

    public TextView(Context context) {
        super(context);
        initPaint();
    }

    public TextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    public TextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }

    private void initPaint() {
        paint = new Paint();
        // 在绘制点之前，需要设置画笔的宽度，否则不能画出来
        paint.setStrokeWidth(10);
        paint.setTextSize(40f);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        switch (type) {
            case 1: {
                paint.setColor(Color.BLUE);
                // drawText (String text, float x, float y, Paint paint)
                canvas.drawText("zhaoqy", 300, 400, paint);
                break;
            }
            case 2: {
                paint.setColor(Color.BLACK);
                // drawText (CharSequence text, int start, int end, float x, float y, Paint paint)
                canvas.drawText("zhaoqy", 1, 4, 300, 400, paint);
                break;
            }
            case 3: {
                paint.setColor(Color.RED);
                // drawPosText (String text, float[] pos, Paint paint)
                canvas.drawPosText("zhaoq", new float[]{
                        100, 100,    // 第一个字符位置
                        200, 200,    // 第二个字符位置
                        300, 300,    // ...
                        400, 400,
                        500, 500
                }, paint);
                break;
            }
            case 4: {
                paint.setColor(Color.GREEN);
                // drawPosText (char[] text, int index, int count, float[] pos, Paint paint)
                char[] chars = "zhaoq".toCharArray();
                canvas.drawPosText(chars, 1, 3, new float[]{
                        300, 300,    // 指定的第一个字符位置
                        400, 400,    // 指定的第二个字符位置
                        500, 500,    // 指定的第三个字符位置
                }, paint);
                break;
            }
            case 5: {
                // 1.创建路径对象
                Path path = new Path();
                // 2. 设置路径轨迹
                path.cubicTo(540, 750, 640, 450, 840, 600);
                // 3. 画路径
                paint.setColor(Color.YELLOW);
                canvas.drawPath(path, paint);
                // 4. 画出在路径上的字
                paint.setColor(Color.RED);
                canvas.drawTextOnPath("在Path上写的字: zhaoqy", path, 50, 0, paint);
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
