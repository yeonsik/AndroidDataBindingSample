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

    /**
     * 원래의 event의 return 값이 void 라면 다른 return 값으로도 사용할 수 있다.
     * @param view
     * @param isChecked
     * @param user
     * @return
     */
    public boolean completeChanged(View view, boolean isChecked, User user) {
        Toast.makeText(getContext(), "completeChanged : User-" + user.getFirstName() + user.getLastName() + ", " + isChecked, Toast.LENGTH_SHORT).show();
        return true;
    }

    /**
     * 원래의 event의 return값이 void가 아닌 경우 원래의 event return 값과 똑같이 맞춰줘야 한다.
     * setOnLongClickListener 에 구현된 onLongClick(View v) 메서드는 boolean 값을 return 하므로
     * 이 메서드도 onLongClick 이벤트로 사용되는 경우 boolean 값을 return 해줘야 한다.
     *
     * @param view
     * @param user
     * @return
     */
    public boolean onLongClick(View view, User user) {
        Toast.makeText(getContext(), "onLongClick : User-" + user.getFirstName() + user.getLastName(), Toast.LENGTH_SHORT).show();
        return true;
    }
}
