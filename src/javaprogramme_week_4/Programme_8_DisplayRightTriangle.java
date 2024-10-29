package javaprogramme_week_4;

/**
 * Display right angle triangle of @ using nested for loops
 *
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */

public class Programme_8_DisplayRightTriangle {

    public static void main(String[] args) {
        //Calling instance method into main method by creating object
        Programme_8_DisplayRightTriangle obj = new Programme_8_DisplayRightTriangle();
        obj.rightTriangle();

    }

    //Create instance method
    public void rightTriangle() {
        int rows = 5;

        //Loop through each row
        for (int i = 1; i <= rows; i++) {
            //Inner loop to print @ symbols
            for (int a = 1; a <= i; a++) {
                System.out.print("@"); //Print @ without a newline
            }
            System.out.println();// Move to the next line after each row
        }

    }
}
