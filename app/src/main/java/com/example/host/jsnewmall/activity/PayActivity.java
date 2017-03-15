package com.example.host.jsnewmall.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.host.jsnewmall.R;

import org.w3c.dom.Text;


/**
 * Created by host on 2017/3/2.
 */

public class PayActivity extends BaseActivity {
    private TextView mTvDuoci;
    private LinearLayout mDuociLayout;
    private TextView mTvdismissduoci;
    private EditText mEtMoreMoney;
    private LinearLayout mBack;
    private RelativeLayout mRlweixin;
    private RelativeLayout mRlzhifubao;
    private ImageView mImgWeixin;
    private ImageView mImgZhifubao;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_content);
        initView();
        initListener();
    }
    private void initView(){
        mBack=(LinearLayout)findViewById(R.id.iv_back);
        TextView mTvtitle=(TextView)findViewById(R.id.tv_title_name_change);//标题更名
        mTvtitle.setText(getApplicationContext().getResources().getString(R.string.order_content_l));
        mDuociLayout=(LinearLayout) findViewById(R.id.ln_pay_content_a);//是否展开多次输入金额
        mTvDuoci=(TextView)findViewById(R.id.tv_pay_duoci);//确认多次支付按钮
        mTvdismissduoci=(TextView)findViewById(R.id.tv_pay_duoci_dismiss);//取消多次支付
        mEtMoreMoney=(EditText)findViewById(R.id.et_order_money);//获取多次支付金额
        mRlweixin=(RelativeLayout)findViewById(R.id.rl_weixin_layout);//微信支付
        mRlzhifubao=(RelativeLayout)findViewById(R.id.rl_zhifubao_layout);//支付宝支付
        mImgWeixin=(ImageView)findViewById(R.id.img_weixin_checked);//微信支付图片
        mImgZhifubao=(ImageView)findViewById(R.id.img_zhifubao_checked);//支付宝图片



    }
    private void initListener(){
        OnClickListenerImpl listener = new OnClickListenerImpl();
        mTvDuoci.setOnClickListener(listener);
        mTvdismissduoci.setOnClickListener(listener);
        mBack.setOnClickListener(listener);
        mRlweixin.setOnClickListener(listener);
        mRlzhifubao.setOnClickListener(listener);
    }

    private class OnClickListenerImpl implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            switch(view.getId()) {
                case R.id.iv_back:
                    finish();
                    break;

                case R.id.tv_pay_duoci:
                    mDuociLayout.setVisibility(View.VISIBLE);
                    break;
                case R.id.tv_pay_duoci_dismiss:
                    mDuociLayout.setVisibility(View.GONE);
                    mEtMoreMoney.setText("");
                    break;

                //微信支付点击
                case R.id.rl_weixin_layout:
                    mImgWeixin.setImageDrawable(getApplicationContext().getResources().getDrawable(R.mipmap.icon_gou_checked));
                    mImgZhifubao.setImageDrawable(getApplicationContext().getResources().getDrawable(R.mipmap.icon_circle_unchecked));
                    break;

                //支付宝支付
                case R.id.rl_zhifubao_layout:
                    mImgZhifubao.setImageDrawable(getApplicationContext().getResources().getDrawable(R.mipmap.icon_gou_checked));
                    mImgWeixin.setImageDrawable(getApplicationContext().getResources().getDrawable(R.mipmap.icon_circle_unchecked));

                    break;
            }

        }
    }
}
