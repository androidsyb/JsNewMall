package com.example.host.jsnewmall.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.model.Picture;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by host on 2017/2/16.
 */

public class TravelOutFirstAdapter extends BaseAdapter{
       private Context mContext;
    private String[] arrText = new String[]{"出境游", "出境游", "出境游","出境游","出境游","出境游","出境游","出境游"};
    private int[] arrImages = new int[]{R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};
    private List<Picture> pictures;


    public TravelOutFirstAdapter(Context context){
        mContext=context;
        pictures = new ArrayList<>();
        for (int i=0; i<8; i++){
            Picture pt = new Picture(arrText[i], arrImages[i],arrText[i]);
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
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_fragment_out_first_view, null);
            holder.iv = (ImageView) convertView.findViewById(R.id.img_third_view);
            //设置显示图片
            holder.iv.setBackgroundResource(arrImages[position]);
            holder.tv = (TextView) convertView.findViewById(R.id.tv_third_content);
            //设置标题
            holder.tv.setText(arrText[position]);
            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }

        return convertView;
    }
    class Holder {
        ImageView iv;
        TextView tv;
    }



}
