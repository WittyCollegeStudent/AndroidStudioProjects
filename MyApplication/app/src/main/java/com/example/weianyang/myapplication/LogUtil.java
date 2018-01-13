package com.example.weianyang.myapplication;

import android.util.Log;

/**
 * Created by weianyang on 18-1-10.
 */

public class LogUtil {

    public static final int VERBOSE = 1;

    public static final int DEBUG = 2;

    public static final int INFO = 3;

    public static final int WARN = 4;

    public static final int ERROR = 5;

    public static final int ASSERT = 6;

    public static final int NOTHING = 7;

    public static int level = VERBOSE; // 大于level的日志都能被打印

    public static void v(String tag,String msg){
        if(level <= VERBOSE)
            Log.v(tag,msg);
    }

    public static void d(String tag,String msg){
        if(level <= DEBUG)
            Log.d(tag,msg);
    }

    public static void i(String tag,String msg){
        if(level <= INFO)
            Log.i(tag,msg);
    }

    public static void w(String tag,String msg){
        if(level <= WARN)
            Log.w(tag,msg);
    }

    public static void e(String tag,String msg){
        if(level <= ERROR)
            Log.e(tag,msg);
    }

    public static void a(String tag,String msg){
        if(level <= ASSERT)
            Log.d(tag,msg);
    }

}
