package com.example.phamt.bcex0129.dialog;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;

import com.example.phamt.bcex0129.R;
import com.example.phamt.bcex0129.activity.DeviceChangeNameActivity;
import com.example.phamt.bcex0129.activity.DeviceContentRenderingActivity;
import com.example.phamt.bcex0129.activity.DeviceSlideEffectActivity;
import com.example.phamt.bcex0129.activity.DeviceSwitchTimeActivity;

/**
 * Created by phamt on 2018/01/29.
 */

public class DeviceSettingDialog extends DialogFragment {
    /**
     * タグ
     */
    private static final String TAG = DeviceSettingDialog.class.getSimpleName();

    /**
     * フラグメントのレイアウト
     */
    private static final int FRGMLAYOUT_XML = R.layout.device_setting;

    public static DeviceSettingDialog newInstance() {
        return new DeviceSettingDialog();
    }

    private RelativeLayout mSpaceLayout = null;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // ダイアログを生成
        Dialog dialog = new Dialog(getActivity());

        // ダイアログ外タップで消えないように設定
        dialog.setCanceledOnTouchOutside(false);

        // DialogFragmentをタイトル無しにする
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(FRGMLAYOUT_XML);
        // 背景を透明に
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        // 画面全体に広げる
        dialog.getWindow().setLayout(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);

        return dialog;
    }

    @Override
    public View onCreateView(final LayoutInflater i, ViewGroup c, Bundle b) {
        View rootView = i.inflate(FRGMLAYOUT_XML, null);

        mSpaceLayout = (RelativeLayout) rootView.findViewById(R.id.spaceLay);
        mSpaceLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });


        // 「名前の変更」を押下
        rootView.findViewById(R.id.btnLay1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), DeviceChangeNameActivity.class);
                startActivity(intent);

                // ダイアログを非表示
                dismiss();
            }
        });

        //
        rootView.findViewById(R.id.btnLay2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // ダイアログを非表示
                dismiss();
            }
        });

        //
        rootView.findViewById(R.id.btnLay3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                // ダイアログを非表示
                dismiss();
            }
        });

        //
        rootView.findViewById(R.id.btnLay4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), DeviceSwitchTimeActivity.class);
                startActivity(intent);

                // ダイアログを非表示
                dismiss();
            }
        });

        //
        rootView.findViewById(R.id.btnLay5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), DeviceSlideEffectActivity.class);
                startActivity(intent);

                // ダイアログを非表示
                dismiss();
            }
        });

        //
        rootView.findViewById(R.id.btnLay6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DeviceRestartDialog restartDialog = DeviceRestartDialog.newInstance();
                restartDialog.show(getFragmentManager(), "");

                // ダイアログを非表示
                dismiss();
            }
        });

        //
        rootView.findViewById(R.id.btnLay7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DeviceInitialDialog initialDialog = DeviceInitialDialog.newInstance();
                initialDialog.show(getFragmentManager(), "");

                // ダイアログを非表示
                dismiss();
            }
        });

        //
        rootView.findViewById(R.id.btnLay8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
//                main.setViewTab(1);

                // ダイアログを非表示
                dismiss();
            }
        });

        //
        rootView.findViewById(R.id.btnLay9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), DeviceContentRenderingActivity.class);
                startActivity(intent);


                // ダイアログを非表示
                dismiss();
            }
        });

        //
        rootView.findViewById(R.id.btnLay10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
//                main.setViewTab(1);

                // ダイアログを非表示
                dismiss();
            }
        });


        return rootView;
    }

}
