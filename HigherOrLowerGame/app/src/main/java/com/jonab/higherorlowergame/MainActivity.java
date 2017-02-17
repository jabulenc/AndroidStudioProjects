package com.jonab.higherorlowergame;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {

    ImageView resultImage;
    EditText guessEntry;
    TextView resultText;
    Random random = new Random();
    static Integer answer = 0;
    public void doGuess(View view){
        String testAnswer = guessEntry.getText().toString();
        if (TextUtils.isEmpty(testAnswer))
            return;
        Log.d("doGuess", "Guess Entered");
        Integer guess = Integer.getInteger(testAnswer);
        if (guess == answer)
        {
            resultText.setText("Good Job! Number Reset!");
            resultText.setTextColor(Color.rgb(0,200,0));
        } else {
            resultText.setText("Try Again!");
            resultText.setTextColor(Color.rgb(200,0,0));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultImage = (ImageView)findViewById(R.id.resultImage);
        guessEntry = (EditText)findViewById(R.id.guessEntry);
        resultText = (TextView)findViewById(R.id.resultText);
        answer = random.nextInt(20)+1;
    }
}
