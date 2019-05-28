package com.company;

public class Main {

    public static void main(String[] args) {
        Printer printer= new Printer(20,787,true);
        System.out.println(printer.getPrintedPages());
        printer.fillToner(1500);
        printer.printPages(12);
        System.out.println(printer.getPrintedPages());
    }
}
