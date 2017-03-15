package com.example.host.jsnewmall.adapter;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;

import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.bean.SelectPriceNum;
import com.example.host.jsnewmall.model.CalendarEntry;

import java.util.List;

/**
 * Created by host on 2017/3/9.
 */

public class SelectDateMoneyAdapter extends BaseAdapter {
    private Context mContext;
    private List<CalendarEntry.DataBean.DescBean> mBodyInfoList;
    private SelectPriceNum mSelectNum;

    public SelectDateMoneyAdapter(Context context, List<CalendarEntry.DataBean.DescBean> bodyinfolist, SelectPriceNum selectnum){
        this.mContext=context;
        this.mBodyInfoList=bodyinfolist;
        this.mSelectNum=selectnum;
    }
    @Override
    public int getCount() {
        return mBodyInfoList.size();
    }

    @Override
    public Object getItem(int position) {
        return mBodyInfoList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        final int[] amount = {0};
        convertView= LayoutInflater.from(mContext).inflate(R.layout.item_select_date_money_view,null);
        final TextView[] mTvPersonName = {(TextView) convertView.findViewById(R.id.tv_select_person)};//支付人名
        TextView mTvPrice =(TextView) convertView.findViewById(R.id.tv_select_price);//金额显示

        mTvPersonName[0].setText(mBodyInfoList.get(position).getPricetypename());//设置名字
        mTvPrice.setText("￥"+mBodyInfoList.get(position).getSaleprice()+"/人");//设置价格

        TextView mBtnJian=(TextView)convertView.findViewById(R.id.btn_select_jian);//价格 减 点击
        TextView mBtnJia =(TextView)convertView.findViewById(R.id.btn_select_jia);//价格 加 点击
        final EditText mEtPrice=(EditText)convertView.findViewById(R.id.et_date_money);//价格编辑 变化



        mBtnJia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int amountnum = mBodyInfoList.get(position).getSelectnum();
                amountnum++;
                mEtPrice.setText(amountnum+"");

                mBodyInfoList.get(position).setSelectnum(amountnum);
                mSelectNum.onChangePriceListener();
            }
        });

        mBtnJian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int amountnum = mBodyInfoList.get(position).getSelectnum();
                    int j=Integer.parseInt(mEtPrice.getText().toString());
                if (j<=0){
                    mEtPrice.setText(0 +"");
                }else {
                    amountnum--;
                    mEtPrice.setText(amountnum +"");
                    mBodyInfoList.get(position).setSelectnum(amountnum);
                    mSelectNum.onChangePriceListener();

                }

            }
        });

        //编辑框监听
//        mEtPrice.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//            @Override
//            public void onFocusChange(View view, boolean b) {
//                if((mEtPrice.getText().toString()).equals("")){
//                    mEtPrice.setText("0");
//
//                }else{
//                    if (!b){
//                        int amountnum=Integer.parseInt(mEtPrice.getText().toString());
//                        mBodyInfoList.get(position).setSelectnum(amountnum);
//                        mSelectNum.onChangePriceListener();
//                    }
//                }
//
//            }
//        });

        mEtPrice.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {


            }

            @Override
            public void afterTextChanged(Editable editable) {
                int amountnum;
                if ((mEtPrice.getText().toString()).equals("")){
                     amountnum=0;
                }else {

                    amountnum = Integer.parseInt(mEtPrice.getText().toString());
                }
                mBodyInfoList.get(position).setSelectnum(amountnum);
                mSelectNum.onChangePriceListener();
            }
        });



        return convertView;
    }

}
