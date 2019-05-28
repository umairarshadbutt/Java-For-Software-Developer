package com.company;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Chairs chairs= new Chairs(3,"wheat");
        Lamp lamp=new Lamp("Tomb",1,4.5);
        Ceiling ceiling=new Ceiling(9,"wheat");
        Wall wall1= new Wall("green","right");
        Wall wall2= new Wall("yellow","left");
        Wall wall3= new Wall("Red","front");
        Wall wall4= new Wall("white", "back");
        Bed bed= new Bed(3,2,1,"Brown");

        Bedroom bedroom= new Bedroom("Umair",lamp,chairs,ceiling,wall1,wall2,wall3,wall4,bed);

        bedroom.getLamp().trunOn();
        bedroom.makeBedroom();

    }
}
