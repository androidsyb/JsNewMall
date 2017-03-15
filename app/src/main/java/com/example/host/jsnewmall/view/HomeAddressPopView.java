package com.example.host.jsnewmall.view;

import android.app.ActionBar;
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

public class HomeAddressPopView extends PopupWindow {
    private Context mContext;
    private List<ResultcInfo> mData;
    private View contentView;
    private ListView mListSearchb;
    private ResultcPopAdapter mAdapter;



    public interface CallBackUi{
        void onRequestUi(String resulta);
    }
    public HomeAddressPopView(final Activity context, final List<ResultcInfo> data, final CallBackUi callBackUi) {
        this.mContext=context;
        this.mData=data;
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        contentView = inflater.inflate(R.layout.popwindow_result_b, null);
        mListSearchb=(ListView) contentView.findViewById(R.id.searchresult_list_b);//第一个筛选列表
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


        int h = context.getWindowManager().getDefaultDisplay().getWidth();
        int w = ActionBar.LayoutParams.MATCH_PARENT;
        this.setContentView(contentView);
        this.setWidth(140);
        this.setHeight(ActionBar.LayoutParams.WRAP_CONTENT);

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
        int[] location = new int[2];
        parent.getLocationOnScreen(location);
//        this.showAsDropDown(parent);
//        this.showAtLocation(parent, Gravity.NO_GRAVITY,0,0);
//        this.showAsDropDown(parent, parent.getLayoutParams().width / 2, 18);
//        this.showAsDropDown(parent, parent.getLayoutParams().width / 2, 0);
        this.showAtLocation(parent, Gravity.NO_GRAVITY, location[0]-this.getWidth(), location[1]+60);
    }
}
