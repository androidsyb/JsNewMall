package com.example.host.jsnewmall.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.host.jsnewmall.R;

/**
 * Created by host on 2017/2/28.
 */

/**
 * 支付成功页面
 */

public class PaySuccessActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_success_content);
        initView();

    }

    private void initView(){
        TextView mtitleview=(TextView)findViewById(R.id.tv_title_name_change);
        mtitleview.setText(getApplicationContext().getResources().getString(R.string.pay_content_f));
    }
}
