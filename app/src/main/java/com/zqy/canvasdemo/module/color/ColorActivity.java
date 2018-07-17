package com.zqy.canvasdemo.module.color;

import android.view.View;

import com.zqy.canvasdemo.R;
import com.zqy.canvasdemo.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class ColorActivity extends BaseActivity {

    @BindView(R.id.colorView)
    ColorView colorView;

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_color;
    }

    @Override
    protected String getTitleName() {
        return "绘制颜色";
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void loadData() {

    }

    @OnClick({R.id.btn_drawColor, R.id.btn_drawRGB, R.id.btn_drawARGB})
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_drawColor: {
                colorView.update(1);
                break;
            }
            case R.id.btn_drawRGB: {
                colorView.update(2);
                break;
            }
            case R.id.btn_drawARGB: {
                colorView.update(3);
                break;
            }
        }
    }
}
