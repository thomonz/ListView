package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 郝俊谦 on 2016/5/14.
 */
public class MyAdapter extends BaseAdapter {

    private List<ItemBean> list;
    private LayoutInflater layoutInflater;

    public MyAdapter(Context context, List<ItemBean> list) {
        this.list = list;
        layoutInflater = LayoutInflater.from(context);
        //Context要使用当前Adapter的界面对象，layoutInflater是布局装载器对象
    }

    //适配器中数据集中数据的个数
    //返回ListView需要显示的数据量
    @Override
    public int getCount() {
        return list.size();
    }

    //获取数据集中与指定索引对应的数据项
    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    //获取指定行对应的id
    @Override
    public long getItemId(int position) {
        return position;
    }

    //获取每一个Item的显示内容,返回每一个数据项显示的内容
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //没有利用缓存机制
//        View view = layoutInflater.inflate(R.layout.item, null);
//        ImageView imageView = (ImageView) view.findViewById(R.id.iv_image);
//        TextView title = (TextView) view.findViewById(R.id.tv_title);
//        TextView content = (TextView) view.findViewById(R.id.tv_content);
//
//        ItemBean itemBean = list.get(position);
//        imageView.setImageResource(itemBean.ItemInageResid);
//        title.setText(itemBean.Itemtitle);
//        content.setText(itemBean.ItemContent);
//        return view;

        //文艺式

        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = layoutInflater.inflate(R.layout.item, null);
            viewHolder.imageView = (ImageView) convertView.findViewById(R.id.iv_image);
            viewHolder.title = (TextView) convertView.findViewById(R.id.tv_title);
            viewHolder.content = (TextView) convertView.findViewById(R.id.tv_content);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        ItemBean bean = list.get(position);
        viewHolder.imageView.setImageResource(bean.ItemInageResid);
        viewHolder.title.setText(bean.ItemContent);
        viewHolder.content.setText(bean.ItemContent);
        return convertView;
    }

    class ViewHolder {
        public ImageView imageView;
        public TextView title;
        public TextView content;
    }


}
