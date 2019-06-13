package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner= new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
//        Gearbox vehicle = new Gearbox(5);
//        vehicle.operateClutch(true);
//        vehicle.changeGear(1);
//        vehicle.operateClutch(false);
//        System.out.println(vehicle.wheelSpeed(1000));
//        vehicle.changeGear(2);
//        System.out.println(vehicle.wheelSpeed(2000));
//        vehicle.operateClutch(true);
//        vehicle.changeGear(3);
//        vehicle.operateClutch(false);
//        System.out.println(vehicle.wheelSpeed(5000));
//




//        Gearbox.Gear first= vehicle.new Gear(1,13.5);//accessing inner class
//
//       // Gearbox.Gear second= new Gearbox.Gear(2,13.25);
//        //Gearbox.Gear third = new vehicle.Gear(3,53.2);
//
//        System.out.println(first.drivespeed(1000));



//        class ClickLinstener implements Button.OnClickListener{
//            public ClickLinstener(){
//                System.out.println("Ive been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + "was clicked");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickLinstener());


        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + "was clicked");
            }
        });
        listen();
    }

    private static void listen(){
        boolean quit = false;
        while (!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
