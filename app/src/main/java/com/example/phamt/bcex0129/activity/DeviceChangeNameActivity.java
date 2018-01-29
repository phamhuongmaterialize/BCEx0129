package com.example.phamt.bcex0129.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.phamt.bcex0129.R;

/**
 * Created by phamt on 2018/01/29.
 */

public class DeviceChangeNameActivity extends AppCompatActivity {

    private LinearLayout mBackImageLayout = null;
    private TextView mConfirmationTextView = null;
    private EditText mNameEditText = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.device_name_change);

        mBackImageLayout = (LinearLayout) findViewById(R.id.device_name_back_image_layout);
        mConfirmationTextView = (TextView) findViewById(R.id.device_name_confimation_textview);
        mNameEditText = (EditText) findViewById(R.id.device_name_edittext);

        mBackImageLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        mConfirmationTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        mNameEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    mNameEditText.setText("");
                } else {
                    mNameEditText.setHint(getResources().getString(R.string.please_enter_name));
                }
                mNameEditText.setTextColor(Color.BLACK);
            }
        });
    }
}
