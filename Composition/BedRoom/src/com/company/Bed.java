package com.company;

public class Bed {
    private int pillows;
    private int height;
    private  int sheets;
    private  String color;

    public Bed(int pillows, int height, int sheets, String color) {
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.color = color;
    }

    public void bedMake(){
        System.out.println("Bed -> make");
    }
    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public String getColor() {
        return color;
    }
}
