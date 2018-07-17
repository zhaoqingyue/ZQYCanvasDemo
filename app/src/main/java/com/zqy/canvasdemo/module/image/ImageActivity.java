package com.zqy.canvasdemo.module.image;

import android.os.Bundle;

import com.zqy.canvasdemo.R;
import com.zqy.canvasdemo.base.BaseActivity;

public class ImageActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
    }

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_image;
    }

    @Override
    protected String getTitleName() {
        return "绘制图片";
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void loadData() {

    }
}
