package com.zqy.canvasdemo.module.graph.line;

import android.view.View;

import com.zqy.canvasdemo.R;
import com.zqy.canvasdemo.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class LineActivity extends BaseActivity {

    @BindView(R.id.lineView)
    LineView lineView;

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_line;
    }

    @Override
    protected String getTitleName() {
        return "线";
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void loadData() {

    }

    @OnClick({R.id.btn_drawLine, R.id.btn_drawLines})
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_drawLine: {
                lineView.update(1);
                break;
            }
            case R.id.btn_drawLines: {
                lineView.update(2);
                break;
            }
        }
    }
}
