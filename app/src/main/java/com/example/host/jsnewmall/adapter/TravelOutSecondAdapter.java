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
 * Created by host on 2017/2/16.
 */

public class TravelOutSecondAdapter extends BaseAdapter {
    private Context mContext;
    private String[] arrTexta = new String[]{"出境游", "国内游", "国内游","出境游"};
    private String[] arrTextb = new String[]{"出境游", "周边游", "出境游","国内游"};
    private String[] arrTextc = new String[]{"出境游", "出境游", "出境游","国内游"};
    private int[] arrImages = new int[]{R.mipmap.testpicture,R.mipmap.testpicture,R.mipmap.testpicture,R.mipmap.testpicture};
    private List<HomeFifthInfo> pictures;

    public TravelOutSecondAdapter(Context context){
        this.mContext=context;
        pictures = new ArrayList<>();
        for (int i=0; i<4; i++){
            HomeFifthInfo pt = new HomeFifthInfo(arrTexta[i], arrTextb[i],arrTextc[i],arrImages[i]);
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
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_fragment_home_fifth_view, null);
            holder.iva = (ImageView) convertView.findViewById(R.id.img_fifth_view);
            //设置显示图片
            holder.iva.setBackgroundResource(arrImages[position]);
            holder.tva = (TextView) convertView.findViewById(R.id.tv_fifth_content_a);
            holder.tvb = (TextView) convertView.findViewById(R.id.tv_fifth_content_b);
            holder.tvc = (TextView) convertView.findViewById(R.id.tv_fifth_content_c);
            //设置标题
            holder.tva.setText(arrTexta[position]);
            holder.tvb.setText(arrTextb[position]);
            holder.tvc.setText(arrTextc[position]);
            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }




        return convertView;
    }
    class Holder {
        ImageView iva;
        TextView tva;
        TextView tvb;
        TextView tvc;

    }
}
