package com.example.host.jsnewmall.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;


import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.android.volley.toolbox.Volley;
import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.adapter.DingZhiAdapter;
import com.example.host.jsnewmall.adapter.DingzViewPagerAdapter;
import com.example.host.jsnewmall.adapter.HomeViewPagerAdpter;
import com.example.host.jsnewmall.model.HomeViewPagerInfo;
import com.example.host.jsnewmall.utils.BitmapCache;
import com.example.host.jsnewmall.view.HomeForthGridView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by host on 2017/2/20.
 */

public class DingzActivity extends BaseActivity{



    private  ViewPager pager;
    private List<HomeViewPagerInfo> bannerInfoList;
    private String[] arrTexta = new String[]{"http://pic6.huitu.com/res/20130116/84481_20130116142820494200_1.jpg",
            "http://img02.tooopen.com/images/20140504/sy_60294738471.jpg",
            "http://pic73.nipic.com/file/20150724/18576408_175304314596_2.jpg"};
    private LinearLayout dot_layout;
    private static final int FINISH_CODE=100;
    private static final int START_PLAY = 1;
    private static final int REFRESH_PLAY = 2;
    private static final int CHANGE_PLAY = 3;
    private static final int STOP_PLAY = 4;
    private static final int MSG_DELAY = 3000;
    private int currentPager = 0;
    private DingzViewPagerAdapter homeViewPagerAdpter;
    private RequestQueue queue;
    private LinearLayout mBack;
    private NetworkImageView mImgDingZa;
    private NetworkImageView mImgDingZb;
    private NetworkImageView mImgDingZc;
    private ListView mDingzListView;



    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (handler.hasMessages(REFRESH_PLAY)) {
                handler.removeMessages(REFRESH_PLAY);
            }
            switch (msg.what) {
                case FINISH_CODE:


                    if (homeViewPagerAdpter == null) {
                        homeViewPagerAdpter = new DingzViewPagerAdapter(getApplicationContext(),queue,bannerInfoList);

                        pager.setAdapter(homeViewPagerAdpter);

                    } else {
                        homeViewPagerAdpter.notifyDataSetChanged();

                    }
                    handler.sendEmptyMessageDelayed(START_PLAY, MSG_DELAY);
                    if (bannerInfoList.size() != 1) {

                        setDot(bannerInfoList.size());
                    }
                    break;
                case REFRESH_PLAY:
                    currentPager++;
                    pager.setCurrentItem(currentPager);
                    handler.sendEmptyMessageDelayed(REFRESH_PLAY, MSG_DELAY);
                    break;
                case START_PLAY:
                    handler.sendEmptyMessageDelayed(REFRESH_PLAY, MSG_DELAY);
                    break;
                case CHANGE_PLAY:
                    currentPager = msg.arg1;

                    break;


                default:
                    break;

            };
        }
    };


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_dingz_content);
        initView();


        handler.sendEmptyMessage(FINISH_CODE);
        initListener();

    }



    private void initView(){
        queue = Volley.newRequestQueue(getApplicationContext());
        bannerInfoList = new ArrayList<>();
        for (int i=0; i<3; i++){
            HomeViewPagerInfo pt = new HomeViewPagerInfo(arrTexta[i]);
            bannerInfoList.add(pt);
        }


        pager=(ViewPager) findViewById(R.id.viewpager_dingzhi);//轮播图
        dot_layout = (LinearLayout)findViewById(R.id.ll_dot);

        mBack=(LinearLayout) findViewById(R.id.iv_back);//返回按钮

        mImgDingZa=(NetworkImageView) findViewById(R.id.img_dingzhi_a);//图片1
        mImgDingZb=(NetworkImageView) findViewById(R.id.img_dingzhi_b);//图片2
        mImgDingZc=(NetworkImageView) findViewById(R.id.img_dingzhi_c);//图片3

        ImageLoader imageLoader = new ImageLoader(queue, new BitmapCache());
        mImgDingZa.setScaleType(ImageView.ScaleType.FIT_XY);
        mImgDingZa.setImageUrl("http://pic6.huitu.com/res/20130116/84481_20130116142820494200_1.jpg", imageLoader);

        mImgDingZb.setImageUrl("http://pic73.nipic.com/file/20150724/18576408_175304314596_2.jpg", imageLoader);

        mImgDingZc.setImageUrl("http://pic73.nipic.com/file/20150724/18576408_175304314596_2.jpg", imageLoader);

        mDingzListView=(ListView) findViewById(R.id.list_dingzhi);//图片的listview列表
        DingZhiAdapter mDingzhiAdapter=new DingZhiAdapter(getApplicationContext(),queue);

        mDingzListView.setAdapter(mDingzhiAdapter);
        HomeForthGridView.setListViewHeight(mDingzListView);
        mDingzListView.deferNotifyDataSetChanged();

        ScrollView mScrollDingz=(ScrollView) findViewById(R.id.activity_dingzhi_scrollview);
        mScrollDingz.smoothScrollTo(0,0);
    }

    /**
     * 设置viewpager下面的白点
     */

    private void setDot(int size) {
        for (int i = 0; i < size; i++) {
            View view = new View(getApplicationContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(20, 20);
            if (i != 0) {
                layoutParams.leftMargin = 25;
            }
            view.setLayoutParams(layoutParams);
            view.setBackgroundResource(R.drawable.dot_shaper);
            dot_layout.addView(view);
            dot_layout.getChildAt(i).setEnabled(i == currentPager);
        }
    }

    private void initListener(){
        OnClickListenerImpl listener = new OnClickListenerImpl();
        mBack.setOnClickListener(listener);



        pager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {

                handler.sendMessage(Message.obtain(handler, CHANGE_PLAY,
                        position, 0));
                currentPager = position % bannerInfoList.size();
                for (int i = 0; i < dot_layout.getChildCount(); i++) {

                    dot_layout.getChildAt(i).setEnabled(i == currentPager);

                }

            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int arg0) {
                switch (arg0) {
                    case ViewPager.SCROLL_STATE_DRAGGING:
                        handler.sendEmptyMessage(STOP_PLAY);
                        break;
                    case ViewPager.SCROLL_STATE_IDLE:
                        handler.sendEmptyMessageDelayed(REFRESH_PLAY, MSG_DELAY);
                        break;
                    default:
                        break;
                }
            }
        });
    }




    private class OnClickListenerImpl implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            switch(view.getId()){
                case R.id.iv_back:
                    finish();
                    break;


                default:
                    break;

            }


        }


    }


}
