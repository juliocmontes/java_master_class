package com.jcmontes;

import java.util.Scanner;

public class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private int additions = 4;
    private double price;
    int lettuceCount = 0;
    int tomatoCount = 0;
    int grilledOnionCount = 0;
    int cheeseCount = 0;
    int pickleCount = 0;

    public Hamburger(String name, String breadRollType, String meat) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = 6;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public void mealDetails(){
        System.out.println(name);
        System.out.println("Base Price " + String.format("$%,.2f", this.price));

    }

    public double setAdditions(){
        System.out.println("Please select up to four additions: ");
        double lettuce = .50;
        double tomato = .50;
        double grilledOnions = .80;
        double cheese = .75;
        double pickles = .50;

        System.out.println("1:Lettuce   2.Tomato   3.Grilled Onions   4.Cheese   5.Pickles");
        
        while (this.additions > 0){
            Scanner userInput = new Scanner(System.in);
            int userSelection = userInput.nextInt();

            switch (userSelection){
                case 1 :
                    System.out.println(" + Lettuce " + String.format("$%,.2f",lettuce));
                    this.price += lettuce;
                    lettuceCount += 1;
                    break;
                case 2:
                    System.out.println(" + Tomato " + String.format("$%,.2f",tomato));
                    this.price += tomato;
                    tomatoCount += 1;
                    break;
                case 3:
                    System.out.println("+ Grilled Onions " + String.format("$%,.2f",grilledOnions));
                    this.price += grilledOnions;
                    grilledOnionCount += 1;
                    break;
                case 4:
                    System.out.println("+ Cheese " + String.format("$%,.2f", cheese));
                    this.price += cheese;
                    cheeseCount += 1;
                    break;
                case 5:
                    System.out.println(" + Pickles" + String.format("$%,.2f",pickles));
                    this.price += pickles;
                    pickleCount += 1;
                    break;
                default:
                    System.out.println("Invalid Value");
                    break;
            }
            this.additions -= 1;
        }
        return price;
    }

}
