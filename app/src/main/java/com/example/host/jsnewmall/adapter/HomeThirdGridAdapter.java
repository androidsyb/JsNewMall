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
import com.example.host.jsnewmall.model.HomeMainEntry;
import com.example.host.jsnewmall.model.Picture;
import com.example.host.jsnewmall.utils.BitmapCache;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by host on 2017/2/15.
 */

public class HomeThirdGridAdapter extends BaseAdapter {



    private Context mContext;
    private HomeMainEntry mBodyInfo;
    private RequestQueue queue;
    private ImageLoader imageLoader;

    public HomeThirdGridAdapter(Context context, HomeMainEntry bodyinfo, RequestQueue queue){
        mContext=context;
        this.mBodyInfo=bodyinfo;
        this.queue=queue;
        imageLoader = new ImageLoader(queue, new BitmapCache());
    }

    @Override
    public int getCount() {
       return mBodyInfo.getList().getTop_nav().size();

    }

    @Override
    public Object getItem(int position) {
        return mBodyInfo.getList().getTop_nav().get(position);
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
                      convertView = LayoutInflater.from(mContext).inflate(R.layout.item_fragment_home_third_view, null);
                      holder.iv = (NetworkImageView) convertView.findViewById(R.id.img_third_view);
                       //设置显示图片

                    holder.iv.setScaleType(ImageView.ScaleType.FIT_XY);
                    holder.iv.setImageUrl(mBodyInfo.getList().getTop_nav().get(position).getImg(), imageLoader);
                     holder.tv = (TextView) convertView.findViewById(R.id.tv_third_content);
                        //设置标题
                     holder.tv.setText(mBodyInfo.getList().getTop_nav().get(position).getTitle());
                      convertView.setTag(holder);
                  } else {
                      holder = (Holder) convertView.getTag();
                   }

        return convertView;
    }
    class Holder {
               NetworkImageView iv;
              TextView tv;
            }
}
