package com.example.riki.category;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

/**
 * Created by riki on 13/10/2015.
 */
public class AppInfor implements Serializable {
        protected String appName = "";
        protected String packageName = "";
        protected String className = "";
        protected String versionName = "";
        protected Integer versionCode = 0;
        protected Drawable icon = null;

        public String getAppName(){
            return appName;
        }

        public String getPackageName(){
            return packageName;
        }

        public String getClassName(){
            return className;
        }

        public String getVersionName(){
            return versionName;
        }

        public Integer getVersionCode(){
            return versionCode;
        }

        public Drawable getIcon(){
            return icon;
        }

}
