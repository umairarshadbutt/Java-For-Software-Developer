package com.company;

public class Wall {
    private double width;
    private  double height;



    Wall(){
        this(0,0);
    }
    public Wall(double width, double height) {
        if (width <0){
            this.width=0;
        }else {
            this.width = width;
        }
        if (height <0){
            this.height = 0;
        } else
        {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <0){
            this.width=0;
        }else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if (height <0){
            this.height = 0;
        } else
        {
            this.height = height;
        }
    }

    public double getArea(){
        return (this.height * this.width);
    }
}
