package com.example.host.jsnewmall.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.model.HomeSixthInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by host on 2017/2/16.
 */

public class TravelThirdAdapter extends BaseAdapter {
    private Context mContext;
    private String[] arrTexta = new String[]{"亲子游", "周边游", "文本标签","文本标签","亲子游", "文本标签", "周边游",};
    private String[] arrTextb = new String[]{"周边游", "文本标签", "周边游","周边游","亲子游", "周边游", "周边游",};
    private String[] arrTextc = new String[]{"周边游", "文本标签", "文本标签","文本标签","亲子游", "周边游", "周边游",};
    private String[] arrTextd = new String[]{"周边游", "周边游", "文本标签","周边游","亲子游", "文本标签", "周边游",};
    private String[] arrTexte = new String[]{"文本标签", "周边游", "周边游","周边游","亲子游", "周边游", "文本标签",};
    private String[] arrTextf = new String[]{"周边游", "周边游", "周边游","文本标签","亲子游", "周边游", "周边游",};

    private int[] arrImages = new int[]{R.mipmap.testpicture,R.mipmap.testpicture,R.mipmap.testpicture,R.mipmap.testpicture
            ,R.mipmap.testpicture,R.mipmap.testpicture,R.mipmap.testpicture};
    private List<HomeSixthInfo> pictures;

    public TravelThirdAdapter(Context context){
        this.mContext=context;
        pictures = new ArrayList<>();
        for (int i=0;i<4;i++){
            HomeSixthInfo pt = new HomeSixthInfo(arrTexta[i], arrTextb[i],arrTextc[i],arrTextd[i],arrTexte[i],arrTextf[i],arrImages[i],arrTextf[i]);
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
            holder.iva = (RelativeLayout) convertView.findViewById(R.id.ll_sixth_layout);
            //设置显示图片
            holder.iva.setBackgroundResource(arrImages[position]);
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


    }
}
