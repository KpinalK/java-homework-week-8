package javaprogramme_week_4;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */
public class Programme_6_TriangleWithNumber {

    public static void main(String[] args) {
        //calling instance method into main method by creating object
        Programme_6_TriangleWithNumber obj = new Programme_6_TriangleWithNumber();
        obj.triangle();

    }

    //Create a instance method
    public void triangle() {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);

        //Prompt user to enter the number of rows
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        //create the triangle pattern
        for (int i = 1; i <= rows; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print(a); //Print numbers from 1 to i
            }
            System.out.println(); // Move to the next line after each row
        }

        //Closing the scanner object
        scanner.close();
    }

}
