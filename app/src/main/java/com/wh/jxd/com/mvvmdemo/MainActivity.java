package com.wh.jxd.com.mvvmdemo;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.wh.jxd.com.mvvmdemo.bean.User;

public class MainActivity extends AppCompatActivity {
    private ViewDataBinding mBinding;
    private User mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 点击跳转到MVVM界面
     *
     * @param view
     */
    public void jumpToMVVM(View view) {
        Intent intent = new Intent(this, UserActivity.class);
        startActivity(intent);
    }
}
