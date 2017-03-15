package com.example.host.jsnewmall.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.adapter.CountryFirstAdapter;
import com.example.host.jsnewmall.adapter.CountrySecondAdapter;
import com.example.host.jsnewmall.adapter.HomeViewPagerAdpter;
import com.example.host.jsnewmall.adapter.TravelThirdAdapter;
import com.example.host.jsnewmall.model.HomeViewPagerInfo;
import com.example.host.jsnewmall.view.HomeForthGridView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by host on 2017/2/16.
 */

/**
 * 国内游
 */
public class CountryTravelFragment extends  BaseFragment {
    private View view;
    private Activity mActivity;
    private ViewPager pager;
    private LinearLayout dot_layout;
    private RequestQueue queue;
    private List<HomeViewPagerInfo> bannerInfoList;
    private String[] arrTexta = new String[]{"http://g.hiphotos.baidu.com/image/pic/item/f3d3572c11dfa9ecfc13ccc066d0f703918fc12c.jpg",
            "http://a.hiphotos.baidu.com/image/h%3D360/sign=61cc75aeab014c08063b2ea33a7a025b/359b033b5bb5c9ea9d26fbe4d739b6003bf3b3e4.jpg",
            "http://d.hiphotos.baidu.com/image/pic/item/d0c8a786c9177f3e8cab060a72cf3bc79f3d561e.jpg"};
    private static final int FINISH_CODE=100;
    private static final int START_PLAY = 1;
    private static final int REFRESH_PLAY = 2;
    private static final int CHANGE_PLAY = 3;
    private static final int STOP_PLAY = 4;
    private static final int MSG_DELAY = 3000;
    private int currentPager = 0;
    private HomeViewPagerAdpter homeViewPagerAdpter;

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
//                        homeViewPagerAdpter = new HomeViewPagerAdpter(mActivity,queue,bannerInfoList);
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



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment_travel_around,null);
        initView();
        handler.sendEmptyMessage(FINISH_CODE);
        initListener();
        return view;
    }


    private void initView(){
        mActivity=getActivity();
        queue = Volley.newRequestQueue(getActivity());
        bannerInfoList = new ArrayList<>();
        for (int i=0; i<3; i++){
            HomeViewPagerInfo pt = new HomeViewPagerInfo(arrTexta[i]);
            bannerInfoList.add(pt);
        }

        pager=(ViewPager) view.findViewById(R.id.around_viewpager);//轮播图
        dot_layout = (LinearLayout) view.findViewById(R.id.ll_dot);


        GridView mGvTravela=(GridView)view.findViewById(R.id.gv_travel_around_first);//热门目的地
        CountryFirstAdapter mTravelFirstAdapter=new CountryFirstAdapter(mActivity);
        mGvTravela.setAdapter(mTravelFirstAdapter);
        HomeForthGridView.setListViewHeightBasedOnChildren(mGvTravela);
        mGvTravela.deferNotifyDataSetChanged();


        GridView mGvTravelb=(GridView) view.findViewById(R.id.gv_travel_around_second);//热卖推荐
        DisplayMetrics dm = new DisplayMetrics();
        mActivity.getWindowManager().getDefaultDisplay().getMetrics(dm);
        float density = dm.density;
        HomeForthGridView.setHorizontalScroll(mGvTravelb,density,4,150);
        CountrySecondAdapter mFifthAdapter=new CountrySecondAdapter(mActivity);
        mGvTravelb.setAdapter(mFifthAdapter);
        mGvTravelb.deferNotifyDataSetChanged();


        ListView mListView= (ListView) view.findViewById(R.id.listview_home_content);//listview 的列表
        TravelThirdAdapter mThirdTravelAdapter=new TravelThirdAdapter(mActivity);
        mListView.setAdapter(mThirdTravelAdapter);
        HomeForthGridView.setListViewHeight(mListView);
        mListView.deferNotifyDataSetChanged();











    }



    /**
     * 设置viewpager下面的白点
     */

    private void setDot(int size) {
        for (int i = 0; i < size; i++) {
            View view = new View(mActivity);
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


}
