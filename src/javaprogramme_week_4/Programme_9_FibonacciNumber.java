package javaprogramme_week_4;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

public class Programme_9_FibonacciNumber {

    public static void main(String[] args) {
        //Direct calling static method into main method
        fibonacciNumber();
    }

    //create static method
    public static void fibonacciNumber() {
        int count = 8; //Numbers of Fibonacci numbers to print
        int a = 1;
        int b = 1;

        //Print the first two fibonacci numbers
        System.out.print(a + " " + b);

        //Calculate next fibonacci number
        for (int i = 3; i <= count; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b; //update a to the last fibonacci number
            b = next; //update b to the new fibonacci number
        }

    }
}
