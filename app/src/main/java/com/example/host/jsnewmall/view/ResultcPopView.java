package com.example.host.jsnewmall.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupWindow;

import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.adapter.ResultcPopAdapter;
import com.example.host.jsnewmall.model.ResultcInfo;

import java.util.List;

/**
 * Created by host on 2017/2/23.
 */

public class ResultcPopView extends PopupWindow {

    private Context mContext;
    private List<ResultcInfo> mData;
    private View contentView;
    private ListView mListSearchb;
    private ResultcPopAdapter mAdapter;



    public interface CallBackUi{
        void onRequestUi(String resulta);
    }
    public ResultcPopView(final Activity context, final List<ResultcInfo> data, final CallBackUi callBackUi) {
        this.mContext=context;
        this.mData=data;
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        contentView = inflater.inflate(R.layout.popwindow_result_a, null);
        mListSearchb=(ListView) contentView.findViewById(R.id.searchresult_list_a);//第一个筛选列表
        mAdapter=new ResultcPopAdapter(mContext,mData);
        mListSearchb.setAdapter(mAdapter);
        mListSearchb.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                data.get(position).setChecked(!data.get(position).isChecked());
                for (int i = 0; i < data.size(); i++) {
                    if (i == position) {
                        continue;
                    }
                    data.get(i).setChecked(false);
                }

                callBackUi.onRequestUi(mData.get(position).getLinkurl());

                popdismiss();

            }
        });


        int h = 400;
        int w = context.getWindowManager().getDefaultDisplay().getWidth();
        this.setContentView(contentView);
        this.setWidth(w);
        this.setHeight(h);
        ColorDrawable dw = new ColorDrawable(00000000);
        this.setBackgroundDrawable(dw);
        this.setFocusable(true);
        this.setOutsideTouchable(true);
        this.update();

    }

    public void showResultaPopup(View parent, final List<ResultcInfo> data) {
//        if (!this.isShowing()) {
//            this.showAsDropDown(parent);
//            mAdapter.notifyDataSetChanged();
//        } else {
//            this.dismiss();
//        }
    }

    private void popdismiss(){
        this.dismiss();
    }


    public void showpop(View parent){
        this.showAsDropDown(parent);
//        this.showAtLocation(parent, Gravity.LEFT,0,0);
    }
}
