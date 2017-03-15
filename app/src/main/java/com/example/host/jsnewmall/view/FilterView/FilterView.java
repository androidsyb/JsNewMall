package com.example.host.jsnewmall.view.FilterView;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.host.jsnewmall.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by host on 2017/2/27.
 */

public class FilterView extends LinearLayout {

    private Context mContext;
    private Activity mActivity;



    public FilterView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public FilterView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        this.mContext = context;
        View view = LayoutInflater.from(context).inflate(R.layout.view_filter_layout, this);


    }




}
