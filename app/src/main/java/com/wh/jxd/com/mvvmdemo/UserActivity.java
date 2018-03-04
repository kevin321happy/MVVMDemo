package com.wh.jxd.com.mvvmdemo;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wh.jxd.com.mvvmdemo.bean.User;
import com.wh.jxd.com.mvvmdemo.databinding.UserActivityBinding;

public class UserActivity extends AppCompatActivity {

    private UserActivityBinding mUserActivityBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataBinding();

    }

    /**
     * 初始化DataBinding
     */
    private void initDataBinding() {
        mUserActivityBinding = DataBindingUtil.setContentView(this, R.layout.user_activity);
        User user = new User("老阔疼", "26");
        mUserActivityBinding.setUser(user);
    }
}
