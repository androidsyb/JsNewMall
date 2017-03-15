package com.example.host.jsnewmall.activity;

import android.app.LocalActivityManager;
import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;
import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.adapter.MyFragmentPagerAdapter;
import com.example.host.jsnewmall.fragment.HotelFirstFragment;
import com.example.host.jsnewmall.fragment.HotelSecondFragment;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by host on 2017/2/21.
 */

/**
 * 酒店
 */

public class HotelActivity extends BaseActivity {

    private TextView barText;
    private ViewPager mPager;
    private NetworkImageView mNetHotelImga;
    private NetworkImageView mNetHotelImgb;
    private ImageView mImga;
    private ImageView mImgb;
    private List<Fragment> fragmentList;
    private int currIndex = 1;// 当前页卡编号
    private LinearLayout mBack;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_view);
        initView();
        initListener();

    }


    private void initView(){



        mBack=(LinearLayout)findViewById(R.id.iv_back);
        TextView mTitlename=(TextView) findViewById(R.id.tv_title_name_change);//标题修改
        mTitlename.setText(getApplicationContext().getResources().getString(R.string.hotel_a));

        ImageView mImgCall=(ImageView) findViewById(R.id.img_title_call);//标题电话图标
        ImageView mImgMessage=(ImageView) findViewById(R.id.img_title_message);//标题电话图标
        mImgCall.setVisibility(View.GONE);
        mImgMessage.setVisibility(View.GONE);

        barText = (TextView) findViewById(R.id.cursoraa);// 动画效果的线此处无效
        mPager=(ViewPager)findViewById(R.id.viewpagera);// viewpager
        mNetHotelImga=(NetworkImageView) findViewById(R.id.netimg_hotel_a);
        mNetHotelImgb=(NetworkImageView) findViewById(R.id.netimg_hotel_b);
        mImga=(ImageView) findViewById(R.id.img_hotel_a);//下划线a
        mImgb=(ImageView) findViewById(R.id.img_hotel_b);//下划线b

        mNetHotelImga.setBackground(getApplicationContext().getResources().getDrawable(R.mipmap.icon_hotel_title_a));
        mNetHotelImgb.setBackground(getApplicationContext().getResources().getDrawable(R.mipmap.icon_hotel_title_b));




        fragmentList = new ArrayList<Fragment>();
        HotelFirstFragment mFirstFragment=new HotelFirstFragment();
        HotelSecondFragment mSecondFragment=new HotelSecondFragment();
        fragmentList.add(mFirstFragment);
        fragmentList.add(mSecondFragment);

        mPager.setAdapter(new MyFragmentPagerAdapter(getSupportFragmentManager(), (ArrayList<Fragment>) fragmentList));
        mPager.setCurrentItem(0);// 设置当前显示标签页为第一页

        mPager.setOnPageChangeListener(new MyOnPageChangeListener()); // 页面变化时的监听器



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

                    mImga.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.title_orange));
                    mImgb.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.travel_title_bar));

                    break;
                case 1:
                    mImga.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.travel_title_bar));
                    mImgb.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.title_orange));

                    break;



                default:
                    break;
            }

        }
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


    private void initListener(){
        OnClickListenerImpl listener = new OnClickListenerImpl();
        mBack.setOnClickListener(listener);
        mNetHotelImga.setOnClickListener(new txListener(0));
        mNetHotelImgb.setOnClickListener(new txListener(1));


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
