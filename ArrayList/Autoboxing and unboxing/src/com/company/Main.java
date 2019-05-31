package com.company;

import java.util.ArrayList;

class IntClass{
    private int myValues;

    public IntClass(int myValues) {
        this.myValues = myValues;
    }

    public int getMyValues() {
        return myValues;
    }

    public void setMyValues(int myValues) {
        this.myValues = myValues;
    }
}
public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList=  new ArrayList<String>();
        stringArrayList.add("Tim");
       // ArrayList<int> intArrayList= new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList= new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        Integer integer=new Integer(54);
        Double doubleValues = new Double(12.25);

        ArrayList<Integer> integerArrayList= new ArrayList<Integer>();
//
//        for(int i=0; i<=10; i++){
//            integerArrayList.add(Integer.valueOf(i));
//        }
//
//        for (int i=0; i<10; i++){
//            System.out.println(i+ " --> "+integerArrayList.get(i).intValue());
//        }

        Integer myIntValue= 56;//Integer.valueOf(56);
        int myInt= myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl=0.0; dbl<=10.0; dbl+=0.5){
            myDoubleValues.add(dbl);
        }

        for (int i=0; i< myDoubleValues.size(); i++){
            double value = myDoubleValues.get(i);
            System.out.println(i+" --> "+ value);
        }






    }
}
