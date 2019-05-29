package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the count number :");
        int count = scanner.nextInt();
        int[] myIntArry= readIntegers(count);
        int min= findMin(myIntArry);

        System.out.println("Minimum Value is :"+ min);

    }

    private static int findMin(int[] myIntArry) {
        int min= Integer.MAX_VALUE;

        for(int i=0; i<myIntArry.length; i++){
            int value = myIntArry[i];
            if (value <min) {
                min = value;
            }
        }

        return min;
    }

    private static int[] readIntegers(int count) {
        int[] array= new int[count];
        for (int i=0; i<array.length; i++){
            System.out.println("Enter the value at the index "+i+" :");
            array[i]=scanner.nextInt();
        }

        return array;
    }

}
