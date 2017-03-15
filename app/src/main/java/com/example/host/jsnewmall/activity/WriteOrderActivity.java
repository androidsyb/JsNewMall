package com.example.host.jsnewmall.activity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.adapter.OrdePersonAdapter;
import com.example.host.jsnewmall.adapter.OrderGvaAdapter;
import com.example.host.jsnewmall.adapter.OrderGvbAdapter;
import com.example.host.jsnewmall.model.CalendarEntry;
import com.example.host.jsnewmall.model.JsonmModel;
import com.example.host.jsnewmall.model.OrderDiscountEntry;
import com.example.host.jsnewmall.utils.Base64Utils;
import com.example.host.jsnewmall.utils.HttpUtils;
import com.example.host.jsnewmall.utils.JsonUtils;
import com.example.host.jsnewmall.utils.ToastUtils;
import com.example.host.jsnewmall.utils.UrlUtils;
import com.example.host.jsnewmall.view.HomeForthGridView;
import com.example.host.jsnewmall.view.HorizontalListView;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by host on 2017/2/28.
 */

public class WriteOrderActivity extends  BaseActivity {

    private ImageView mImgSelecta;
    private ImageView mImgSelectb;
    private LinearLayout mBack;
    private RelativeLayout mRlselecta;
    private RelativeLayout mRlselectb;
    private boolean checkedable= true;
    private LinearLayout lnclickread;
    private TextView mTvAgreement;
    private ImageView mImgAgree;
//    private ListView mGvOrderaView;
    private ListView mGvOrderbView;
//    private OrderGvaAdapter mGvaAdapter;
    private OrderGvbAdapter mGvbAdapter;
    private LinearLayout mLnOrdera;
    private LinearLayout mLnOrderb;
    private  TextView mTvOrdera;
    private  TextView mTvOrderb;
    private String[] arrTextb = new String[]{"600", "500", "1000","1500"};
    private double  currentprice;
    private List<CalendarEntry.DataBean.DescBean> mDecList;
    private TextView  mTvPrice;
    private String selectdate;
    private TextView mTvDate;
    private TextView mTvRouteTitle;
    private String routetitlename;
    private LinearLayout mSubmit;
    private HorizontalListView mListPerson;
    private SimpleDateFormat mSimpleTime;
    private String nTime;
    Gson gson=new Gson();
    private OrderDiscountEntry bodyinfo;
    private List<OrderDiscountEntry.DataBean.CouponBean.ApplicableBean> mApplicable;

    private LinearLayout mLndiscounta;

    private static final int FINISH_CODE=100;
    private TextView mDistitlea,mDistitleb,mDistitlec;
    private EditText mEtName,mEtPhone,mEtEmail;
    private static final int SUCCESS_CODE=101;
    private static final int FAIL_CODE=102;
    private String mStrname,mStrphone,mStremail;


    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            switch (msg.what) {
                case FINISH_CODE:
                    initView();
                    initListener();


                    break;
                case SUCCESS_CODE:
                    Intent intento=new Intent(WriteOrderActivity.this, OrderSuccessActivity.class);
                    intento.putExtra("name",mStrname);
                    intento.putExtra("phone",mStrphone);
                    intento.putExtra("email",mStremail);
                    intento.putExtra("personlist",(Serializable) mDecList);
                    intento.putExtra("allprice",currentprice);
                    intento.putExtra("titleroutename",routetitlename);
                    intento.putExtra("selectdate",selectdate);


                    startActivity(intento);
                    break;
                case FAIL_CODE:
                    Intent intentp=new Intent(WriteOrderActivity.this, OrderFailActivity.class);
                    startActivity(intentp);
                    break;

                default:
                    break;

            };
        }
    };



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_order_content);
        Date d=new Date();
        mSimpleTime=new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        nTime=mSimpleTime.format(d);
        getIntentData();
        initData();


        mBack=(LinearLayout)findViewById(R.id.iv_back);//返回
        TextView mTvTitle=(TextView)findViewById(R.id.tv_title_name_change);//标题名字修改
        mTvTitle.setText(getApplicationContext().getResources().getString(R.string.order_content_a));
        mTvTitle.setTextColor(getApplicationContext().getResources().getColor(R.color.dark_6));
        ImageView mImgMore=(ImageView)findViewById(R.id.img_title_message);//图片更多
        mImgMore.setVisibility(View.GONE);


    }

    private void getIntentData(){
        Intent intent=getIntent();

        currentprice=intent.getDoubleExtra("allprice",0);
        mDecList=(List<CalendarEntry.DataBean.DescBean>)intent.getSerializableExtra("personlist");
        selectdate=intent.getStringExtra("selectdate");
        routetitlename=intent.getStringExtra("titleroutename");
    }

    private void initData(){
        JSONObject jbody=null;
        try {
            jbody = new JSONObject();
            jbody.put("city_id",115);
            jbody.put("line_id",13510);
            jbody.put("linetype",1);
            jbody.put("user_id",24025);

            jbody.put("method","Lines_coupon");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        JSONObject jbodyB= JsonUtils.JsonParseInfo(nTime,jbody);
        dohttpdiscount(UrlUtils.APP_URL,jbodyB);

    }



    private void initView(){



        mTvPrice=(TextView)findViewById(R.id.tv_order_all_money);//总金额显示
        mTvPrice.setText(currentprice+"");
        mTvDate=(TextView)findViewById(R.id.tv_write_content_b);//团期显示
        mTvDate.setText(selectdate);

        mTvRouteTitle=(TextView)findViewById(R.id.tv_write_content_a);//路线标题内容显示
        mTvRouteTitle.setText(routetitlename);
        mSubmit=(LinearLayout)findViewById(R.id.ln_writeorder_sub);//提交订单点击
        mListPerson=(HorizontalListView)findViewById(R.id.personnum_listview);//横向listview显示
        OrdePersonAdapter personAdapter=new OrdePersonAdapter(getApplicationContext(),mDecList);
        mListPerson.setAdapter(personAdapter);


        mEtName=(EditText)findViewById(R.id.et_order_name);//名字
        mEtPhone=(EditText)findViewById(R.id.et_order_phone);//电话
        mEtEmail=(EditText)findViewById(R.id.et_order_email);//邮件



        mImgSelecta=(ImageView)findViewById(R.id.img_order_a);//按钮选择 优惠活动
        mImgSelectb=(ImageView)findViewById(R.id.img_order_b);//按钮选择 使用优惠券
        mRlselecta=(RelativeLayout)findViewById(R.id.rl_order_select_a);//第一个优惠选择点击布局
        mRlselectb=(RelativeLayout)findViewById(R.id.rl_order_select_b);//第二个优惠选择点击布局
        lnclickread=(LinearLayout)findViewById(R.id.ln_click_read_a);//确定协议点击
        mTvAgreement=(TextView)findViewById(R.id.tv_read_a);//协议跳转
        mImgAgree=(ImageView)findViewById(R.id.img_order_c);//按钮 确定协议

//        mGvOrderaView=(ListView)findViewById(R.id.gv_order_a);//优惠活动展开
        mGvOrderbView=(ListView)findViewById(R.id.gv_order_b);//优惠券展开

//        mGvaAdapter=new OrderGvaAdapter(getApplicationContext());//第一组活动
//        mGvOrderaView.setAdapter(mGvaAdapter);
//        HomeForthGridView.setListViewHeight(mGvOrderaView);
//        mGvOrderaView.deferNotifyDataSetChanged();
        mLndiscounta=(LinearLayout)findViewById(R.id.ln_discount_a);//优惠活动展开布局（修改）
        mDistitlea=(TextView)findViewById(R.id.tv_activity_a);//活动标题
        mDistitleb=(TextView)findViewById(R.id.tv_activity_b);//活动时间
        mDistitlec=(TextView)findViewById(R.id.tv_activity_c);//活动内容

        mDistitlea.setText(bodyinfo.getData().getActivity().get(0).getBase().getActivity_name());

//        mDistitleb.setText(bodyinfo.getData().getActivity().get(0).getBase().getBegin_datetime()
//        +"至"+bodyinfo.getData().getActivity().get(0).getBase().getEnd_datetime());
        mDistitleb.setText(showdate(bodyinfo.getData().getActivity().get(0).getBase().getBegin_datetime())
                +"至"+showdate(bodyinfo.getData().getActivity().get(0).getBase().getEnd_datetime()));

        mDistitlec.setText(bodyinfo.getData().getActivity().get(0).getBase().getRemark());

        mApplicable=bodyinfo.getData().getCoupon().getApplicable();//优惠券显示
        mGvbAdapter=new OrderGvbAdapter(getApplicationContext(),mApplicable);//第二组活动
        mGvOrderbView.setAdapter(mGvbAdapter);
        HomeForthGridView.setListViewHeight(mGvOrderbView);
        mGvOrderbView.deferNotifyDataSetChanged();

        mLnOrdera=(LinearLayout)findViewById(R.id.ln_order_a);//活动金额显示一
        mLnOrderb=(LinearLayout)findViewById(R.id.ln_order_b);//活动金额显示一
        mTvOrdera=(TextView)findViewById(R.id.tv_discount_money_a);//textview的金额显示一
        mTvOrderb=(TextView)findViewById(R.id.tv_discount_money_b);//textview的金额显示一




    }

    private void initListener(){
        OnClickListenerImpl listener = new OnClickListenerImpl();
        mBack.setOnClickListener(listener);
        mRlselecta.setOnClickListener(listener);
        mRlselectb.setOnClickListener(listener);
        lnclickread.setOnClickListener(listener);
        mTvAgreement.setOnClickListener(listener);
        mSubmit.setOnClickListener(listener);

//        mGvOrderaView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
//                mGvaAdapter.changeSelected(position);
//                mLnOrdera.setVisibility(View.VISIBLE);
//                mLnOrderb.setVisibility(View.GONE);
//                mTvOrdera.setText(arrTextb[position]);
//            }
//        });

        mGvOrderbView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                mGvbAdapter.changeSelected(position);
                mLnOrdera.setVisibility(View.GONE);
                mLnOrderb.setVisibility(View.VISIBLE);
                mTvOrderb.setText(bodyinfo.getData().getCoupon().getApplicable().get(position).getLowemoney()+"");
            }
        });

    }

    private class OnClickListenerImpl implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.iv_back:
                    finish();
                    break;
                //活动选择点击展开与否
                case R.id.rl_order_select_a:
//                    mGvaAdapter.changeSelected(-1);//重置listview的item的选中状态
                    mImgSelecta.setImageDrawable(getApplicationContext().getResources().getDrawable(R.mipmap.icon_circle_checked));
                    mImgSelectb.setImageDrawable(getApplicationContext().getResources().getDrawable(R.mipmap.icon_circle_unchecked));
//                    mGvOrderaView.setVisibility(View.VISIBLE);
                    mLndiscounta.setVisibility(View.VISIBLE);
                    mGvOrderbView.setVisibility(View.GONE);
                    mLnOrderb.setVisibility(View.GONE);
                    break;
                //活动选择点击展开与否
                case R.id.rl_order_select_b:
                    mGvbAdapter.changeSelected(-1);
                    mImgSelectb.setImageDrawable(getApplicationContext().getResources().getDrawable(R.mipmap.icon_circle_checked));
                    mImgSelecta.setImageDrawable(getApplicationContext().getResources().getDrawable(R.mipmap.icon_circle_unchecked));
//                    mGvOrderaView.setVisibility(View.GONE);
                    mLndiscounta.setVisibility(View.GONE);
                    mGvOrderbView.setVisibility(View.VISIBLE);
                    mLnOrdera.setVisibility(View.GONE);
                    break;
                //确定协议
                case R.id.ln_click_read_a:
                    if (checkedable){
                        mImgAgree.setImageDrawable(getApplicationContext().getResources().getDrawable(R.mipmap.icon_gou_checked));

                        checkedable=false;
                    }else {
                        mImgAgree.setImageDrawable(getApplicationContext().getResources().getDrawable(R.mipmap.icon_circle_unchecked));
                        checkedable=true;
                    }


                    break;
                //协议跳转webview
                case R.id.tv_read_a:
                    break;

                //提交订单
                case R.id.ln_writeorder_sub:
                     mStrname=mEtName.getText().toString().trim();
                     mStrphone=mEtPhone.getText().toString().trim();
                     mStremail=mEtEmail.getText().toString().trim();
                    if (mStrname.equals("")||mStrphone.equals("")||mStremail.equals("")){
                        ToastUtils.show(WriteOrderActivity.this,"请输入正确的联系人信息");
                        return;
                    }

                    JSONObject jsonnum=null;
                    for (int j=0;j<mDecList.size();j++){
                        try {
                            jsonnum=new JSONObject();
                            jsonnum.put("priceid",mDecList.get(j).getPricetypeid());
                            jsonnum.put("num",mDecList.get(j).getSelectnum());

                        }catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }



                    JSONObject jbody=null;
                    try {
                        jbody = new JSONObject();
                        jbody.put("city_id",115);
                        jbody.put("order_total_money",currentprice);//订单总金额（产品金额+保险金额+运费金额-优惠金额）
                        jbody.put("order_product_money",currentprice);//产品总额
                        jbody.put("link_man",mStrname);//联系人
                        jbody.put("link_mobile",mStrphone);//联系人手机号码
                        jbody.put("link_email",mStremail);//联系人邮箱
                        jbody.put("order_remark","备注测试");//订单备注
                        jbody.put("order_type",1);//订单类型 1 景点 2 邮轮
                        jbody.put("order_source",3);//订单来源 1 电脑 2 移动站 3 APP
                        jbody.put("line_id",13510);
                        jbody.put("json_product",jsonnum);//订单明细json([{'priceid':'价格体系id','num':'数量'}])
                        jbody.put("method","AddOrder");
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    JSONObject jbodyB= JsonUtils.JsonParseInfo(nTime,jbody);


                    dohttpSubmit(UrlUtils.ROUTE_LINE,jbodyB);


                    break;
                default:
                    break;

            }
        }
    }



    protected  void dohttpdiscount(String url,JSONObject  paramhash){
        HttpUtils.dopost(url,getApplicationContext(),paramhash, new HttpUtils.CallBack() {
            @Override
            public void onRequestComplete(String result) {

                JsonmModel homeinfoa=gson.fromJson(result,JsonmModel.class);
                String body= Base64Utils.getFromBase64(homeinfoa.getBody());

                bodyinfo=gson.fromJson(body, OrderDiscountEntry.class);

                handler.sendEmptyMessage(FINISH_CODE);

            }

            @Override
            public void onRequestErr(String err) {

            }
        });
    }



    protected  void dohttpSubmit(String url,JSONObject  paramhash){
        HttpUtils.dopost(url,getApplicationContext(),paramhash, new HttpUtils.CallBack() {
            @Override
            public void onRequestComplete(String result) {

                JsonmModel homeinfoa=gson.fromJson(result,JsonmModel.class);
                String body= Base64Utils.getFromBase64(homeinfoa.getBody());
                int head=homeinfoa.getHead().getCode();
                if (head==0){
                    handler.sendEmptyMessage(SUCCESS_CODE);
                }else{
                    handler.sendEmptyMessage(FAIL_CODE);
                }



            }

            @Override
            public void onRequestErr(String err) {

            }
        });
    }





    private String showdate(String date){
        String spStr[] = date.split(" ");
        String year=spStr[0];


        return year;
    }




}
