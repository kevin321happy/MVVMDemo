package com.wh.jxd.com.mvvmdemo;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.wh.jxd.com.mvvmdemo.databinding.TestActivityBinding;

public class TestActivity extends AppCompatActivity {

    private TestActivityBinding mTestActivityBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTestActivityBinding = DataBindingUtil.setContentView(this, R.layout.test_activity);

    }
}
