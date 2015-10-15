package com.example.riki.category;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ArrayList<AppInfor> systemList = new ArrayList<AppInfor>();
    private ArrayList<AppInfor> toolsList = new ArrayList<AppInfor>();
    private ArrayList<AppInfor> mediaList = new ArrayList<AppInfor>();
    private ArrayList<AppInfor> educationList = new ArrayList<AppInfor>();
    private ArrayList<AppInfor> gameList = new ArrayList<AppInfor>();
    private ArrayList<AppInfor> socialList = new ArrayList<AppInfor>();
    private ArrayList<AppInfor> otherList = new ArrayList<AppInfor>();
    String systemString ="gallery3d,phone,backupconfirm,filemanager,soundrecorder,smartshare,backup," +
            "superuser,smspush,contacts,launcher,bluetooth,shell,wallpaper,packageinstaller";
    String toolsString = "laban,boot,docs,smspush,calculator2,calendar,browser," +
            "deskclock,dreams,videoeditor,galaxy4,htmlviewer,documentsui";
    String mediaString ="camera,mp3,play,mp4,kpm,player,music,musicvis,musicfx";
    String educationString ="development,dict,quizlet,jlpt,learn,test";
    String gameString ="magicsmoke,pico,clash,clan,tank,tom,temple,stickman,zombie,candy,zingplay";
    String socialString ="email,messenger,facebook,omronsoft,instargram,viber,zalo,line,riki";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView systemItem1 = (ImageView)findViewById(R.id.systemItem1);
        ImageView systemItem2 = (ImageView)findViewById(R.id.systemItem2);
        ImageView systemItem3 = (ImageView)findViewById(R.id.systemItem3);
        ImageView systemItem4 = (ImageView)findViewById(R.id.systemItem4);
        ImageView toolsItem1 = (ImageView)findViewById(R.id.toolsItem1);
        ImageView toolsItem2 = (ImageView)findViewById(R.id.toolsItem2);
        ImageView toolsItem3 = (ImageView)findViewById(R.id.toolsItem3);
        ImageView toolsItem4 = (ImageView)findViewById(R.id.toolsItem4);
        ImageView mediaItem1 = (ImageView)findViewById(R.id.mediaItem1);
        ImageView mediaItem2 = (ImageView)findViewById(R.id.mediaItem2);
        ImageView mediaItem3 = (ImageView)findViewById(R.id.mediaItem3);
        ImageView mediaItem4 = (ImageView)findViewById(R.id.mediaItem4);
        ImageView educationItem1 = (ImageView)findViewById(R.id.educationItem1);
        ImageView educationItem2 = (ImageView)findViewById(R.id.educationItem2);
        ImageView educationItem3 = (ImageView)findViewById(R.id.educationItem3);
        ImageView educationItem4 = (ImageView)findViewById(R.id.educationItem4);
        ImageView socialItem1 = (ImageView)findViewById(R.id.socialItem1);
        ImageView socialItem2 = (ImageView)findViewById(R.id.socialItem2);
        ImageView socialItem3 = (ImageView)findViewById(R.id.socialItem3);
        ImageView socialItem4 = (ImageView)findViewById(R.id.socialItem4);
        ImageView gameItem1 = (ImageView)findViewById(R.id.gameItem1);
        ImageView gameItem2 = (ImageView)findViewById(R.id.gameItem2);
        ImageView gameItem3 = (ImageView)findViewById(R.id.gameItem3);
        ImageView gameItem4 = (ImageView)findViewById(R.id.gameItem4);
        ImageView otherItem1 = (ImageView)findViewById(R.id.otherItem1);
        ImageView otherItem2 = (ImageView)findViewById(R.id.otherItem2);
        ImageView otherItem3 = (ImageView)findViewById(R.id.otherItem3);
        ImageView otherItem4 = (ImageView)findViewById(R.id.otherItem4);
        String tag = "Myapps : ";
        List<PackageInfo> packs = getPackageManager().getInstalledPackages(0);
        for(int i=0;i<packs.size();i++){
            PackageInfo packInfo = packs.get(i);

            AppInfor newInfo = new AppInfor();
            newInfo.packageName = packInfo.packageName;
            if(newInfo.packageName.contains("keyguard")){
                continue;
            }
            String[]tolkens =packInfo.packageName.split("[.]");
            try{

                Log.v(tag," " + packInfo.packageName);
            }catch(ArrayIndexOutOfBoundsException e){
                continue;
            }
            newInfo.appName = packInfo.applicationInfo.loadLabel(
                    getPackageManager()).toString();
            newInfo.versionName = packInfo.versionName;
            newInfo.versionCode = packInfo.versionCode;
            newInfo.icon = packInfo.applicationInfo.loadIcon(
                    getPackageManager());

            try{
                Log.v(tag+"name : ", tolkens[2]);
                if(systemString.contains(tolkens[2])){
                    systemList.add(newInfo);
                }
                else if(toolsString.contains(tolkens[2])){
                    toolsList.add(newInfo);
                }
                else if(mediaString.contains(tolkens[2])){
                    mediaList.add(newInfo);
                }
                else if(educationString.contains(tolkens[2])){
                    educationList.add(newInfo);
                }
                else if(socialString.contains(tolkens[2])){
                    socialList.add(newInfo);
                }
                else if(gameString.contains(tolkens[2])){
                    gameList.add(newInfo);
                }
                else{
                    otherList.add(newInfo);
                }
            }catch (ArrayIndexOutOfBoundsException e){
                continue;
            }
        }
        for(int i=0;i<systemList.size();i++){
            try{
                Log.d("SystemApp", systemList.get(i).getAppName());
                String pkg = systemList.get(i).getPackageName();//your package name
                Drawable icon = getPackageManager().getApplicationIcon(pkg);
                if(i>3){
                    break;
                }
                if(i==0){
                    systemItem1.setImageDrawable(icon);
                }else if(i==1){
                    systemItem2.setImageDrawable(icon);
                }else if(i==2){
                    systemItem3.setImageDrawable(icon);
                }else if(i==3){
                    systemItem4.setImageDrawable(icon);
                }
            }
            catch (PackageManager.NameNotFoundException ne)
            {
                continue;
            }
        }
        for(int i=0;i<toolsList.size();i++){
            try{
                Log.d("ToolsApp",toolsList.get(i).getAppName());
                String pkg = toolsList.get(i).getPackageName();//your package name
                Drawable icon = getPackageManager().getApplicationIcon(pkg);
                if(i>3){
                    break;
                }
                if(i==0){
                    toolsItem1.setImageDrawable(icon);
                }else if(i==1){
                    toolsItem2.setImageDrawable(icon);
                }else if(i==2){
                    toolsItem3.setImageDrawable(icon);
                }else if(i==3){
                    toolsItem4.setImageDrawable(icon);
                }
            }
            catch (PackageManager.NameNotFoundException ne)
            {
                continue;
            }
        }
        for(int i=0;i<mediaList.size();i++){
            try{
                Log.d("Media",mediaList.get(i).getAppName());
                String pkg = mediaList.get(i).getPackageName();//your package name
                Drawable icon = getPackageManager().getApplicationIcon(pkg);
                if(i>3){
                    break;
                }
                if(i==0){
                    mediaItem1.setImageDrawable(icon);
                }else if(i==1){
                    mediaItem2.setImageDrawable(icon);
                }else if(i==2){
                    mediaItem3.setImageDrawable(icon);
                }else if(i==3){
                    mediaItem4.setImageDrawable(icon);
                }
            }
            catch (PackageManager.NameNotFoundException ne)
            {
                continue;
            }
        }
        for(int i=0;i<educationList.size();i++){
            try{
                Log.d("Media",educationList.get(i).getAppName());
                String pkg = educationList.get(i).getPackageName();//your package name
                Drawable icon = getPackageManager().getApplicationIcon(pkg);
                if(i>3){
                    break;
                }
                if(i==0){
                    educationItem1.setImageDrawable(icon);
                }else if(i==1){
                    educationItem2.setImageDrawable(icon);
                }else if(i==2){
                    educationItem3.setImageDrawable(icon);
                }else if(i==3){
                    educationItem4.setImageDrawable(icon);
                }
            }
            catch (PackageManager.NameNotFoundException ne)
            {
                continue;
            }
        }
        for(int i=0;i<socialList.size();i++){
            try{
                Log.d("Media",socialList.get(i).getAppName());
                String pkg = socialList.get(i).getPackageName();//your package name
                Drawable icon = getPackageManager().getApplicationIcon(pkg);
                if(i>3){
                    break;
                }
                if(i==0){
                    socialItem1.setImageDrawable(icon);
                }else if(i==1){
                    socialItem2.setImageDrawable(icon);
                }else if(i==2){
                    socialItem3.setImageDrawable(icon);
                }else if(i==3){
                    socialItem4.setImageDrawable(icon);
                }
            }
            catch (PackageManager.NameNotFoundException ne)
            {
                continue;
            }
        }
        for(int i=0;i<gameList.size();i++){
            try{
                Log.d("Media",gameList.get(i).getAppName());
                String pkg = gameList.get(i).getPackageName();//your package name
                Drawable icon = getPackageManager().getApplicationIcon(pkg);
                if(i>3){
                    break;
                }
                if(i==0){
                    gameItem1.setImageDrawable(icon);
                }else if(i==1){
                    gameItem2.setImageDrawable(icon);
                }else if(i==2){
                    gameItem3.setImageDrawable(icon);
                }else if(i==3){
                    gameItem4.setImageDrawable(icon);
                }
            }
            catch (PackageManager.NameNotFoundException ne)
            {
                continue;
            }
        }
        for(int i=0;i<otherList.size();i++){
            try{
                Log.d("Media", otherList.get(i).getAppName());
                String pkg = otherList.get(i).getPackageName();//your package name
                Drawable icon = getPackageManager().getApplicationIcon(pkg);
                if(i>3){
                    break;
                }
                if(i==0){
                    otherItem1.setImageDrawable(icon);
                }else if(i==1){
                    otherItem2.setImageDrawable(icon);
                }else if(i==2){
                    otherItem3.setImageDrawable(icon);
                }else if(i==3){
                    otherItem4.setImageDrawable(icon);
                }
            }
            catch (PackageManager.NameNotFoundException ne)
            {
                continue;
            }
        }


    }
    public void systemClicked(View view){
        Intent intent = new Intent(this, CategoryDisplayActivity.class);
        intent.putExtra("category", "system");
        ArrayList<String> systemListStrings = new ArrayList<String>();
        for(int i=0;i<systemList.size();i++){
            systemListStrings.add(systemList.get(i).getPackageName());
        }
        intent.putExtra("systemList",(ArrayList<String>)systemListStrings);
        startActivity(intent);
    }
    public void educationClicked(View view){
        Intent intent = new Intent(this, CategoryDisplayActivity.class);
        intent.putExtra("category", "education");
        ArrayList<String> educationStrings = new ArrayList<String>();
        for(int i=0;i<educationList.size();i++){
            educationStrings.add(educationList.get(i).getPackageName());
        }
        intent.putExtra("educationList",(ArrayList<String>)educationStrings);
        startActivity(intent);
    }
    public void toolsClicked(View view){
        Intent intent = new Intent(this, CategoryDisplayActivity.class);
        intent.putExtra("category", "tools");
        ArrayList<String> toolsStrings = new ArrayList<String>();
        for(int i=0;i<toolsList.size();i++){
            toolsStrings.add(toolsList.get(i).getPackageName());
        }
        intent.putExtra("toolsList",(ArrayList<String>)toolsStrings);
        startActivity(intent);
    }
    public void mediaClicked(View view){
        Intent intent = new Intent(this, CategoryDisplayActivity.class);
        intent.putExtra("category", "media");
        ArrayList<String> mediaStrings = new ArrayList<String>();
        for(int i=0;i<mediaList.size();i++){
            mediaStrings.add(mediaList.get(i).getPackageName());
        }
        intent.putExtra("mediaList",(ArrayList<String>)mediaStrings);
        startActivity(intent);
    }
    public void socialClicked(View view){
        Intent intent = new Intent(this, CategoryDisplayActivity.class);
        intent.putExtra("category", "social");
        ArrayList<String> socialStrings = new ArrayList<String>();
        for(int i=0;i<socialList.size();i++){
            socialStrings.add(socialList.get(i).getPackageName());
        }
        intent.putExtra("socialList",(ArrayList<String>)socialStrings);
        startActivity(intent);
    }
    public void gameClicked(View view){
        Intent intent = new Intent(this, CategoryDisplayActivity.class);
        intent.putExtra("category", "game");
        ArrayList<String> gameStrings = new ArrayList<String>();
        for(int i=0;i<gameList.size();i++){
            gameStrings.add(gameList.get(i).getPackageName());
        }
        intent.putExtra("gameList",(ArrayList<String>)gameStrings);
        startActivity(intent);
    }
    public void otherClicked(View view){
        Intent intent = new Intent(this, CategoryDisplayActivity.class);
        intent.putExtra("category", "other");
        ArrayList<String> otherStrings = new ArrayList<String>();
        for(int i=0;i<otherList.size();i++){
            otherStrings.add(otherList.get(i).getPackageName());
        }
        intent.putExtra("otherList",(ArrayList<String>)otherStrings);
        startActivity(intent);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();

        unbindDrawables(findViewById(R.id.rikiLayout));
        System.gc();
    }

    private void unbindDrawables(View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback(null);
        }
        if (view instanceof ViewGroup) {
            for (int i = 0; i < ((ViewGroup) view).getChildCount(); i++) {
                unbindDrawables(((ViewGroup) view).getChildAt(i));
            }
            ((ViewGroup) view).removeAllViews();
        }
    }
}



