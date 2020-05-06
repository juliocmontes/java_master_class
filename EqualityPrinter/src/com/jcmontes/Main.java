package com.jcmontes;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        printEqual(1,1,1);
//        printEqual(1,1,2);
//        printEqual(-1,-1,-1);
//        printEqual(1,2,3);
//        printEqual(2,1,1);

        displayMessage('A');
        displayMessage('E');

//        System.out.println(isCatPlaying(true, 10));
//        System.out.println(isCatPlaying(false, 36));
//        System.out.println(isCatPlaying(false, 35));
    }

    public static void printEqual(int num1, int num2, int num3){
        if (num1 < 0 || num2 < 0 || num3 < 0){
            System.out.println("Invalid Value");
        } else if (num1 == num2 && num1 == num3){
            System.out.println("All numbers are equal");
        } else if (num1 != num2 && num1 != num3 && num2 != num3){
            System.out.println("All numbers are different");
        } else
            System.out.println("Neither all are equal or different");
    }

    public static boolean isCatPlaying(boolean summer, int temperature ){
        if (!summer && temperature >= 25 && temperature <= 35) {
            return true;
        }
        else return summer && (temperature >= 25 && temperature <= 45);
    }

    public static void displayMessage(char letter){

        switch (letter){
            case 'A':
                System.out.println("Value is A");
                break;

                case 'B':
                System.out.println("Value is B");
                break;

                case 'C':
                System.out.println("Value is C");
                break;

                case 'D':
                System.out.println("Value is D");
                break;

            default:
                System.out.println("Message not found");
        }
    }
}
