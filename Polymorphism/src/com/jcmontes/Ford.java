package com.jcmontes;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine(){
        return "Car -> Start Engine";
    }

    public String accelerate(){
        return "Car -> Accelerate";
    }

    public String brake(){
        return "Car -> Brake";
    }
}


class Dodge extends Car {

    public Dodge(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Dodge -> Start Engine";
    }

    @Override
    public String accelerate() {
        return "Dodge -> Accelerate";
    }

    @Override
    public String brake() {
        return "Dodge -> Brake";
    }
}



public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new Car("First Car", 6);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Car dodge = new Dodge("Challenger", 8);
        System.out.println(dodge.startEngine());
        System.out.println(dodge.accelerate());
        System.out.println(dodge.brake());


    }
}
