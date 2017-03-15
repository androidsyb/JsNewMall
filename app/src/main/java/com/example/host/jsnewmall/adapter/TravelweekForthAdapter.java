package com.example.host.jsnewmall.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
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
import com.example.host.jsnewmall.model.Picture;
import com.example.host.jsnewmall.utils.BitmapCache;
import com.example.host.jsnewmall.view.XRoundNetImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by host on 2017/2/17.
 */

public class TravelweekForthAdapter extends BaseAdapter {
    private Context mContext;
    private String[] arrText = new String[]{"千岛湖", "千岛湖", "千岛湖","千岛湖"};
    private int[] arrImages = new int[]{R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};
    private List<Picture> pictures;
    private String[] imgurla=new String[]{"http://img2.imgtn.bdimg.com/it/u=2644124456,1222741308&fm=23&gp=0.jpg",
            "http://pic6.huitu.com/res/20130116/84481_20130116142820494200_1.jpg",
            "http://img2.imgtn.bdimg.com/it/u=2644124456,1222741308&fm=23&gp=0.jpg",
            "http://pic6.huitu.com/res/20130116/84481_20130116142820494200_1.jpg"};
    private RequestQueue queue;
    private ImageLoader imageLoader;


    public TravelweekForthAdapter(Context context,RequestQueue queue){
        mContext=context;
        this.queue=queue;
        imageLoader = new ImageLoader(queue, new BitmapCache());
        pictures = new ArrayList<>();
        for (int i=0; i<4; i++){
            Picture pt = new Picture(arrText[i], arrImages[i],imgurla[i]);
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
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_fragment_travel_week_forth, null);
            holder.ivnetimg = (XRoundNetImageView) convertView.findViewById(R.id.img_network_a);
            //设置显示图片
            holder.ivnetimg.setScaleType(ImageView.ScaleType.FIT_XY);
            holder.ivnetimg.setImageUrl(imgurla[position], imageLoader);//设置图片




            holder.tv = (TextView) convertView.findViewById(R.id.tv_week_forth_a);
            //设置标题
            holder.tv.setText(arrText[position]);
            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }

        return convertView;
    }
    class Holder {
        XRoundNetImageView ivnetimg;
        TextView tv;
    }




}
