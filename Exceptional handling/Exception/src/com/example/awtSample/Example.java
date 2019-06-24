package com.example.awtSample;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args){
        int result= divide();
        System.out.println(result);
    }

    private static int divide(){
        int x,y;
        try {
                x=getInt();
                y = getInt();
        } catch (NoSuchElementException e){
            throw new ArithmeticException("no suitable input");
        }
        System.out.println("x is = "+ x+ ", y = "+ y +" 2");
        try {
            return x/y;
        } catch (ArithmeticException e){
            throw new ArithmeticException("Attempt to divide with Zero");
        }
    }

    private static int getInt(){
        Scanner s= new Scanner(System.in);
        System.out.println("Please enter an integer");
        while (true){
            try {
                return s.nextInt();
            } catch (InputMismatchException e){
                s.nextLine();
                System.out.println("Please enter a number only the digits 0 to 9 ");
            }
        }
    }
}
