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
import com.example.host.jsnewmall.model.HomeSixthInfo;
import com.example.host.jsnewmall.utils.BitmapCache;
import com.example.host.jsnewmall.view.XRoundNetImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by host on 2017/2/20.
 */

public class DingZhiAdapter extends BaseAdapter{


    private Context mContext;
    private String[] arrTexta = new String[]{"亲子游", "文本标签", "文本标签","文本标签"};
    private String[] arrTextb = new String[]{"文本标签", "文本标签", "文本标签","文本标签"};

    private String[] arrTextg = new String[]{"http://pic6.huitu.com/res/20130116/84481_20130116142820494200_1.jpg",
            "http://img2.imgtn.bdimg.com/it/u=2644124456,1222741308&fm=23&gp=0.jpg",
            "http://pic6.huitu.com/res/20130116/84481_20130116142820494200_1.jpg",
            "http://img2.imgtn.bdimg.com/it/u=2644124456,1222741308&fm=23&gp=0.jpg"};
    private int[] arrImages = new int[]{R.mipmap.testpicture,R.mipmap.testpicture,R.mipmap.testpicture,R.mipmap.testpicture
            ,R.mipmap.testpicture,R.mipmap.testpicture,R.mipmap.testpicture};
    private List<HomeSixthInfo> pictures;

    private RequestQueue queue;
    private ImageLoader imageLoader;
    public DingZhiAdapter(Context context, RequestQueue queue){
        this.mContext=context;
        this.queue=queue;
        imageLoader = new ImageLoader(queue, new BitmapCache());
        pictures = new ArrayList<>();
        for (int i=0;i<4;i++){
            HomeSixthInfo pt = new HomeSixthInfo(arrTexta[i], arrTextb[i],arrTextb[i],arrTextb[i],arrTextb[i],arrTextb[i],arrImages[i],arrTextg[i]);
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
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        Holder holder;
        if (convertView == null) {
            holder = new Holder();
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_activity_dingzhi_view, null);

            holder.networkImageView=(XRoundNetImageView) convertView.findViewById(R.id.item_list_round_view);

//            NetworkImageView imageView = new NetworkImageView(mContext);
            holder.networkImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            holder.networkImageView.setImageUrl(arrTextg[position], imageLoader);


            //设置显示图片
//            holder.iva.setBackgroundResource(arrImages[position]);



            holder.tva = (TextView) convertView.findViewById(R.id.tv_dingzhi_item_a);
            holder.tvb = (TextView) convertView.findViewById(R.id.tv_dingzhi_item_b);



            //设置标题
            holder.tva.setText(arrTexta[position]);
            holder.tvb.setText(arrTextb[position]);



            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }




        return convertView;
    }
    class Holder {

        TextView tva;
        TextView tvb;

        XRoundNetImageView networkImageView;


    }

}
