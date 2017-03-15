package com.example.host.jsnewmall.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.model.CouponEntry;

import java.util.List;

/**
 * Created by host on 2017/3/14.
 */

public class CouponAdapter extends BaseAdapter {

    private Context mContext;
    private List<CouponEntry.DataBean> mBodyinfolist;
    public CouponAdapter(Context context, List<CouponEntry.DataBean> datalist){
        this.mContext=context;
        this.mBodyinfolist=datalist;
    }
    @Override
    public int getCount() {
        return mBodyinfolist.size();
    }

    @Override
    public Object getItem(int position) {
        return mBodyinfolist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        CouponEntry.DataBean mBodyinfo = mBodyinfolist.get(position);
        String typename=mBodyinfo.getTypeid();
        double moneyinfo=Double.parseDouble(mBodyinfo.getMoney());
        int moneyinfoa=(int)moneyinfo;

        Holder holder;
        if (convertView == null) {
            holder = new Holder();
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_activity_coupon_view, null);
            holder.mCouponMoney=(TextView) convertView.findViewById(R.id.tv_coupon_money);//价格显示
            holder.mCouponType=(TextView)convertView.findViewById(R.id.tv_type_name);//优惠券类型
            holder.mTitlea=(TextView)convertView.findViewById(R.id.tv_coupon_title_a);//标题
            holder.mTitleb=(TextView)convertView.findViewById(R.id.tv_coupon_title_b);//时间

            holder.mCouponMoney.setText(moneyinfoa+"");


//            holder.mCouponMoney.setText("100.00");

            //优惠券类型 0:全场券，1=周边券、2=国内券、3=出境券，4=常州地接社券 5=邮轮券
            if (typename.equals("0")){
                holder.mCouponType.setText("全场券");
            }else if (typename.equals("1")){
                holder.mCouponType.setText("周边券");
            }else if (typename.equals("2")){
                holder.mCouponType.setText("国内券");
            }else if (typename.equals("3")){
                holder.mCouponType.setText("出境券");
            }else if (typename.equals("4")){
                holder.mCouponType.setText("常州地接社券");
            }else if (typename.equals("5")){
                holder.mCouponType.setText("邮轮券");
            }


            holder.mTitlea.setText(mBodyinfo.getTitle());
            holder.mTitleb.setText("使用期限:"+mBodyinfo.getBegintime()+"至"+mBodyinfo.getEndtime());

            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }

        return convertView;
    }
    class Holder {
        TextView mCouponMoney;
        TextView mCouponType;
        TextView mTitlea;
        TextView mTitleb;
    }
}
