package com.example.cheers.minecomponent;

import android.content.Intent;

import com.example.cheers.componentlib.service.IMineService;

public class MineServiceImpl implements IMineService {
    @Override
    public void startActivity() {
        Intent intent = new Intent(MineApplication.getApplication(), MineActivity.class);
        MineApplication.getApplication().startActivity(intent);
    }
}
