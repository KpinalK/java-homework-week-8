package javaprogramme_week_4;

import java.util.Scanner;

/**
 * Read 10 numbers from the console entered by the user and print the sum of those numbers.
 * Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read 10 numbers.
 * Use the nextInt() method to get the number and add it to the sum.
 * Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 * For example, the first message printed to the user would be Enter number #1:, the next Enter number
 * #2:, and so on.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * -Create a class with the name ReadingUserInputChallenge.
 */

public class Programme_1_ReadingUserInputChallenge {

    public static void main(String[] args) {
        // calling instance method into main method by creating object
        Programme_1_ReadingUserInputChallenge obj = new Programme_1_ReadingUserInputChallenge();
        obj.sum();


    }

    //Creating instance method
    public void sum() {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);

        int count = 0; //to count valid number
        int sum = 0; // to store  the sum of valid numbers

        while (count < 10) {
            System.out.print("Enter number #" + (count + 1) + " :"); //Prompt user to enter number
            // Check if the next input is an integer
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number; //Add the valid number to the sum
                count++; //Increment the count of valid numbers

            } else {
                System.out.println("Invalid Number");
                scanner.next(); // consume the valid input
            }
        }
        System.out.println("Sum of the numbers: " + sum);

        //closing the scanner object
        scanner.close();
    }

}
