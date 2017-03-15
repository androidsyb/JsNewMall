package com.example.host.jsnewmall.activity;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.adapter.HomeFifthGridAdapter;
import com.example.host.jsnewmall.adapter.HomeForthGridAdapter;
import com.example.host.jsnewmall.adapter.HomeGviewaAdapter;
import com.example.host.jsnewmall.adapter.HomeGviewbAdapter;
import com.example.host.jsnewmall.adapter.HomeSixthListAdapter;
import com.example.host.jsnewmall.adapter.HomeThirdGridAdapter;
import com.example.host.jsnewmall.fragment.AddressFragment;
import com.example.host.jsnewmall.fragment.CenterFragment;
import com.example.host.jsnewmall.fragment.CustomerFragment;
import com.example.host.jsnewmall.fragment.HomeFragment;
import com.example.host.jsnewmall.view.HomeForthGridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {

    public static RadioGroup mRadioGroup;
    private FragmentManager fManager;
    private HomeFragment homeFragment;
    private AddressFragment addressFragment;
    private CustomerFragment customerFragment;
    private CenterFragment centerFragment;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }

        initView();
        initFragment();
        initListener();





//        GridView mGvThird= (GridView) findViewById(R.id.gv_home_third_content);
//        HomeThirdGridAdapter mThirdAdapter=new HomeThirdGridAdapter(getApplicationContext());
//        mGvThird.setAdapter(mThirdAdapter);
//        GridView mGvForth= (GridView) findViewById(R.id.gv_home_forth_content);//热门推荐
//        HomeForthGridAdapter mForthAdapter=new HomeForthGridAdapter(getApplicationContext());
//        mGvForth.setAdapter(mForthAdapter);
//        HomeForthGridView.setListViewHeightBasedOnChildren(mGvForth);
//        mGvForth.deferNotifyDataSetChanged();
//
////        int size = 4;//设置横向数据多少
////        int length = 150;
//        GridView mGvFifth=(GridView)findViewById(R.id.gv_home_fifth_content);//精品路线推荐
//        DisplayMetrics dm = new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(dm);
//        float density = dm.density;
//        HomeForthGridView.setHorizontalScroll(mGvFifth,density,4,150);
//        HomeFifthGridAdapter mFifthAdapter=new HomeFifthGridAdapter(getApplicationContext());
//        mGvFifth.setAdapter(mFifthAdapter);
//        mGvFifth.deferNotifyDataSetChanged();
//
//
//
//
//        ListView mListView= (ListView) findViewById(R.id.listview_home_content);//listview 的列表
//        HomeSixthListAdapter mSixthAdapter=new HomeSixthListAdapter(getApplicationContext());
//        mListView.setAdapter(mSixthAdapter);
//        HomeForthGridView.setListViewHeight(mListView);
//        mListView.deferNotifyDataSetChanged();







    }



    private void initView(){
        mRadioGroup = (RadioGroup) findViewById(R.id.rg_activity_main_group);
        RadioButton mHomeButton=(RadioButton) findViewById(R.id.rbtn_activity_main_home_page);
        RadioButton mAddressButton=(RadioButton) findViewById(R.id.rbtn_activity_main_address);
        RadioButton mCustomerButton=(RadioButton) findViewById(R.id.rbtn_activity_main_customer);
        RadioButton mMineButton=(RadioButton) findViewById(R.id.rbtn_activity_main_mine);

        Drawable drawableWeiHui = getResources().getDrawable(R.drawable.main_bottom_home_selector);
        drawableWeiHui.setBounds(0, 0, 40, 40);//第一0是距左右边距离，第二0是距上下边距离，第三69长度,第四宽度
        mHomeButton.setCompoundDrawables(null, drawableWeiHui, null, null);//只放上面

        Drawable drawableWeiHuia = getResources().getDrawable(R.drawable.main_bottom_address_selector);
        drawableWeiHuia.setBounds(0, 0,40, 40);//第一0是距左右边距离，第二0是距上下边距离，第三69长度,第四宽度
        mAddressButton.setCompoundDrawables(null, drawableWeiHuia, null, null);//只放上面

        Drawable drawableWeiHuib = getResources().getDrawable(R.drawable.main_bottom_customer_selector);
        drawableWeiHuib.setBounds(0, 0, 40, 40);//第一0是距左右边距离，第二0是距上下边距离，第三69长度,第四宽度
        mCustomerButton.setCompoundDrawables(null, drawableWeiHuib, null, null);//只放上面

        Drawable drawableWeiHuic = getResources().getDrawable(R.drawable.main_bottom_mine_selector);
        drawableWeiHuic.setBounds(0, 0, 40, 40);//第一0是距左右边距离，第二0是距上下边距离，第三69长度,第四宽度
        mMineButton.setCompoundDrawables(null, drawableWeiHuic, null, null);//只放上面
    }


    private void initFragment() {
        fManager = getSupportFragmentManager();
        homeFragment = (HomeFragment) fManager.findFragmentById(R.id.home);
        addressFragment = (AddressFragment) fManager.findFragmentById(R.id.donation);
        customerFragment = (CustomerFragment) fManager.findFragmentById(R.id.offered);
        centerFragment = (CenterFragment) fManager.findFragmentById(R.id.center);
        fragmentTransaction = fManager.beginTransaction().hide(homeFragment).hide(addressFragment)
                .hide(customerFragment).hide(centerFragment);
        fragmentTransaction.show(homeFragment).commit();


        mRadioGroup.check(mRadioGroup.getChildAt(0).getId());
    }

    private void initListener() {
        OnCheckedChangeListenerImpl listener = new OnCheckedChangeListenerImpl();
        mRadioGroup.setOnCheckedChangeListener(listener);
    }


    private class OnCheckedChangeListenerImpl implements RadioGroup.OnCheckedChangeListener {

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            fragmentTransaction = fManager.beginTransaction().hide(homeFragment).hide(addressFragment)
                    .hide(customerFragment).hide(centerFragment);
            switch (checkedId) {
                case R.id.rbtn_activity_main_home_page:
                    fragmentTransaction.show(homeFragment).commitAllowingStateLoss();
                    // homePageFragment.lazyLoad();
                    break;
                case R.id.rbtn_activity_main_address:


                    fragmentTransaction.show(addressFragment).commitAllowingStateLoss();
                    break;
                case R.id.rbtn_activity_main_customer:

                    fragmentTransaction.show(customerFragment).commitAllowingStateLoss();
                    break;
                case R.id.rbtn_activity_main_mine:
//                centerFragment.lazyLoad();
                    fragmentTransaction.show(centerFragment).commitAllowingStateLoss();
                    break;
                default:
                    break;
            }
        }

    }




    @Override
    protected void onResume() {
        super.onResume();
        int id =getIntent().getIntExtra("id",0);
        if (id==1){
            fragmentTransaction = fManager.beginTransaction().hide(homeFragment).hide(addressFragment)
                    .hide(customerFragment).hide(centerFragment);
            fragmentTransaction.show(homeFragment).commit();


            mRadioGroup.check(mRadioGroup.getChildAt(0).getId());
        }
    }
}
