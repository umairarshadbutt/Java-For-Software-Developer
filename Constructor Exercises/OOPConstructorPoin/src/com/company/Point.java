package com.company;

public class Point {
    private  int x;
    private  int y;

    Point(){}

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(){
        //System.out.println(Math.sqrt(((this.getX()-0)*(this.getX()-0))+((this.getY()-0)*(this.getY()-0))));
        double dist= (double) Math.sqrt(((this.getX()-0)*(this.getX()-0))+((this.getY()-0)*(this.getY()-0)));
        return dist;
    }

    public int distance(int x, int y){
        System.out.println(Math.sqrt(((this.getX()-x)*(this.getX()-x))+((this.getY()-y)*(this.getY()-y))));
        int dist= (int) Math.sqrt(((this.getX()-x)*(this.getX()-x))+((this.getY()-y)*(this.getY()-y)));
        return dist;
    }

    public int distance(Point obj){
        int dist= (int) Math.sqrt(((this.getX()-obj.x)*(this.getX()-obj.x))+((this.getY()-obj.y)*(this.getY()-obj.y)));
        return dist;
    }



}
