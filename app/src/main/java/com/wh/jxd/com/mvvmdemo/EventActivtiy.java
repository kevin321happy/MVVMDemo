package com.wh.jxd.com.mvvmdemo;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.wh.jxd.com.mvvmdemo.databinding.EventActivityBinding;
import com.wh.jxd.com.mvvmdemo.inter.EventListener;

/**
 * Created by kevin321vip on 2018/3/5.
 * 事件绑定
 */

public class EventActivtiy extends AppCompatActivity{

    private EventActivityBinding mEventActivityBinding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mEventActivityBinding = DataBindingUtil.setContentView(this, R.layout.event_activity);
        mEventActivityBinding.setTitle1("事件绑定1");
        mEventActivityBinding.setTitle2("事件绑定2");
        mEventActivityBinding.setTitle3("事件绑定3");
        mEventActivityBinding.setEvent(new EventListener() {
            @Override
            public void click1(View v) {
                mEventActivityBinding.setTitle1("方法1调用");

            }

            @Override
            public void click2(View v) {
                mEventActivityBinding.setTitle1("方法2调用");
            }

            @Override
            public void cilck3(String s) {
                mEventActivityBinding.setTitle1("方法3调用");
            }
        });
    }
}
