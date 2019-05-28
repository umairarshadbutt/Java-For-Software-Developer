package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger=new Hamburger("ABC", "Roasted",250,"ABC" );
        hamburger.addition1("souces",30);
        hamburger.addition2("souces",30);
        System.out.println("Total Burger Price is: " +hamburger.burgurePrice());
        System.out.println();

        HealthyBurgur healthyBurgur= new HealthyBurgur("KLM", 5);
        healthyBurgur.addHealthAddition1("Egg", 30);
        System.out.println("Total Burger Price is: " +healthyBurgur.burgurePrice());
        System.out.println();

        Delux delux=new Delux();
        delux.addition4("Test",120);
        System.out.println("Total Burger Price is: " +delux.burgurePrice());


    }
}
