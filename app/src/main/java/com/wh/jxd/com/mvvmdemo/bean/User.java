package com.wh.jxd.com.mvvmdemo.bean;

import android.databinding.BaseObservable;

import com.android.databinding.library.baseAdapters.BR;

/**
 * Created by kevin321vip on 2018/2/26.
 */

public class User extends BaseObservable {
    private String name;
    private String age;
    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.user);
//        notifyPropertyChanged(BR.user);
//        notifyPropertyChanged(BR.use);
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
