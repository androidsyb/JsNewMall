package com.example.host.jsnewmall.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.model.HomeFifthInfo;
import com.example.host.jsnewmall.model.HomeMainEntry;
import com.example.host.jsnewmall.utils.BitmapCache;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by host on 2017/2/15.
 */

public class HomeFifthGridAdapter extends BaseAdapter{

    private Context mContext;
    private  HomeMainEntry mBodyInfo;
    private RequestQueue queue;
    private ImageLoader imageLoader;


    public HomeFifthGridAdapter(Context context, HomeMainEntry bodyinfo, RequestQueue queue){
        this.mContext=context;
        this.mBodyInfo=bodyinfo;
        this.queue=queue;
        imageLoader = new ImageLoader(queue, new BitmapCache());
    }



    @Override
    public int getCount() {
        return mBodyInfo.getList().getRecommend().size();
    }

    @Override
    public Object getItem(int position) {
        return mBodyInfo.getList().getRecommend().get(position);
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
            holder.iva = (NetworkImageView) convertView.findViewById(R.id.img_fifth_view);

            //设置显示图片
            holder.iva.setScaleType(ImageView.ScaleType.FIT_XY);
            holder.iva.setImageUrl(mBodyInfo.getList().getRecommend().get(position).getLine_data().getImage(), imageLoader);

            holder.tva = (TextView) convertView.findViewById(R.id.tv_fifth_content_a);
            holder.tvb = (TextView) convertView.findViewById(R.id.tv_fifth_content_b);
            holder.tvc = (TextView) convertView.findViewById(R.id.tv_fifth_content_c);
            //设置标题
            holder.tva.setText(mBodyInfo.getList().getRecommend().get(position).getLine_data().getName());
            holder.tvb.setText(mBodyInfo.getList().getRecommend().get(position).getLine_data().getLines_days()+
            "天"+mBodyInfo.getList().getRecommend().get(position).getLine_data().getLines_daysnight()+"晚");
            holder.tvc.setText(mContext.getResources().getString(R.string.search_h)+
                    mBodyInfo.getList().getRecommend().get(position).getLine_data().getPrice()+
            mContext.getResources().getString(R.string.search_i));
            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }




        return convertView;
    }
    class Holder {
        NetworkImageView iva;
        TextView tva;
        TextView tvb;
        TextView tvc;

    }
}
