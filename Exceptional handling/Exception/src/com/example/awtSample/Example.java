package com.example.awtSample;

import java.util.Scanner;

public class Example {
    public static void main(String[] args){
        int result= divide();
        System.out.println(result);
    }

    private static int divide(){
        int x=getInt();
        int y = getInt();
        System.out.println("x is = "+ x+ ", y = "+ y +"");
        return x/y;
    }

    private static int getInt(){
        Scanner s= new Scanner(System.in);
        System.out.println("Please enter an integer");
        return s.nextInt();
    }
}
