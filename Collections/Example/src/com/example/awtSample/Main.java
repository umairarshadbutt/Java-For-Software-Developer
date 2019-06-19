package com.example.awtSample;

public class Main {

    public static void main(String[] args) {
        Theartre theartre = new Theartre("Cinipex", 8, 15);
        //theartre.getSeats();

        if(theartre.reserveSeat("H10")){
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }

        if(theartre.reserveSeat("H10")){
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
    }
}
