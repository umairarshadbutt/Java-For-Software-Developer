package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name ,double initalAmount) {
        this.name = name;
        this.addTransaction(initalAmount);
    }

    public void addTransaction(double amount){
        this.transactions.add(amount);

    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
