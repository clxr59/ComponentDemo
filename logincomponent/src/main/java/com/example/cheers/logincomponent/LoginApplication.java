package com.example.cheers.logincomponent;

import android.app.Application;

import com.example.cheers.componentlib.IApplicationComponent;
import com.example.cheers.componentlib.service.ServiceManager;

public class LoginApplication extends Application implements IApplicationComponent {
    private static Application mLoginApplication;

    public static Application getApplication() {
        return mLoginApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void initApplication(Application app) {
        mLoginApplication = app;
        ServiceManager.newInstance().setLoginService(new LoginServiceImpl());
    }
}
