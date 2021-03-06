package com.wh.jxd.com.mvvmdemo.bean;


import android.databinding.BaseObservable;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

import java.io.Serializable;

/**
 * Created by kevin321vip on 2018/2/26.
 */

public class User extends BaseObservable {

    private String nama;
    private String age;
    private User mUser;

    public void setUser(User user) {
        mUser = user;
        notifyChange();
    }

    public User(String nama, String age) {
        this.nama = nama;
        this.age = age;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        notifyChange();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
        notifyChange();
    }

    /**
     * 点击了姓名
     */
    public void ClickedName(View view) {
        Log.d("test", "点击了姓名");


    }

    /**
     * 点击了年纪
     */
    public void ClickedAge(View view) {

        Log.d("test", "点击了年龄");

    }

    /**
     * 获取姓名和年龄的拼接
     */
    public String getNA(String name, String age) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("NA" + name);
        buffer.append(age);
        return buffer.toString();
    }

}
