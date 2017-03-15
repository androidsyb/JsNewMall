package com.example.host.jsnewmall.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.example.host.jsnewmall.model.LineRouteEntry;
import com.example.host.jsnewmall.utils.BitmapCache;

/**
 * Created by host on 2017/3/6.
 */

public class RouteViewPagerAdapter extends PagerAdapter {


    private LineRouteEntry mBodyInfo;
    private Context mContext;
    private ImageLoader imageLoader;
    private RequestQueue queue;
    public RouteViewPagerAdapter(Context context, RequestQueue queue, LineRouteEntry bodyinfo) {
        super();
        this.mContext = context;
        this.queue=queue;
        this.mBodyInfo=bodyinfo;
        imageLoader = new ImageLoader(queue, new BitmapCache());


    }

    @Override
    public int getCount() {
//        return Integer.MAX_VALUE;
//        if (mBodyInfo.getData_img().size()<4){
//            return mBodyInfo.getData_img().size();
//        }else {
//            return 4;
//
//        }
        return mBodyInfo.getData_img().size();


    }


    @Override
    public boolean isViewFromObject(View arg0, Object arg1) {
        return arg0 == arg1;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {

        LineRouteEntry.DataImgBean bannerinfo = mBodyInfo.getData_img().get(position
                % mBodyInfo.getData_img().size());
        NetworkImageView imageView = new NetworkImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageUrl(bannerinfo.getImg_url(), imageLoader);

        container.addView(imageView);

        return imageView;

    }
}
