package com.jonab.textfielddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usernameField;
    EditText passwordField;
    public void SendData(View view)
    {
        String username = usernameField.getText().toString();
        String password = passwordField.getText().toString();
        Boolean dataFilled = !(TextUtils.isEmpty(username) || TextUtils.isEmpty(password));
        if (!dataFilled)
            (Toast.makeText(getApplicationContext(), "Please Enter Info", Toast.LENGTH_SHORT)).show();
        else
            (Toast.makeText(getApplicationContext(), "GOT YA DEETS", Toast.LENGTH_SHORT)).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameField = (EditText)findViewById(R.id.userNameField);
        passwordField = (EditText)findViewById(R.id.passwordField);
    }
}
