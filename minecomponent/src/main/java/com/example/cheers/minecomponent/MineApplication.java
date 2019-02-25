package com.example.cheers.minecomponent;

import android.app.Application;

import com.example.cheers.componentlib.IApplicationComponent;
import com.example.cheers.componentlib.service.ServiceManager;

public class MineApplication extends Application implements IApplicationComponent {
   private static Application mMineApplication;

    @Override
    public void initApplication(Application app) {
        mMineApplication = app;
        ServiceManager.newInstance().setMineService(new MineServiceImpl());
    }

    public static Application getApplication() {
        return mMineApplication;
    }
}
