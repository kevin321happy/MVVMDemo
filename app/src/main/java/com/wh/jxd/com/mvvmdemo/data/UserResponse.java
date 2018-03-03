package com.wh.jxd.com.mvvmdemo.data;

import com.google.gson.annotations.SerializedName;
import com.wh.jxd.com.mvvmdemo.bean.User;

import java.util.List;

/**
 * Created by kevin321vip on 2018/3/3.
 */

public class UserResponse {
    @SerializedName("results")
    private List<User> peopleList;

    public List<User> getPeopleList() {
        return peopleList;
    }

    public void setPeopleList(List<User> mPeopleList) {
        this.peopleList = mPeopleList;
    }
}
