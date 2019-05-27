package com.company;

public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private  Dimensions diemension;

    public Case(String model, String manufacturer, String powerSupply, Dimensions diemension) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.diemension = diemension;
    }

    public  void pressPowerButton(){
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDiemension() {
        return diemension;
    }
}
