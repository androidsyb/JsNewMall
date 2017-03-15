package com.example.host.jsnewmall.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PersistableBundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.example.host.jsnewmall.R;

import com.example.host.jsnewmall.adapter.SearchResultAdapter;
import com.example.host.jsnewmall.model.HomeViewPagerInfo;
import com.example.host.jsnewmall.model.ResultbInfo;
import com.example.host.jsnewmall.model.ResultcInfo;
import com.example.host.jsnewmall.model.ResultdInfo;
import com.example.host.jsnewmall.view.HomeForthGridView;
import com.example.host.jsnewmall.view.ResultaPopView;
import com.example.host.jsnewmall.view.ResultbPopView;
import com.example.host.jsnewmall.view.ResultcPopView;
import com.example.host.jsnewmall.view.ResultdPopView;
import com.yyydjk.library.DropDownMenu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by host on 2017/2/21.
 */

public class SearchResultActivity extends BaseActivity {


    private static final int FINISH_CODE=100;
    private static final int FINISH_CODE_B=101;
    private static final int FINISH_CODE_C=102;
    private static final int FINISH_CODE_D=103;
    private LinearLayout mBack;
    private LinearLayout mLnSearchAgain;

    private String headers[] = {"城市", "年龄", "性别"};
    private String citys[] = {"武汉", "北京", "上海", "成都", "广州", "深圳"};
    private String ages[] = {"18岁以下", "18-22岁", "23-26岁", "27-35岁", "35岁以上"};
    private String arrtemps[]={"数据一", "数据二", "数据三", "数据四", "数据五",};

    private ListView mListResult;
    private RequestQueue queue;
    private LinearLayout mLnResulta;
    private LinearLayout mLnResultb;
    private LinearLayout mLnResultc;
    private LinearLayout mLnResultd;
    private List<HomeViewPagerInfo> dataList;
    private List<ResultbInfo> dataListb;
    private List<ResultcInfo> dataListc;
    private List<ResultdInfo> dataListd;
    private String resultdata;
    private TextView mTvResulta;
    private String resultdatab;
    private TextView mTvResultb;
    private TextView mTvResultc;
    private TextView mTvResultd;
    private String resultdatac;
    private String resultdatad;

    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            switch (msg.what) {
                case FINISH_CODE:
                    setTextViewBackColor(mTvResulta,resultdata);
                    break;
                case FINISH_CODE_B:
                    setTextViewBackColor(mTvResultb,resultdatab);
                    break;
                case FINISH_CODE_C:
                    setTextViewBackColor(mTvResultc,resultdatac);
                    break;
                case FINISH_CODE_D:
                    setTextViewBackColor(mTvResultd,resultdatad);
                    break;
                default:
                    break;

            };
        }
    };

                    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result_view);
        initView();
        initListener();
    }
    private void initView(){


        dataList = new ArrayList<>();
        for (int i=0; i<5; i++){
            HomeViewPagerInfo pt = new HomeViewPagerInfo(arrtemps[i]);
            dataList.add(pt);
        }

        dataListb=new ArrayList<>();
        for (int i=0; i<5; i++){
            ResultbInfo ptb = new ResultbInfo(ages[i]);
            dataListb.add(ptb);
        }
        dataListc=new ArrayList<>();
        for (int i=0; i<6; i++){
            ResultcInfo ptc = new ResultcInfo(citys[i]);
            dataListc.add(ptc);
        }
        dataListd=new ArrayList<>();
        for (int i=0; i<3; i++){
            ResultdInfo ptd = new ResultdInfo(headers[i]);
            dataListd.add(ptd);
        }

        queue = Volley.newRequestQueue(getApplicationContext());
        mBack=(LinearLayout) findViewById(R.id.iv_back);//返回按钮
        mLnSearchAgain= (LinearLayout) findViewById(R.id.tv_search_address_again);//搜索框点击
        mListResult=(ListView) findViewById(R.id.result_listview_a);//结果列表
        SearchResultAdapter mListAdapter=new SearchResultAdapter(getApplicationContext(),queue);
        mListResult.setAdapter(mListAdapter);
//        HomeForthGridView.setListViewHeight(mListResult);
//        mListResult.deferNotifyDataSetChanged();

        mLnResulta=(LinearLayout) findViewById(R.id.ln_searchresult_a);//推荐排序
        mLnResultb=(LinearLayout) findViewById(R.id.ln_searchresult_b);//游玩方式
        mLnResultc=(LinearLayout) findViewById(R.id.ln_searchresult_c);//行程天数
        mLnResultd=(LinearLayout) findViewById(R.id.ln_searchresult_d);//筛选
        mTvResulta=(TextView) findViewById(R.id.tv_searchresult_a);
        mTvResultb=(TextView) findViewById(R.id.tv_searchresult_b);
        mTvResultc=(TextView) findViewById(R.id.tv_searchresult_c);
        mTvResultd=(TextView) findViewById(R.id.tv_searchresult_d);





    }

    private void initListener(){
        OnClickListenerImpl listener=new OnClickListenerImpl();
        mBack.setOnClickListener(listener);
        mLnSearchAgain.setOnClickListener(listener);
        mLnResulta.setOnClickListener(listener);
        mLnResultb.setOnClickListener(listener);
        mLnResultc.setOnClickListener(listener);
        mLnResultd.setOnClickListener(listener);

    }


    private class OnClickListenerImpl implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            switch(view.getId()){
                case R.id.iv_back:
                    finish();
                    break;
                case R.id.tv_search_address_again:
                    Intent intent=new Intent(getApplicationContext(),SearchActivity.class);
                    startActivity(intent);
                    finish();
                    break;

                case R.id.ln_searchresult_a:
                    ResultaPopView mResultaPopView=new ResultaPopView(SearchResultActivity.this, dataList, new ResultaPopView.CallBackUi() {
                        @Override
                        public void onRequestUi(String resulta) {
                             resultdata=resulta;
                            handler.sendEmptyMessage(FINISH_CODE);
                        }
                    });
                    mResultaPopView.showpop(view);
                    break;
                case R.id.ln_searchresult_b:

                    ResultbPopView mResultaPopViewb=new ResultbPopView(SearchResultActivity.this, dataListb, new ResultbPopView.CallBackUi() {
                        @Override
                        public void onRequestUi(String resultb) {
                            resultdatab=resultb;
                            handler.sendEmptyMessage(FINISH_CODE_B);
                        }
                    });
                    mResultaPopViewb.showpop(view);

                    break;
                case R.id.ln_searchresult_c:
                    ResultcPopView mResultaPopViewc=new ResultcPopView(SearchResultActivity.this, dataListc, new ResultcPopView.CallBackUi() {
                        @Override
                        public void onRequestUi(String resultc) {
                            resultdatac=resultc;
                            handler.sendEmptyMessage(FINISH_CODE_C);
                        }
                    });
                    mResultaPopViewc.showpop(view);
                    break;
                case R.id.ln_searchresult_d:
                    ResultdPopView mResultaPopViewd=new ResultdPopView(SearchResultActivity.this, dataListd, new ResultdPopView.CallBackUi() {
                        @Override
                        public void onRequestUi(String resultd) {
                            resultdatad=resultd;
                            handler.sendEmptyMessage(FINISH_CODE_D);
                        }
                    });
                    mResultaPopViewd.showpop(view);

                    break;
                default:
                    break;

            }
        }


    }

    private void setTextViewBackColor(TextView mTview,String data){
        mTview.setText(data);
        mTview.setTextColor(getApplicationContext().getResources().getColor(R.color.title_orange));
    }

}
