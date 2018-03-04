package com.wh.jxd.com.mvvmdemo.bean;



import java.io.Serializable;

/**
 * Created by kevin321vip on 2018/2/26.
 */

public class User implements Serializable{
    private String nama;
    private String age;

    public User(String nama, String age) {
        this.nama = nama;
        this.age = age;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
