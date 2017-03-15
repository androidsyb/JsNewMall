package com.example.host.jsnewmall.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;


import com.dsw.calendar.component.MonthView;
import com.dsw.calendar.entity.CalendarInfo;
import com.dsw.calendar.views.ADCircleCalendarView;
import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.adapter.SelectDateMoneyAdapter;
import com.example.host.jsnewmall.bean.SelectPriceNum;
import com.example.host.jsnewmall.model.CalendarEntry;
import com.example.host.jsnewmall.model.JsonmModel;
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

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by host on 2017/3/8.
 */

public class SelectDateActivity extends BaseActivity implements SelectPriceNum{
    private ADCircleCalendarView circleCalendarView;
    private  List<CalendarInfo> list;
    private ListView  mListSelect;
    private static final int FINISH_CODE=100;
    private static final int LIST_VISIABLE=101;
    private static final int LIST_GONE=102;


    private SimpleDateFormat mSimpleTime;
    private String nTime;
    Gson gson=new Gson();
    private CalendarEntry bodyinfo;
    private LinearLayout mBack;
    private  SelectDateMoneyAdapter selectdateAdapter;
    private TextView mTvAllMoney;
    private double currentprice;
    List<CalendarEntry.DataBean.DescBean> datemoneylist;
    private LinearLayout mBtnNext;
    private String subdatetime;//选择时间
    private String routename;



    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            switch (msg.what) {
                case FINISH_CODE:
                    initView();
                    initListener();


                    break;
                case LIST_VISIABLE:
                    ToastUtils.show(getApplicationContext(),"显示");



                    break;
                case LIST_GONE:
                    mListSelect.setVisibility(View.GONE);

                    break;


                default:
                    break;

            };
        }
    };



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_date_view);
        getIntentData();
        Date d=new Date();
        mSimpleTime=new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        nTime=mSimpleTime.format(d);
        initData();
        TextView mTitlename=(TextView)findViewById(R.id.tv_title_name_change);//标题设置
        mTitlename.setText("选择团期和人数");



    }
    private void getIntentData(){
        Intent intent=getIntent();
        routename =intent.getStringExtra("routetitle");
    }

    private void initData(){

        JSONObject jbody=null;
        try {
            jbody = new JSONObject();
            jbody.put("city_id",115);
            jbody.put("lines_id",13510);
            jbody.put("method","GetCalendar");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        JSONObject jbodyB= JsonUtils.JsonParseInfo(nTime,jbody);
        dohttpdate(UrlUtils.ROUTE_LINE,jbodyB);


    }


    private void initView(){

        mListSelect=(ListView)findViewById(R.id.select_date_list);//选择价格的listview
        Calendar calendar = Calendar.getInstance();
        int currYear = calendar.get(Calendar.YEAR);
        int currMonth = calendar.get(Calendar.MONTH) + 1;
        list = new ArrayList<CalendarInfo>();
        for (int i=0;i<bodyinfo.getData().size();i++){
            String date=bodyinfo.getData().get(i).getDate();
            String money=bodyinfo.getData().get(i).getSaleprice();
            String spStr[] = date.split("-");
            String year=spStr[0];
            String month=spStr[1];
            String day=spStr[2];
            list.add(new CalendarInfo(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day),"￥"+money+"起"));

        }



//        list.add(new CalendarInfo(2017,3,8,"￥1200"));
        circleCalendarView = (ADCircleCalendarView) findViewById(R.id.circleMonthView);
        circleCalendarView.setCalendarInfos(list);


         mBack=(LinearLayout)findViewById(R.id.iv_back);//返回按钮
         mTvAllMoney=(TextView)findViewById(R.id.tv_select_all_money);//所有价格和
         mBtnNext=(LinearLayout)findViewById(R.id.ln_btn_date_next);//下一步




    }
    private void initListener(){
        OnClickListenerImpl listener = new OnClickListenerImpl();
        mBack.setOnClickListener(listener);
        mBtnNext.setOnClickListener(listener);


        circleCalendarView.setDateClick(new MonthView.IDateClick(){

            @Override
            public void onClickOnDate(int yeara, int montha, int daya) {

                currentprice=0;
                mTvAllMoney.setText("0.0");


                List<String> selectlist = new ArrayList<String>();
                String atempdate=yeara + "-" + montha + "-" + daya;
                String atempdateaa = null;
                for (int i=0;i<list.size();i++){
                    int y=list.get(i).year;
                    int m=list.get(i).month;
                    int d=list.get(i).day;
                    atempdateaa=y+"-"+m+"-"+d;
                    selectlist.add(atempdateaa);

                }


                int atempif=selectlist.indexOf(atempdate);
                //判断当前选择日期是否在规定日期中
                if (atempif==-1){
////                    ToastUtils.show(getApplicationContext(),"影藏");
//
                    handler.sendEmptyMessage(LIST_GONE);

//
                }else{
                    ToastUtils.show(getApplicationContext(),atempdate+"");

                    for (int j=0; j < bodyinfo.getData().size();j++){
                       String atempdatass=bodyinfo.getData().get(j).getDate();
                        String spStr[] = atempdatass.split("-");
                        int monthsa=Integer.parseInt(spStr[0]);
                        int yearsa=Integer.parseInt(spStr[1]);
                        int daysa=Integer.parseInt(spStr[2]);

                        String monthsb=Integer.toString(monthsa);
                        String yearsb=Integer.toString(yearsa);
                        String daysb=Integer.toString(daysa);
                        String dateatemp=monthsb+"-"+yearsb+"-"+daysb;



                        if ((dateatemp).equals(atempdate)){

                               subdatetime=bodyinfo.getData().get(j).getDate();//赋值服务器端时间格式的数据


                                mListSelect.setVisibility(View.VISIBLE);

                                datemoneylist=bodyinfo.getData().get(j).getDesc();

                             for (int z=0;z<datemoneylist.size();z++){
                                datemoneylist.get(z).setSelectnum(0);
                             }


                                selectdateAdapter=new SelectDateMoneyAdapter(getApplicationContext(),datemoneylist,SelectDateActivity.this);
                                mListSelect.setAdapter(selectdateAdapter);
                                HomeForthGridView.setListViewHeight(mListSelect);
                                selectdateAdapter.notifyDataSetChanged();

//                            }
                        }

                    }

                }

            }
        });
    }



    protected  void dohttpdate(String url,JSONObject  paramhash){
        HttpUtils.dopost(url,getApplicationContext(),paramhash, new HttpUtils.CallBack() {
            @Override
            public void onRequestComplete(String result) {

                JsonmModel homeinfoa=gson.fromJson(result,JsonmModel.class);
                String body= Base64Utils.getFromBase64(homeinfoa.getBody());

                bodyinfo=gson.fromJson(body, CalendarEntry.class);

                handler.sendEmptyMessage(FINISH_CODE);

            }

            @Override
            public void onRequestErr(String err) {

            }
        });
    }

    @Override
    public void onChangePriceListener() {
        //计算所有数据
        currentprice=0;
        for (int i=0;i<datemoneylist.size();i++){
          double a=Double.parseDouble(datemoneylist.get(i).getSaleprice());
           int b= datemoneylist.get(i).getSelectnum();
            double c=a*b;
            currentprice+=c;
            mTvAllMoney.setText(currentprice+"");
        }

    }


    private class OnClickListenerImpl implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            switch(view.getId()){
                case R.id.iv_back:
                    finish();
                    break;
                case R.id.ln_btn_date_next:
                    if (currentprice==0){
                        ToastUtils.show(getApplicationContext(),"请选择团期和人数");
                        return;
                    }

                    Intent intent=new Intent();
                    intent.putExtra("personlist",(Serializable) datemoneylist);
                    intent.putExtra("allprice",currentprice);
                    intent.putExtra("selectdate",subdatetime);
                    intent.putExtra("titleroutename",routename);
                    intent.setClass(SelectDateActivity.this,WriteOrderActivity.class);

                    startActivity(intent);


                    break;
                default:
                    break;

            }
        }
    }





}
