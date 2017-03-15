package com.example.host.jsnewmall.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.model.Picture;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by host on 2017/2/21.
 */

public class SearchAdapter extends BaseAdapter {

    private Context mContext;
    private String[] arrText = new String[]{"文本标签", "文本", "文本标文本标签文本标签","文本标签","文本标签",
            "文本标签", "文本", "文本标","文本标签","文本标签"};
    private int[] arrImages = new int[]{R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,};
    private List<Picture> pictures;


    public SearchAdapter(Context context){
        mContext=context;
        pictures = new ArrayList<>();
        for (int i=0; i<10; i++){
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
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_activity_search_first, null);


            holder.tv = (TextView) convertView.findViewById(R.id.tv_item_search);
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
