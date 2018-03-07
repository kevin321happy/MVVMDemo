package com.wh.jxd.com.mvvmdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wh.jxd.com.mvvmdemo.bean.User;
import com.wh.jxd.com.mvvmdemo.databinding.ItemTestBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kevin321vip on 2018/3/6.
 */

public class UserAdapter extends RecyclerView.Adapter {

    private List<User> mUserList = new ArrayList<>();

    public void setUserList(List<User> userList) {
        mUserList = userList;
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemTestBinding dataBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_test, parent, false);
        return new UserAdapterViewHodler(dataBinding);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        ((UserAdapterViewHodler) holder).bindPeople(mUserList.get(position));
    }

    @Override
    public int getItemCount() {
        return mUserList.size();
    }

    public static class UserAdapterViewHodler extends RecyclerView.ViewHolder {
        private ItemTestBinding mItemTestBinding;

        public UserAdapterViewHodler(ItemTestBinding itemView) {
            super(itemView.getRoot());
            this.mItemTestBinding = itemView;
        }

        public void bindPeople(User user) {
            mItemTestBinding.setUsermodel(user);
        }
    }
}
