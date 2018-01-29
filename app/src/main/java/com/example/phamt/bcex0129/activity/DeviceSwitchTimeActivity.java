package com.example.phamt.bcex0129.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.NumberPicker;

import com.example.phamt.bcex0129.R;

/**
 * Created by phamt on 2018/01/29.
 */

public class DeviceSwitchTimeActivity extends AppCompatActivity {

    private LinearLayout mBackImageLayout = null;
    private Button mConfirmationButton = null;
    private NumberPicker mMinutePicker = null;
    private NumberPicker mSecondPicker = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.device_switching_time);

        mBackImageLayout = (LinearLayout) findViewById(R.id.device_switching_time_back_image_layout);
        mBackImageLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        mMinutePicker = (NumberPicker) findViewById(R.id.device_switching_time_minute_picker);
        mMinutePicker.setMinValue(0);
        mMinutePicker.setMaxValue(30);
        mSecondPicker = (NumberPicker) findViewById(R.id.device_switching_time_second_picker);
        mSecondPicker.setMinValue(10);
        mSecondPicker.setMaxValue(59);
        mMinutePicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker numberPicker, int i, int i1) {
                if (i1 != 0) {
                    mSecondPicker.setMinValue(0);
                    mSecondPicker.setMaxValue(59);
                } else {
                    mSecondPicker.setMinValue(10);
                    mSecondPicker.setMaxValue(59);
                }
            }
        });

        mConfirmationButton = (Button) findViewById(R.id.device_switching_time_confirmation_button);
        mConfirmationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }
}
