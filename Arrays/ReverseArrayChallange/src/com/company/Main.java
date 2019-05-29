package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[] array={1,5,4,2,5,2,8,66,69};
	System.out.println("Arrays values are :"+ Arrays.toString(array));
	revers(array);

	System.out.println("Arrays values are :"+ Arrays.toString(array));


    }

    private static void revers(int[] array) {
        int maxIndx=array.length-1;
        int halfLength=array.length/2;
        for (int i=0; i<halfLength;i++){
            int temp=array[i];
            array[i]=array[maxIndx-i];
            array[maxIndx-i]=temp;

        }
    }
}
