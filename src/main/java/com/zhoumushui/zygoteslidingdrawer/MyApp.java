package com.zhoumushui.zygoteslidingdrawer;

import android.app.Application;
import android.content.Context;

import com.zhoumushui.zygoteslidingdrawer.util.MyUncaughtExceptionHandler;


public class MyApp extends Application {

    private Context context;

    @Override
    public void onCreate() {
        context = getApplicationContext();
        MyUncaughtExceptionHandler myUncaughtExceptionHandler = MyUncaughtExceptionHandler
                .getInstance();
        myUncaughtExceptionHandler.init(context);

        super.onCreate();
    }

}
