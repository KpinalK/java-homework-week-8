package javaprogramme_week_4;

import java.util.Scanner;

/**
 * Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */

public class Programme_2_MinAndMaxInputChallenge {

    public static void main(String[] args) {
        //Calling instance method1 into main method by creating object
        Programme_2_MinAndMaxInputChallenge obj = new Programme_2_MinAndMaxInputChallenge();
        obj.method1();

    }

    //Create instance method
    public void method1() {
        //Scanner Declaration for reading input from console
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE; // Initialize min to the largest integer
        int max = Integer.MIN_VALUE; //Initialize min to the largest integer

        while (true) {
            System.out.println("Enter number: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                //update min and max values
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            } else {
                System.out.println("Invalid number");
                break;
            }
        }

        // Print the results only if at least one valid number was entered
        if (min != Integer.MAX_VALUE && max != Integer.MIN_VALUE) {
            System.out.println("Minimum number: " + min);
            System.out.println("Maximum number: " + max);
        } else {
            System.out.println("No valid numbers were entered.");
        }

        // closing the scanner object
        scanner.close();
    }

}
