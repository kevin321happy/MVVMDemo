package com.wh.jxd.com.mvvmdemo.bean;

/**
 * Created by kevin321vip on 2018/3/4.
 */

public class People {
    private String name;
    private String hobby;

    public People(String name, String hobby) {
        this.name = name;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
