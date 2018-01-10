package com.example.weianyang.myapplication;

import android.app.Application;
import android.content.Context;
import android.os.Parcelable;

/**
 * Created by weianyang on 18-1-6.
 */

public class MyApplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext(){
        return context;
    }

}

