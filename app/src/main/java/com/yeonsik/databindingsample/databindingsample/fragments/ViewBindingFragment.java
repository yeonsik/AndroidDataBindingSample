package com.yeonsik.databindingsample.databindingsample.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yeonsik.databindingsample.databindingsample.R;
import com.yeonsik.databindingsample.databindingsample.databinding.FragmentViewBindingBinding;

/**
 * Created by yeonsik on 2017-03-03.
 */

public class ViewBindingFragment extends BaseFragment {

    FragmentViewBindingBinding mBinding;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_view_binding, container, false);

        mBinding = FragmentViewBindingBinding.bind(layout);

        mBinding.titleTextview.setText("title");
        mBinding.descriptionTextview.setText("description");
        mBinding.footerTextview.setText("footer");

        return layout;
    }

    @Override public void onDestroyView() {
        super.onDestroyView();
    }
}
