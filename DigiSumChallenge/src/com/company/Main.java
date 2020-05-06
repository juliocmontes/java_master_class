package com.company;

public class Main {

    public static void main(String[] args) {
//        System.out.println(hasSharedDigit(12,23));
//        System.out.println(hasSharedDigit(9,99));
//        System.out.println(hasSharedDigit(15,55));
//        System.out.println(hasSharedDigit(12,13));
//        System.out.println(isValid(10));
//        System.out.println(hasSameLastDigit(22,23,34));
//        System.out.println(hasSameLastDigit(41,22,71));
//        System.out.println(hasSameLastDigit(9,9, 999));
//        System.out.println(getGreatestCommonDivisor(12,30));
//        printFactors(28);
//        System.out.println(isPerfectNumber(28));
//        System.out.println(isPerfectNumber(6));
//        System.out.println(isPerfectNumber(5));
//        System.out.println(isPerfectNumber(-1));

        numberTwoWords(25);
        numberTwoWords(5200);

    }

    public static int reverse(int number){
        int reversedNumber = 0;

        while (number != 0){

            reversedNumber = number % 10;
            number /= 10;
        }

    }

    public static void numberTwoWords(int number){
        if (number < 0){
            System.out.println("invalid Value");
        }

        while (number != 0){
            int extractedInt = number % 10;

            switch (extractedInt){
                case 0 :
                    System.out.println("Zero");
                    break;
                case 1 :
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            number /=10;
        }
    }

    public static boolean isPerfectNumber(int num){
        int runningTotal = 0;

        if (num < 1){
            return false;
        }

        for (int i = 1; i < num; i++){
            if (num % i == 0){
                runningTotal += i;
                if (runningTotal == num){
                    return true;
                }
            }
        }

        return false;
    }
    public static void printFactors(int num){

        if (num < 1){
            System.out.println("Invalid Value");
        }
        for (int i = 1; i <= num; i++){
            if (num % i == 0){
                System.out.println(i);
            }
        }
    }
    public static int getGreatestCommonDivisor(int firstVal, int secondVal){
        int commonDenominator = 0;
        int higherVal = Math.max(firstVal, secondVal);
        if ( firstVal < 10 || secondVal < 10){
            return - 1;
        }

        for (int i = 1; i <= higherVal; i++ ){
            if ((firstVal % i == 0) && (secondVal % i == 0)){
                commonDenominator = i;
            }
        }
        return commonDenominator;
    }
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if (isValid(num1) || isValid(num2) || isValid(num3)){
            return false;
        }

        int lastNum1 = num1 % 10;
        int lastNum2 = num2 % 10;
        int lastNum3 = num3 % 10;

        for (int i = 0; i <=3 ; i++ ){
            if (lastNum1 == lastNum2 && lastNum1 == lastNum3){
                return true;

            } else if(lastNum2 == lastNum3 || lastNum1 == lastNum3){
                return true;
            }
            i++;
        }
        return false;

    }
    public static boolean isValid(int number){
        return (number < 10 || number > 1000);
    }
    public static boolean hasSharedDigit(int numberOne, int numberTwo){
        int lastDigitNum1 = 0;
        int lastDigitNum2 = 0;

        if ((numberOne < 10 || numberOne > 99) || (numberTwo < 10 || numberTwo > 99)) {
            return false;
        }
        while (numberOne > 0){
            lastDigitNum1 = numberOne % 10;
            numberOne /= 10;

            if (lastDigitNum1  == lastDigitNum2 ){
                return true;
            }

            while (numberTwo > 0){
                lastDigitNum2 = numberTwo % 10;
                numberTwo /= 10;

                if (lastDigitNum1 == lastDigitNum2){
                    return true;
                }
            }
        }
        return false;
    }
    public static int sumDigits(int number){
        int sum = 0;

        if (number >= 10){
            while (number != 0){
                sum += number % 10;
                number /= 10;
            }
            return sum;
        }
        return -1;
    }
    public static boolean isPalindrome(int number){
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0){
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10;
            reversedNumber += lastDigit;
            number /= 10;
        }
        return reversedNumber == originalNumber;
    }
    public static int sumFirstAndLastDigit(int number){
        int lastNumber = number % 10;

        if (number < 0){
            return -1;
        } else if (number < 10){
            return number * 2;
        } else {
            while (number >= 10){
                number /= 10;
            }

            int firstNumber = number;
            return firstNumber + lastNumber;
        }
    }
    public static int getEvenDigitSum(int number){
        if (number < 0){
            return - 1;
        } else {
            int sum = 0;

            while (number != 0){
                int evenDigit = number % 10;

                if (evenDigit % 2 == 0){
                    sum += evenDigit;
                }
                number /= 10;
            }
            return sum;
        }
    }

}
