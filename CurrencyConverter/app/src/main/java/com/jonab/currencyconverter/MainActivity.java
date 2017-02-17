package com.jonab.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText _inUSD;
    EditText _inJPY;

    public void toJPY(View view){
        if (TextUtils.isEmpty(_inUSD.getText().toString()))
            return;
        Double moneyInUSD = Double.valueOf(_inUSD.getText().toString());
        moneyInUSD *= 100;
        _inJPY.setText(moneyInUSD.toString());
    }

    public void toUSD(View view){
        if (TextUtils.isEmpty(_inJPY.getText().toString()))
            return;
        Double moneyInJPY = Double.valueOf(_inJPY.getText().toString());
        moneyInJPY /= 100;
        _inUSD.setText(moneyInJPY.toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _inUSD = (EditText)findViewById(R.id.inUSD);
        _inJPY = (EditText)findViewById(R.id.inYEN);
    }
}
