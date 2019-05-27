package com.company;

import com.company.Animal;

public class Dog extends Animal {

    private  int eye;
    private int legs;
    private int tail;
    private  int teeth;
    private  String coat;
    public Dog(String name,  int size, int weight, int eye, int legs, int tail, int teeth, String coat) {
        super(name, 1,1, size, weight);
        //super is used inside a sub-class method definition to call a method defined in the super class

        this.eye=eye;
        this.legs=legs;
        this.tail=tail;
        this.teeth=teeth;
        this.coat=coat;
    }

    public void chew(){
        System.out.println("Dog.chew() is called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() is called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        move(5);
    }

    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }

    public void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
