package com.example.cheers.mycomponentdemo;

import android.app.Application;
import android.util.Log;

import com.example.cheers.componentlib.AppConfig;
import com.example.cheers.componentlib.IApplicationComponent;

public class MainApplication extends Application implements IApplicationComponent {
    private static final String TAG = MainApplication.class.getSimpleName();
    private static MainApplication application;

    @Override
    public void onCreate() {
        super.onCreate();
        initApplication(this);
    }

    public static MainApplication getApplication() {
        return application;
    }

    @Override
    public void initApplication(Application app) {
        application = (MainApplication)app;
        for (String strName : AppConfig.applications){
            try {
                Log.i(TAG, "initApplication: ---- " + strName);
                Class<?> clazz = Class.forName(strName);
                Object instance = clazz.newInstance();
                ((IApplicationComponent)instance).initApplication(this);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }
}
