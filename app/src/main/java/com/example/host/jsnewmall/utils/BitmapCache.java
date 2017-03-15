package com.example.host.jsnewmall.utils;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;

import com.android.volley.toolbox.ImageLoader;

/**
 * Created by host on 2017/2/15.
 */

public class BitmapCache implements ImageLoader.ImageCache{
    private LruCache<String, Bitmap> mCache;

    public BitmapCache() {
        int maxSize = 1 * 1024 * 1024;
        mCache = new LruCache<String, Bitmap>(maxSize) {
            @Override
            protected int sizeOf(String key, Bitmap value) {
                return value.getRowBytes() * value.getHeight();
            }
        };
    }

    @Override
    public Bitmap getBitmap(String url) {
        return mCache.get(url);
    }

    @Override
    public void putBitmap(String url, Bitmap bitmap) {
        if (getBitmap(url) == null) {
            mCache.put(url, bitmap);
        }
    }
}
