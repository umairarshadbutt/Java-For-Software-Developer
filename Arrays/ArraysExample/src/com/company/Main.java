package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers= getIntegers(5);

//        int[] myIntArray = new int[25];
//
//        for (int i=0; i<myIntArray.length;i++){
//            myIntArray[i] = i*10;
//        }
        for (int i=0; i<myIntegers.length; i++){
            System.out.println("Element "+ i +", value is "+ myIntegers[i]);
        }

        System.out.println("The average is : "+ getAverage(myIntegers));

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values");
        int[] values= new int[number];
        for (int i=0; i<values.length; i++){
            values[i]= scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int [] array){
        int sum=0;
        for (int i=0; i<array.length ; i++){
            sum+= array[i];
        }

        return (double)sum/ (double)array.length;
    }
}
