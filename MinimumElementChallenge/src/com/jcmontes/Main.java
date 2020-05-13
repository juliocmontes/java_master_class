package com.jcmontes;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        System.out.println("Enter a number.\r");
//        int count = scanner.nextInt();
//
//        int[] returnedRead = readIntegers(count);
//
//        System.out.println(findMin(returnedRead));

        int[] array = {10,11,53,66,24,64,73};
        reverse(array);

    }

    public static int[] readIntegers(int count){
        System.out.println("Please enter " + count + " number(s).\r");
        int[] inputtedIntegers = new int[count];
        for (int i = 0; i < inputtedIntegers.length; i ++){
            inputtedIntegers[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return inputtedIntegers;
    }

    public static int findMin(int[] array){
        for (int i = 0; i < array.length - 1; i++ ){
            for (int j = 0; j < array.length - 1; j++){
                if (array[j] > array[j +1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array:  " + Arrays.toString(array));
        System.out.println("Min is " + array[0]);
        return array[0];
    }

    public static void reverse(int[] arr){
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            reversedArr[i] = arr[arr.length - 1 - i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reversedArr));
    }

}
