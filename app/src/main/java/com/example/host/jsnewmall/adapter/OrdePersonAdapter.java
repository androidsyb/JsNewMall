package com.example.host.jsnewmall.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.host.jsnewmall.R;
import com.example.host.jsnewmall.model.CalendarEntry;

import java.util.List;

/**
 * Created by host on 2017/3/10.
 */

public class OrdePersonAdapter  extends BaseAdapter{
    private Context mContext;
    private List<CalendarEntry.DataBean.DescBean> mDecList;

    public OrdePersonAdapter(Context context, List<CalendarEntry.DataBean.DescBean> decList){
        this.mContext=context;
        this.mDecList=decList;
    }
    @Override
    public int getCount() {
        return mDecList.size();
    }

    @Override
    public Object getItem(int position) {
        return mDecList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        Holder holder;
        if (convertView == null) {
            holder = new Holder();
            convertView= LayoutInflater.from(mContext).inflate(R.layout.item_write_order_person_view,null);
            holder.mTvNum=(TextView)convertView.findViewById(R.id.tv_item_write_num);//人数
            holder.mTvNumname=(TextView)convertView.findViewById(R.id.tv_item_write_num_name);//人数名字

            int arr=mDecList.get(position).getSelectnum();

            if (arr==0){
                holder.mTvNum.setText("");
                holder.mTvNumname.setText("");
            }else {

                holder.mTvNum.setText(mDecList.get(position).getSelectnum() + "");
                holder.mTvNumname.setText(mDecList.get(position).getPricetypename());

            }
            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }
        return convertView;
    }

    class Holder {
        TextView mTvNum;
        TextView mTvNumname;


    }
}
