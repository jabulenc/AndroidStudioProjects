package com.jonab.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int counter = 1;
    ///
    public void clickFunction(View view)
    {
        EditText myTextField = (EditText) findViewById(R.id.enterName);

        TextView title = (TextView)findViewById(R.id.deez_nuts);
        counter++;
        title.setText(myTextField.getText());
        Log.i("Info","Button pressed");
    }

    @Override
    // Protected means only this package can access this function
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
