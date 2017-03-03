package com.jonab.animationsudemy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade(View view){
        ImageView animegirl = (ImageView) findViewById(R.id.animegrill);
        ImageView agirl2 = (ImageView) findViewById(R.id.agrill2);
        if (animegirl.getAlpha() != 0f) {
            animegirl.animate().alpha(0f).setDuration(1500);
            agirl2.animate().alpha(1f).setDuration(1500);
        } else {
            animegirl.animate().alpha(1f).setDuration(1500);
            agirl2.animate().alpha(0f).setDuration(1500);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
