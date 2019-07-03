package com.example.awtSample;

public class Main {

    public static void main(String[] args) {

        String string ="I an a string. Yes, Iam.";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);
    }
}
