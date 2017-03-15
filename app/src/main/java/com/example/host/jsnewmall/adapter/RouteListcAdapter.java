package com.example.host.jsnewmall.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.model.HomeFifthInfo;
import com.example.host.jsnewmall.model.LineRouteEntry;
import com.example.host.jsnewmall.utils.BitmapCache;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by host on 2017/3/1.
 */

public class RouteListcAdapter extends BaseAdapter {

    private Context mContext;
    private RequestQueue queue;
    private ImageLoader imageLoader;

//    private String[] arrTexta = new String[]{"1", "2", "3","4"};
//    private String[] arrTextb = new String[]{"文本标签", "文本标签", "文本标签","文本标签"};
//    private String[] arrTextc = new String[]{"文本标签", "文本标签", "文本标签","文本标签"};
//    private int[] arrImages = new int[]{R.mipmap.testpicture,R.mipmap.testpicture,R.mipmap.testpicture,R.mipmap.testpicture};
//    private List<HomeFifthInfo> pictures;

    private LineRouteEntry mBodyInfo;
    private List<LineRouteEntry.DataShowBean.PicDataBean> mPiclist;


    public RouteListcAdapter(Context context, RequestQueue queue, List<LineRouteEntry.DataShowBean.PicDataBean> piclist){
        this.mContext=context;
        this.queue=queue;
//        this.mBodyInfo=bodyinfo;
        this.mPiclist=piclist;
        imageLoader = new ImageLoader(queue, new BitmapCache());

//        pictures = new ArrayList<>();
//        for (int i=0; i<2; i++){
//            HomeFifthInfo pt = new HomeFifthInfo(arrTexta[i], arrTextb[i],arrTextc[i],arrImages[i]);
//            pictures.add(pt);
//        }



    }
    @Override
    public int getCount() {
        return mPiclist.size();
//        if (mPiclist!=null) {
//            return mPiclist.size();
//        }else {
//            return 0;
//        }
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

        Holder holder;
        if (convertView == null) {
            holder = new Holder();
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_item_item_route_netimge, null);
            holder.iva = (NetworkImageView) convertView.findViewById(R.id.netimg_threeitem);
            //设置显示图片

//            for (int i=0;i<mBodyInfo.getData_journey().size();i++){
//                String atempa=mBodyInfo.getData_journey().get(position).getJourney_day();
////                String atempa="2";
//                for (int j=0;j<mBodyInfo.getData_show().size();j++){
//
//                    String atempb=mBodyInfo.getData_show().get(j).getTypeid();
//                    if (atempa.equals(atempb)){
//                        List<LineRouteEntry.DataShowBean.PicDataBean> mpicdata = mBodyInfo.getData_show().get(j).getPic_data();
//                        holder.iva.setScaleType(ImageView.ScaleType.FIT_XY);
//                        holder.iva.setImageUrl(mpicdata.get(j).getImg_url(), imageLoader);
//                    }else{
//                        holder.iva.setVisibility(View.INVISIBLE);
//                    }
//                }
//            }


//            holder.iva.setBackgroundResource(pictures.get(position).getImageId());

            holder.iva.setScaleType(ImageView.ScaleType.FIT_XY);
            holder.iva.setImageUrl(mPiclist.get(position).getImg_url(), imageLoader);

            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }




        return convertView;
    }
    class Holder {
        NetworkImageView iva;

    }

}
