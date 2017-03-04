package com.yeonsik.databindingsample.databindingsample.fragments;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableArrayMap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yeonsik.databindingsample.databindingsample.R;
import com.yeonsik.databindingsample.databindingsample.databinding.FragmentObservableDataBindingBinding;
import com.yeonsik.databindingsample.databindingsample.datas.Fields;
import com.yeonsik.databindingsample.databindingsample.datas.User2;
import com.yeonsik.databindingsample.databindingsample.datas.User3;

/**
 * Created by yeonsik on 2017-03-04.
 */

public class ObservableDataBindingFragment extends BaseFragment {
    private FragmentObservableDataBindingBinding mBinding;


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_observable_data_binding, container, false);

        mBinding = FragmentObservableDataBindingBinding.bind(layout);
        mBinding.setFragment(this);

        User2 user2 = new User2("Gildong", "Hong");
        mBinding.setUser2(user2);

        User3 user3 = new User3();
        user3.firstName.set("보영");
        user3.lastName.set("박");
        user3.age.set(25);
        mBinding.setUser3(user3);

        ObservableArrayMap<String, Object> user4 = new ObservableArrayMap<>();
        user4.put("firstName", "초아");
        user4.put("lastName", "박");
        user4.put("age", 17);
        mBinding.setUser4(user4);

        ObservableArrayList<Object> user5 = new ObservableArrayList<>();
        user5.add("이유");
        user5.add("아");
        user5.add(21);
        mBinding.setUser5(user5);

        return layout;
    }

    public void testClick(View view) {
        mBinding.getUser2().setLastName("Kim");
        mBinding.getUser3().lastName.set("Kim");
        mBinding.getUser4().put("lastName", "Kim");
        mBinding.getUser5().set(Fields.LAST_NAME, "Kim");
    }
}
