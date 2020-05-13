package com.jcmontes;


class Ford extends Car {

    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Ford -> Start Engine";
    }

    @Override
    public String accelerate() {
        return "Ford -> Accelerate";
    }

    @Override
    public String brake() {
        return "Ford -> Brake";
    }
}



