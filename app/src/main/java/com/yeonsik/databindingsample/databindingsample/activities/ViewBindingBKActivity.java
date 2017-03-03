package com.yeonsik.databindingsample.databindingsample.activities;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.widget.TextView;

import com.yeonsik.databindingsample.databindingsample.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by yeonsik on 2017-03-03.
 */

public class ViewBindingBKActivity extends Activity {

    @Bind(R.id.title_textview)
    TextView titleTextView;

    @Bind(R.id.description_textview)
    TextView descriptionView;

    @Bind(R.id.footer_textview)
    TextView footerTextView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_view_binding_bk);

        ButterKnife.bind(this);

        titleTextView.setText("title");
        descriptionView.setText("description");
        footerTextView.setText("footer");
    }
}
