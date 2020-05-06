public class Hello {

    public static void main(String[] args) {
//        double weightInPounds = 200d;
//        double convertedKilograms = weightInPounds * 0.45359237d;
//        System.out.println("Your weight in pounds " + weightInPounds + " is converted to " + convertedKilograms + " kilograms.;");

//        char myChar = 'J';
//        char myUnicodeChar = '\u004A';
//
//        System.out.println(myChar);
//        System.out.println(myUnicodeChar);

        double firstVar = 20.00;
        double secondVar = 80.00;

        double result = (firstVar + secondVar) * 100;
        double remainder = result % 40.00;

        boolean isRemainderZero = (remainder == 0);
        if (!isRemainderZero){
            System.out.println("Got some remainder");
        }

        System.out.println("The total is: " + result);
        System.out.println("isRemainderZero: " + isRemainderZero);
        System.out.println("The remainder is: " + remainder);

    }
}
