package com.wh.jxd.com.mvvmdemo;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

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
        Presenter presenter = new Presenter();
        mUserActivityBinding.setUser(user);
        mUserActivityBinding.setPresenter(presenter);
    }

    public class Presenter {
        public String message = "-";

        //跳转到下个界面
        public void GotoNext() {
            Intent intent = new Intent(UserActivity.this, EventActivtiy.class);
            startActivity(intent);
            Toast.makeText(UserActivity.this, "开始跳转到下个界面", Toast.LENGTH_SHORT).show();
        }
    }
}
