package com.example.awtSample;

public class Main {

    public static void main(String[] args) {

        String string ="I an a string. Yes, Iam.";
        System.out.println(string);
        String yourString = string.replaceAll("I", "You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF12Ghhiiiiiiklo349jjeijdij";
        System.out.println(alphanumeric.replaceAll(".","Y"));

        System.out.println(alphanumeric.replaceAll("^abcDeee","Y"));


        String secondString = "abcDeeeF12GhhiiiabcDeeeiiikloabcDeee349jjeijdij";
        System.out.println(alphanumeric.replaceAll("^abcDeee","YYY"));

        System.out.println(alphanumeric.matches("^Hello"));
        System.out.println(alphanumeric.matches("^bcDeee"));
        System.out.println(alphanumeric.matches("^abcDeeeF12Ghhiiiiiiklo349jjeijdij"));

        System.out.println(alphanumeric.replaceAll("jjeijdij","The Eend"));
        System.out.println(alphanumeric.replaceAll("[iiiik]","X"));
        System.out.println(alphanumeric.replaceAll("[iiiik]","I replaced the letter here"));
        System.out.println(alphanumeric.replaceAll("[klo][jjeijd]","X"));

    }
}
