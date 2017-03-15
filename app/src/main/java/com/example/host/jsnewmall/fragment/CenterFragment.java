package com.example.host.jsnewmall.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.activity.AllOrderActivity;
import com.example.host.jsnewmall.activity.CouponActivity;
import com.example.host.jsnewmall.activity.LoginActivity;
import com.example.host.jsnewmall.model.JsonmModel;
import com.example.host.jsnewmall.model.LoginUserEntry;
import com.example.host.jsnewmall.model.LoginYouhuiEntry;
import com.example.host.jsnewmall.utils.Base64Utils;
import com.example.host.jsnewmall.utils.HttpUtils;
import com.example.host.jsnewmall.utils.JsonUtils;
import com.example.host.jsnewmall.utils.SharedPreferencesUtils;
import com.example.host.jsnewmall.utils.StatusBarUtils;
import com.example.host.jsnewmall.utils.ToastUtils;
import com.example.host.jsnewmall.utils.UrlUtils;
import com.example.host.jsnewmall.view.CenterCircleImageView;
import com.example.host.jsnewmall.view.CircleNetWorkImage;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by host on 2017/2/15.
 * 个人中心页面
 */

public class CenterFragment extends BaseFragment {
    private View view;
    private ImageView mShezhi;
    private LinearLayout mCenterAll,mCenterSH,mCenterFK,mCenterCY;
    private RelativeLayout mYouhuiquan,mJifen;
    private RelativeLayout mRlcentera,mRlcenterb,mRlcenterc,mRlcenterd,mRlcentere;
    private TextView mTvcenteryouhui,mTvcenterjifen;
    private TextView mTvUsername, mTvHuiyuanmsg;
    private LinearLayout mLnWeidenglu;
    private RelativeLayout mRlNameMsg;
    Gson gson=new Gson();
    private static final int FINISH_CODE=100;
    private static final int FINISH_CODE_A=101;
    private LoginUserEntry userinfo;
    private ImageView mImgTou;
    private CenterCircleImageView circleImageView;
    private SimpleDateFormat mSimpleTime;
    private String nTime;
    private LoginYouhuiEntry discountinfo;

    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            switch (msg.what) {
                case FINISH_CODE:

                    userinfo=gson.fromJson(SharedPreferencesUtils.getUserInfo(getActivity()),LoginUserEntry.class);
                    if (userinfo!=null){
                        circleImageView.readBitmapViaVolley(userinfo.getHeadimgurl(),mImgTou);//头像
                        mRlNameMsg.setVisibility(View.VISIBLE);
                        mLnWeidenglu.setVisibility(View.GONE);

                        mTvUsername.setText(userinfo.getNickname()+"");//用户名
                        mTvHuiyuanmsg.setText(userinfo.getGrade()+"");


                        JSONObject jbody=null;
                        try {
                            jbody = new JSONObject();
                            jbody.put("user_id",userinfo.getUserid());
                            jbody.put("method","User_info_num");
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        JSONObject jbodyB= JsonUtils.JsonParseInfo(nTime,jbody);
                        dohttpGetfino(UrlUtils.APP_URL,jbodyB);

                    }
                    break;

                case FINISH_CODE_A:
                    if (null!=discountinfo) {
                        mTvcenteryouhui.setText(discountinfo.getData().getCoupon_num() + "张");
                        mTvcenterjifen.setText(discountinfo.getData().getPoints_num() + "分");
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
        view=inflater.inflate(R.layout.fragment_center_main_content,null);
        Date d=new Date();
        mSimpleTime=new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
        nTime=mSimpleTime.format(d);
        initView();
        initListener();
        handler.sendEmptyMessage(FINISH_CODE);

        return view;
    }

    private void initView(){
         mImgTou=(ImageView)view.findViewById(R.id.center_img_touxiang);//头像
         circleImageView=new CenterCircleImageView(getActivity());
//        circleImageView.readBitmapViaVolley("http://imgtu.5011.net/uploads/content/20170207/5885661486451448.jpg",mImgTou);

        mShezhi=(ImageView)view.findViewById(R.id.img_shezhi);//设置按钮
        mCenterAll=(LinearLayout)view.findViewById(R.id.center_all);//全部
        mCenterSH=(LinearLayout)view.findViewById(R.id.center_shenghe);//待审核
        mCenterFK=(LinearLayout)view.findViewById(R.id.center_fukuan);//待付款
        mCenterCY=(LinearLayout)view.findViewById(R.id.center_chuyou);//待出游
        mYouhuiquan=(RelativeLayout)view.findViewById(R.id.center_rl_youhuiquan);//优惠券
        mJifen=(RelativeLayout)view.findViewById(R.id.center_rl_jifen);//积分
        mRlcentera=(RelativeLayout)view.findViewById(R.id.rl_center_a);//我的收藏
        mRlcenterb=(RelativeLayout)view.findViewById(R.id.rl_center_b);//浏览历史
        mRlcenterc=(RelativeLayout)view.findViewById(R.id.rl_center_c);//我的顾问
        mRlcenterd=(RelativeLayout)view.findViewById(R.id.rl_center_d);//我的成长值
        mRlcentere=(RelativeLayout)view.findViewById(R.id.rl_center_e);//常用旅客资料
        mTvcenteryouhui=(TextView)view.findViewById(R.id.tv_center_youhuiquan);//优惠券显示
        mTvcenterjifen=(TextView)view.findViewById(R.id.tv_center_jifen);//积分显示
        mTvUsername=(TextView)view.findViewById(R.id.tv_username);//用户名
        mTvHuiyuanmsg=(TextView)view.findViewById(R.id.tv_huiyuanmsg);//会员信息
        mLnWeidenglu=(LinearLayout)view.findViewById(R.id.ln_center_weidenglu);//未登录点击
        mRlNameMsg=(RelativeLayout)view.findViewById(R.id.rl_name_msg);//登陆后信息显示





    }


    private void initListener(){

        OnClickListenerImpl listener = new OnClickListenerImpl();
        mShezhi.setOnClickListener(listener);
        mCenterAll.setOnClickListener(listener);
        mCenterSH.setOnClickListener(listener);
        mCenterFK.setOnClickListener(listener);
        mCenterCY.setOnClickListener(listener);
        mYouhuiquan.setOnClickListener(listener);
        mJifen.setOnClickListener(listener);
        mRlcentera.setOnClickListener(listener);
        mRlcenterb.setOnClickListener(listener);
        mRlcenterc.setOnClickListener(listener);
        mRlcenterd.setOnClickListener(listener);
        mRlcentere.setOnClickListener(listener);
        mLnWeidenglu.setOnClickListener(listener);


    }




    private class OnClickListenerImpl implements View.OnClickListener {

        @Override
        public void onClick(View view) {


            if (userinfo==null){
                Intent  intent=new Intent(getActivity(), LoginActivity.class);
//                    startActivity(intent);
                startActivityForResult(intent,107);
            }else {
                switch (view.getId()) {

//                //未登录点击
//                case R.id.ln_center_weidenglu:
//
//                    break;


                    //设置
                    case R.id.img_shezhi:

                        break;
                    //全部
                    case R.id.center_all:
                        Intent intentall=new Intent(getActivity(),AllOrderActivity.class);
                        startActivity(intentall);

                        break;
                    //待审核
                    case R.id.center_shenghe:

                        break;
                    //待付款
                    case R.id.center_fukuan:

                        break;
                    //待出游
                    case R.id.center_chuyou:

                        break;
                    //优惠券
                    case R.id.center_rl_youhuiquan:
                        Intent intentcoupon=new Intent(getActivity(), CouponActivity.class);
                        intentcoupon.putExtra("userid",userinfo.getUserid());
                        startActivity(intentcoupon);
                        break;
                    //积分
                    case R.id.center_rl_jifen:
                        break;

                    //我的收藏
                    case R.id.rl_center_a:
                        break;
                    //浏览历史
                    case R.id.rl_center_b:
                        break;
                    //我的顾问
                    case R.id.rl_center_c:
                        break;
                    //我的成长值
                    case R.id.rl_center_d:
                        break;
                    //常用旅客资料
                    case R.id.rl_center_e:
                        break;


                    default:
                        break;

                }
            }
        }
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
       switch(resultCode){
           case 59:
               handler.sendEmptyMessage(FINISH_CODE);
               break;
           default:
               break;
       }
    }


    protected  void dohttpGetfino(String url,JSONObject  paramhash){
        HttpUtils.dopost(url,getActivity(),paramhash, new HttpUtils.CallBack() {
            @Override
            public void onRequestComplete(String result) {

                JsonmModel homeinfoa=gson.fromJson(result,JsonmModel.class);
                String body= Base64Utils.getFromBase64(homeinfoa.getBody());

                discountinfo=gson.fromJson(body, LoginYouhuiEntry.class);

                handler.sendEmptyMessage(FINISH_CODE_A);

            }

            @Override
            public void onRequestErr(String err) {

            }
        });
    }






}
