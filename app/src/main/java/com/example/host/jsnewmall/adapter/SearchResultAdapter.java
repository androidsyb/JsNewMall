package com.example.host.jsnewmall.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
 * Created by host on 2017/2/22.
 */

public class SearchResultAdapter extends BaseAdapter {

    private Context mContext;
    private String[] arrTexta = new String[]{"亲子游", "文本标签", "文本标签","文本标签","亲子游", "文本标签", "文本标签",};
    private String[] arrTextb = new String[]{"文本标签", "文本标签", "文本标签","文本标签","亲子游", "文本标签", "文本标签",};
    private String[] arrTextc = new String[]{"文本标签", "文本标签", "文本标签","文本标签","亲子游", "文本标签", "文本标签",};
    private String[] arrTextd = new String[]{"文本标签", "文本标签", "文本标签","文本标签","亲子游", "文本标签", "文本标签",};
    private String[] arrTexte = new String[]{"文本标签", "文本标签", "文本标签","文本标签","亲子游", "文本标签", "文本标签",};
    private String[] arrTextf = new String[]{"文本标签", "文本标签", "文本标签","文本标签","亲子游", "文本标签", "文本标签",};
    private String[] arrTextg = new String[]{"http://pic6.huitu.com/res/20130116/84481_20130116142820494200_1.jpg",
            "http://pic6.huitu.com/res/20130116/84481_20130116142820494200_1.jpg",
            "http://pic6.huitu.com/res/20130116/84481_20130116142820494200_1.jpg",
            "http://pic6.huitu.com/res/20130116/84481_20130116142820494200_1.jpg"};
    private int[] arrImages = new int[]{R.mipmap.testpicture,R.mipmap.testpicture,R.mipmap.testpicture,R.mipmap.testpicture
            ,R.mipmap.testpicture,R.mipmap.testpicture,R.mipmap.testpicture};
    private List<HomeSixthInfo> pictures;

    private RequestQueue queue;
    private ImageLoader imageLoader;
    public SearchResultAdapter(Context context, RequestQueue queue){
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
    public View  getView(int position, View convertView, ViewGroup viewGroup) {
        Holder holder;
        if (convertView == null) {
            holder = new Holder();
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_activity_result, null);
//            holder.iva = (ImageView) convertView.findViewById(R.id.img);


            holder.networkImageView=(NetworkImageView) convertView.findViewById(R.id.netimg_result);

//            NetworkImageView imageView = new NetworkImageView(mContext);
            holder.networkImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            holder.networkImageView.setImageUrl(arrTextg[position], imageLoader);
            holder.mLnAddView=(LinearLayout)convertView.findViewById(R.id.ln_result_b);//需要添加控件


            //设置显示图片
//            holder.iva.setBackgroundResource(arrImages[position]);



            holder.tva = (TextView) convertView.findViewById(R.id.tv_item_result_a);//图片上方字一
            holder.tvb = (TextView) convertView.findViewById(R.id.tv_item_result_b);//图片上方字二
            holder.tvc = (TextView) convertView.findViewById(R.id.tv_result_content_a);//右上方第一排
            holder.tvd = (TextView) convertView.findViewById(R.id.tv_result_content_b);//团期
            holder.tve = (TextView) convertView.findViewById(R.id.tv_result_content_c);//金额
            holder.tvf = (TextView) convertView.findViewById(R.id.tv_result_content_d);//右下角日期

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


        for (int i=0;i<position;i++){
            LinearLayout.LayoutParams lp1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT);
            TextView tv = new TextView(mContext);
            tv.setText("你好");
            tv.setBackgroundDrawable(mContext.getResources().getDrawable(R.drawable.home_sixth_content_shape_c));
            tv.setPadding(10,10,10,10);
            tv.setTextSize(10);
            tv.setTextColor(mContext.getResources().getColor(R.color.home_button_a));
            lp1.setMargins(10,0,0,0);
            holder.mLnAddView.addView(tv,lp1);
        }



        return convertView;
    }
    class Holder {

        TextView tva;
        TextView tvb;
        TextView tvc;
        TextView tvd;
        TextView tve;
        TextView tvf;
        NetworkImageView networkImageView;
        LinearLayout mLnAddView;


    }
}
