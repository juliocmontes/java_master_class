package com.company;

public class Tv {
    private String model;
    private String manufacturer;
    private String resolution;
    private int size;


    public Tv(String model, String manufacturer, String resolution, int size) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.resolution = resolution;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public String getResolution(){
        return resolution;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed.");
    }
}
