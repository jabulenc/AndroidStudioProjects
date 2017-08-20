package com.jonab.fullylocalconnect4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Connect4 extends AppCompatActivity {

    private Button turnButton;
    private TextView gameStats;
    private Color currentTurn;
    private boolean gameIsRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect4);
        currentTurn = Color.Leaf;
        turnButton = (Button)findViewById(R.id.turnButton);
        gameStats = (TextView) findViewById(R.id.gameStatus);
        gameStats.setText("Press Start");
        turnButton.setText("Start Game");
        gameIsRunning = false;
    }

    public void doEndTurn(View view){
        if (!gameIsRunning){
            gameIsRunning = true;
            gameStats.setText("Hat's Turn");
            turnButton.setText("End Turn");
        }

        if (currentTurn == Color.Leaf){
            gameStats.setText("Hat's Turn");
            currentTurn = Color.Hat;
        } else {
            gameStats.setText("Leaf's Turn");
            currentTurn = Color.Leaf;
        }
    }
}
