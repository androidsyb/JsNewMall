package com.example.host.jsnewmall.activity;


import android.app.LocalActivityManager;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.adapter.MyFragmentPagerAdapter;
import com.example.host.jsnewmall.fragment.AroundFragment;
import com.example.host.jsnewmall.fragment.CountryTravelFragment;
import com.example.host.jsnewmall.fragment.OutTravelFragment;
import com.example.host.jsnewmall.fragment.WeekTravelFragment;



import java.util.ArrayList;
import java.util.List;

/**
 * Created by host on 2017/2/16.
 */

public class TravelActivity extends BaseActivity implements View.OnClickListener {

    private LocalActivityManager manager = null;
    private TextView barText;
    private ViewPager mPager;
    private List<Fragment> fragmentList;
    private int currIndex = 1;// 当前页卡编号
    private TextView mTvTravela;
    private TextView mTvTravelb;
    private TextView mTvTravelc;
    private TextView mTvTraveld;

    private LinearLayout mBack;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        manager = new LocalActivityManager(activity, true);
        manager.dispatchCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_content);
        initView();
        initListener();
        initTextBar();
    }
    public void initView(){
        mBack=(LinearLayout)findViewById(R.id.iv_back);


//        barText = (TextView) findViewById(R.id.cursoraa);// 动画效果的线

        mPager=(ViewPager)findViewById(R.id.viewpagera);// viewpager
        mTvTravela =(TextView)findViewById(R.id.travel_content_a);//周边游
        mTvTravelb =(TextView)findViewById(R.id.travel_content_b);//国内游
        mTvTravelc =(TextView)findViewById(R.id.travel_content_c);//出境游
        mTvTraveld =(TextView)findViewById(R.id.travel_content_d);//周末游


        fragmentList = new ArrayList<Fragment>();
        AroundFragment aroundFragment=new AroundFragment();//周边游
        CountryTravelFragment countryTravelFragment=new CountryTravelFragment();//国内游
        OutTravelFragment outTravelFragment=new OutTravelFragment();//出境游
        WeekTravelFragment weekTravelFragment=new WeekTravelFragment();//周末游
        fragmentList.add(aroundFragment);
        fragmentList.add(countryTravelFragment);
        fragmentList.add(outTravelFragment);
        fragmentList.add(weekTravelFragment);
        mPager.setAdapter(new MyFragmentPagerAdapter(getSupportFragmentManager(), (ArrayList<Fragment>) fragmentList));
        mPager.setCurrentItem(0);// 设置当前显示标签页为第一页
        mTvTravela.setTextColor(getResources().getColor(R.color.title_orange));
        mPager.setOnPageChangeListener(new MyOnPageChangeListener()); // 页面变化时的监听器
        mPager.setOffscreenPageLimit(3);
    }

    private void initTextBar(){
        barText = (TextView) super.findViewById(R.id.cursoraa);
        Display display = getWindow().getWindowManager().getDefaultDisplay();
        // 得到显示屏宽度
        DisplayMetrics metrics = new DisplayMetrics();
        display.getMetrics(metrics);
        // 1/3屏幕宽度
        int  tabLineLength = metrics.widthPixels / 4;
        LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) barText.getLayoutParams();
        lp.width = tabLineLength;
        barText.setLayoutParams(lp);


    }


    public class MyOnPageChangeListener implements ViewPager.OnPageChangeListener {

        @Override
        public void onPageScrolled(int arg0, float arg1, int arg2) {
            // TODO Auto-generated method stub
            // 取得该控件的实例
            LinearLayout.LayoutParams ll = (android.widget.LinearLayout.LayoutParams) barText
                    .getLayoutParams();

            if (currIndex == arg0) {
                ll.leftMargin = (int) (currIndex * barText.getWidth() + arg1
                        * barText.getWidth());
            } else if (currIndex > arg0) {
                ll.leftMargin = (int) (currIndex * barText.getWidth() - (1 - arg1)
                        * barText.getWidth());
            }
            barText.setLayoutParams(ll);

        }

        @Override
        public void onPageScrollStateChanged(int arg0) {
            // TODO Auto-generated method stub

        }

        @Override
        public void onPageSelected(int arg0) {
            // TODO Auto-generated method stub
            currIndex = arg0;
            int i = currIndex + 1;

            switch (arg0) {
                case 0:

                    mTvTravela.setTextColor(getResources().getColor(R.color.title_orange));

                    mTvTravelb.setTextColor(getResources().getColor(R.color.dark_3));

                    mTvTravelc.setTextColor(getResources().getColor(R.color.dark_3));

                    mTvTraveld.setTextColor(getResources().getColor(R.color.dark_3));


                    break;
                case 1:


                    mTvTravela.setTextColor(getResources().getColor(R.color.dark_3));
                    mTvTravelb.setTextColor(getResources().getColor(R.color.title_orange));

                    mTvTravelc.setTextColor(getResources().getColor(R.color.dark_3));

                    mTvTraveld.setTextColor(getResources().getColor(R.color.dark_3));

                    break;
                case 2:

                    mTvTravela.setTextColor(getResources().getColor(R.color.dark_3));
                    mTvTravelc.setTextColor(getResources().getColor(R.color.title_orange));

                    mTvTravelb.setTextColor(getResources().getColor(R.color.dark_3));
                    mTvTraveld.setTextColor(getResources().getColor(R.color.dark_3));

                    break;
                case 3:

                    mTvTravela.setTextColor(getResources().getColor(R.color.dark_3));
                    mTvTraveld.setTextColor(getResources().getColor(R.color.title_orange));

                    mTvTravelb.setTextColor(getResources().getColor(R.color.dark_3));

                    mTvTravelc.setTextColor(getResources().getColor(R.color.dark_3));

                    break;


                default:
                    break;
            }

        }
    }


    private void initListener(){
        mBack.setOnClickListener(this);
        mTvTravela.setOnClickListener(new txListener(0));
        mTvTravelb.setOnClickListener(new txListener(1));
        mTvTravelc.setOnClickListener(new txListener(2));
        mTvTraveld.setOnClickListener(new txListener(3));



    }
    public class txListener implements View.OnClickListener {
        private int index = 0;

        public txListener(int i) {
            index = i;
        }

        @Override
        public void onClick(View v) {
            mPager.setCurrentItem(index);

        }
    }

    @Override
    public void onClick(View view) {
         switch (view.getId()){
             case R.id.iv_back:
                 finish();
                 break;

            default:
                break;
        }
    }

}
