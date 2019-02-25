package com.example.cheers.logincomponent;

import android.content.Intent;

import com.example.cheers.componentlib.service.ILoginService;

public class LoginServiceImpl implements ILoginService {
    @Override
    public void startActivity() {
        Intent intent = new Intent(LoginApplication.getApplication(), LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        LoginApplication.getApplication().startActivity(intent);
    }

    @Override
    public void startActivity(String info) {
        Intent intent = new Intent(LoginApplication.getApplication(), LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra(LoginActivity.INFO, info);
        LoginApplication.getApplication().startActivity(intent);
    }
}

