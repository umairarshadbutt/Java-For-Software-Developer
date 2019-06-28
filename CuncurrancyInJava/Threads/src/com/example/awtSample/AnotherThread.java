package com.example.awtSample;

import static com.example.awtSample.ThreadColor.ANSI_BLUE;
import static com.example.awtSample.ThreadColor.ANSI_GREEN;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println( ANSI_BLUE+"Hello from another thread");
    }
}
