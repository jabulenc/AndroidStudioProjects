package com.jonab.textfielddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // This is for S2.L17-20
    EditText usernameField;
    EditText passwordField;
    ImageView loginimage;
    public void SendData(View view) {
        String username = usernameField.getText().toString();
        String password = passwordField.getText().toString();
        Boolean dataFilled = !(TextUtils.isEmpty(username) || TextUtils.isEmpty(password));
        if (!dataFilled)
            (Toast.makeText(getApplicationContext(), "Please Enter Info", Toast.LENGTH_SHORT)).show();
        else {
            (Toast.makeText(getApplicationContext(), "GOT YA DEETS", Toast.LENGTH_SHORT)).show();
            loginimage.setImageResource(R.drawable.hamburger);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameField = (EditText)findViewById(R.id.userNameField);
        passwordField = (EditText)findViewById(R.id.passwordField);
        loginimage = (ImageView)findViewById(R.id.loginImage);
    }
}
