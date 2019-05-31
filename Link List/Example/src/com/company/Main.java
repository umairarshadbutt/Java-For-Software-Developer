package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer customer= new Customer("Umair", 450.54);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.36);

        System.out.println("Balance of customer "+ customer.getName()+" is "+customer.getBalance());

        ArrayList<Integer> intList= new ArrayList<Integer>();

        intList.add(1);
        intList.add(2);
        intList.add(45);

        for (int i=0; i<intList.size() ; i++){
           System.out.println(i+ " : "+ intList.get(i));
        }

        intList.add(1,3);

        for (int i=0; i<intList.size() ; i++){
            System.out.println(i+ " : "+ intList.get(i));
        }

    }


}
