package com.example.awtSample;

import static com.example.awtSample.ThreadColor.ANSI_GREEN;
import static com.example.awtSample.ThreadColor.ANSI_PURPLE;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE+ "Hello from the main thread ");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        new Thread(){
            public void run(){
                System.out.println(ANSI_GREEN+ "Hello from the anonymous class thread");
            }
        }.start();

        System.out.println("Hello again from the main thread ");
    }
}
