package com.yeonsik.databindingsample.databindingsample.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.yeonsik.databindingsample.databindingsample.R;
import com.yeonsik.databindingsample.databindingsample.databinding.FragmentListenerBindingBinding;
import com.yeonsik.databindingsample.databindingsample.datas.User;

/**
 * Created by yeonsik on 2017-03-04.
 */

public class ListenerBindingFragment extends BaseFragment {

    FragmentListenerBindingBinding mBinding;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_listener_binding, container, false);

        mBinding = FragmentListenerBindingBinding.bind(layout);
        User user = new User("Gildong", "Hong");
        mBinding.setUser(user);
        mBinding.setFragment(this);

        user.setFirstName("Yeonsik");
        user.setLastName("Yoon");

        return layout;
    }

    public void methodReferencesOnClick(View view) {
        Toast.makeText(getContext(), "methodReferencesOnClick", Toast.LENGTH_SHORT).show();
    }

    public void listenerBindings(View view, User user) {
        Toast.makeText(getContext(), "listenerBindings : User-" + user.getFirstName() + user.getLastName(), Toast.LENGTH_SHORT).show();
    }

    public void completeChanged(View view, boolean isChecked, User user) {
        Toast.makeText(getContext(), "completeChanged : User-" + user.getFirstName() + user.getLastName() + ", " + isChecked, Toast.LENGTH_SHORT).show();
    }

    public boolean onLongClick(View view, User user) {
        Toast.makeText(getContext(), "onLongClick : User-" + user.getFirstName() + user.getLastName(), Toast.LENGTH_SHORT).show();
        return true;
    }
}
