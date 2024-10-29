package javaprogramme_week_4;

/**
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number.
 * The method needs to find the first and the last digit of the parameter number passed to the method,
 * using a loop and return the sum of the first and the last digit of that number.
 * If the number is negative then the method needs to return -1 to indicate an invalid value.
 * Example input/output
 * * sumFirstAndLastDigit(252); →should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
 * * sumFirstAndLastDigit(257); →should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
 * * sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have 1 digit, which
 * gives us 0+0 and the sum is 0.
 * * sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have 1 digit, which
 * gives us 5+5 and the sum is 10.
 * * sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
 * NOTE: The method sumFirstAndLastDigit needs to be defined as public static
 */

public class Programme_7_FirstAndLastDigitSum {

    public static void main(String[] args) {
        // Calling instance method into main method by creating object
        Programme_7_FirstAndLastDigitSum obj = new Programme_7_FirstAndLastDigitSum();
        obj.firstLast();

    }

    //create instance method
    public void firstLast(){
        //Testing sumFirstAndLastDigit method with various values
        System.out.println("sumFirstAndLastDigit(252): " + sumFirstAndLastDigit(252)); //Expected output: 4
        System.out.println("sumFirstAndLastDigit(257): " + sumFirstAndLastDigit(257)); //Expected output: 9
        System.out.println("sumFirstAndLastDigit(0): " + sumFirstAndLastDigit(0)); //Expected output: 0
        System.out.println("sumFirstAndLastDigit(5): " + sumFirstAndLastDigit(5)); //Expected output: 10
        System.out.println("sumFirstAndLastDigit(-10): " + sumFirstAndLastDigit(-10)); //Expected output: -1
        System.out.println("sumFirstAndLastDigit(857): " + sumFirstAndLastDigit(857)); //Expected output: 15
    }

    //Static method to sum the first and last digit of a number
    public static int sumFirstAndLastDigit(int number) {
        //Return -1 for negative numbers
        if (number < 0) {
            return -1;
        }
        //Return 0 where the number is 0
        if (number == 0) {
            return 0;
        }
        //Get the last digit
        int lastDigit = number % 10;

        //Find the first digit
        while (number >= 10) {
            number = number / 10; //Remove the last digit
        }
        int firstDigit = number; //number is the first digit

        //Return sum of first and last digit
        return firstDigit + lastDigit;
    }
}
