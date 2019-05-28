package com.company;

public class Main {

    public static void main(String[] args) {
        Player player= new Player();
        player.name= "umair";
        player.health=20;
        player.weapon="Knife";

        int damage=10;
        player.loseHealth(damage);
        System.out.println("Remaining health= "+player.healthRemaining());

        System.out.println();
        damage=11;
        player.loseHealth(damage);
        System.out.println("Remaining health= "+player.healthRemaining());
    }
}
