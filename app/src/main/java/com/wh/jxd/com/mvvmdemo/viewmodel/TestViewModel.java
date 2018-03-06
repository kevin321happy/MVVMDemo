package com.wh.jxd.com.mvvmdemo.viewmodel;

import android.content.Context;
import android.databinding.Observable;
import android.databinding.ObservableInt;
import android.view.View;
import android.widget.Toast;

import com.wh.jxd.com.mvvmdemo.bean.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kevin321vip on 2018/3/6.
 */

public class TestViewModel extends java.util.Observable {

    public ObservableInt testRecycle;
    public ObservableInt startBtn;

    private Context mContext;
    private List<User> mUsers;

    public TestViewModel(Context context) {
        mContext = context;
        testRecycle = new ObservableInt(View.VISIBLE);
    }

    public void startLoad(View view) {
        Toast.makeText(mContext, "点击了加载数据", Toast.LENGTH_SHORT).show();
        mUsers = new ArrayList<>();
        //模拟一段假数据
        for (int i = 0; i < 10; i++) {
            mUsers.add(new User("张三" + i, i + "岁"));
        }
        chageDataSet(mUsers);
    }

    /**
     * 改变数据的设置
     *
     * @param users
     */
    private void chageDataSet(List<User> users) {
        setChanged();
        notifyObservers();
    }

    /**
     * 获取数据
     */
    public List<User> getData() {
        return mUsers;
    }
}
