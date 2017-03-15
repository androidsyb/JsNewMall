package com.example.host.jsnewmall.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.model.HomeMainEntry;
import com.example.host.jsnewmall.model.HomeThirdInfo;
import com.example.host.jsnewmall.utils.BitmapCache;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by host on 2017/2/15.
 */

public class HomeForthGridAdapter extends BaseAdapter {

    private RequestQueue queue;
    private Context mContext;
    private HomeMainEntry mBodyInfo;
    private ImageLoader imageLoader;

    public HomeForthGridAdapter(Context context, HomeMainEntry bodyinfo, RequestQueue queue){
        this.mContext=context;
        this.mBodyInfo=bodyinfo;
        this.queue=queue;
        imageLoader = new ImageLoader(queue, new BitmapCache());


    }
    @Override
    public int getCount() {

       return mBodyInfo.getList().getHot_rec().size();
    }

    @Override
    public Object getItem(int position) {
        return mBodyInfo.getList().getHot_rec().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        Holder holder;
        if (convertView == null) {
            holder = new Holder();
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_fragment_home_forth_view, null);
            holder.iva = (NetworkImageView) convertView.findViewById(R.id.img_forth_view);
            //设置显示图片
            holder.iva.setScaleType(ImageView.ScaleType.FIT_XY);
            holder.iva.setImageUrl(mBodyInfo.getList().getHot_rec().get(position).getImg(), imageLoader);
//            holder.iva.setBackgroundResource(arrImages[position]);
            holder.tva = (TextView) convertView.findViewById(R.id.tv_forth_content_a);
            holder.tvb = (TextView) convertView.findViewById(R.id.tv_forth_content_b);

            //设置标题
            String mSubstring=mBodyInfo.getList().getHot_rec().get(position).getTitle();

//            String[] mText=mSubstring.split("-");
            holder.tva.setText(mSubstring);
//            holder.tvb.setText(mText[1]);



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
    }
}
