package com.company;

public class Delux extends Hamburger {
    public Delux() {
        super("Deluxe", "Sausage & Bacon", 14, "White");
        super.addition1("Chips", 2);
        super.addition2("XYZ", 2);
    }

    @Override
    public void addition1(String name, int price) {
        System.out.println("Cannot not add additional items to a deluxe burger");    }

    @Override
    public void addition2(String name, int price) {
        System.out.println("Cannot not add additional items to a deluxe burger");    }

    @Override
    public void addition3(String name, int price) {
        System.out.println("Cannot not add additional items to a deluxe burger");    }

    @Override
    public void addition4(String name, int price) {
        System.out.println("Cannot not add additional items to a deluxe burger");    }

    @Override
    public int burgurePrice() {
        return super.burgurePrice();
    }
}
