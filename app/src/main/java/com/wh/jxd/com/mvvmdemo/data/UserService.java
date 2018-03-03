package com.wh.jxd.com.mvvmdemo.data;

import java.util.Observable;

import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by kevin321vip on 2018/3/3.
 */

public interface UserService {

    @GET
    io.reactivex.Observable<UserResponse> fetchPeople(@Url String url);


}
