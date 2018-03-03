package com.wh.jxd.com.mvvmdemo;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.android.databinding.library.baseAdapters.BR;
import com.wh.jxd.com.mvvmdemo.bean.User;

public class MainActivity extends AppCompatActivity {
    private ViewDataBinding mBinding;
    private User mUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mUser = new User("老疼", "26");
        mBinding.setVariable(BR.user, mUser);
//        mBinding.
//      mBinding.setVariable(BR);
        mUser.setName("哈哈哈哈哈");

    }

    public class Presenter{
        public void onClickListenerBinding() {
            //处理的点击事件
        }
    }
}
