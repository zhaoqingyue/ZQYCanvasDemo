package com.zqy.canvasdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

//    @BindView(R.id.tv_dian0)
//    TextView tv_dian0;
//    @BindView(R.id.tv_dian1)
//    TextView tv_dian1;

    ViewGroup viewGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        TextView dian0 = (TextView) findViewById(R.id.tv_dian0);
        dian0.setTextSize(25);
    }

    @OnClick({R.id.tv_dian0, R.id.tv_dian1})
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_dian0: {
                Intent intent = new Intent(this, TestActivity.class);
                startActivity(intent);



                break;
            }
            case R.id.tv_dian1: {
                Intent intent = new Intent(this, TestActivity.class);
                startActivity(intent);
                break;
            }
        }
    }
}
