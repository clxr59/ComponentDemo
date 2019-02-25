package com.example.cheers.componentlib.service.empty_ipml;

import android.util.Log;

import com.example.cheers.componentlib.service.IMineService;

public class EmptyMineServiceImpl implements IMineService {
    @Override
    public void startActivity() {
        Log.i("EmptyMineServiceImpl", "startActivity: 空对象");
    }

}
