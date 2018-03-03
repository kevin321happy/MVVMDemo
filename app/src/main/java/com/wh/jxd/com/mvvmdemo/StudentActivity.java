package com.wh.jxd.com.mvvmdemo;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


import com.wh.jxd.com.mvvmdemo.bean.User;

public class StudentActivity extends AppCompatActivity {
    private ViewDataBinding mBinding;
    private User mUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewDataBinding viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_student);
//        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
//        mUser = new User("老疼", "26");
//        mBinding.setVariable(BR.user, mUser);
////        mBinding.
////      mBinding.setVariable(BR);
//        mUser.setName("哈哈哈哈哈");

    }

    public class Presenter{
        public void onClickListenerBinding() {
            //处理的点击事件
        }
    }
}
