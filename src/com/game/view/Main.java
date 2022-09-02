package com.game.view;
import com.game.thread.MusicThread;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new BaseFrame();
        new MusicThread("src/video/bjmusic.wav").start();

    }

}




