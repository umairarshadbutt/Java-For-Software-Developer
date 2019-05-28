package com.company;

class Car{
    private String name;
    private  int wheels;
    private  int cylinders;
    private boolean engine;

    public Car(String name, int cylinders) {
        this.name = name;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.engine = true;
    }

    public String startEngine(){
        return  "Car -> startEngine()";
    }

    public String accelerate(){
        return "Car -> accelerate()";
    }

    public String brake(){
        return "Car -> brake()";
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    public boolean isEngine() {
        return engine;
    }
}

class Ford extends Car{
    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return  "Ford -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ford -> brake()";
    }
}

class  Mitsubishi extends Car{
    public Mitsubishi(String name, int cylinders) {
        super(name, cylinders);
    }

    public String startEngine() {
        return  "Misubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Misubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Misubishi -> brake()";
    }
}

class Holden extends Car{
    public Holden(String name, int cylinders) {
        super(name, cylinders);
    }

    public String startEngine() {
        return  getClass().getSimpleName()+"Holden -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName()+"Holden -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+"Holden -> brake()";
    }
}

public class Main {

    public static void main(String[] args) {
        Car car=new Car("Base Car", 4);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi=new Mitsubishi("XYZ", 4);
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford=new Ford("ABC", 4);
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
    }
}
