package com.example.host.jsnewmall.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.model.HomeFifthInfo;
import com.example.host.jsnewmall.model.LineRouteEntry;
import com.example.host.jsnewmall.view.HomeForthGridView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by host on 2017/3/1.
 */

public class RouteListbAdapter extends BaseAdapter {
    private Context mContext;
    private RequestQueue queue;


//    private String[] arrTexta = new String[]{"1", "2", "3","4"};
//    private String[] arrTextb = new String[]{"文本标签", "文本标签", "文本标签","文本标签"};
//    private String[] arrTextc = new String[]{"文本标签", "文本标签", "文本标签","文本标签"};
//    private int[] arrImages = new int[]{R.mipmap.testpicture,R.mipmap.testpicture,R.mipmap.testpicture,R.mipmap.testpicture};
//    private List<HomeFifthInfo> pictures;

    private LineRouteEntry mBodyInfo;

    public RouteListbAdapter(Context context, RequestQueue queue, LineRouteEntry bodyinfo){
        this.mContext=context;
        this.queue=queue;
        this.mBodyInfo=bodyinfo;

//        pictures = new ArrayList<>();
//        for (int i=0; i<2; i++){
//            HomeFifthInfo pt = new HomeFifthInfo(arrTexta[i], arrTextb[i],arrTextc[i],arrImages[i]);
//            pictures.add(pt);
//        }



//        for (int i=0;i<mBodyInfo.getData_journey().size();i++){
//
//            for (int j=0;j<mBodyInfo.getData_journey().size();j++){
//                String atempb=mBodyInfo.getData_show().get(j).getTypeid();
//                if (atempa.equals(atempb)){
//
//                }
//            }
//        }

    }

    @Override
    public int getCount() {
        return mBodyInfo.getData_journey().size();

    }


    @Override
    public Object getItem(int position) {
        return mBodyInfo.getData_journey().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        convertView = LayoutInflater.from(mContext).inflate(R.layout.item_item_route_b_view, null);

       TextView mTvItemDate=(TextView)convertView.findViewById(R.id.tv_item_date_route);//第几天
        mTvItemDate.setText(mBodyInfo.getData_journey().get(position).getJourney_day());
       TextView mTvItemRouteTitle=(TextView)convertView.findViewById(R.id.tv_item_title_route_a);//第几天名字
        mTvItemRouteTitle.setText(mBodyInfo.getData_journey().get(position).getJourney_basic_info());
        TextView mTvFirstContent=(TextView)convertView.findViewById(R.id.tv_item_first_view);//第一组内容
        mTvFirstContent.setText(mBodyInfo.getData_journey().get(position).getJourney_details());

        TextView mTvLuncha=(TextView)convertView.findViewById(R.id.tv_route_lunch_a);//早餐
        TextView mTvLunchb=(TextView)convertView.findViewById(R.id.tv_route_lunch_b);//午餐
        TextView mTvLunchc=(TextView)convertView.findViewById(R.id.tv_route_lunch_c);//晚餐
        mTvLuncha.setText(mBodyInfo.getData_journey().get(position).getJourney_break_fast());
        mTvLunchb.setText(mBodyInfo.getData_journey().get(position).getJourney_lunch());
        mTvLunchc.setText(mBodyInfo.getData_journey().get(position).getJourney_dinner());

        TextView mTvZhusu=(TextView)convertView.findViewById(R.id.tv_zhusu);//住宿
        mTvZhusu.setText(mBodyInfo.getData_journey().get(position).getJourney_lodging());




        String atempa=mBodyInfo.getData_journey().get(position).getJourney_day();

            for (int j = 0; j < mBodyInfo.getData_show().size(); j++) {

                String atempb = mBodyInfo.getData_show().get(j).getTypeid();

                if (atempa.equals(atempb)) {
                    ListView mListViewThird = (ListView) convertView.findViewById(R.id.itme_item_item_listview_route);//第一组图片展示用listview
                    RouteListcAdapter adapterc = new RouteListcAdapter(mContext, queue, mBodyInfo.getData_show().get(j).getPic_data());
                    mListViewThird.setAdapter(adapterc);
                    HomeForthGridView.setListViewHeight(mListViewThird);

                }
            }


        return convertView;
    }
}
