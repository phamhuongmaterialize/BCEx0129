package com.example.phamt.bcex0129.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.phamt.bcex0129.R;

/**
 * Created by phamt on 2018/01/29.
 */

public class LoginMainActivity extends AppCompatActivity {

    private Button mRegisterButton = null;
    private Button mLoginButton = null;

    private TextView mPasswordForgetTextview = null;
    private TextView mIDForgetTextview = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);

        mRegisterButton = (Button) findViewById(R.id.login_main_register_button);
        mLoginButton = (Button) findViewById(R.id.login_main_login_button);

        mPasswordForgetTextview = (TextView) findViewById(R.id.login_main_password_forget_textview);
        mIDForgetTextview = (TextView) findViewById(R.id.login_main_id_forget_textview);

        mRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginMainActivity.this, LoginActivity.class);
                startActivity(intent);

            }
        });

        mPasswordForgetTextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mIDForgetTextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}
