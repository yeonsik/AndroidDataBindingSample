package com.yeonsik.databindingsample.databindingsample.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yeonsik.databindingsample.databindingsample.R;
import com.yeonsik.databindingsample.databindingsample.databinding.FragmentDataBindingBinding;
import com.yeonsik.databindingsample.databindingsample.datas.User;

/**
 * Created by yeonsik on 2017-03-04.
 */

public class DataBindingFragment extends BaseFragment {

    FragmentDataBindingBinding mBinding;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_data_binding, container, false);

        mBinding = FragmentDataBindingBinding.bind(layout);

        User user = new User("Gildong", "Hong");
        mBinding.setUser(user);

        user.setFirstName("Yeonsik");
        user.setLastName("Yoon");

        return layout;
    }
}
