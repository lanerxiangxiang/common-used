package com.xingxiang.commonused.base;

import android.app.Application;
import android.content.Context;

/**
 * Description : （类描述，描述当前类具体作用和功能）
 * Created by 宋盼想 on 2020/1/21.
 */
public class BaseApplication extends Application {
    private static Context mContext;
    private static BaseApplication mApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        mApplication = this;
    }


    public static Context getContext() {
        return mContext;
    }

    public static BaseApplication getBaseApplication() {
        return mApplication;

    }


}
