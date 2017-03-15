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
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.adapter.AroudViewPagerAdapter;
import com.example.host.jsnewmall.adapter.HomeViewPagerAdpter;
import com.example.host.jsnewmall.adapter.TravelFirstAdapter;
import com.example.host.jsnewmall.adapter.TravelSecondAdapter;
import com.example.host.jsnewmall.adapter.TravelThirdAdapter;
import com.example.host.jsnewmall.model.AroundEntry;
import com.example.host.jsnewmall.model.HomeViewPagerInfo;
import com.example.host.jsnewmall.model.JsonmModel;
import com.example.host.jsnewmall.utils.Base64Utils;
import com.example.host.jsnewmall.utils.HttpUtils;
import com.example.host.jsnewmall.utils.JsonUtils;
import com.example.host.jsnewmall.utils.UrlUtils;
import com.example.host.jsnewmall.view.HomeForthGridView;
import com.example.host.jsnewmall.view.RefreshScrollView.PullToRefreshLayout;
import com.example.host.jsnewmall.view.RefreshScrollView.PullableScrollView;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by host on 2017/2/16.
 */

public class AroundFragment extends BaseFragment {
    private View view;
    private Activity mActivity;
    private ViewPager pager;
    private LinearLayout dot_layout;

    private RequestQueue queue;
    private List<HomeViewPagerInfo> bannerInfoList;
    private String[] arrTexta = new String[]{"http://i.zeze.com/attachment/forum/201605/06/214815xnd5dz5t58fndt85.jpg",
            "http://dealer0.autoimg.cn/dl/10982/newsimg/130364690780019046.jpg",
            "http://pic35.nipic.com/20131121/2531170_145358633000_2.jpg"};
    private static final int FINISH_CODE=100;
    private static final int START_PLAY = 1;
    private static final int REFRESH_PLAY = 2;
    private static final int CHANGE_PLAY = 3;
    private static final int STOP_PLAY = 4;
    private static final int MSG_DELAY = 3000;
    private int currentPager = 0;
    private AroudViewPagerAdapter aroundviewpageradapter;
    private PullableScrollView mAroundScrollView;
    private PullToRefreshLayout mPullscroll;
    private SimpleDateFormat mSimpleTime;
    private String nTime;
    Gson gson=new Gson();
    private AroundEntry bodyinfo;

    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (handler.hasMessages(REFRESH_PLAY)) {
                handler.removeMessages(REFRESH_PLAY);
            }
            switch (msg.what) {
                case FINISH_CODE:


                    initView();
                    initListener();

                    if (aroundviewpageradapter == null) {
                        aroundviewpageradapter = new AroudViewPagerAdapter(mActivity,queue,bodyinfo);

                        pager.setAdapter(aroundviewpageradapter);

                    } else {
                        aroundviewpageradapter.notifyDataSetChanged();

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
        Date d=new Date();
        mSimpleTime=new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        nTime=mSimpleTime.format(d);
        initData();

        return view;
    }



    private void initData(){

        JSONObject jbody=null;
        try {
            jbody = new JSONObject();
            jbody.put("city_id",115);
            jbody.put("topic_name", "zb");
            jbody.put("method","Get_ad_byname");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        JSONObject jbodyB= JsonUtils.JsonParseInfo(nTime,jbody);
        dohttpAround(UrlUtils.APP_URL,jbodyB);


    }



    private void initView(){
        mActivity=getActivity();
        queue = Volley.newRequestQueue(getActivity());
        bannerInfoList = new ArrayList<>();
        for (int i=0; i<3; i++){
            HomeViewPagerInfo pt = new HomeViewPagerInfo(arrTexta[i]);
            bannerInfoList.add(pt);
        }




        mAroundScrollView=(PullableScrollView) view.findViewById(R.id.around_scrollview);//scrollview布局
        mPullscroll=(PullToRefreshLayout)view.findViewById(R.id.refresh_view);//scrollview外层布局用来刷新



        pager=(ViewPager) view.findViewById(R.id.around_viewpager);//轮播图
        dot_layout = (LinearLayout) view.findViewById(R.id.ll_dot);

        GridView mGvTravela=(GridView)view.findViewById(R.id.gv_travel_around_first);//热门目的地
        TravelFirstAdapter mTravelFirstAdapter=new TravelFirstAdapter(mActivity,bodyinfo);
        mGvTravela.setAdapter(mTravelFirstAdapter);
        HomeForthGridView.setListViewHeightBasedOnChildren(mGvTravela);
        mGvTravela.deferNotifyDataSetChanged();


        GridView mGvTravelb=(GridView) view.findViewById(R.id.gv_travel_around_second);//热卖推荐
        DisplayMetrics dm = new DisplayMetrics();
        mActivity.getWindowManager().getDefaultDisplay().getMetrics(dm);
        float density = dm.density;
        HomeForthGridView.setHorizontalScroll(mGvTravelb,density,4,150);
        TravelSecondAdapter mFifthAdapter=new TravelSecondAdapter(mActivity,bodyinfo,queue);
        mGvTravelb.setAdapter(mFifthAdapter);
        mGvTravelb.deferNotifyDataSetChanged();

        ListView mListView= (ListView) view.findViewById(R.id.listview_home_content);//listview 的列表
        TravelThirdAdapter mThirdTravelAdapter=new TravelThirdAdapter(mActivity);
        mListView.setAdapter(mThirdTravelAdapter);
        HomeForthGridView.setListViewHeight(mListView);
        mListView.deferNotifyDataSetChanged();


        TextView mTvSelectRoad=(TextView) view.findViewById(R.id.tv_select_travel_route);//底部路线选择



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




        //下啦刷新 上啦加载
        mPullscroll.setOnRefreshListener(new PullToRefreshLayout.OnRefreshListener() {
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



    protected  void dohttpAround(String url,JSONObject  paramhash){
        HttpUtils.dopost(url,getActivity(),paramhash, new HttpUtils.CallBack() {
            @Override
            public void onRequestComplete(String result) {

                JsonmModel homeinfoa=gson.fromJson(result,JsonmModel.class);
                String body= Base64Utils.getFromBase64(homeinfoa.getBody());

                bodyinfo=gson.fromJson(body, AroundEntry.class);

                handler.sendEmptyMessage(FINISH_CODE);

            }

            @Override
            public void onRequestErr(String err) {

            }
        });
    }



}
