package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private  static Scanner scanner= new Scanner(System.in);
    public static void main(String[] args) {
        int [] myIntegerArray= getIntegers(5);
        int [] sortedArray=sortedArrayMethod(myIntegerArray);
        printArray(sortedArray);
    }

    private static int[] getIntegers(int number) {
        int[] array= new int[number];
        for (int i=0; i<array.length; i++) {
            System.out.println("Enter the value of index " + i + ": ");
            array[i]=scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.println("Element on index " + i +" contains "+array[i]);
        }
    }

    public static int [] sortedArrayMethod(int[] array){
        int []sortedArray= Arrays.copyOf(array,array.length);

        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;

            for (int i = 0; i < sortedArray.length-1; i++)
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
        }

        return sortedArray;
    }
}
