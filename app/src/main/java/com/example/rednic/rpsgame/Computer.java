package com.example.rednic.rpsgame;

import java.util.Random;

/**
 * Created by Nic on 12/30/2014. Computer class to track the computers play
 */
public class Computer {
    int play;
    public Computer(){

    }



    public void checkWin(){
        //Testing github with a comment here
        String win = "Winner";
    }



    public int getPlay() {
        return play;
    }

    public void setPlay(int play) {
        Random number = new Random();
        play = number.nextInt(2);
        this.play = play;
    }
}
