package com.company;

public class HealthyBurgur  extends  Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurgur( String meat, int price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public int burgurePrice() {
        int price=super.burgurePrice();

        if (this.healthyExtra1Name !=  null){
            price+=this.healthyExtra1Price;
            System.out.println("Added "+this.healthyExtra1Name + " for an extra " +this.healthyExtra1Price);
        }

        if (this.healthyExtra2Name !=  null){
            price+=this.healthyExtra2Price;
            System.out.println("Added "+this.healthyExtra2Name + " for an extra " +this.healthyExtra2Price);
        }
    return price;
    }
}
