package com.example.riki.category;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by riki on 14/10/2015.
 */
public class DrawAdapter extends BaseAdapter{
    Context mContext;
    List<AppInfor> appInfors;
    public DrawAdapter(Context c, List<AppInfor> appinfor){
        mContext = c;
        appInfors = appinfor;
    }

    @Override
    public int getCount() {
        return appInfors.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class ViewHolder{
        TextView text;
        ImageView icon;
    }
    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        LayoutInflater li = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(convertView==null){
            convertView = li.inflate(R.layout.drawable,null);
            viewHolder = new ViewHolder();
            viewHolder.text = (TextView)convertView.findViewById(R.id.icon_text);
            viewHolder.icon = (ImageView)convertView.findViewById(R.id.icon_image);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder)convertView.getTag();
        }
        viewHolder.text.setText(appInfors.get(pos).getAppName());
        viewHolder.icon.setImageDrawable(appInfors.get(pos).getIcon());

        return convertView;
    }
}
