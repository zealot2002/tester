package com.zzy.tester;

import android.app.Application;

/**
 * @author zzy
 * @date 2018/7/30
 */

public class MyApplication extends Application {
    public static MyApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}
