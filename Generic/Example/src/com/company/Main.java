package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        //items.add("Umair")
        items.add(5);
        items.add(6);

        printDouble(items);
    }

    private static void printDouble(ArrayList<Integer> n){
        for (Object i:n){
            System.out.println((Integer) i*2);
        }
    }
}
