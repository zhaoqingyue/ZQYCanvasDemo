package com.zqy.canvasdemo.module.text;

import android.view.View;

import com.zqy.canvasdemo.R;
import com.zqy.canvasdemo.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class TextActivity extends BaseActivity {

    @BindView(R.id.textView)
    com.zqy.canvasdemo.module.text.TextView textView;

    @Override
    protected int getLayoutResID() {
        return R.layout.activity_text;
    }

    @Override
    protected String getTitleName() {
        return "绘制文本";
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void loadData() {

    }

    @OnClick({R.id.btn_drawText1, R.id.btn_drawText2, R.id.btn_drawPosText1, R.id.btn_drawPosText2,
            R.id.btn_drawTextOnPath})
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_drawText1: {
                textView.update(1);
                break;
            }
            case R.id.btn_drawText2: {
                textView.update(2);
                break;
            }
            case R.id.btn_drawPosText1: {
                textView.update(3);
                break;
            }
            case R.id.btn_drawPosText2: {
                textView.update(4);
                break;
            }
            case R.id.btn_drawTextOnPath: {
                textView.update(5);
                break;
            }
        }
    }
}
