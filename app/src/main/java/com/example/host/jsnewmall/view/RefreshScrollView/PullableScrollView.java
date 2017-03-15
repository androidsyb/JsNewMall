package com.example.host.jsnewmall.view.RefreshScrollView;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;

/**
 * Created by host on 2017/3/3.
 */

public class PullableScrollView extends ScrollView implements Pullable {
    private ScrollViewListener scrollViewListener = null;

    public PullableScrollView(Context context) {
        super(context);
    }

    public PullableScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PullableScrollView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public boolean canPullDown() {
        if (getScrollY() == 0)
            return true;
        else
            return false;
    }

    @Override
    public boolean canPullUp() {
        if (getScrollY() >= (getChildAt(0).getHeight() - getMeasuredHeight()))
            return true;
        else
            return false;
    }

    @Override
    protected void onScrollChanged(int x, int y, int oldx, int oldy) {
        super.onScrollChanged(x, y, oldx, oldy);
        if (scrollViewListener != null) {
            //在这里将方法暴露出去
            scrollViewListener.onScrollChanged(this, x, y, oldx, oldy);
        }
    }

    //接口
    public interface ScrollViewListener {
        void onScrollChanged(View scrollView, int x, int y, int oldx, int oldy);
    }


    public void setScrollViewListener(ScrollViewListener listener)
    {        scrollViewListener=listener;

    }




}
