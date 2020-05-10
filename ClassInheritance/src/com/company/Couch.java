package com.company;

public class Couch {
    private String type;
    private String color;
    private String condition;
    public Couch(String type, String color, String condition) {
        this.type = type;
        this.color = color;
        this.condition = condition;

    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getCondition() {
        return condition;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
