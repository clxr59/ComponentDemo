package com.example.cheers.componentlib.service.empty_ipml;

import android.util.Log;

import com.example.cheers.componentlib.service.ILoginService;

public class EmptyLoginServiceImpl implements ILoginService {
    @Override
    public void startActivity() {
        Log.i("EmptyLoginServiceImpl", "startActivity: 空对象");
    }

    @Override
    public void startActivity(String info) {
        Log.i("EmptyLoginServiceImpl", "startActivity: 空对象");
    }
}
