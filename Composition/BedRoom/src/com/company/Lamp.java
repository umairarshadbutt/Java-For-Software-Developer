package com.company;

public class Lamp {
    private  String style;
    private  boolean charging;
    private int globalRating;

    public Lamp(String style, boolean charging, int globalRating) {
        this.style = style;
        this.charging = charging;
        this.globalRating = globalRating;
    }

    public void  trunOn(){
        System.out.println("Lamp -> Turn ON");
    }

    public String getStyle() {
        return style;
    }

    public boolean isCharging() {
        return charging;
    }

    public int getGlobalRating() {
        return globalRating;
    }
}
