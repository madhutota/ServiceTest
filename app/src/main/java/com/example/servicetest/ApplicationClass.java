package com.example.servicetest;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Configuration;
import android.widget.Toast;

public class ApplicationClass extends Application implements Foreground.Listener {
    private int numStarted;
    private boolean isForeground;


    @Override
    public void onCreate() {
        super.onCreate();
        Foreground.iniT(this).addListener(this);


    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        Toast.makeText(this, "Configuration Changed", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    @Override
    public ComponentName startForegroundService(Intent service) {
        return super.startForegroundService(service);
    }

    public ApplicationClass() {
        super();
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }

    @Override
    public void registerComponentCallbacks(ComponentCallbacks callback) {
        super.registerComponentCallbacks(callback);
    }

    @Override
    public void unregisterComponentCallbacks(ComponentCallbacks callback) {
        super.unregisterComponentCallbacks(callback);
    }

    @Override
    public void registerActivityLifecycleCallbacks(ActivityLifecycleCallbacks callback) {
        super.registerActivityLifecycleCallbacks(callback);
    }

    @Override
    public void unregisterActivityLifecycleCallbacks(ActivityLifecycleCallbacks callback) {
        super.unregisterActivityLifecycleCallbacks(callback);
    }

    @Override
    public void registerOnProvideAssistDataListener(OnProvideAssistDataListener callback) {
        super.registerOnProvideAssistDataListener(callback);
    }

    @Override
    public void unregisterOnProvideAssistDataListener(OnProvideAssistDataListener callback) {
        super.unregisterOnProvideAssistDataListener(callback);
    }

    @Override
    public void onBecameForeground() {
        Toast.makeText(this, "App is Foreground", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onBecameBackground() {
        Toast.makeText(this, "App is Background", Toast.LENGTH_SHORT).show();

    }
}
