package com.example.phamt.bcex0129.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.phamt.bcex0129.R;

/**
 * Created by phamt on 2018/01/29.
 */

public class LoginActivity extends AppCompatActivity {

    private Button mLoginButton = null;

    private EditText mMailEditText = null;
    private EditText mPassEditText = null;

    private TextView mToRegisterTextview = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        mMailEditText = (EditText) findViewById(R.id.login_mail_edittext);
        mMailEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    mMailEditText.setText("");
                } else {
                    mMailEditText.setHint(getResources().getString(R.string.please_input_mail_adress));
                }
                mMailEditText.setTextColor(Color.BLACK);
            }
        });

        mPassEditText = (EditText) findViewById(R.id.login_password_edittext);
        mPassEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    mPassEditText.setText("");
                    mPassEditText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                } else {
                    mPassEditText.setHint(getResources().getString(R.string.please_input_password));
                }
                mPassEditText.setTextColor(Color.BLACK);
            }
        });

        mLoginButton = (Button) findViewById(R.id.login_button);
        mLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this,MainTabActivity.class);
                startActivity(intent);

            }
        });

        mToRegisterTextview = (TextView) findViewById(R.id.login_to_register);
        mToRegisterTextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
