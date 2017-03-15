package com.example.host.jsnewmall.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.example.host.jsnewmall.model.HomeMainEntry;
import com.example.host.jsnewmall.model.HomeViewPagerInfo;
import com.example.host.jsnewmall.utils.BitmapCache;

import java.util.List;

/**
 * Created by host on 2017/2/15.
 */

public class HomeViewPagerAdpter extends PagerAdapter {


    private HomeMainEntry mBodyInfo;
    private Context mContext;
    private ImageLoader imageLoader;
    private RequestQueue queue;
    public HomeViewPagerAdpter(Context context, RequestQueue queue, HomeMainEntry bodyinfo) {
        super();
        this.mContext = context;
        this.queue=queue;
        this.mBodyInfo=bodyinfo;
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
        final HomeMainEntry.ListBean.BannerBean bannerInfo = mBodyInfo.getList().getBanner().get(position
                % mBodyInfo.getList().getBanner().size());
        NetworkImageView imageView = new NetworkImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageUrl(bannerInfo.getImg(), imageLoader);

//        imageView.setImageDrawable(mContext.getResources().getDrawable(R.mipmap.testpicture));
        container.addView(imageView);

    return imageView;
    }
}
