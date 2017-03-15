package com.example.host.jsnewmall.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.model.HomeFifthInfo;
import com.example.host.jsnewmall.model.OrderDiscountEntry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by host on 2017/3/2.
 */

public class OrderGvbAdapter extends BaseAdapter{

    private Context mContext;

    private int mSelect=-1;
    private List<OrderDiscountEntry.DataBean.CouponBean.ApplicableBean> mApplicablelist;

    public OrderGvbAdapter(Context  context,List<OrderDiscountEntry.DataBean.CouponBean.ApplicableBean> mapplicable){
        this.mContext=context;
        this.mApplicablelist=mapplicable;

    }

    @Override
    public int getCount() {
        return mApplicablelist.size();
    }

    @Override
    public Object getItem(int position) {
        return mApplicablelist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void changeSelected(int positon){ //刷新方法
        if(positon != mSelect){
            mSelect = positon;
            notifyDataSetChanged();
        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        Holder holder;
        if (convertView == null) {
            holder = new Holder();
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_order_listview_b, null);
            holder.tvmoneya=(TextView) convertView.findViewById(R.id.tv_order_money_first_b);//日期
            holder.imgchoose=(ImageView) convertView.findViewById(R.id.img_money_choose_b);//金额
            holder.tvmoneya.setText(mApplicablelist.get(position).getTitle());



            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }

        if(mSelect==position){
            holder.imgchoose.setImageDrawable(mContext.getResources().getDrawable(R.mipmap.icon_circle_checked));  //选中项背景


        }else{
            holder.imgchoose.setImageDrawable(mContext.getResources().getDrawable(R.mipmap.icon_circle_unchecked));
        }




        return convertView;
    }
    class Holder {
        TextView tvmoneya;
        ImageView imgchoose;


    }
}
