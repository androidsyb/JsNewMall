package com.example.host.jsnewmall.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PersistableBundle;

import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.view.RefreshScrollView.PullToRefreshLayout;

/**
 * Created by host on 2017/3/7.
 */

public class MessageActivity extends BaseActivity {
    private PullToRefreshLayout mPullLayout;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_view);
        initView();
        initListener();

    }


    private void initView(){
        mPullLayout=(PullToRefreshLayout)findViewById(R.id.refresh_view_message);//刷新布局

    }


    private void initListener(){
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
}
