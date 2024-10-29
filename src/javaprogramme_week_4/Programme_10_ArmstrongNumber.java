package javaprogramme_week_4;

import java.util.Scanner;

/**
 *  Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */

public class Programme_10_ArmstrongNumber {

    public static void main(String[] args) {
      //Direct calling static method into main method
      m1();
    }

    //Create static method
    public static void m1(){
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        //Prompt user to enter number
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)){
            System.out.println(number + " is an Armstrong number.");
        }else{
            System.out.println(number + " is not an Armstrong number.");
        }
        //closing the scanner object
        scanner.close();
    }

    //create static method
    public static boolean isArmstrong(int number){

        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length(); //calculate number of digits

        while (number > 0){
            int digit = number % 10; //Get the last digit
            sum += Math.pow(digit, digits); //Raise the digit to the power of the number of digits and add to sum
            number /= 10; //Remove the last digit
        }
        return sum == originalNumber;// Check if the sum equals the original number
    }
}
