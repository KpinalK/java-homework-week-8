package javaprogramme_week_4;

/**
 * Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with
 * names firstNumber and secondNumber both of type double.
 * Write the following methods (instance methods):
 * ● Method named getFirstNumber without any parameters, it needs to return the value of the
 * firstNumber field.
 * ● Method named getSecondNumber without any parameters, it needs to return the value of
 * the secondNumber field.
 * ● Method named setFirstNumber with one parameter of type double, it needs to set the value
 * of the firstNumber field.
 * ● *Method named setSecondNumber with one parameter of type double, it needs to set the
 * value of the secondNumber field.
 * ● Method named getAdditionResult without any parameters, it needs to return the result of
 * adding the field values of firstNumber and secondNumber.
 * ● Method named getSubtractionResult without any parameters, it needs to return the result of
 * subtracting the field values of the secondNumber from the firstNumber.
 * ● Method named getMultiplicationResult without any parameters, it needs to return the result
 * of multiplying the field values of firstNumber and secondNumber.
 * ● Method named getDivisionResult without any parameters, it needs to return the result of
 * dividing the field values of firstNumber by the secondNumber. In case the value of
 * secondNumber is 0 then return 0.
 *
 * TEST EXAMPLE
 * TEST CODE: Write the bellow code into main method
 * SimpleCalculator calculator = new SimpleCalculator();
 * calculator.setFirstNumber(5.0);
 * calculator.setSecondNumber(4);
 * System.out.println("add= " + calculator.getAdditionResult());
 * System.out.println("subtract= " + calculator.getSubtractionResult());
 * calculator.setFirstNumber(5.25);
 * calculator.setSecondNumber(0);
 * System.out.println("multiply= " + calculator.getMultiplicationResult());
 * System.out.println("divide= " + calculator.getDivisionResult());
 * OUTPUT
 * add= 9.0
 * subtract= 1.0
 * multiply= 0.0
 * divide= 0.0
 * TIPS:
 * ● add= 9.0 is printed because 5.0 + 4 is 9.0
 * ● subtract= 1.0 is printed because 5.0 - 4 is 1.0
 * ● multiply= 0.0 is printed because 5.25 * 0 is 0.0
 * ● divide= 0.0 is printed because secondNumber is set to 0
 * NOTE: All methods should be defined as public NOT public static.
 * NOTE: In total, you have to write 8 methods.
 */

public class SumCalculator {

    //Instance variable
    double firstNumber;
    double secondNumber;

    public static void main(String[] args) {
        SumCalculator calculator = new SumCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());

    }

    // Method to get the value of firstNumber
    public double getFirstNumber() {
        return firstNumber; // Return the value of first number
    }

    // Method to get the value of secondNumber
    public double getSecondNumber() {
        return secondNumber; // Return the value of second number
    }

    // Method to set the value of firstNumber
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber; // Set the value of first number
    }

    // Method to set the value of secondNumber
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber; // Set the value of second number
    }

    // Method to get the result of adding firstNumber and secondNumber
    public double getAdditionResult() {
        return firstNumber + secondNumber; // Return the sum
    }

    // Method to get the result of subtracting secondNumber from firstNumber
    public double getSubtractionResult() {
        return firstNumber - secondNumber; // Return the difference
    }

    // Method to get the result of multiplying firstNumber and secondNumber
    public double getMultiplicationResult() {
        return firstNumber * secondNumber; // Return the product
    }

    // Method to get the result of dividing firstNumber by secondNumber
    public double getDivisionResult() {
        if (secondNumber == 0) { // Check if secondNumber is zero
            return 0; // Return 0 if dividing by zero
        }
        return firstNumber / secondNumber;
    }
}
