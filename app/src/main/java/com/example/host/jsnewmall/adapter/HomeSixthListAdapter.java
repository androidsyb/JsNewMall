package com.example.host.jsnewmall.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.NetworkImageView;
import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.model.HomeMainEntry;
import com.example.host.jsnewmall.model.HomeSixthInfo;
import com.example.host.jsnewmall.utils.BitmapCache;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by host on 2017/2/15.
 */

public class HomeSixthListAdapter extends BaseAdapter {

    private Context mContext;
//    private String[] arrTexta = new String[]{"亲子游", "文本标签", "文本标签","文本标签","亲子游", "文本标签", "文本标签",};
//    private String[] arrTextb = new String[]{"文本标签", "文本标签", "文本标签","文本标签","亲子游", "文本标签", "文本标签",};
//    private String[] arrTextc = new String[]{"文本标签", "文本标签", "文本标签","文本标签","亲子游", "文本标签", "文本标签",};
//    private String[] arrTextd = new String[]{"文本标签", "文本标签", "文本标签","文本标签","亲子游", "文本标签", "文本标签",};
//    private String[] arrTexte = new String[]{"文本标签", "文本标签", "文本标签","文本标签","亲子游", "文本标签", "文本标签",};
//    private String[] arrTextf = new String[]{"文本标签", "文本标签", "文本标签","文本标签","亲子游", "文本标签", "文本标签",};
//    private String[] arrTextg = new String[]{"http://pic6.huitu.com/res/20130116/84481_20130116142820494200_1.jpg",
//            "http://pic6.huitu.com/res/20130116/84481_20130116142820494200_1.jpg",
//            "http://pic6.huitu.com/res/20130116/84481_20130116142820494200_1.jpg",
//            "http://pic6.huitu.com/res/20130116/84481_20130116142820494200_1.jpg"};
//    private int[] arrImages = new int[]{R.mipmap.testpicture,R.mipmap.testpicture,R.mipmap.testpicture,R.mipmap.testpicture
//            ,R.mipmap.testpicture,R.mipmap.testpicture,R.mipmap.testpicture};
//    private List<HomeSixthInfo> pictures;

    private RequestQueue queue;
    private ImageLoader imageLoader;
    private HomeMainEntry mBodyInfo;
    public HomeSixthListAdapter(Context context, RequestQueue queue, HomeMainEntry bodyinfo){
        this.mContext=context;
        this.queue=queue;
        this.mBodyInfo=bodyinfo;
        imageLoader = new ImageLoader(queue, new BitmapCache());
//        pictures = new ArrayList<>();
//        for (int i=0;i<4;i++){
//            HomeSixthInfo pt = new HomeSixthInfo(arrTexta[i], arrTextb[i],arrTextc[i],arrTextd[i],arrTexte[i],arrTextf[i],arrImages[i],arrTextg[i]);
//            pictures.add(pt);
//        }

    }
    @Override
    public int getCount() {
//        if (null != pictures){
//            return  pictures.size();
//        }else{
//            return 0;
//        }
        return mBodyInfo.getList().getLindes_list().size();
    }

    @Override
    public Object getItem(int position) {
        return mBodyInfo.getList().getLindes_list().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
     HomeMainEntry.ListBean.LindesListBean contentinfo=mBodyInfo.getList().getLindes_list().get(position);
        Holder holder;
        if (convertView == null) {
            holder = new Holder();
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_fragment_home_sixth_view, null);
//            holder.iva = (ImageView) convertView.findViewById(R.id.img);

            holder.iva = (RelativeLayout) convertView.findViewById(R.id.ll_sixth_layout);//背景
            holder.networkImageView=(NetworkImageView) convertView.findViewById(R.id.network_travel);

//            NetworkImageView imageView = new NetworkImageView(mContext);
            holder.networkImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            holder.networkImageView.setImageUrl(contentinfo.getLine_data().getImage(), imageLoader);


            //设置显示图片
//            holder.iva.setBackgroundResource(arrImages[position]);



            holder.tva = (TextView) convertView.findViewById(R.id.tv_sixth_content_a);
            holder.tvb = (TextView) convertView.findViewById(R.id.tv_sixth_content_b);
            holder.tvc = (TextView) convertView.findViewById(R.id.tv_sixth_content_c);
            holder.tvd = (TextView) convertView.findViewById(R.id.tv_sixth_content_d);
            holder.tve = (TextView) convertView.findViewById(R.id.tv_sixth_content_e);
            holder.tvf = (TextView) convertView.findViewById(R.id.tv_sixth_content_f);

            //设置标题
            holder.tva.setText(mContext.getResources().getString(R.string.search_h)+
                    contentinfo.getLine_data().getPrice()+
            mContext.getResources().getString(R.string.search_i));
            holder.tvb.setText(contentinfo.getLine_data().getLines_days()+"天"+
            contentinfo.getLine_data().getLines_daysnight()+"晚");
            holder.tvc.setText(contentinfo.getLine_data().getGo_place()+"出发");
            holder.tvd.setText(contentinfo.getLine_data().getTravelmode());
            holder.tve.setText(contentinfo.getLine_data().getName());
            holder.tvf.setText(contentinfo.getLine_data().getTitle());

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
