package com.example.awtSample;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args){
        try {
            int result= divide();
            System.out.println(result);
        } catch (ArithmeticException | NoSuchElementException e){
            System.out.println(e.toString());
            System.out.println("Unable to perform division, autopilot sutting down");
        }
    }

    private static int divide(){
        int x,y;
//        try {
                x=getInt();
                y = getInt();
                System.out.println("x is = "+ x+ ", y = "+ y +" 2");
                return x/y;
//        } catch (NoSuchElementException e){
//            throw new ArithmeticException("no suitable input");
//        } catch (ArithmeticException e){
//            throw new ArithmeticException("Attempt to divide with Zero");
//        }

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
