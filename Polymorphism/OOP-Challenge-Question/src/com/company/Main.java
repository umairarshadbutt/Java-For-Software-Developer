package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger=new Hamburger("ABC", "Roasted",250,"ABC" );
        hamburger.addition1("souces",30);
        hamburger.addition2("souces",30);

       System.out.println("Total Burger Price is: " +hamburger.burgurePrice());
    }
}
