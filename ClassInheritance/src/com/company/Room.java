package com.company;

public class Room {
    private Couch theCouch;
    private Tv tv;
    private String name;
    private String color;


    public Room(Couch theCouch, Tv tv, String name, String color) {
        this.theCouch = theCouch;
        this.tv = tv;
        this.name = name;
        this.color = color;
    }

    public Couch getTheCouch() {
        return theCouch;
    }

    public Tv getTv() {
        return tv;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void turnOnLights(){
        System.out.println("Lights On");
        tv.pressPowerButton();
    }

}
