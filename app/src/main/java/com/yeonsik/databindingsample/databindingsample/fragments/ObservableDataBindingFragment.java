package com.yeonsik.databindingsample.databindingsample.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.yeonsik.databindingsample.databindingsample.R;
import com.yeonsik.databindingsample.databindingsample.databinding.FragmentObservableDataBindingBinding;
import com.yeonsik.databindingsample.databindingsample.datas.User2;

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

        User2 user = new User2("Gildong", "Hong");
        mBinding.setUser2(user);

        user.setFirstName("Yeonsik");
        user.setLastName("Yoon");

        return layout;
    }

    public void testClick(View view) {
        Toast.makeText(getActivity().getApplicationContext(), "testClick", Toast.LENGTH_SHORT).show();
        mBinding.getUser2().setFirstName("Kim");
    }
}
