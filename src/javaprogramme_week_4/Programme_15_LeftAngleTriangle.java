package javaprogramme_week_4;

/**
 * Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */
public class Programme_15_LeftAngleTriangle {

    public static void main(String[] args) {
        //Directly calling static method into main method
        triangle();
    }

    //Create static method
    public static void triangle() {
        int rows = 5; // Number of rows for triangle

        //Loop for each row
        for (int i = 1; i <= rows; i++) {
            // Loop to print '*' for each column in the row
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Print '*' followed by a space
            }
            System.out.println(); //Move to the next line after each row
        }

    }
}
