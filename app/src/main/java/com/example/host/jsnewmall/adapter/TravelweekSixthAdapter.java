package com.example.host.jsnewmall.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.model.HomeSixthInfo;
import com.example.host.jsnewmall.utils.BitmapCache;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by host on 2017/2/17.
 */

public class TravelweekSixthAdapter  extends BaseAdapter{


    private Context mContext;
    private String[] arrTexta = new String[]{"亲子游", "周末游", "文本标签","文本标签","周末游", "文本标签", "文本标签",};
    private String[] arrTextb = new String[]{"周末游", "文本标签", "文本标签","文本标签","亲子游", "文本标签", "文本标签",};
    private String[] arrTextc = new String[]{"文本标签", "文本标签", "文本标签","周末游","亲子游", "文本标签", "文本标签",};
    private String[] arrTextd = new String[]{"周末游", "文本标签", "周末游","文本标签","亲子游", "文本标签", "文本标签",};
    private String[] arrTexte = new String[]{"周末游", "周末游", "文本标签","文本标签","亲子游", "文本标签", "文本标签",};
    private String[] arrTextf = new String[]{"文本标签", "文本标签", "文本标签","文本标签","亲子游", "文本标签", "文本标签",};
    private String[] arrTextg = new String[]{"http://f.hiphotos.baidu.com/image/pic/item/203fb80e7bec54e753da379aba389b504fc26a7b.jpg",
            "http://f.hiphotos.baidu.com/image/pic/item/203fb80e7bec54e753da379aba389b504fc26a7b.jpg",
            "http://f.hiphotos.baidu.com/image/pic/item/203fb80e7bec54e753da379aba389b504fc26a7b.jpg",
            "http://f.hiphotos.baidu.com/image/pic/item/203fb80e7bec54e753da379aba389b504fc26a7b.jpg"};
    private int[] arrImages = new int[]{R.mipmap.testpicture,R.mipmap.testpicture,R.mipmap.testpicture,R.mipmap.testpicture
            ,R.mipmap.testpicture,R.mipmap.testpicture,R.mipmap.testpicture};
    private List<HomeSixthInfo> pictures;

    private RequestQueue queue;
    private ImageLoader imageLoader;
    public TravelweekSixthAdapter(Context context, RequestQueue queue){
        this.mContext=context;
        this.queue=queue;
        imageLoader = new ImageLoader(queue, new BitmapCache());
        pictures = new ArrayList<>();
        for (int i=0;i<4;i++){
            HomeSixthInfo pt = new HomeSixthInfo(arrTexta[i], arrTextb[i],arrTextc[i],arrTextd[i],arrTexte[i],arrTextf[i],arrImages[i],arrTextg[i]);
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
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_fragment_home_sixth_view, null);
//            holder.iva = (ImageView) convertView.findViewById(R.id.img);

            holder.iva = (RelativeLayout) convertView.findViewById(R.id.ll_sixth_layout);//背景
            holder.networkImageView=(NetworkImageView) convertView.findViewById(R.id.network_travel);

//            NetworkImageView imageView = new NetworkImageView(mContext);
            holder.networkImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            holder.networkImageView.setImageUrl(arrTextg[position], imageLoader);


            //设置显示图片
//            holder.iva.setBackgroundResource(arrImages[position]);



            holder.tva = (TextView) convertView.findViewById(R.id.tv_sixth_content_a);
            holder.tvb = (TextView) convertView.findViewById(R.id.tv_sixth_content_b);
            holder.tvc = (TextView) convertView.findViewById(R.id.tv_sixth_content_c);
            holder.tvd = (TextView) convertView.findViewById(R.id.tv_sixth_content_d);
            holder.tve = (TextView) convertView.findViewById(R.id.tv_sixth_content_e);
            holder.tvf = (TextView) convertView.findViewById(R.id.tv_sixth_content_f);

            //设置标题
            holder.tva.setText(arrTexta[position]);
            holder.tvb.setText(arrTextb[position]);
            holder.tvc.setText(arrTextc[position]);
            holder.tvd.setText(arrTextd[position]);
            holder.tve.setText(arrTexte[position]);
            holder.tvf.setText(arrTextf[position]);

            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }




        return convertView;
    }
    class Holder {
        RelativeLayout iva;
        TextView tva;
        TextView tvb;
        TextView tvc;
        TextView tvd;
        TextView tve;
        TextView tvf;
        NetworkImageView networkImageView;


    }
}
