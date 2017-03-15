package com.example.host.jsnewmall.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.model.TravelWeekFirstInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by host on 2017/2/16.
 */

public class TravelWeekFirstAdapter extends BaseAdapter {
    private Context mContext;
    private String[] arrText = new String[]{"周末游", "周末游", "周末游","周末游","周末游","周末游"};
    private List<TravelWeekFirstInfo> pictures;

    public TravelWeekFirstAdapter(Context context){
         this.mContext=context;
        pictures = new ArrayList<>();
        for (int i=0; i<6; i++){
            TravelWeekFirstInfo pt = new TravelWeekFirstInfo(arrText[i]);
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
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_fragment_travel_week_first, null);

            holder.tv = (TextView) convertView.findViewById(R.id.tv_travel_week_a);
            //设置标题
            holder.tv.setText(arrText[position]);
            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }
        if (position==2){
            holder.tv.setBackgroundDrawable(mContext.getResources().getDrawable(R.drawable.travel_week_second_shape));
        }else if (position==5){
            holder.tv.setBackgroundDrawable(mContext.getResources().getDrawable(R.drawable.travel_week_third_shape));
        }

        return convertView;
    }
    class Holder {

        TextView tv;
    }


}
