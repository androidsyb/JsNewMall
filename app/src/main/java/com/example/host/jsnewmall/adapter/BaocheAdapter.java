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
import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.model.Picture;
import com.example.host.jsnewmall.utils.BitmapCache;
import com.example.host.jsnewmall.view.XRoundNetImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by host on 2017/2/20.
 */

public class BaocheAdapter extends BaseAdapter {


    private Context mContext;
    private String[] arrText = new String[]{"文本标签", "文本标签", "文本标签","文本标签","文本标签","文本标签","文本标签","文本标签"};
    private int[] arrImages = new int[]{R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};
    private List<Picture> pictures;

    private RequestQueue queue;
    private ImageLoader imageLoader;
    private String[] arrTextg = new String[]{"http://pic6.huitu.com/res/20130116/84481_20130116142820494200_1.jpg",
            "http://img2.imgtn.bdimg.com/it/u=2644124456,1222741308&fm=23&gp=0.jpg",
            "http://pic6.huitu.com/res/20130116/84481_20130116142820494200_1.jpg",
            "http://img2.imgtn.bdimg.com/it/u=2644124456,1222741308&fm=23&gp=0.jpg",
            "http://pic6.huitu.com/res/20130116/84481_20130116142820494200_1.jpg",
            "http://img2.imgtn.bdimg.com/it/u=2644124456,1222741308&fm=23&gp=0.jpg",
            "http://pic6.huitu.com/res/20130116/84481_20130116142820494200_1.jpg",
            "http://img2.imgtn.bdimg.com/it/u=2644124456,1222741308&fm=23&gp=0.jpg"};
    public BaocheAdapter(Context context, RequestQueue queue){
        mContext=context;
        this.queue=queue;
        imageLoader = new ImageLoader(queue, new BitmapCache());
        pictures = new ArrayList<>();
        for (int i=0; i<8; i++){
            Picture pt = new Picture(arrText[i], arrImages[i],arrTextg[i]);
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
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_activity_baoche_gridview, null);
            holder.iv = (XRoundNetImageView) convertView.findViewById(R.id.item_baoche_imageview);
            //设置显示图片
            holder.iv.setScaleType(ImageView.ScaleType.FIT_XY);
            holder.iv.setImageUrl(arrTextg[position],imageLoader);
            holder.tv = (TextView) convertView.findViewById(R.id.tv_baoche_item_textview);
            //设置标题
            holder.tv.setText(arrText[position]);
            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }

        return convertView;
    }
    class Holder {
        XRoundNetImageView iv;
        TextView tv;
    }

}
