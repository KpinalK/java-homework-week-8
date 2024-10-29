package javaprogramme_week_4;

/**
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE: The method getEvenDigitSum should be defined as public static
 */

public class Programme_11_EvenDigitSum {

    public static void main(String[] args) {
    //Calling instance method into main method via creating object
        Programme_11_EvenDigitSum obj = new Programme_11_EvenDigitSum();
        obj.method1();
    }

    //Create a instance method
    public void method1(){
        //Testing the getEvenDigitSum method with various values
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
        System.out.println(getEvenDigitSum(15698));
    }

    //create static method
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1; //return-1 for negative numbers
        }
        //Initialize the sum of even digit
        int sum = 0;
        while (number > 0) {
            int digit = number % 10; //get the last digit
            if (digit % 2 == 0) { // check if digit is even
                sum += digit; //add it to the sum
            }
            number /= 10; //Remove the last digit
        }
        return sum; // Return the total sum of even digits
    }
}
