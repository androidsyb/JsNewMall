package com.example.host.jsnewmall.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.host.jsnewmall.R;

/**
 * Created by host on 2017/2/15.
 */

public class CustomerFragment extends BaseFragment {
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){

     view = inflater.inflate(R.layout.fragment_customer_main_content, null);
    return view;
}

}
