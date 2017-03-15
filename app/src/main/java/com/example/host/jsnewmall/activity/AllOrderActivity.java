package com.example.host.jsnewmall.activity;

import android.os.Bundle;
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
import com.example.host.jsnewmall.fragment.CenterOrderaFragment;
import com.example.host.jsnewmall.fragment.CenterOrderbFragment;
import com.example.host.jsnewmall.fragment.CenterOrdercFragment;
import com.example.host.jsnewmall.fragment.CenterOrderdFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by host on 2017/3/14.
 */
//所有订单

/**
 * @{@"1":@"待审核",
 *@"2":@"待付款",
 *@"3":@"待确定",
 *@"4":@"已完成",
 *@"5":@"已取消",
 *@"6":@"已删除",
 *@"7":@"已作废",
 *@"8":@"待出游"};
 *
 */

public class AllOrderActivity extends BaseActivity {
    private LinearLayout mBack;
    private TextView mTvordera,mTvorderb,mTvorderc,mTvorderd;
    private ViewPager mPager;
    private List<Fragment> fragmentList;
    private TextView barText;
    private int currIndex = 1;// 当前页卡编号
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_order_view);
        initView();
        initListener();
        initTextBar();

        TextView mTitlename=(TextView)findViewById(R.id.tv_title_name_change);
        mTitlename.setText("我的订单");
        mTitlename.setTextColor(getApplicationContext().getResources().getColor(R.color.dark_3));
        ImageView mImgMore=(ImageView)findViewById(R.id.img_title_message);//更多图案
        mImgMore.setVisibility(View.GONE);
    }

    private void initView(){
        mBack=(LinearLayout)findViewById(R.id.iv_back);//返回

        mPager=(ViewPager)findViewById(R.id.viewpagera);// viewpager
        mTvordera =(TextView)findViewById(R.id.order_content_a);//全部
        mTvorderb =(TextView)findViewById(R.id.order_content_b);//待审核
        mTvorderc =(TextView)findViewById(R.id.order_content_c);//待付款
        mTvorderd =(TextView)findViewById(R.id.order_content_d);//待出游



        fragmentList = new ArrayList<Fragment>();
        CenterOrderaFragment OrderaFragment=new CenterOrderaFragment();//全部
        CenterOrderbFragment OrderbFragment=new CenterOrderbFragment();//待审核
        CenterOrdercFragment OrdercFragment=new CenterOrdercFragment();//待付款
        CenterOrderdFragment OrderdFragment=new CenterOrderdFragment();//待出游
        fragmentList.add(OrderaFragment);
        fragmentList.add(OrderbFragment);
        fragmentList.add(OrdercFragment);
        fragmentList.add(OrderdFragment);
        mPager.setAdapter(new MyFragmentPagerAdapter(getSupportFragmentManager(), (ArrayList<Fragment>) fragmentList));
        mPager.setCurrentItem(0);// 设置当前显示标签页为第一页
        mTvordera.setTextColor(getResources().getColor(R.color.title_orange));
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

    private void initListener(){
        OnClickListenerImpl listener = new OnClickListenerImpl();
        mBack.setOnClickListener(listener);
        mTvordera.setOnClickListener(new txListener(0));
        mTvorderb.setOnClickListener(new txListener(1));
        mTvorderc.setOnClickListener(new txListener(2));
        mTvorderd.setOnClickListener(new txListener(3));
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
                    setTitleBgcolor(mTvordera,mTvorderb,mTvorderc,mTvorderd);
                    break;
                case 1:
                    setTitleBgcolor(mTvorderb,mTvordera,mTvorderc,mTvorderd);
                    break;
                case 2:

                    setTitleBgcolor(mTvorderc,mTvordera,mTvorderb,mTvorderd);
                    break;
                case 3:
                    setTitleBgcolor(mTvorderd,mTvordera,mTvorderb,mTvorderc);
                    break;


                default:
                    break;
            }

        }
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


    private void setTitleBgcolor(TextView tva,TextView tvb,TextView tvc,TextView tvd){
        tva.setTextColor(getResources().getColor(R.color.title_orange));

        tvb.setTextColor(getResources().getColor(R.color.dark_3));

        tvc.setTextColor(getResources().getColor(R.color.dark_3));

        tvd.setTextColor(getResources().getColor(R.color.dark_3));
    }
}