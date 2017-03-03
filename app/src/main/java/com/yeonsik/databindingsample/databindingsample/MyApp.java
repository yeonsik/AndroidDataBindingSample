package com.yeonsik.databindingsample.databindingsample;

import android.app.Application;

/**
 * Created by yeonsik on 2017-03-03.
 */

public class MyApp extends Application {
    private static MyApp sInstance;

    public static MyApp get() {
        return sInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        sInstance = (MyApp) getApplicationContext();
    }
}
