package com.yeonsik.databindingsample.databindingsample.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yeonsik.databindingsample.databindingsample.R;
import com.yeonsik.databindingsample.databindingsample.activities.ViewBindingActivity;
import com.yeonsik.databindingsample.databindingsample.activities.ViewBindingBKActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by yeonsik on 2017-03-03.
 */

public class MainFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, layout);
        return layout;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @OnClick(R.id.btn_sample_view_binding_bk_activity)
    void sampleViewBindingButterKnifeActivity() {
        Intent intent = new Intent(getActivity().getApplicationContext(), ViewBindingBKActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btn_sample_view_binding_activity)
    void sampleViewBindingActivity() {
        Intent intent = new Intent(getActivity().getApplicationContext(), ViewBindingActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btn_sample_view_binding_bk)
    void sampleViewBindingButterKnife() {
        clickedOn(new ViewBindingBKFragment());
    }

    @OnClick(R.id.btn_sample_view_binding)
    void sampleViewBinding() {
        clickedOn(new ViewBindingFragment());
    }

    @OnClick(R.id.btn_sample_data_binding)
    void sampleDataBinding() {
        clickedOn(new DataBindingFragment());
    }

    private void clickedOn(@NonNull Fragment fragment) {
        final String tag = fragment.getClass().toString();
        getActivity().getSupportFragmentManager()
                .beginTransaction()
                .addToBackStack(tag)
                .replace(android.R.id.content, fragment, tag)
                .commit();
    }
}