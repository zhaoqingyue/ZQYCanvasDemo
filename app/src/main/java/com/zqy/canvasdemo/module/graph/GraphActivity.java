package com.zqy.canvasdemo.module.graph;

import android.content.Intent;
import android.view.View;

import com.zqy.canvasdemo.R;
import com.zqy.canvasdemo.base.BaseActivity;
import com.zqy.canvasdemo.module.graph.arc.ArcActivity;
import com.zqy.canvasdemo.module.graph.circle.CircleActivity;
import com.zqy.canvasdemo.module.graph.line.LineActivity;
import com.zqy.canvasdemo.module.graph.oval.OvalActivity;
import com.zqy.canvasdemo.module.graph.point.PointActivity;
import com.zqy.canvasdemo.module.graph.rect.RectActivity;
import com.zqy.canvasdemo.module.graph.rect.RoundRectActivity;

import butterknife.OnClick;

public class GraphActivity extends BaseActivity {

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_graph;
    }

    @Override
    protected String getTitleName() {
        return "绘制图形";
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void loadData() {

    }

    @OnClick({R.id.btn_point, R.id.btn_line, R.id.btn_rect, R.id.btn_roundRect,
              R.id.btn_arc, R.id.btn_circle, R.id.btn_oval})
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_point: {
                Intent intent = new Intent(this, PointActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_line: {
                Intent intent = new Intent(this, LineActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_rect: {
                Intent intent = new Intent(this, RectActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_roundRect: {
                Intent intent = new Intent(this, RoundRectActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_arc: {
                Intent intent = new Intent(this, ArcActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_circle: {
                Intent intent = new Intent(this, CircleActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.btn_oval: {
                Intent intent = new Intent(this, OvalActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
