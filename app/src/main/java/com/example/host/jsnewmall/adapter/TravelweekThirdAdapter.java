package com.example.host.jsnewmall.adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.model.TravelWeekSecondInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by host on 2017/2/16.
 */

/**
 * 出行方式适配器
 */
public class TravelweekThirdAdapter  extends BaseAdapter{
    private Context mContext;
    private String[] arrText = new String[]{"玩法", "玩法", "玩法", "玩法"};
    private List<TravelWeekSecondInfo> pictures;

    public TravelweekThirdAdapter(Context context){
        this.mContext=context;
        pictures = new ArrayList<>();
        for (int i=0; i<4; i++){
            TravelWeekSecondInfo pt = new TravelWeekSecondInfo(arrText[i]);
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
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_fragment_travel_week_third, null);
            holder.mImgThird=(ImageView)convertView.findViewById(R.id.img_week_third_view_a);
            holder.tv = (TextView) convertView.findViewById(R.id.tv_week_third_a);
            //设置标题
            holder.tv.setText(arrText[position]);
            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }
//        if (position==2){
//            holder.tv.setBackgroundDrawable(mContext.getResources().getDrawable(R.drawable.travel_week_eigth_shape));
//        }
        if (position==0){
            holder.mImgThird.setImageResource(R.mipmap.ic_launcher);
        }

        return convertView;
    }
    class Holder {
        ImageView mImgThird;
        TextView tv;
    }
}
