package com.wh.jxd.com.mvvmdemo;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableInt;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.wh.jxd.com.mvvmdemo.bean.User;
import com.wh.jxd.com.mvvmdemo.databinding.TestActivityBinding;
import com.wh.jxd.com.mvvmdemo.viewmodel.TestViewModel;
import com.wh.jxd.com.mvvmdemo.viewmodel.UserViewModel;

import java.util.Observable;
import java.util.Observer;

public class TestActivity extends AppCompatActivity implements Observer {

    private TestActivityBinding mTestActivityBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mTestActivityBinding = DataBindingUtil.setContentView(this, R.layout.test_activity);
        TestViewModel testViewModel = new TestViewModel(this);
        mTestActivityBinding.setTestmodel(testViewModel);
        setUpUserData(mTestActivityBinding.listUser);
        setupObserver(testViewModel);


    }

    private void setupObserver(TestViewModel testViewModel) {

        testViewModel.addObserver(this);
    }

    /**
     * 设置列表的数据
     *
     * @param listUser
     */
    private void setUpUserData(RecyclerView listUser) {
        listUser.setLayoutManager(new LinearLayoutManager(this));
        UserAdapter userAdapter = new UserAdapter();
        listUser.setAdapter(userAdapter);
    }


    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof TestViewModel) {
            UserAdapter peopleAdapter = (UserAdapter) mTestActivityBinding.listUser.getAdapter();
            TestViewModel peopleViewModel = (TestViewModel) observable;
            peopleAdapter.setUserList(peopleViewModel.getData());
        }
    }
}
