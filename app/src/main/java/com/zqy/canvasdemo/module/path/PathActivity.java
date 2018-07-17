package com.zqy.canvasdemo.module.path;

import android.content.Intent;
import android.view.View;

import com.zqy.canvasdemo.R;
import com.zqy.canvasdemo.base.BaseActivity;
import com.zqy.canvasdemo.module.color.ColorActivity;

import butterknife.OnClick;

public class PathActivity extends BaseActivity {

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_path;
    }

    @Override
    protected String getTitleName() {
        return "绘制路径";
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void loadData() {

    }

    @OnClick({R.id.btn_drawPath})
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_drawPath: {
                Intent intent = new Intent(this, ColorActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
