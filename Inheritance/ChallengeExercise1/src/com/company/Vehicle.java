package com.company;

public class Vehicle {
    private  String name;
    private  String size;

    private int currentVelocity;
    private int currentDirectory;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentDirectory=0;
        this.currentVelocity=0;
    }
}
