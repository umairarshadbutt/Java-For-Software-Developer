package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer customer= new Customer("Umair", 450.54);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.36);

        System.out.println("Balance of customer "+ customer.getName()+" is "+customer.getBalance());

    }
}
