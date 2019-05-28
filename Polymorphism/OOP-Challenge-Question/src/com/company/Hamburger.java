package com.company;

public class Hamburger {
    private String name;
    private  String meat;
    private int hamburguerPrice;
    private  String breadRoleType;

    private String additionalItem1;
    private int additionalPrice1;

    private String additionalItem2;
    private int additionalPrice2;

    private String additionalItem3;
    private int additionalPrice3;

    private String additionalItem4;
    private int additionalPrice4;

    public Hamburger(String name, String meat, int price, String breadRoleType) {
        this.name = name;
        this.meat = meat;
        this.hamburguerPrice = price;
        this.breadRoleType = breadRoleType;
    }

    public void addition1(String name, int price){
        this.additionalItem1=name;
        this.additionalPrice1=price;
    }

    public void addition2(String name, int price){
        this.additionalItem2=name;
        this.additionalPrice2=price;
    }

    public void addition3(String name, int price){
        this.additionalItem3=name;
        this.additionalPrice3=price;
    }

    public void addition4(String name, int price){
        this.additionalItem4=name;
        this.additionalPrice4=price;
    }

    public int burgurePrice()
    {

        int price=this.hamburguerPrice;
        System.out.println(this.name +" hamburguer on a "+this.breadRoleType + " role with "+ this.meat+", price is "+ this.hamburguerPrice);

        if (this.additionalItem1 !=  null){
            price+=this.additionalPrice1;
            System.out.println("Added "+this.additionalItem1 + " for an extra " +this.additionalPrice1);
        }

        if (this.additionalItem2 !=  null){
            price+=this.additionalPrice2;
            System.out.println("Added "+this.additionalItem2 + " for an extra " +this.additionalPrice2);
        }

        if (this.additionalItem3 !=  null){
            price+=this.additionalPrice3;
            System.out.println("Added "+this.additionalItem3 + " for an extra " +this.additionalPrice3);
        }

        if (this.additionalItem4 !=  null){
            price+=this.additionalPrice4;
            System.out.println("Added "+this.additionalItem4 + " for an extra " +this.additionalPrice4);
        }

        return price;
    }
}
