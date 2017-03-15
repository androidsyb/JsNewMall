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

/**
 * Created by host on 2017/2/14.
 */

public class HomeGviewbAdapter extends BaseAdapter {

    private Context mContext;

    private List<String> arrDataList;
    public HomeGviewbAdapter(Context context, List<String> datalist){
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
                    R.layout.item_fragment_home_gridview_b, null);


            holder.mTvcontent = (TextView) convertView
                    .findViewById(R.id.tv_gridview_b);
            holder.mLayout= (LinearLayout) convertView.findViewById(R.id.ll_item_layout_b);
            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }
      holder.mTvcontent.setText(arrDataList.get(position));
        if (position==0){
            holder.mLayout.setBackgroundDrawable(mContext.getResources().getDrawable(R.drawable.home_second_bottomleft_shape));
        }else if (position==1){
            holder.mLayout.setBackgroundColor(mContext.getResources().getColor(R.color.item_chengse));
        }else if (position==2){
            holder.mLayout.setBackgroundDrawable(mContext.getResources().getDrawable(R.drawable.home_second_bottomright_shape));
        }



        return convertView;
    }

    class Holder {

        TextView mTvcontent;
        LinearLayout mLayout;

    }
}
