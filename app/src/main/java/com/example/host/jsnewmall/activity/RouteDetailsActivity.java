package com.example.host.jsnewmall.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.adapter.DingzViewPagerAdapter;


import com.example.host.jsnewmall.adapter.RouteGridAdapter;
import com.example.host.jsnewmall.adapter.RouteListaAdapter;
import com.example.host.jsnewmall.adapter.RouteViewPagerAdapter;
import com.example.host.jsnewmall.model.HomeViewPagerInfo;
import com.example.host.jsnewmall.model.JsonmModel;
import com.example.host.jsnewmall.model.LineRouteEntry;
import com.example.host.jsnewmall.utils.Base64Utils;
import com.example.host.jsnewmall.utils.HttpUtils;
import com.example.host.jsnewmall.utils.JsonUtils;
import com.example.host.jsnewmall.utils.ToastUtils;
import com.example.host.jsnewmall.utils.UrlUtils;
import com.example.host.jsnewmall.view.HomeForthGridView;
import com.google.gson.Gson;


import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by host on 2017/2/27.
 */

public class RouteDetailsActivity extends BaseActivity {
    private ImageView mImgMore,mImgCall;


    private  TextView mTvRouteDetaila,mTvRouteDetailaa;
    private TextView mTvRouteDetailb,mTvRouteDetailbb;
    private  TextView mTvRouteDetailc,mTvRouteDetailcc;
    private ImageView  mImgRoutea,mImgRouteaa;
    private ImageView  mImgRouteb,mImgRoutebb;
    private ImageView  mImgRoutec,mImgRoutecc;

    private LinearLayout mBack;
    private ViewPager mBannnerpager;


    private String[] arrTexta = new String[]{"http://pic6.huitu.com/res/20130116/84481_20130116142820494200_1.jpg",
            "http://img02.tooopen.com/images/20140504/sy_60294738471.jpg",
            "http://pic73.nipic.com/file/20150724/18576408_175304314596_2.jpg"};
    private RequestQueue queue;
    private static final int FINISH_CODE=100;
    private static final int START_PLAY = 1;
    private static final int REFRESH_PLAY = 2;
    private static final int CHANGE_PLAY = 3;
    private static final int STOP_PLAY = 4;
    private static final int MSG_DELAY = 3000;

    private int currentPager = 0;

    private ListView mRouteListViewa;
    private  LinearLayout mLinearBtnGroup;
    private View headerbanner;
    private View headerbtngroup;
    private View footerView;
    private View headerdateselect;
    private TextView mTvDingzhiTravel;
    private GridView mGvDateView;
    private RouteGridAdapter mGvAdapter;
    private SimpleDateFormat mSimpleTime;
    private String nTime;
    Gson gson=new Gson();
    private LineRouteEntry bodyinfo;
    private LinearLayout dot_layout;
    private RouteViewPagerAdapter mRouteViewPagerAdapter;
    private TextView mTvtitlea;
    private TextView mTvPrice;
    private TextView mTvDate;
    private TextView mTvSubmit;
    private LinearLayout mLnDateSelectLayout;

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
                    if (mRouteViewPagerAdapter == null) {
                        mRouteViewPagerAdapter = new RouteViewPagerAdapter(getApplicationContext(),queue,bodyinfo);
                        mBannnerpager.setAdapter(mRouteViewPagerAdapter);
                    } else {
                        mRouteViewPagerAdapter.notifyDataSetChanged();
                    }
                    handler.sendEmptyMessageDelayed(START_PLAY, MSG_DELAY);
                    if (bodyinfo.getData_img().size() != 1) {

                        setDot(bodyinfo.getData_img().size());
                    }
                    break;
                case REFRESH_PLAY:
                    currentPager++;
                    mBannnerpager.setCurrentItem(currentPager);
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




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_route_details_content);
        Date d=new Date();
        mSimpleTime=new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        nTime=mSimpleTime.format(d);
        initData();
        mImgMore=(ImageView)findViewById(R.id.img_title_message);
        mImgCall=(ImageView) findViewById(R.id.img_title_call);
        mImgCall.setVisibility(View.GONE);
        mImgMore.setBackgroundResource(R.mipmap.icon_search_more);
        TextView mTvtitle=(TextView) findViewById(R.id.tv_title_name_change);
        mTvtitle.setText(getApplicationContext().getResources().getString(R.string.route_details_b));


    }


    private void initData(){

        JSONObject jbody=null;
        try {
            jbody = new JSONObject();
            jbody.put("lines_id",13510);
            jbody.put("method","GetLines");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        JSONObject jbodyB= JsonUtils.JsonParseInfo(nTime,jbody);
        doRouteline(UrlUtils.ROUTE_LINE,jbodyB);

    }

    private void initView(){
        queue = Volley.newRequestQueue(getApplicationContext());
//        bannerInfoList = new ArrayList<>();
//        for (int i=0; i<3; i++){
//            HomeViewPagerInfo pt = new HomeViewPagerInfo(arrTexta[i]);
//            bannerInfoList.add(pt);
//        }

        mBack=(LinearLayout)findViewById(R.id.iv_back);//返回键



        mRouteListViewa=(ListView) findViewById(R.id.lv_route_a);//第一个listview
        mLinearBtnGroup=(LinearLayout) findViewById(R.id.ln_route_a);//影藏的按钮组(3个)

        headerbanner= LayoutInflater.from(RouteDetailsActivity.this).inflate(R.layout.activity_route_details_first_view, null);//添加轮播图为头部


        headerbtngroup= LayoutInflater.from(RouteDetailsActivity.this).inflate(R.layout.activity_route_details_second_viewpager_title, null);

        headerdateselect= LayoutInflater.from(RouteDetailsActivity.this).inflate(R.layout.headerview_route_gridview_selectdate, null);//团期选择


        footerView=LayoutInflater.from(RouteDetailsActivity.this).inflate(R.layout.footerview_route_first_listview, null);
        mTvDingzhiTravel=(TextView)footerView.findViewById(R.id.route_dingzhi);//跳转定制游
        mTvSubmit=(TextView)findViewById(R.id.tv_change_first_content_c);//我要预订

        mGvDateView=(GridView) headerdateselect.findViewById(R.id.gv_route_date_select);//gridview展示的4个选择框
        mGvAdapter=new RouteGridAdapter(getApplicationContext());
        mGvDateView.setAdapter(mGvAdapter);
        mLnDateSelectLayout=(LinearLayout)headerdateselect.findViewById(R.id.route_tuanqi_select);//团期选择整个布局
        if((bodyinfo.getData_base().getLines_from()).equals("3")){
            mLnDateSelectLayout.setVisibility(View.GONE);
        }else {
            mLnDateSelectLayout.setVisibility(View.VISIBLE);
        }



        mRouteListViewa.addFooterView(footerView);//添加底部布局(定制点击)

        mRouteListViewa.addHeaderView(headerbanner);
        mRouteListViewa.addHeaderView(headerdateselect);
        mRouteListViewa.addHeaderView(headerbtngroup);

        RouteListaAdapter adaptera=new RouteListaAdapter(getApplicationContext(),queue,bodyinfo);//第一个listview数据填充
        mRouteListViewa.setAdapter(adaptera);




        mRouteListViewa.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {

            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem,int visibleItemCount, int totalItemCount) {
                if (firstVisibleItem >= 2) {
                    mLinearBtnGroup.setVisibility(View.VISIBLE);
                } else {

                    mLinearBtnGroup.setVisibility(View.GONE);
                }
            }
        });


         mBannnerpager=(ViewPager)headerbanner.findViewById(R.id.route_details_viewpager);//轮播图
         dot_layout = (LinearLayout) headerbanner.findViewById(R.id.ll_dot);//轮播点布局
         mTvtitlea =(TextView)headerbanner.findViewById(R.id.tv_route_details_title_a);//第一个标题
         mTvPrice=(TextView)headerbanner.findViewById(R.id.tv_route_content_c);//轮播图下价格显示
         mTvDate=(TextView)headerbanner.findViewById(R.id.tv_route_content_b);//轮播图下日期显示

         mTvRouteDetaila=(TextView) headerbtngroup.findViewById(R.id.tv_routedetail_a);//tab1
         mTvRouteDetailb=(TextView) headerbtngroup.findViewById(R.id.tv_routedetail_b);
         mTvRouteDetailc=(TextView) headerbtngroup.findViewById(R.id.tv_routedetail_c);
         mImgRoutea=(ImageView)headerbtngroup.findViewById(R.id.img_routedetail_a);//tab1的下滑线
         mImgRouteb=(ImageView)headerbtngroup.findViewById(R.id.img_routedetail_b);
         mImgRoutec=(ImageView)headerbtngroup.findViewById(R.id.img_routedetail_c);

        mTvRouteDetailaa=(TextView) mLinearBtnGroup.findViewById(R.id.tv_routedetail_a);//tab1
        mTvRouteDetailbb=(TextView) mLinearBtnGroup.findViewById(R.id.tv_routedetail_b);
        mTvRouteDetailcc=(TextView) mLinearBtnGroup.findViewById(R.id.tv_routedetail_c);
        mImgRouteaa=(ImageView)mLinearBtnGroup.findViewById(R.id.img_routedetail_a);//tab1的下滑线
        mImgRoutebb=(ImageView)mLinearBtnGroup.findViewById(R.id.img_routedetail_b);
        mImgRoutecc=(ImageView)mLinearBtnGroup.findViewById(R.id.img_routedetail_c);




        mTvtitlea.setText(bodyinfo.getData_base().getLines_name());
        mTvPrice.setText(bodyinfo.getData_base().getSaleprice());
        mTvDate.setText(bodyinfo.getData_base().getLines_days()+"天"+bodyinfo.getData_base().getLines_daysnight()+"晚");


    }
    private void initListener(){

        OnClickListenerImpl listener = new OnClickListenerImpl();
        mBack.setOnClickListener(listener);

        mTvRouteDetaila.setOnClickListener(listener);
        mTvRouteDetailb.setOnClickListener(listener);
        mTvRouteDetailc.setOnClickListener(listener);
        mTvRouteDetailaa.setOnClickListener(listener);
        mTvRouteDetailbb.setOnClickListener(listener);
        mTvRouteDetailcc.setOnClickListener(listener);
        mTvSubmit.setOnClickListener(listener);
        mLnDateSelectLayout.setOnClickListener(listener);




            //团期单个选择
            mGvDateView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    mGvAdapter.changeSelected(position);
                    if((bodyinfo.getData_base().getLines_from()).equals("3")) {
                    ToastUtils.show(getApplicationContext(),"测试团期点击为3");
                    }else{
                        Intent intentcalendara=new Intent(getApplicationContext(),SelectDateActivity.class);
                        intentcalendara.putExtra("routetitle",bodyinfo.getData_base().getLines_name());
                        startActivity(intentcalendara);
                    }
                }
            });











        mBannnerpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {

                handler.sendMessage(Message.obtain(handler, CHANGE_PLAY,
                        position, 0));


                currentPager = position % bodyinfo.getData_img().size();
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




    }

    /**
     * 设置viewpager下面的白点
     */

    private void setDot(int size) {
        for (int i = 0; i < size; i++) {
            View view = new View(getApplicationContext());
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

    private class OnClickListenerImpl implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            switch(view.getId()){
                case R.id.iv_back:
                    finish();
                    break;

                case R.id.tv_routedetail_a:
                    mRouteListViewa.setSelection(2);

//                    setTextaBgColor(mTvRouteDetaila,mImgRoutea);
//                    setTextbBgColor(mTvRouteDetailb,mImgRouteb);
//                    setTextbBgColor(mTvRouteDetailc,mImgRoutec);

                    setTextaBgColor(mTvRouteDetailaa,mImgRouteaa);
                    setTextbBgColor(mTvRouteDetailbb,mImgRoutebb);
                    setTextbBgColor(mTvRouteDetailcc,mImgRoutecc);


                    break;
                case R.id.tv_routedetail_b:
                    mRouteListViewa.setSelection(4);

//                    setTextaBgColor(mTvRouteDetailb,mImgRouteb);
//                    setTextbBgColor(mTvRouteDetaila,mImgRoutea);
//                    setTextbBgColor(mTvRouteDetailc,mImgRoutec);


                    setTextaBgColor(mTvRouteDetailbb,mImgRoutebb);
                    setTextbBgColor(mTvRouteDetailaa,mImgRouteaa);
                    setTextbBgColor(mTvRouteDetailcc,mImgRoutecc);

                    break;


                case R.id.tv_routedetail_c:
                    mRouteListViewa.setSelection(6);
//                    setTextaBgColor(mTvRouteDetailc,mImgRoutec);
//                    setTextbBgColor(mTvRouteDetaila,mImgRoutea);
//                    setTextbBgColor(mTvRouteDetailb,mImgRouteb);

                    setTextaBgColor(mTvRouteDetailcc,mImgRoutecc);
                    setTextbBgColor(mTvRouteDetailaa,mImgRouteaa);
                    setTextbBgColor(mTvRouteDetailbb,mImgRoutebb);

                    break;
                /**
                 *  3  //平台线路  没有日历控件   填写订单页面不需要人数
                 *  1和2 //内网线路   有日历控件 填写订单页面需要人数
                 */
                case R.id.tv_change_first_content_c:

                    if((bodyinfo.getData_base().getLines_from()).equals("3")){
                        ToastUtils.show(getApplicationContext(),"3");
                    }else{
//                        ToastUtils.show(getApplicationContext(),bodyinfo.getData_base().getLines_from());
                        Intent intent=new Intent(getApplicationContext(),SelectDateActivity.class);
                        intent.putExtra("routetitle",bodyinfo.getData_base().getLines_name());
                        startActivity(intent);
                    }
                    break;
                //选择团期跳转日历
                case R.id.route_tuanqi_select:
                    Intent intentcalendar=new Intent(getApplicationContext(),SelectDateActivity.class);
                    intentcalendar.putExtra("routetitle",bodyinfo.getData_base().getLines_name());
                    startActivity(intentcalendar);

                break;


                default:
                    break;

            }
        }
    }


    protected  void doRouteline(String url,JSONObject  paramhash){
        HttpUtils.dopost(url,getApplicationContext(),paramhash, new HttpUtils.CallBack() {
            @Override
            public void onRequestComplete(String result) {

                JsonmModel homeinfoa=gson.fromJson(result,JsonmModel.class);
                String body= Base64Utils.getFromBase64(homeinfoa.getBody());

                bodyinfo=gson.fromJson(body, LineRouteEntry.class);

                handler.sendEmptyMessage(FINISH_CODE);

            }

            @Override
            public void onRequestErr(String err) {

            }
        });
    }






    private void setTextaBgColor(TextView mTva,ImageView mImga){

        mTva.setTextColor(getApplicationContext().getResources().getColor(R.color.title_orange));
        mImga.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.title_orange));
    }
    private void setTextbBgColor(TextView mTvb,ImageView mImgb){
        mTvb.setTextColor(getApplicationContext().getResources().getColor(R.color.dark_3));
        mImgb.setBackgroundColor(getApplicationContext().getResources().getColor(R.color.travel_title_bar));
    }

}
