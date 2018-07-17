package com.zqy.canvasdemo.module.graph.point;

import android.view.View;

import com.zqy.canvasdemo.R;
import com.zqy.canvasdemo.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class PointActivity extends BaseActivity {

    @BindView(R.id.pointView)
    PointView pointView;

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_point;
    }

    @Override
    protected String getTitleName() {
        return "点";
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void loadData() {

    }

    @OnClick({R.id.btn_drawPoint, R.id.btn_drawPoints})
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_drawPoint: {
                pointView.update(1);
                break;
            }
            case R.id.btn_drawPoints: {
                pointView.update(2);
                break;
            }
        }
    }
}
