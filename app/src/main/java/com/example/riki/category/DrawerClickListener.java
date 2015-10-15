package com.example.riki.category;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.view.View;
import android.widget.AdapterView;

import java.util.List;

/**
 * Created by riki on 15/10/2015.
 */
public class DrawerClickListener implements AdapterView.OnItemClickListener {
    Context mContext;
    List<AppInfor> appInforList;
    PackageManager pmForListener;
    public  DrawerClickListener(Context c, List<AppInfor> appInfors, PackageManager pm){
        mContext = c;
        appInforList = appInfors;
        pmForListener = pm;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {
        Intent launchIntent = pmForListener.getLaunchIntentForPackage(appInforList.get(pos).getPackageName());
        mContext.startActivity(launchIntent);
    }
}
