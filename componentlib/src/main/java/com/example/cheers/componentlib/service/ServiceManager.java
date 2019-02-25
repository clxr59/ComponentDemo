package com.example.cheers.componentlib.service;

import android.os.Bundle;

import com.example.cheers.componentlib.service.empty_ipml.EmptyLoginServiceImpl;
import com.example.cheers.componentlib.service.empty_ipml.EmptyMineServiceImpl;

public class ServiceManager {
    private static ServiceManager manager = new ServiceManager();

    private ILoginService mLoginService;
    private IMineService mMineService;

    public static ServiceManager newInstance() {
        return manager;
    }

    public ILoginService getLoginService() {
        if (mLoginService == null){
            mLoginService = new EmptyLoginServiceImpl();
        }
        return mLoginService;
    }

    public void setLoginService(ILoginService mLoginService) {
        this.mLoginService = mLoginService;
    }

    public IMineService getMineService() {
        if (mMineService == null){
            mMineService = new EmptyMineServiceImpl();
        }
        return mMineService;
    }

    public void setMineService(IMineService mMineService) {
        this.mMineService = mMineService;
    }
}
