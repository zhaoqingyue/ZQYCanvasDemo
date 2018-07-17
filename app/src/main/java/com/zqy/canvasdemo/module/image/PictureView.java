package com.zqy.canvasdemo.module.image;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by zhaoqy on 2018/7/17.
 */

public class PictureView extends View {

    public PictureView(Context context) {
        super(context);
    }

    public PictureView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PictureView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Picture picture = new Picture();
        Canvas recordingCanvas = picture.beginRecording(400, 400);

        // 位移
        // 将坐标系的原点移动到(200,200)
        recordingCanvas.translate(200, 200);

        // 创建一个画笔
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(10);
        paint.setStyle(Paint.Style.STROKE);

        // 绘制一个圆
        // 圆心为（0，0），半径为100
        recordingCanvas.drawCircle(0, 0, 100, paint);
        picture.endRecording();
        picture.draw(canvas);


        // 实例1：将录制的内容显示（区域刚好布满图形）
        canvas.drawPicture(picture, new RectF(300, 300, picture.getWidth(), picture.getHeight()));

        // 实例2：将录制的内容显示在当前画布上（区域小于图形）
        canvas.drawPicture(picture, new RectF(500, 500, picture.getWidth(), 200));



//        // 将Picture包装成为Drawable
//        PictureDrawable drawable = new PictureDrawable(picture);
//
//        // 设置在画布上的绘制区域（类似drawPicture (Picture picture, Rect dst)的Rect dst参数）
//        // 每次都从Picture的左上角开始绘制
//        // 并非根据该区域进行缩放，也不是剪裁Picture。
//
//        // 实例1：将录制的内容显示（区域刚好布满图形）
//        drawable.setBounds(700, 7000, picture.getWidth(), picture.getHeight());
//        // 绘制
//
//        drawable.draw(canvas);
//        // 实例2：将录制的内容显示在当前画布上（区域小于图形）
//        drawable.setBounds(800, 800, 250, picture.getHeight());

    }
}
