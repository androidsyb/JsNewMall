package com.example.host.jsnewmall.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.host.jsnewmall.R;

import java.util.List;
import java.util.Map;

/**
 * Created by host on 2017/2/14.
 */

public class HomeGviewaAdapter extends BaseAdapter {

    private Context mContext;
    private String[] iconName = { "周边游", "国内游", "出境游", "定制游"};
    private List<String> arrDataList;
    public HomeGviewaAdapter(Context context,List<String> datalist){
        mContext=context;
        arrDataList=datalist;
    }

    @Override
    public int getCount() {
        return arrDataList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrDataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder = null;

        if (convertView == null) {
            holder = new Holder();
            convertView = LayoutInflater.from(mContext).inflate(
                    R.layout.item_fragment_home_gridview_a, null);


            holder.mTvcontent = (TextView) convertView
                    .findViewById(R.id.tv_gridview_a);
            holder.mLayout= (LinearLayout) convertView.findViewById(R.id.ll_item_layout_a);
            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }
      holder.mTvcontent.setText(arrDataList.get(position));
        if (position==0){
            holder.mLayout.setBackgroundColor(mContext.getResources().getColor(R.color.title_orange));
        }else if (position==1){
            holder.mLayout.setBackgroundDrawable(mContext.getResources().getDrawable(R.drawable.home_second_right_shape));
        }else if (position==2){
            holder.mLayout.setBackgroundColor(mContext.getResources().getColor(R.color.title_orange));
        }else if (position==3){
            holder.mLayout.setBackgroundColor(mContext.getResources().getColor(R.color.title_orange));
        }



        return convertView;
    }

    class Holder {

        TextView mTvcontent;
        LinearLayout mLayout;

    }
}
