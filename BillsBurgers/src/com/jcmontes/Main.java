package com.jcmontes;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hamburger julio = new Hamburger("Regular", "Sourdough", "Beef");
        julio.mealDetails();

        System.out.println(julio.setAdditions());
        julio.mealDetails();
//
//        HealthyBurger test = new HealthyBurger("Regular", "Chicken", 7);
//        test.setAdditions();
    }
}
