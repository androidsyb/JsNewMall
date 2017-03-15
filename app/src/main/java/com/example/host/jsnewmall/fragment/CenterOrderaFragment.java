package com.example.host.jsnewmall.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.adapter.CenterOrderaAdapter;
import com.example.host.jsnewmall.model.CenterOrderaEntry;
import com.example.host.jsnewmall.model.JsonmModel;
import com.example.host.jsnewmall.model.LoginUserEntry;
import com.example.host.jsnewmall.utils.Base64Utils;
import com.example.host.jsnewmall.utils.HttpUtils;
import com.example.host.jsnewmall.utils.JsonUtils;
import com.example.host.jsnewmall.utils.SharedPreferencesUtils;
import com.example.host.jsnewmall.utils.ToastUtils;
import com.example.host.jsnewmall.utils.UrlUtils;
import com.example.host.jsnewmall.view.RefreshScrollView.PullToRefreshLayout;
import com.example.host.jsnewmall.view.RefreshScrollView.PullableListView;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by host on 2017/3/14.
 */

public class CenterOrderaFragment extends BaseFragment {
    private View view;
    private PullToRefreshLayout mPullLayout;
    private static final int FINISH_CODE=100;

    private SimpleDateFormat mSimpleTime;
    private String nTime;
    Gson gson=new Gson();
    private LoginUserEntry userinfo;
    private CenterOrderaEntry mOrderaInfo;
    private PullableListView mListview;
    private int currentpage=1;
    private CenterOrderaAdapter adaptera;
    private List<CenterOrderaEntry.OrderlistBean> mBodyListaa;
    private boolean refreshState = false;
    private int mCurrentAction = 0; //默认0，1表示刷新，2表示加载

    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            switch (msg.what) {
                case FINISH_CODE:
                    List<CenterOrderaEntry.OrderlistBean> mBodyList = mOrderaInfo.getOrderlist();


                    if (refreshState) {
                        mBodyListaa.clear();
                        refreshState = false;
                    }
                    mBodyListaa.addAll(mBodyList);
                    if (adaptera==null) {
                        adaptera = new CenterOrderaAdapter(getActivity(), mBodyListaa);
                        mListview.setAdapter(adaptera);
                    }else {
                        adaptera.notifyDataSetChanged();
                    }


                    break;
                default:
                    break;

            };
        }
    };



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_center_order_a_content,null);
        Date d=new Date();
        mSimpleTime=new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        nTime=mSimpleTime.format(d);
        mBodyListaa = new ArrayList<CenterOrderaEntry.OrderlistBean>();
        userinfo=gson.fromJson(SharedPreferencesUtils.getUserInfo(getActivity()),LoginUserEntry.class);
        initData();
        initView();
        initListener();
        return view;
    }

    private void initData(){


        JSONObject jbody=null;
        try {
            jbody = new JSONObject();
            jbody.put("user_id",userinfo.getUserid());
            jbody.put("order_state",0);//
            jbody.put("page",currentpage);//页数
            jbody.put("method","QueryOrderList");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        JSONObject jbodyB= JsonUtils.JsonParseInfo(nTime,jbody);
        dohttpOrderaInfo(UrlUtils.ROUTE_LINE,jbodyB);

    }


    private void initView(){
        mPullLayout=(PullToRefreshLayout)view.findViewById(R.id.refresh_view_ordera);//布局刷新监听
        mListview=(PullableListView)view.findViewById(R.id.content_view);//listview
    }
    private void initListener(){
        mPullLayout.setOnRefreshListener(new PullToRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh(final PullToRefreshLayout pullToRefreshLayout) {
                refreshState = true;
                currentpage = 1;
                initData();
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
                currentpage++;
                initData();
                new Handler(){
                    @Override
                    public void handleMessage(Message msg) {
                        pullToRefreshLayout.loadmoreFinish(PullToRefreshLayout.SUCCEED);
                    }
                }.sendEmptyMessageDelayed(0,3000);
            }
        });
    }


    protected  void dohttpOrderaInfo(String url,JSONObject  paramhash){
        HttpUtils.dopost(url,getActivity(),paramhash, new HttpUtils.CallBack() {
            @Override
            public void onRequestComplete(String result) {

                JsonmModel homeinfoa=gson.fromJson(result,JsonmModel.class);
                String body= Base64Utils.getFromBase64(homeinfoa.getBody());
                mOrderaInfo=gson.fromJson(body, CenterOrderaEntry.class);
                handler.sendEmptyMessage(FINISH_CODE);
            }

            @Override
            public void onRequestErr(String err) {

            }
        });

    }




}
