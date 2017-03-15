package com.example.host.jsnewmall.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.adapter.SearchAdapter;
import com.example.host.jsnewmall.adapter.SearchHistoryAdapter;
import com.example.host.jsnewmall.view.HomeForthGridView;

/**
 * Created by host on 2017/2/21.
 */

public class SearchActivity extends BaseActivity {
    private LinearLayout mLnSearch;
    private EditText mEtSsearch;
    private TextView mTvBack;
    private GridView mGvSearcha;
    private GridView mGvSearchb;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_view);
        initView();
        initListener();
    }



    private void initView(){
         mLnSearch=(LinearLayout) findViewById(R.id.ln_search_a);
         mEtSsearch=(EditText) findViewById(R.id.et_search);//搜索框
         mTvBack=(TextView) findViewById(R.id.tv_search_dismiss);//取消按钮
         mGvSearcha=(GridView) findViewById(R.id.gv_search_content_a);//热门搜索
         SearchAdapter mSearchAdapter=new SearchAdapter(getApplicationContext());
         mGvSearcha.setAdapter(mSearchAdapter);
         HomeForthGridView.setListViewHeightBasedOnChildren(mGvSearcha);
         mGvSearcha.deferNotifyDataSetChanged();

         mGvSearchb=(GridView) findViewById(R.id.gv_search_content_b);//历史记录
         SearchHistoryAdapter mHistoryAdapter=new SearchHistoryAdapter(getApplicationContext());
         mGvSearchb.setAdapter(mHistoryAdapter);
         HomeForthGridView.setListViewHeightBasedOnChildren(mGvSearchb);
         mGvSearchb.deferNotifyDataSetChanged();




    }

    private void initListener(){
        OnClickListenerImpl listener=new OnClickListenerImpl();
        mTvBack.setOnClickListener(listener);


            mEtSsearch.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (mEtSsearch.getText().toString().trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "请输入搜索内容", Toast.LENGTH_SHORT).show();
                }else{

                    if (actionId == EditorInfo.IME_ACTION_SEARCH) {

                        // 先隐藏键盘
                        ((InputMethodManager) mEtSsearch.getContext().getSystemService(INPUT_METHOD_SERVICE))
                                .hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);


                        //跳转activity

                        Intent intent = new Intent();
                        intent.setClass(getApplicationContext(), SearchResultActivity.class);
                        startActivity(intent);
                        finish();


                        // 将查询的数据插入数据库

//                    mDbHelper.insert_search_history(searchText.getText().toString(), getStringDate());

                        return true;
                    }
                }




                return false;
            }
        });
    }





    private class OnClickListenerImpl implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            switch(view.getId()){
                case R.id.tv_search_dismiss:
                    finish();
                    break;
                default:
                    break;

            }


        }


    }


}
