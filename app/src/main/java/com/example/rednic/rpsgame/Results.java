package com.example.rednic.rpsgame;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


/**
 * Created by Nic on 12/30/2014. Results class to show the results of the game
 */
public class Results extends Activity {
    TextView playChoice;
    TextView compChoice;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results);
        playChoice = (TextView) findViewById(R.id.playerChoice);
        compChoice = (TextView) findViewById(R.id.compChoice);
        result = (TextView) findViewById(R.id.playerChoice);


    }
}
