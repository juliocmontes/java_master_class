package com.company;

public class Main {

    public static void main(String[] args) {
        Tv theTV = new Tv("S90000", "Samsung", "4K", 65);
        Couch theCouch = new Couch("Sectional", "Gray", "Used");


        Room livingRoom = new Room(theCouch, theTV, "Living Room", "beige");
        livingRoom.getTv().pressPowerButton();

        System.out.println(livingRoom.getTheCouch().getColor());
        livingRoom.getTheCouch().setColor("Navy");
        System.out.println(livingRoom.getTheCouch().getColor());
        livingRoom.turnOnLights();


    }
}