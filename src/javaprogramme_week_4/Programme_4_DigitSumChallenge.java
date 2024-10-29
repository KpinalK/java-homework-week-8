package javaprogramme_week_4;

/**
 * Write a method with the name sumDigits that has one int parameter called number.
 * If the parameter is >= 10 then the method should process the number and return sum of all digits,
 * otherwise return -1 to indicate an invalid value.
 * The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
 * negative numbers, so also return -1 for negative numbers.
 * For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
 * Calling the method sumDigits(1) should return -1 as per requirements described above.
 * Add some code to the main method to test out the sumDigits method to determine that it is working
 * correctly for valid and invalid values passed as arguments.
 * Hint:
 * Use n % 10 to extract the least-significant digit.
 * Use n = n / 10 to discard the least-significant digit.
 * The method needs to be static
 * Create a class with the name DigitSumChallenge.
 */

public class Programme_4_DigitSumChallenge {

    public static void main(String[] args) {
        //Calling instance method into main method creating object
        Programme_4_DigitSumChallenge obj = new Programme_4_DigitSumChallenge();
        obj.method1();
    }

    //Creating instance method
    public void method1(){
        //Testing the sumDigit method with various values
        System.out.println("sumDigits(125) : " + sumDigits(125)); //Expected output: 8
        System.out.println("sumDigits(1) : " + sumDigits(1)); //Expected output: -1
        System.out.println("sumDigits(255) : " + sumDigits(255)); //Expected output: 12
        System.out.println("sumDigits(-10) : " + sumDigits(-10)); //Expected output: -1
        System.out.println("sumDigits(1966) : " + sumDigits(1966)); //Expected output: 22
        System.out.println("sumDigits(2) : " + sumDigits(2)); //Expected output: -1
        System.out.println("sumDigits(-50) : " + sumDigits(-50)); //Expected output: -1
        System.out.println("sumDigits(0) : " + sumDigits(0)); //Expected output: -1
    }


    //Static method to sum digit of a number
    public static int sumDigits(int number) {
        // Return -1 for invalid input (single digit or negative)
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        //Process the number and sum its digit
        while (number > 0) {
            sum += number % 10; //Add the least-significant digit
            number = number / 10; //Discard the list-significant digit

        }
        return sum; //Return the sum of the digit
    }
}
