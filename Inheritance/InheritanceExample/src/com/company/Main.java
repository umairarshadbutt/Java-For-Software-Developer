package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal=new Animal("Animal", 1,1,5,5);

        Dog dog= new Dog("Tommy",3,6,2,4,1,20,"Long Silky");
        dog.eat();
        //dog.walk();

        dog.run();
    }
}
