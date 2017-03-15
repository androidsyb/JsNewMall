package com.example.host.jsnewmall.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
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
import com.example.host.jsnewmall.utils.VolleyController;
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

    private SimpleDateFormat mSimpleTime;
    private String nTime;
    Gson gson=new Gson();
    private LoginUserEntry userinfo;
    private CenterOrderaEntry mOrderaInfo;
    private PullableListView mListview;
    private int currentpage=1;
    private CenterOrderaAdapter adaptera;
    private List<CenterOrderaEntry.OrderlistBean> mBodyListaa;
    private int mCurrentAction = 0; //默认0，1表示刷新，2表示加载

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
                mCurrentAction = 1;     //当前处于下拉刷新状态
                currentpage = 1;
                initData();

            }

            @Override
            public void onLoadMore(final PullToRefreshLayout pullToRefreshLayout) {
                mCurrentAction = 2; //当前处于上啦加载状态
                currentpage++;
                initData();
            }
        });
    }


    protected  void dohttpOrderaInfo(String url,JSONObject  paramhash){

        /**
         * volley用法 json请求  参数1 请求方式  get post
         *                      参数2 url   参数3 json串 参数4 成功响应 参数5 失败响应
         */
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.POST, UrlUtils.getBaseUrl() + url, paramhash,
                new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    String body = Base64Utils.getFromBase64(response.getString("body"));
                    mOrderaInfo=gson.fromJson(body, CenterOrderaEntry.class);
                    refreshData();
                    if (mCurrentAction == 1){
                        mPullLayout.refreshFinish(PullToRefreshLayout.SUCCEED); //刷新结束
                    }else if (mCurrentAction == 2){
                        mPullLayout.loadmoreFinish(PullToRefreshLayout.SUCCEED);    //加载结束
                    }
                    mCurrentAction = 0; //重置当前状态
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                Log.d("zhaofen",response.toString());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("zhaofen",error.toString());
            }
        });
        VolleyController.getInstance(getContext()).addToRequestQueue(request);
    }

    private void refreshData(){
        List<CenterOrderaEntry.OrderlistBean> mBodyList = mOrderaInfo.getOrderlist();
        if (mCurrentAction == 1) {
            mBodyListaa.clear();
        }
        mBodyListaa.addAll(mBodyList);
        if (adaptera==null) {
            adaptera = new CenterOrderaAdapter(getActivity(), mBodyListaa);
            mListview.setAdapter(adaptera);
        }else {
            adaptera.notifyDataSetChanged();
        }
    }


}
