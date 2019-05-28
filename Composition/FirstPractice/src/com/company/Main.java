package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions= new Dimensions(20,20, 5);
        Case theCase= new Case("A20", "Dell","240",dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Dell", 27, new Resolution(2451,1550));

        Motherboard theMotherboard= new Motherboard("BJ-200", "Asus", 8,3,"v2.44");
        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        thePC.powerUp();
    }
}
