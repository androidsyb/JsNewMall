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

import java.util.ArrayList;
import java.util.List;

/**
 * Created by host on 2017/3/2.
 */

public class OrderGvaAdapter extends BaseAdapter {


    private Context mContext;
    private String[] arrTexta = new String[]{"1月", "2月", "3月","4月"};
    private String[] arrTextb = new String[]{"600", "500", "1000","1500"};
    private String[] arrTextc = new String[]{"文本标签", "文本标签", "文本标签","文本标签"};
    private int[] arrImages = new int[]{R.mipmap.testpicture,R.mipmap.testpicture,R.mipmap.testpicture,R.mipmap.testpicture};
    private List<HomeFifthInfo> pictures;
    private int mSelect=-1;


    public OrderGvaAdapter(Context context){
        this.mContext=context;
        pictures = new ArrayList<>();
        for (int i=0; i<3; i++){
            HomeFifthInfo pt = new HomeFifthInfo(arrTexta[i], arrTextb[i],arrTextc[i],arrImages[i]);
            pictures.add(pt);
        }
    }
    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public Object getItem(int position) {
        return pictures.get(position);
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
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_order_gridview_a, null);
            holder.tvmoneya=(TextView) convertView.findViewById(R.id.tv_order_money_first_a);//日期
            holder.imgchoose=(ImageView) convertView.findViewById(R.id.img_money_choose_a);//金额
            holder.tvmoneya.setText(pictures.get(position).getTitleb());



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
