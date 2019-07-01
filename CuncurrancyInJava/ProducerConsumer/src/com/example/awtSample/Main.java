package com.example.awtSample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.example.awtSample.Main.EOF;


public class Main {
    public static final String EOF="EOF";

    public static void main(String[] args) {

        List<String> buffer= new ArrayList<String>();
        MyProducer producer= new MyProducer(buffer, ThreadColor.ANSI_YELLOW);
        MyProducer producer1= new MyProducer(buffer, ThreadColor.ANSI_PURPLE);
        MyProducer producer2= new MyProducer(buffer, ThreadColor.ANSI_CYAN);

        new Thread(producer).start();
        new Thread(producer1).start();
        new Thread(producer2).start();
    }
}


class MyProducer implements Runnable{
    private List<String> buffer;
    private  String color;

    public MyProducer(List<String> buffer, String color){
        this.buffer=buffer;
        this.color= color;
    }

    public void run(){
        Random random = new Random();
        String[] nums = {"1","2","3","4","5"};

        for (String num: nums){
            try {
                System.out.println(color + "Adding..."+ num);
                buffer.add(num);

                Thread.sleep(random.nextInt(1000));
            }catch (InterruptedException e){
                System.out.println("Producer EOF and exiting");
            }
        }

        System.out.println(color + "Adding EOF and exiting...");
        buffer.add("EOF");
    }
}


class MyConsumer implements Runnable{
    private List<String> buffer;
    private String color;

    public MyConsumer(List<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }

    public void run(){
        while (true){
            if(buffer.isEmpty()){
                continue;
            }

            if (buffer.get(0).equals(EOF)){
                System.out.println(color+"Existing");
                break;
            } else{
                System.out.println(color+"Removed "+ buffer.remove(0));
            }
        }
    }
}
