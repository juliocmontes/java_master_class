package com.company;

import java.util.StringTokenizer;

public class Vehicle {
    private String name;
    private String size;
    private String type;


    public Vehicle(String name, String size){
      this(name, size, "");
    }

    public Vehicle(String name, String size, String type){
        this.name = name;
        this.size = size;
        this.size = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
