package com.example.cheers.logincomponent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    public static final String INFO = "info";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {
        TextView tvDesc =  findViewById(R.id.tvDesc);
        String info = getIntent().getStringExtra(INFO);
        if (!TextUtils.isEmpty(info)){
            tvDesc.setText(info);
        }
    }
}
