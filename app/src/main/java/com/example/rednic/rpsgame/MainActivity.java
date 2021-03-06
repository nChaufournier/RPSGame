package com.example.rednic.rpsgame;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;



public class MainActivity extends ActionBarActivity {
    ImageButton rockButton;
    ImageButton paperButton;
    ImageButton scissorsButton;
    int Player;
    Computer computer = new Computer();

    public String findPlay(int num){
        if(num == 0){
            return "Rock";
        }else if(num ==1){
            return "Paper";
        }else{
            return "Scissors";
        }
    }

//This is a test
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //findPlay(computer);
        rockButton = (ImageButton) findViewById(R.id.rockButton);
        paperButton = (ImageButton) findViewById(R.id.paperButton);
        scissorsButton = (ImageButton) findViewById(R.id.scissorsButton);

        rockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Results.class);
                i.putExtra("key1", "Results");
                startActivityForResult(i, 1);
                Player = 0;

            }
        });

        paperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Player = 1;
                Intent i = new Intent(v.getContext(), Results.class);
                startActivity(i);
            }
        });

        scissorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Player = 2;
                Intent i = new Intent(v.getContext(), Results.class);
                startActivity(i);
            }
        });




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
