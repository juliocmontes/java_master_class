package com.company;

public class Wall {
    private double width;
    private double height;

    public Wall() {
        System.out.println("First Constructor");
    }

    public Wall(double width, double height){
            setHeight(height);
            setWidth(width);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0){
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0){
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea(){
        return (getWidth() * getHeight());
    }

};
