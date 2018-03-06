package com.wh.jxd.com.mvvmdemo.viewmodel;

import android.content.Context;
import android.databinding.Observable;
import android.databinding.ObservableInt;
import android.view.View;
import android.widget.Toast;

/**
 * Created by kevin321vip on 2018/3/6.
 */

public class TestViewModel extends java.util.Observable {

    public ObservableInt testRecycle;
    public ObservableInt startBtn;

    private Context mContext;

    public TestViewModel(Context context) {
        mContext = context;
        testRecycle = new ObservableInt(View.VISIBLE);
    }

    public void startLoad(View view) {

        Toast.makeText(mContext, "点击了加载数据", Toast.LENGTH_SHORT).show();

    }


}
