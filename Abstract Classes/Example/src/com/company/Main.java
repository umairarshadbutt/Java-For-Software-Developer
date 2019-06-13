package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog= new Dog("Tommy");
        dog.breath();
        dog.eat();

        Parrot parrot = new Parrot("Parrot");
        parrot.breath();
        parrot.eat();
        parrot.fly();
    }
}
