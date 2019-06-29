package com.example.awtSample;

import static com.example.awtSample.ThreadColor.ANSI_BLUE;
import static com.example.awtSample.ThreadColor.ANSI_GREEN;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println( ANSI_BLUE+"Hello from "+currentThread().getName());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e){
            System.out.println(ANSI_BLUE+"Another threas woke me up");
        }

        System.out.println(ANSI_BLUE+ "Three seconds have been passed and I'm awake");

    }
}
