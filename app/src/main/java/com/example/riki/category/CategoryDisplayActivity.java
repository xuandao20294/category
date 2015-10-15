package com.example.riki.category;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class CategoryDisplayActivity extends AppCompatActivity {
    DrawAdapter drawAdapterObject;
    GridView drawerGrid;
    private ArrayList<AppInfor> appList = new ArrayList<AppInfor>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_display);
        drawerGrid = (GridView)findViewById(R.id.listView);

        Intent intent = getIntent();
        String message = intent.getStringExtra("category");
        switch (message){
            case "system":
                setTitle("System Category");
                break;
            case "tools":
                setTitle("Tools Category");
                break;
            case "media":
                setTitle("Media Category");
                break;
            case "education":
                setTitle("Education Category");
                break;
            case "game":
                setTitle("Game Category");
                break;
            case "other":
                setTitle("Other Category");
                break;
            case "social":
                setTitle("Social Category");
                break;
            default:
                setTitle("Category");
                break;
        }
        List<PackageInfo> packs = getPackageManager().getInstalledPackages(0);
        for(int i=0;i<packs.size();i++){
            PackageInfo packageInfo = packs.get(i);
            if(message.equals("system")){
                ArrayList<String> systemString = intent.getStringArrayListExtra("systemList");
                for(int j=0;j<systemString.size();j++){
                    if(packageInfo.packageName.equals(systemString.get(j))){

                        AppInfor newInfo = new AppInfor();
                        newInfo.packageName = packageInfo.packageName;
                        newInfo.appName = packageInfo.applicationInfo.loadLabel(
                                getPackageManager()).toString();
                        newInfo.versionName = packageInfo.versionName;
                        newInfo.versionCode = packageInfo.versionCode;
                        newInfo.icon = packageInfo.applicationInfo.loadIcon(
                                getPackageManager());
                        Log.d("app ten la : ",newInfo.packageName);
                        appList.add(newInfo);
                    }
                }
            }else if(message.equals("tools")){
                ArrayList<String> toolsStrings = intent.getStringArrayListExtra("toolsList");
                for(int j=0;j<toolsStrings.size();j++){
                    if(packageInfo.packageName.equals(toolsStrings.get(j))){
                        AppInfor newInfo = new AppInfor();
                        newInfo.packageName = packageInfo.packageName;
                        newInfo.appName = packageInfo.applicationInfo.loadLabel(
                                getPackageManager()).toString();
                        newInfo.versionName = packageInfo.versionName;
                        newInfo.versionCode = packageInfo.versionCode;
                        newInfo.icon = packageInfo.applicationInfo.loadIcon(
                                getPackageManager());
                        Log.d("app ten la : ",newInfo.packageName);
                        appList.add(newInfo);
                    }
                }
            }else if(message.equals("media")){
                ArrayList<String> mediaStrings = intent.getStringArrayListExtra("mediaList");
                for(int j=0;j<mediaStrings.size();j++){
                    if(packageInfo.packageName.equals(mediaStrings.get(j))){
                        AppInfor newInfo = new AppInfor();
                        newInfo.packageName = packageInfo.packageName;
                        newInfo.appName = packageInfo.applicationInfo.loadLabel(
                                getPackageManager()).toString();
                        newInfo.versionName = packageInfo.versionName;
                        newInfo.versionCode = packageInfo.versionCode;
                        newInfo.icon = packageInfo.applicationInfo.loadIcon(
                                getPackageManager());
                        Log.d("app ten la : ",newInfo.packageName);
                        appList.add(newInfo);
                    }
                }
            }else if(message.equals("education")){
                ArrayList<String> educationStrings = intent.getStringArrayListExtra("educationList");
                for(int j=0;j<educationStrings.size();j++){
                    if(packageInfo.packageName.equals(educationStrings.get(j))){
                        AppInfor newInfo = new AppInfor();
                        newInfo.packageName = packageInfo.packageName;
                        newInfo.appName = packageInfo.applicationInfo.loadLabel(
                                getPackageManager()).toString();
                        newInfo.versionName = packageInfo.versionName;
                        newInfo.versionCode = packageInfo.versionCode;
                        newInfo.icon = packageInfo.applicationInfo.loadIcon(
                                getPackageManager());
                        Log.d("app ten la : ",newInfo.packageName);
                        appList.add(newInfo);
                    }
                }
            }else if(message.equals("social")){
                ArrayList<String> socialStrings = intent.getStringArrayListExtra("socialList");
                for(int j=0;j<socialStrings.size();j++){
                    if(packageInfo.packageName.equals(socialStrings.get(j))){
                        AppInfor newInfo = new AppInfor();
                        newInfo.packageName = packageInfo.packageName;
                        newInfo.appName = packageInfo.applicationInfo.loadLabel(
                                getPackageManager()).toString();
                        newInfo.versionName = packageInfo.versionName;
                        newInfo.versionCode = packageInfo.versionCode;
                        newInfo.icon = packageInfo.applicationInfo.loadIcon(
                                getPackageManager());
                        Log.d("app ten la : ",newInfo.packageName);
                        appList.add(newInfo);
                    }
                }
            }else if(message.equals("game")){
                ArrayList<String> gameStrings = intent.getStringArrayListExtra("gameList");
                for(int j=0;j<gameStrings.size();j++){
                    if(packageInfo.packageName.equals(gameStrings.get(j))){
                        AppInfor newInfo = new AppInfor();
                        newInfo.packageName = packageInfo.packageName;
                        newInfo.appName = packageInfo.applicationInfo.loadLabel(
                                getPackageManager()).toString();
                        newInfo.versionName = packageInfo.versionName;
                        newInfo.versionCode = packageInfo.versionCode;
                        newInfo.icon = packageInfo.applicationInfo.loadIcon(
                                getPackageManager());
                        Log.d("app ten la : ",newInfo.packageName);
                        appList.add(newInfo);
                    }
                }
            }else if(message.equals("other")){
                ArrayList<String> otherStrings = intent.getStringArrayListExtra("otherList");
                for(int j=0;j<otherStrings.size();j++){
                    if(packageInfo.packageName.equals(otherStrings.get(j))){
                        AppInfor newInfo = new AppInfor();
                        newInfo.packageName = packageInfo.packageName;
                        newInfo.appName = packageInfo.applicationInfo.loadLabel(
                                getPackageManager()).toString();
                        newInfo.versionName = packageInfo.versionName;
                        newInfo.versionCode = packageInfo.versionCode;
                        newInfo.icon = packageInfo.applicationInfo.loadIcon(
                                getPackageManager());
                        Log.d("app ten la : ",newInfo.packageName);
                        appList.add(newInfo);
                    }
                }
            }
        }
        PackageManager pm = getPackageManager();
        drawAdapterObject = new DrawAdapter(this,appList);
        Log.d("Count = "," "+drawAdapterObject.getCount());
        drawerGrid.setAdapter(drawAdapterObject);
        drawerGrid.setOnItemClickListener(new DrawerClickListener(this, appList, pm));

    }

}
