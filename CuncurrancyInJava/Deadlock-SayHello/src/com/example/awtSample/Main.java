package com.example.awtSample;

public class Main {

    public static void main(String[] args) {
        final PolitePerson umair = new PolitePerson("Umair");
        final PolitePerson adeel = new PolitePerson("Adeel");

        new Thread(new Runnable() {
            @Override
            public void run() {
                umair.sayHello(adeel);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                adeel.sayHello(umair);
            }
        }).start();
    }

    static class PolitePerson {
        private final String name;

        public PolitePerson(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public synchronized void sayHello(PolitePerson person) {
            System.out.format("%s: %s" + "has said hello to me! %n", this.name, person.getName());
            person.sayHello(this);
        }

        public synchronized void sayHelloBack(PolitePerson person) {
            System.out.format("%s:%s" + " has said hello back to me!%n", this.name, person.getName());
        }
    }
}
