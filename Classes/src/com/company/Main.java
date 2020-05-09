package com.company;

public class Main {

    public static void main(String[] args) {

//        BankAccount myAccount = new BankAccount();
//        myAccount.withdraw(100);
//        myAccount.deposit(50);
//        myAccount.withdraw(100);
//        myAccount.deposit(51);
//        myAccount.withdraw(100);
//        Wall wall = new Wall(5, 4);
//        System.out.println("area= " + wall.getArea());
//        System.out.println(wall.getHeight());
//        wall.setHeight(-1.5);
//        System.out.println(wall.getHeight());
//        System.out.println("width= " + wall.getWidth());
//        System.out.println("height= " + wall.getHeight());
//        System.out.println("area= " + wall.getArea());
//        Point first = new Point(6, 5);
//        Point second = new Point(3, 1);
//        System.out.println("distance(0,0)= " + first.distance());
//        System.out.println("distance(second)= " + first.distance(second));
//        System.out.println("distance(2,2)= " + first.distance(2, 2));
//        Point point = new Point();
//        System.out.println("distance()= " + point.distance());

//
//        Floor test = new Floor(5, 5);
//        System.out.println(test.getArea());
//        Floor test2 = new Floor(0, -1);
//        System.out.println(test2.getArea());
//
//        Carpet carpet = new Carpet(3.5);
//        Floor floor = new Floor(2.75, 4.0);
//        Calculator calculator = new Calculator(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());
//        carpet = new Carpet(1.5);
//        floor = new Floor(5.4, 4.5);
//        calculator = new Calculator(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());


        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());



    }
}
