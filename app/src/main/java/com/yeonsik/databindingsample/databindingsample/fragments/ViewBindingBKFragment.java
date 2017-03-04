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

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_view_binding_bk, container, false);
        ButterKnife.bind(this, layout);

        titleTextView.setText("title");
        descriptionView.setText("description");
        footerTextView.setText("footer");

        return layout;
    }
}
