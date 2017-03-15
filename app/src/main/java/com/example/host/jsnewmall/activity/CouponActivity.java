package com.example.host.jsnewmall.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.adapter.CouponAdapter;
import com.example.host.jsnewmall.model.CouponEntry;
import com.example.host.jsnewmall.model.JsonmModel;
import com.example.host.jsnewmall.utils.Base64Utils;
import com.example.host.jsnewmall.utils.HttpUtils;
import com.example.host.jsnewmall.utils.JsonUtils;
import com.example.host.jsnewmall.utils.UrlUtils;
import com.example.host.jsnewmall.view.RefreshScrollView.PullToRefreshLayout;
import com.example.host.jsnewmall.view.RefreshScrollView.PullableListView;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by host on 2017/3/14.
 */

public class CouponActivity extends BaseActivity {
    private String userid;
    private SimpleDateFormat mSimpleTime;
    private String nTime;
    Gson gson=new Gson();
    private CouponEntry mCouponinfo;
    private static final int FINISH_CODE=100;
    private LinearLayout mBack;
    private PullToRefreshLayout mPullLayout;
    private PullableListView mPullableListView;


    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            switch (msg.what) {
                case FINISH_CODE:

                    initView();
                    initListener();

                    List<CouponEntry.DataBean> mList=mCouponinfo.getData();
                    CouponAdapter adapter=new CouponAdapter(getApplicationContext(),mList);
                    mPullableListView.setAdapter(adapter);

               break;
                default:
                    break;

            };
        }
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coupon_view);
        Date d=new Date();
        mSimpleTime=new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        nTime=mSimpleTime.format(d);
        initGetData();
        initData();

        TextView mTvTitlte=(TextView)findViewById(R.id.tv_title_name_change);//标题
        mTvTitlte.setText("优惠券");
        mTvTitlte.setTextColor(getApplicationContext().getResources().getColor(R.color.dark_6));
//        ImageView mImgBack=(ImageView)findViewById(R.id.title_img_back_change);//返回箭头图案
//        mImgBack.setImageDrawable(getApplicationContext().getResources().getDrawable(R.mipmap.backicon_a));
        ImageView mImgMessage=(ImageView)findViewById(R.id.img_title_message);//更多图案显示
        mImgMessage.setVisibility(View.GONE);


    }

    private void initGetData(){
        Intent intent=getIntent();
        userid=intent.getStringExtra("userid");
    }

    private void initData(){

        JSONObject jbody=null;
        try {
            jbody = new JSONObject();
            jbody.put("user_id",userid);
            jbody.put("overdue",1);//0:过期，1:可使用 空:查全部
            jbody.put("is_page",2);//是否分页,1是，2否
            jbody.put("method","QueryCoupons");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        JSONObject jbodyB= JsonUtils.JsonParseInfo(nTime,jbody);
        dohttpGetfino(UrlUtils.USER,jbodyB);

    }


    private void initView(){

        mPullLayout=(PullToRefreshLayout)findViewById(R.id.refresh_view_coupon);//刷新布局
        mBack=(LinearLayout)findViewById(R.id.iv_back);//返回
        mPullableListView=(PullableListView)findViewById(R.id.content_view);//listview




    }
    private void initListener(){
        OnClickListenerImpl listener = new OnClickListenerImpl();
        mBack.setOnClickListener(listener);

        mPullLayout.setOnRefreshListener(new PullToRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh(final PullToRefreshLayout pullToRefreshLayout) {
                new Handler() {
                    @Override
                    public void handleMessage(Message msg) {
                        // 千万别忘了告诉控件刷新完毕了哦！
                        pullToRefreshLayout.refreshFinish(PullToRefreshLayout.SUCCEED);
                    }
                }.sendEmptyMessageDelayed(0, 3000);
            }

            @Override
            public void onLoadMore(final PullToRefreshLayout pullToRefreshLayout) {
                new Handler(){
                    @Override
                    public void handleMessage(Message msg) {
                        pullToRefreshLayout.loadmoreFinish(PullToRefreshLayout.SUCCEED);
                    }
                }.sendEmptyMessageDelayed(0,3000);
            }
        });

    }
    protected  void dohttpGetfino(String url,JSONObject  paramhash){
        HttpUtils.dopost(url,getApplicationContext(),paramhash, new HttpUtils.CallBack() {
            @Override
            public void onRequestComplete(String result) {

                JsonmModel homeinfoa=gson.fromJson(result,JsonmModel.class);
                String body= Base64Utils.getFromBase64(homeinfoa.getBody());
                mCouponinfo=gson.fromJson(body, CouponEntry.class);
                handler.sendEmptyMessage(FINISH_CODE);
            }

            @Override
            public void onRequestErr(String err) {

            }
        });
    }


    private class OnClickListenerImpl implements View.OnClickListener {

        @Override
        public void onClick(View view) {

                switch (view.getId()) {
                    case R.id.iv_back:
                        finish();
                        break;

                    default:
                        break;


            }
        }
    }



}
