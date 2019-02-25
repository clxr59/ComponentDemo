package com.example.cheers.mycomponentdemo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.cheers.componentlib.service.ServiceManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
         findViewById(R.id.tv_login).setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 ServiceManager.newInstance().getLoginService().startActivity("From MainActivity");
             }
         });

         findViewById(R.id.tv_mine).setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 ServiceManager.newInstance().getMineService().startActivity();
             }
         });
    }
}
