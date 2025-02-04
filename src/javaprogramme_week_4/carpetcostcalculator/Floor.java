package javaprogramme_week_4.carpetcostcalculator;

/**
 * The Carpet Company has asked you to write an application that calculates the price of carpeting for
 * rectangular rooms. To calculate the price, you multiply the area of the floor (width times length) by
 * the price per square meter of carpet. For example, the area of the floor that is 12 meters long and 10
 * meters wide is 120 square meters. To cover the floor with a carpet that costs $8 per square meter would cost $960.
 *
 * Write a class with the name Floor. The class needs two fields (instance variables) with name width
 * and length of type double.
 * The class needs to have one constructor with parameters width and length of type double and it
 * needs to initialize the fields.
 * In case the width parameter is less than 0 it needs to set the width field value to 0, in case the length
 * parameter is less than 0 it needs to set the length field value to 0.
 * Write the following methods (instance methods):
 * ● Method named getA
 */
public class Floor {
    // Instance variable
    double width;
    double length;

    //Constructor with parameter
    public Floor(double width, double length){
        this.width = (width < 0) ? 0 : width; //Set width to 0 if value less than 0
        this.length = (length < 0) ? 0 : length; ////Set length to 0 if value less than 0
    }

    //Create instance method
    public double getArea(){
        return width * length; //Area = width * length
    }


}
