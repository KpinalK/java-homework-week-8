package javaprogramme_week_4;

/**
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */

public class Programme_13_SharedDigit {

    public static void main(String[] args) {
        //Direct calling static method into main method
        digitMethod();

    }

    //Create static method
    public static void digitMethod() {
        //Testing hasSharedDigit method using various value
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(35, 93));
        System.out.println(hasSharedDigit(22, 63));

    }

    //create static method with return type with parameter
    public static boolean hasSharedDigit(int number1, int number2) {
        //Check if both numbers are within the range of 10 to 99
        if (number1 < 10 || number2 > 99 || number2 < 10 || number2 > 99) {
            return false;
        }

        //Extract digit from the first number
        int digit1A = number1 / 10; //Tens place of number1
        int digit1B = number1 % 10; //Units place of number1

        // Extract digits from the second number
        int digit2A = number2 / 10; // Tens place of number2
        int digit2B = number2 % 10; // Units place of number2

        // Check for shared digits
        return (digit1A == digit2A || digit1A == digit2B || digit1B == digit2A || digit1B == digit2B);
    }


}
