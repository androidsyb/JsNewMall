package com.example.host.jsnewmall.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;


import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.adapter.BaocheAdapter;
import com.example.host.jsnewmall.adapter.HomeViewPagerAdpter;
import com.example.host.jsnewmall.model.HomeViewPagerInfo;
import com.example.host.jsnewmall.view.HomeForthGridView;
import com.example.host.jsnewmall.view.XGridView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by host on 2017/2/20.
 */

public class BaoCheActivity extends BaseActivity {


    private LinearLayout mBack;
    private ViewPager pager;
    private LinearLayout dot_layout;
    private static final int FINISH_CODE=100;
    private static final int START_PLAY = 1;
    private static final int REFRESH_PLAY = 2;
    private static final int CHANGE_PLAY = 3;
    private static final int STOP_PLAY = 4;
    private static final int MSG_DELAY = 3000;
    private int currentPager = 0;
    private RequestQueue queue;
    private List<HomeViewPagerInfo> bannerInfoList;
    private String[] arrTexta = new String[]{"http://pic6.huitu.com/res/20130116/84481_20130116142820494200_1.jpg",
            "http://img02.tooopen.com/images/20140504/sy_60294738471.jpg",
            "http://pic73.nipic.com/file/20150724/18576408_175304314596_2.jpg"};
    private HomeViewPagerAdpter homeViewPagerAdpter;
    private XGridView mGvBaoche;


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
//                        homeViewPagerAdpter = new HomeViewPagerAdpter(getApplicationContext(),queue,bannerInfoList);
//
//                        pager.setAdapter(homeViewPagerAdpter);

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
        setContentView(R.layout.activity_baoche_content);
        initView();
        handler.sendEmptyMessage(FINISH_CODE);
        initListener();
    }


    private void initView(){
        TextView mTvTitle= (TextView) findViewById(R.id.tv_title_name_change);//标题
        mTvTitle.setText(getApplicationContext().getResources().getString(R.string.travel_content_t));
        mBack=(LinearLayout) findViewById(R.id.iv_back);//返回按钮
        queue = Volley.newRequestQueue(getApplicationContext());
        bannerInfoList = new ArrayList<>();
        for (int i=0; i<3; i++){
            HomeViewPagerInfo pt = new HomeViewPagerInfo(arrTexta[i]);
            bannerInfoList.add(pt);
        }

        pager=(ViewPager) findViewById(R.id.viewpager_dingzhi);//轮播图
        dot_layout = (LinearLayout) findViewById(R.id.ll_dot);
        TextView mTvContenta=(TextView) findViewById(R.id.tv_baoche_content_a);//文本内容
        mTvContenta.setText("\u3000\u3000"+getApplicationContext().getResources().getString(R.string.travel_content_u));

        mGvBaoche =(XGridView) findViewById(R.id.gv_baoche_gridview);//图片gridview显示
        BaocheAdapter mBaoCheAdapter=new BaocheAdapter(getApplicationContext(),queue);
        mGvBaoche.setAdapter(mBaoCheAdapter);
        HomeForthGridView.setListViewHeightBasedOnChildren(mGvBaoche);
        mGvBaoche.deferNotifyDataSetChanged();

        ScrollView mScrollBaoche =(ScrollView) findViewById(R.id.activity_baoche_scrollview);
        mScrollBaoche.smoothScrollTo(0,0);

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



    private class OnClickListenerImpl implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.iv_back:
                    finish();

                default:
                    break;

            }


        }


    }

}
