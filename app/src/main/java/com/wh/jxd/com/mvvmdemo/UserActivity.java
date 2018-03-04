package com.wh.jxd.com.mvvmdemo;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


import com.wh.jxd.com.mvvmdemo.bean.User;
import com.wh.jxd.com.mvvmdemo.viewmodel.UserViewModel;

public class UserActivity extends AppCompatActivity {
    private User mUser;
    private ViewDataBinding mUserDataBinding;
    private UserViewModel mUserViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initDataBinding();
//        setSupportActionBar(mUserDataBinding.toolbar);


    }

    /**
     * 初始化DataBinding
     */
    private void initDataBinding() {
//        ViewDataBinding viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_user);
//        mUserViewModel = new UserViewModel(this);
//        mUserDataBinding.setUserView(peopleViewModel);


    }


}
