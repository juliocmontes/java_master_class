//package com.jcmontes;
//
//
//import java.util.Scanner;
//
//public class HealthyBurger extends Hamburger {
//    private int additions = 6;
//
//    public HealthyBurger(String name, String meat, double price) {
//        super(name, "Brown Rye", meat, price);
//    }
//
//    @Override
//    public void setAdditions() {
//        System.out.println("Please select up to six additions: ");
//        int lettuceCount = 0;
//        int tomatoCount = 0;
//        int grilledOnionCount = 0;
//        int cheeseCount = 0;
//        int pickleCount = 0;
//
//        double lettuce = .50;
//        double tomato = .50;
//        double grilledOnions = .80;
//        double cheese = .75;
//        double pickles = .50;
//
//        System.out.println("1:Lettuce   2.Tomato   3.Grilled Onions   4.Cheese   5.Pickles");
//
//        while (this.additions > 0){
//            Scanner userInput = new Scanner(System.in);
//            int userSelection = userInput.nextInt();
//
//            switch (userSelection){
//                case 1 :
//                    System.out.println("Lettuce " + String.format("%,.2f",lettuce));
//                     += lettuce;
//                    lettuceCount += 1;
//                    break;
//                case 2:
//                    System.out.println("Tomato " + String.format("%,.2f",tomato));
//                    this.price += tomato;
//                    tomatoCount += 1;
//                    break;
//                case 3:
//                    System.out.println("Grilled Onions " + String.format("%,.2f",grilledOnions));
//                    this.price += grilledOnions;
//                    grilledOnionCount += 1;
//                    break;
//                case 4:
//                    System.out.println("Cheese " + String.format("%,.2f", cheese));
//                    this.price += cheese;
//                    cheeseCount += 1;
//                    break;
//                case 5:
//                    System.out.println("Pickles" + String.format("%,.2f",pickles));
//                    this.price += pickles;
//                    pickleCount += 1;
//                    break;
//                default:
//                    System.out.println("Invalid Value");
//                    break;
//            }
//            this.additions -= 1;
//        }
//        System.out.println("Total Burger Price is: " + String.format("%,.2f", price));
//
//    }
//}
