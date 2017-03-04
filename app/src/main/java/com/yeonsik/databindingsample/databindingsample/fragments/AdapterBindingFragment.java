package com.yeonsik.databindingsample.databindingsample.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yeonsik.databindingsample.databindingsample.R;
import com.yeonsik.databindingsample.databindingsample.adapters.DataBindingAdapter;
import com.yeonsik.databindingsample.databindingsample.databinding.FragmentAdapterBindingBinding;
import com.yeonsik.databindingsample.databindingsample.datas.User;

import java.util.ArrayList;

/**
 * Created by yeonsik on 2017-03-04.
 */

public class AdapterBindingFragment extends BaseFragment {

    FragmentAdapterBindingBinding mBinding;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_adapter_binding, container, false);

        mBinding = FragmentAdapterBindingBinding.bind(layout);

        mBinding.recycleview.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        DataBindingAdapter adapter = new DataBindingAdapter(getContext(), getUserList());
        mBinding.recycleview.setAdapter(adapter);

        return layout;
    }

    private ArrayList<User> getUserList() {
        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("보영", "박", 20, "http://i.imgur.com/CqmBjo5.jpg"));
        userList.add(new User("지현", "전", 22, "http://i.imgur.com/zkaAooq.jpg"));
        userList.add(new User("재석", "유", 15, "http://i.imgur.com/0gqnEaY.jpg"));
        userList.add(new User("명수", "박", 19, "http://i.imgur.com/9gbQ7YR_error.jpg"));
        userList.add(new User("세호", "조", 13, "http://i.imgur.com/aFhEEby.jpg"));

        return userList;
    }
}
