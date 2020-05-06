package com.jcmontes;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114));

        printConversion(1.5);
        printConversion(0);
        printConversion(10.25);
        printConversion(- 5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            double milePerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + Math.round(milePerHour) + " mi/h");
        }
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
//            1 mile is 1.609 km
            double milesPerHour = kilometersPerHour / 1.609;
            return Math.round(milesPerHour);
        }
    }
}
