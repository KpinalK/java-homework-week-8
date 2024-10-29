package javaprogramme_week_4;

import java.util.Scanner;

/**
 * Write a Java program that takes the user to provide a single character from the alphabet.
 * Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */

public class Programme_3_InputSingleCharacter {

    public static void main(String[] args) {
        //Calling instance method into static method by creating object
        Programme_3_InputSingleCharacter obj = new Programme_3_InputSingleCharacter();
        obj.alphabet();

    }

    //create instance method
    public void alphabet() {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an alphabet");
        String input = scanner.nextLine();

        //Check if the input is a single character and a letter
        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Error: Please enter a single letter(a-z or A-Z).");
        } else {
            char letter = input.charAt(0); //get the character

            //Determine if the character is a vowel or consonant
            if ("AEIOUaeiou".indexOf(letter) != -1) {
                System.out.println("Input letter is vowel");
            } else {
                System.out.println("Input letter is consonant");
            }
        }
        //Closing the scanner object
        scanner.close();
    }
}
