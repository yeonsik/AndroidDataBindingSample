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
import com.yeonsik.databindingsample.databindingsample.databinding.FragmentMainBinding;

/**
 * Created by yeonsik on 2017-03-03.
 */

public class MainFragment extends BaseFragment {

    private FragmentMainBinding mBinding;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_main, container, false);

        mBinding = FragmentMainBinding.bind(layout);
        mBinding.setFragment(this);

        return layout;
    }

    /**
     * onClick Listener Binding을 위해서는 반드시 public 으로 설정하고 매개변수로 View를 넘겨줘야 한다.
     * @param view
     */
    public void sampleViewBindingButterKnifeActivity(View view) {
        Intent intent = new Intent(getActivity().getApplicationContext(), ViewBindingBKActivity.class);
        startActivity(intent);
    }

    public void sampleViewBindingActivity(View view) {
        Intent intent = new Intent(getActivity().getApplicationContext(), ViewBindingActivity.class);
        startActivity(intent);
    }

    public void sampleViewBindingButterKnife(View view) {
        clickedOn(new ViewBindingBKFragment());
    }

    public void sampleViewBinding(View view) {
        clickedOn(new ViewBindingFragment());
    }

    public void sampleDataBinding(View view) {
        clickedOn(new DataBindingFragment());
    }

    public void sampleListenerBinding(View view) {
        clickedOn(new ListenerBindingFragment());
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