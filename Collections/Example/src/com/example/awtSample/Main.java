package com.example.awtSample;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Cinipex", 12, 15);
      //  theatre.getSeats();
        if(theatre.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
        if(theatre.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
    }
}
