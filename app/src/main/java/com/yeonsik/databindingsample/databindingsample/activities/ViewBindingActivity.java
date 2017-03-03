package com.yeonsik.databindingsample.databindingsample.activities;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.yeonsik.databindingsample.databindingsample.R;
import com.yeonsik.databindingsample.databindingsample.databinding.ActivityViewBindingBinding;

/**
 * Created by yeonsik on 2017-03-03.
 */

public class ViewBindingActivity extends Activity {

    private ActivityViewBindingBinding mBinding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_view_binding);

        mBinding.titleTextview.setText("title");
        mBinding.descriptionTextview.setText("description");
        mBinding.footerTextview.setText("footer");
    }
}
