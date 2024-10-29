package javaprogramme_week_4;

/**
 * Write a program in Java to display the pattern like a diamond.
 * While loop
 * *
 * ***
 * *****
 * *******
 * *********
 * ***********
 * *************
 * ***********
 * *********
 * *******
 * *****
 * ***
 * *
 */

public class Programme_14_Diamond {

    public static void main(String[] args) {
        //Calling instance method into main method via creating object
        Programme_14_Diamond obj = new Programme_14_Diamond();
        obj.star();
    }

    //Create instance method
    public void star() {
        int n = 13; //Height of the diamond (should be an odd number)

        //Upper part of diamond
        int i = 1;
        while (i <= n) {
            //Print space
            int spaces = (n - i) / 2; //Calculate leading spaces
            int j = 0;
            while (j < spaces) {
                System.out.print(" ");
                j++;
            }

            //Print stars
            int stars = i; // Number of stars in the current row
            j = 0;
            while (j < stars) {
                System.out.print("*");
                j++;
            }
            System.out.println(); // Move to the next line
            i += 2; // Increase i by 2 for the next row

        }

        // lower part of diamond
        i = n - 2; // Start from the row before the middle
        while (i > 0) {
            // Print spaces
            int spaces = (n - i) / 2; // Calculate leading spaces
            int j = 0;
            while (j < spaces) {
                System.out.print(" ");
                j++;
            }
            // Print stars
            int stars = i; // Number of stars in the current row
            j = 0;
            while (j < stars) {
                System.out.print("*");
                j++;
            }
            System.out.println(); // Move to the next line
            i -= 2; // Decrease i by 2 for the next row
        }
    }

}
