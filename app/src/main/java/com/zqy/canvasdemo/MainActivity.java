package com.zqy.canvasdemo;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.zqy.canvasdemo.base.BaseActivity;
import com.zqy.canvasdemo.module.color.ColorActivity;
import com.zqy.canvasdemo.module.graph.GraphActivity;
import com.zqy.canvasdemo.module.image.ImageActivity;
import com.zqy.canvasdemo.module.path.PathActivity;
import com.zqy.canvasdemo.module.text.TextActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @BindView(R.id.tv_des)
    TextView des;

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_main;
    }

    @Override
    protected String getTitleName() {
        return getResources().getString(R.string.app_name);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void loadData() {

    }

    @OnClick({R.id.btn_color, R.id.btn_text, R.id.btn_graph, R.id.btn_image, R.id.btn_path, R.id.btn_operate})
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_color: {
                Intent intent = new Intent(this, ColorActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_text: {
                Intent intent = new Intent(this, TextActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_graph: {
                Intent intent = new Intent(this, GraphActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_image: {
                Intent intent = new Intent(this, ImageActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_path: {
                Intent intent = new Intent(this, PathActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_operate: {
                Intent intent = new Intent(this, TestActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
