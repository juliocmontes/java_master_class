package com.company;

import java.nio.channels.Pipe;

public class Point {
    private int x;
    private int y;

    public Point(){

    }


    public Point(int x, int y){
        setX(x);
        setY(y);
    }

    public double distance(){
        int x1 = 0;
        int y1 = 0;
        return Math.sqrt(((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y)));
    }

    public double distance(int x, int y){
//        return distance between this point and Point (x,y);
        int x1 = getX();
        int y1 = getY();
        return Math.sqrt(((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y)));
    }

    public double distance(Point test){
        return Math.sqrt(((test.getX() - this.x) * (test.getX() - this.x) + (test.getY() - this.y) * (test.getY() - this.y)));
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
