package com.example.host.jsnewmall.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.host.jsnewmall.R;

/**
 * Created by host on 2017/2/28.
 */

public class OrderFailActivity extends AppCompatActivity {
    private TextView mTvResetOrder;
    private TextView mTvCall;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_fail_content);
        initView();
    }
    private void initView(){
       TextView mTitle=(TextView) findViewById(R.id.tv_title_name_change);//标题名字修改
        mTitle.setText(getApplicationContext().getResources().getString(R.string.pay_content_r));
        LinearLayout mLnFirstView=(LinearLayout) findViewById(R.id.pay_first_view_bgcolor);//背景图片颜色
        mLnFirstView.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.title_orange));
        TextView mTvFirstcontent=(TextView)findViewById(R.id.tv_pay_content_a);//失败信息第一条
        mTvFirstcontent.setText(getApplicationContext().getResources().getString(R.string.pay_content_n));
        TextView mTvSecondcontent=(TextView)findViewById(R.id.tv_pay_content_b);//失败信息第二条
        mTvSecondcontent.setText(getApplicationContext().getResources().getString(R.string.pay_content_o));

         mTvResetOrder=(TextView)findViewById(R.id.pay_submit_a);//重新下单
         mTvResetOrder.setText(getApplicationContext().getResources().getString(R.string.pay_content_p));

         mTvCall=(TextView)findViewById(R.id.tv_order_submit);//电话咨询
         mTvCall.setText(getApplicationContext().getResources().getString(R.string.pay_content_q));
    }
}
