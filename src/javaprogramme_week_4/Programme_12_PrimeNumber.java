package javaprogramme_week_4;

import java.util.Scanner;

/**
 * Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */

public class Programme_12_PrimeNumber {

    public static void main(String[] args) {
        //Calling instance method into main method by creating object
        Programme_12_PrimeNumber obj = new Programme_12_PrimeNumber();
        obj.m1();

    }

    // create instance method
    public void m1() {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        //Prompt user to enter number
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        //closing the scanner object
        scanner.close();
    }

    //create a static method with return type with parameter
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; //Number less than or equal to one are not prime number
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If divisible by any number other than 1 and itself
            }
        }
        return true; //If no divisors found, it's prime
    }
}
