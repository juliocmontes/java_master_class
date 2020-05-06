package com.jcmontes;

import jdk.swing.interop.SwingInterOpUtils;

import javax.print.DocFlavor;

public class Main {

    public static void main(String[] args) {
//        System.out.println(isPrime(2));
//        System.out.println(isPrime(3));
//        System.out.println(isPrime(5));
//        System.out.println(isPrime(6));
//        System.out.println(isPrime(7));
//        System.out.println(isPrime(9));
//        primeWithinRange(10, 50);
//        sumThreeAndFiveChallenge();
//        System.out.println(isOdd(25));
//        System.out.println(isOdd(22));

//        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(1,100));

    }


    public static void primeWithinRange(int starting, int ending){
        int count = 0;

        for (int i = starting; i < ending; i++){
            if (isPrime(i)){
                count++;
                System.out.println( i + " is prime: " + isPrime(i));
                if (count == 3){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }
    public static boolean isPrime(int number){
        if (number == 1){
            return false;
        }
        for (int i = 2; i <= number/2; i++){
            if (number % i == 0){
                return false;
            }
        } return true;
    }
    public static void sumThreeAndFiveChallenge(){
        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 1000; i++){
            if (i % 3 == 0 && i % 5 == 0){
                count ++;
                System.out.println("found number: " + i);
                sum += i;

                if (count == 5){
                    System.out.println("total" + sum);
                break;
                }
            }
        }
    }
    public static boolean isOdd(int number){
        if (number > 0){
            return number % 2 == 1;
        }
        return false;
    }
    public static int sumOdd(int start, int end){

        if ((start > 0 && end > 0) && (end >= start)){
            int sum = 0;

            for (int i = start; i <= end; i++){
                if (isOdd(i)){
                    sum += i;
                }
            }
            return sum;
        }
        return -1;
    }

    public static boolean isEvenNumber(int number){
        return (number % 2) == 0;
    }

    public static void printEvensRange(int starting, int end){
        while (starting <= end)
    }

}
