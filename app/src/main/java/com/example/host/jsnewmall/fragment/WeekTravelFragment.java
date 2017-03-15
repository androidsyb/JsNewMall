package com.example.host.jsnewmall.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.adapter.TravelWeekAdapter;
import com.example.host.jsnewmall.adapter.TravelWeekFirstAdapter;
import com.example.host.jsnewmall.adapter.TravelweekFifthAdapter;
import com.example.host.jsnewmall.adapter.TravelweekForthAdapter;
import com.example.host.jsnewmall.adapter.TravelweekSecondAdapter;
import com.example.host.jsnewmall.adapter.TravelweekSixthAdapter;
import com.example.host.jsnewmall.adapter.TravelweekThirdAdapter;
import com.example.host.jsnewmall.model.HomeViewPagerInfo;
import com.example.host.jsnewmall.view.HomeForthGridView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by host on 2017/2/16.
 */

public class WeekTravelFragment extends BaseFragment {
    private View view;
    private Activity mActivity;
    private ViewPager pager;
    private LinearLayout dot_layout;
    private RequestQueue queue;
    private List<HomeViewPagerInfo> bannerInfoList;
    private String[] arrTexta = new String[]{"http://f.hiphotos.baidu.com/image/pic/item/bba1cd11728b47101489df48c0cec3fdfd03238b.jpg",
            "http://f.hiphotos.baidu.com/image/pic/item/203fb80e7bec54e753da379aba389b504fc26a7b.jpg",
            "http://g.hiphotos.baidu.com/image/pic/item/ac6eddc451da81cb87d0ae495166d0160924317b.jpg"};
    private static final int FINISH_CODE=100;
    private static final int START_PLAY = 1;
    private static final int REFRESH_PLAY = 2;
    private static final int CHANGE_PLAY = 3;
    private static final int STOP_PLAY = 4;
    private static final int MSG_DELAY = 3000;
    private int currentPager = 0;
    private TravelWeekAdapter travelWeekAdapter;



    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (handler.hasMessages(REFRESH_PLAY)) {
                handler.removeMessages(REFRESH_PLAY);
            }
            switch (msg.what) {
                case FINISH_CODE:


                    if (travelWeekAdapter == null) {
                        travelWeekAdapter = new TravelWeekAdapter(mActivity,queue,bannerInfoList);

                        pager.setAdapter(travelWeekAdapter);

                    } else {
                        travelWeekAdapter.notifyDataSetChanged();

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
        view=inflater.inflate(R.layout.fragment_travel_weekend_content,null);
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


        GridView mGridWeeka=(GridView) view.findViewById(R.id.gv_travel_week_a);//日期
        TravelWeekFirstAdapter mTravelWeekFirstAdapter=new TravelWeekFirstAdapter(mActivity);
        mGridWeeka.setAdapter(mTravelWeekFirstAdapter);
//        HomeForthGridView.setListViewHeightBasedOnChildren(mGridWeeka);
        mGridWeeka.deferNotifyDataSetChanged();

        GridView mGridWeekb=(GridView) view.findViewById(R.id.gv_travel_week_b);//特色玩法
        TravelweekSecondAdapter mTravelWeekFirstAdapterb=new TravelweekSecondAdapter(mActivity);
        mGridWeekb.setAdapter(mTravelWeekFirstAdapterb);
//        HomeForthGridView.setListViewHeightBasedOnChildren(mGridWeeka);
        mGridWeekb.deferNotifyDataSetChanged();

        GridView mGridWeekc=(GridView) view.findViewById(R.id.gv_travel_week_c);//出行方式
        TravelweekThirdAdapter mTravelweekAdapter=new TravelweekThirdAdapter(mActivity);
        mGridWeekc.setAdapter(mTravelweekAdapter);

        GridView mGridWeekd=(GridView) view.findViewById(R.id.gv_travel_week_d);//热卖推荐图片部分
        TravelweekForthAdapter mTravelweekForthAdapter=new TravelweekForthAdapter(mActivity,queue);
        mGridWeekd.setAdapter(mTravelweekForthAdapter);
        HomeForthGridView.setListViewHeightBasedOnChildren(mGridWeekd);
        mGridWeekd.deferNotifyDataSetChanged();

        GridView mGridWeeke=(GridView)view.findViewById(R.id.gv_travel_week_e);//热卖推荐文字部分
        TravelweekFifthAdapter mTravelweekFifthAdapter=new TravelweekFifthAdapter(mActivity);
        mGridWeeke.setAdapter(mTravelweekFifthAdapter);
        HomeForthGridView.setListViewHeightBasedOnChildren(mGridWeeke);
        mGridWeeke.deferNotifyDataSetChanged();

        ListView mListView= (ListView) view.findViewById(R.id.listview_home_content);//listview 的列表
        TravelweekSixthAdapter mTravelweekSixthAdapter=new TravelweekSixthAdapter(mActivity,queue);
        mListView.setAdapter(mTravelweekSixthAdapter);
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
