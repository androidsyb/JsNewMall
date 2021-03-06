package com.example.host.jsnewmall.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.adapter.MyFragmentPagerAdapter;
import com.example.host.jsnewmall.fragment.TicketFirstFragment;
import com.example.host.jsnewmall.fragment.TicketSecondFragment;
import com.example.host.jsnewmall.fragment.TicketThirdFragment;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by host on 2017/2/21.
 */

/**
 * 门票
 */
public class TicketActivity extends BaseActivity {

    private LinearLayout mBack;
    private TextView barText;
    private ViewPager mPager;
    private TextView mTvticketa;
    private TextView mTvticketb;
    private TextView mTvticketc;
    private ImageView mImgTicketa;
    private ImageView mImgTicketb;
    private ImageView mImgTicketc;
    private List<Fragment> fragmentList;
    private int currIndex = 1;// 当前页卡编号


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_view);
        initView();
        initListener();
    }

    private void initView(){
        mBack=(LinearLayout)findViewById(R.id.iv_back);
        TextView mTitlename=(TextView) findViewById(R.id.tv_title_name_change);//标题修改
        mTitlename.setText(getApplicationContext().getResources().getString(R.string.ticket_a));

        ImageView mImgCall=(ImageView) findViewById(R.id.img_title_call);//标题电话图标
        ImageView mImgMessage=(ImageView) findViewById(R.id.img_title_message);//标题电话图标
        mImgCall.setVisibility(View.GONE);
        mImgMessage.setVisibility(View.GONE);

        barText = (TextView) findViewById(R.id.cursoraa);// 动画效果的线此处无效
        mPager=(ViewPager)findViewById(R.id.viewpagera);// viewpager
        mTvticketa=(TextView) findViewById(R.id.tv_ticket_a);//滑动标题一
        mTvticketb=(TextView) findViewById(R.id.tv_ticket_b);//滑动标题二
        mTvticketc=(TextView) findViewById(R.id.tv_ticket_c);//滑动标题三
        mImgTicketa=(ImageView) findViewById(R.id.img_ticket_a);//下划线一
        mImgTicketb=(ImageView) findViewById(R.id.img_ticket_b);//下划线二
        mImgTicketc=(ImageView) findViewById(R.id.img_ticket_c);//下划线三

        fragmentList = new ArrayList<Fragment>();
        TicketFirstFragment mFirstFragment=new TicketFirstFragment();
        TicketSecondFragment mSecondFragment=new TicketSecondFragment();
        TicketThirdFragment mThirdFragment=new TicketThirdFragment();
        fragmentList.add(mFirstFragment);
        fragmentList.add(mSecondFragment);
        fragmentList.add(mThirdFragment);

        mPager.setAdapter(new MyFragmentPagerAdapter(getSupportFragmentManager(), (ArrayList<Fragment>) fragmentList));
        mPager.setCurrentItem(0);// 设置当前显示标签页为第一页

        mPager.setOnPageChangeListener(new MyOnPageChangeListener()); // 页面变化时的监听器


    }

    private void initListener(){
        OnClickListenerImpl listener = new OnClickListenerImpl();
        mBack.setOnClickListener(listener);
        mTvticketa.setOnClickListener(new txListener(0));
        mTvticketb.setOnClickListener(new txListener(1));
        mTvticketc.setOnClickListener(new txListener(2));
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

                    mTvticketa.setTextColor(getApplicationContext().getResources().getColor(R.color.title_orange));
                    mImgTicketa.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.title_orange));
                    mTvticketb.setTextColor(getApplicationContext().getResources().getColor(R.color.dark_3));
                    mImgTicketb.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.travel_title_bar));
                    mTvticketc.setTextColor(getApplicationContext().getResources().getColor(R.color.dark_3));
                    mImgTicketc.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.travel_title_bar));

                    break;
                case 1:

                    mTvticketa.setTextColor(getApplicationContext().getResources().getColor(R.color.dark_3));
                    mImgTicketa.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.travel_title_bar));
                    mTvticketb.setTextColor(getApplicationContext().getResources().getColor(R.color.title_orange));
                    mImgTicketb.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.title_orange));
                    mTvticketc.setTextColor(getApplicationContext().getResources().getColor(R.color.dark_3));
                    mImgTicketc.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.travel_title_bar));



                    break;


                case 2:
                    mTvticketa.setTextColor(getApplicationContext().getResources().getColor(R.color.dark_3));
                    mImgTicketa.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.travel_title_bar));
                    mTvticketb.setTextColor(getApplicationContext().getResources().getColor(R.color.dark_3));
                    mImgTicketb.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.travel_title_bar));
                    mTvticketc.setTextColor(getApplicationContext().getResources().getColor(R.color.title_orange));
                    mImgTicketc.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.title_orange));
                    break;



                default:
                    break;
            }

        }
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
