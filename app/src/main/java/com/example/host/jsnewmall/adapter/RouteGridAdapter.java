package com.example.host.jsnewmall.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.model.HomeFifthInfo;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by host on 2017/3/2.
 */

public class RouteGridAdapter extends BaseAdapter {

    private Context mContext;
    private String[] arrTexta = new String[]{"1月", "2月", "3月","4月"};
    private String[] arrTextb = new String[]{"600", "500", "1000","1500"};
    private String[] arrTextc = new String[]{"文本标签", "文本标签", "文本标签","文本标签"};
    private int[] arrImages = new int[]{R.mipmap.testpicture,R.mipmap.testpicture,R.mipmap.testpicture,R.mipmap.testpicture};
    private List<HomeFifthInfo> pictures;
    private int mSelect=-1;

    public RouteGridAdapter(Context context){
        this.mContext=context;

        pictures = new ArrayList<>();
        for (int i=0; i<4; i++){
            HomeFifthInfo pt = new HomeFifthInfo(arrTexta[i], arrTextb[i],arrTextc[i],arrImages[i]);
            pictures.add(pt);
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Object getItem(int position) {
        return pictures.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void changeSelected(int positon){ //刷新方法
        if(positon != mSelect){
            mSelect = positon;
            notifyDataSetChanged();
        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {


        Holder holder;
        if (convertView == null) {
            holder = new Holder();
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_route_selectdate_gridview, null);
            holder.tvdate=(TextView) convertView.findViewById(R.id.tv_item_date_a);//日期
            holder.tvmoney=(TextView) convertView.findViewById(R.id.tv_routedate_money);//金额
            holder.tvmoneya=(TextView) convertView.findViewById(R.id.tv_routedate_money_a);//金额标记
            holder.lnbgcolor=(LinearLayout) convertView.findViewById(R.id.ln_item_layout_bgcolor);//点击背景变化

            holder.tvdate.setText(arrTexta[position]);
            holder.tvmoney.setText(arrTextb[position]);
;

            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }

        if(mSelect==position){
            holder.lnbgcolor.setBackgroundDrawable(mContext.getResources().getDrawable(R.drawable.home_sixth_content_shape));  //选中项背景
            holder.tvmoney.setTextColor(mContext.getResources().getColor(R.color.white));
            holder.tvmoneya.setTextColor(mContext.getResources().getColor(R.color.white));

        }else{
            holder.lnbgcolor.setBackgroundDrawable(mContext.getResources().getDrawable(R.drawable.home_sixth_content_shape_c));  //其他项背景
            holder.tvmoney.setTextColor(mContext.getResources().getColor(R.color.title_orange));
            holder.tvmoneya.setTextColor(mContext.getResources().getColor(R.color.title_orange));
        }




        return convertView;
    }
    class Holder {
        TextView tvdate;
        TextView tvmoney;
        TextView tvmoneya;
        LinearLayout lnbgcolor;

    }

}
