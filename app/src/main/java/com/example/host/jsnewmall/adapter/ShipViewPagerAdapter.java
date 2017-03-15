package com.example.host.jsnewmall.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.example.host.jsnewmall.model.HomeViewPagerInfo;
import com.example.host.jsnewmall.utils.BitmapCache;

import java.util.List;

/**
 * Created by host on 2017/2/21.
 */

public class ShipViewPagerAdapter extends PagerAdapter {
    private List<HomeViewPagerInfo> bannerInfoList;
    private Context mContext;
    private ImageLoader imageLoader;
    private RequestQueue queue;
    public ShipViewPagerAdapter(Context context,RequestQueue queue,List<HomeViewPagerInfo> bannerInfoList) {
        super();
        this.mContext = context;
        this.queue=queue;
        this.bannerInfoList=bannerInfoList;
        imageLoader = new ImageLoader(queue, new BitmapCache());


    }

    @Override
    public int getCount() {
        return Integer.MAX_VALUE;
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
        final HomeViewPagerInfo bannerInfo = bannerInfoList.get(position
                % bannerInfoList.size());
        NetworkImageView imageView = new NetworkImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageUrl(bannerInfo.getLinkurl(), imageLoader);


        container.addView(imageView);

        return imageView;
    }
}
