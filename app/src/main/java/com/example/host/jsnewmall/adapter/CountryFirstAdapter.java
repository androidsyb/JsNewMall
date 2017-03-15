package com.example.host.jsnewmall.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.model.TravelFirstInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by host on 2017/2/16.
 */

public class CountryFirstAdapter extends BaseAdapter {
    private String[] arrText = new String[]{"国内游", "周边游", "国内游","国内游","国内游",
            "国内游", "国内游", "国内游","国内游","国内游","周边游", "国内游"};

    private List<TravelFirstInfo> pictures;

    private Context mContext;
    public CountryFirstAdapter(Context context){
        mContext=context;
        pictures = new ArrayList<>();
        for (int i=0; i<12; i++){
            TravelFirstInfo pt = new TravelFirstInfo(arrText[i]);
            pictures.add(pt);
        }
    }

    @Override
    public int getCount() {
        if (null != pictures){
            return  pictures.size();
        }else{
            return 0;
        }

    }

    @Override
    public Object getItem(int position) {
        return pictures.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Holder holder;
        if (convertView == null) {
            holder = new Holder();
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_fragment_travel_around_first, null);

            holder.tv = (TextView) convertView.findViewById(R.id.tv_travel_around_first);
            //设置标题
            holder.tv.setText(arrText[position]);
            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }

        return convertView;
    }
    class Holder {

        TextView tv;
    }

}
