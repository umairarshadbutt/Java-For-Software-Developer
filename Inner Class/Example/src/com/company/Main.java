package com.company;

public class Main {

    public static void main(String[] args) {
        Gearbox vehicle = new Gearbox(5);
        vehicle.operateClutch(true);
        vehicle.changeGear(1);
        vehicle.operateClutch(false);
        System.out.println(vehicle.wheelSpeed(1000));
        vehicle.changeGear(2);
        System.out.println(vehicle.wheelSpeed(2000));
        vehicle.operateClutch(true);
        vehicle.changeGear(3);
        vehicle.operateClutch(false);
        System.out.println(vehicle.wheelSpeed(5000));





//        Gearbox.Gear first= vehicle.new Gear(1,13.5);//accessing inner class
//
//       // Gearbox.Gear second= new Gearbox.Gear(2,13.25);
//        //Gearbox.Gear third = new vehicle.Gear(3,53.2);
//
//        System.out.println(first.drivespeed(1000));
    }
}
