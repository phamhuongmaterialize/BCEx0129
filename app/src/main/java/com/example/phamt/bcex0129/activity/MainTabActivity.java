package com.example.phamt.bcex0129.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.phamt.bcex0129.R;
import com.example.phamt.bcex0129.fragment.DeviceListFragment;
import com.example.phamt.bcex0129.fragment.UploadFragment;

/**
 * Created by phamt on 2018/01/29.
 */

public class MainTabActivity extends AppCompatActivity {

    private LinearLayout mTabContainer = null;
    private LinearLayout mFragmentContainer = null;

    private RelativeLayout mUploadTitleLayout = null;
    private RelativeLayout mDeviceTitleLayout = null;
    private View mUploadBorder = null;
    private View mDeviceBorder = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_tab);

        mUploadTitleLayout = (RelativeLayout) findViewById(R.id.tab_upload_title_layout);
        mDeviceTitleLayout = (RelativeLayout) findViewById(R.id.tab_device_title_layout);
        mUploadBorder = (View) findViewById(R.id.tab_border_upload);
        mDeviceBorder = (View) findViewById(R.id.tab_border_device);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.tab_content_layout, DeviceListFragment.newInstance());
        transaction.commit();

        mUploadTitleLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDeviceBorder.setBackgroundColor(Color.parseColor("#FFFFFF"));
                mUploadBorder.setBackgroundColor(Color.parseColor("#bdbdbd"));

                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction transaction = fm.beginTransaction();
                transaction.replace(R.id.tab_content_layout, UploadFragment.newInstance());
                transaction.commit();
            }
        });

        mDeviceTitleLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDeviceBorder.setBackgroundColor(Color.parseColor("#bdbdbd"));
                mUploadBorder.setBackgroundColor(Color.parseColor("#FFFFFF"));

                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction transaction = fm.beginTransaction();
                transaction.replace(R.id.tab_content_layout, DeviceListFragment.newInstance());
                transaction.commit();
            }
        });
    }
}
