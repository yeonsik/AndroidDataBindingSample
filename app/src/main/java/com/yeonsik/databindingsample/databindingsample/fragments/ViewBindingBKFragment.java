package com.yeonsik.databindingsample.databindingsample.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yeonsik.databindingsample.databindingsample.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by yeonsik on 2017-03-03.
 */

public class ViewBindingBKFragment extends BaseFragment {

    @BindView(R.id.title_textview)
    TextView titleTextView;

    @BindView(R.id.description_textview)
    TextView descriptionView;

    @BindView(R.id.footer_textview)
    TextView footerTextView;

    /**
     * Fragments have a different view lifecycle than activities.
     * When binding a fragment in onCreateView, set the views to null in onDestroyView.
     * Butter Knife returns an Unbinder instance when you call bind to do this for you.
     * Call its unbind method in the appropriate lifecycle callback.
     *
     * http://jakewharton.github.io/butterknife/#reset
     */
    private Unbinder mUnbinder;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_view_binding_bk, container, false);
        mUnbinder = ButterKnife.bind(this, layout);

        titleTextView.setText("title");
        descriptionView.setText("description");
        footerTextView.setText("footer");

        return layout;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mUnbinder.unbind();
    }
}
