package com.company;

public class Bedroom {
    private Lamp lamp;
    private  Chairs chairs;
    private  Ceiling ceiling;
    private  Wall wall1;
    private  Wall wall2;
    private  Wall wall3;
    private  Wall wall4;
    private  Bed bed;
    private String name;

    public Bedroom(String name, Lamp lamp, Chairs chairs, Ceiling ceiling, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Bed bed) {
        this.name= name;
        this.lamp = lamp;
        this.chairs = chairs;
        this.ceiling = ceiling;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.bed = bed;
    }

    public Lamp getLamp(){
       return this.lamp;
    }

    public void makeBedroom()
    {
        System.out.println("Bedroom ->Making bedroom");
        bed.bedMake();
    }


}
