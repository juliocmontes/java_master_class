package com.company;

public class Calculator {
    private Floor floor;
    private  Carpet carpet;

    public Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
//        carpet is $8 per square meeter , 8 x area
        return this.floor.getArea() * this.carpet.getCost();
    }
}
