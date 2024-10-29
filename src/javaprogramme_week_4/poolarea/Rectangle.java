package javaprogramme_week_4.poolarea;

/**
 * The Swimming Company has asked you to write an application that calculates the volume of cuboid
 * shaped pools.
 * 1. Write a class with the name Rectangle. The class needs two fields (instance variable) with name
 * width and length both of type double.
 * The class needs to have one constructor with parameters width and length both of type double and it
 * needs to initialize the fields.
 * In case the width parameter is less than 0 it needs to set the width field value to 0.
 * In case the length parameter is less than 0 it needs to set the length field value to 0.
 * Write the following methods (instance methods):
 * ●  Method named getWidth without any parameters, it needs to return the value of the width
 * field.
 * ●  Method named getLength without any parameters, it needs to return the value of the length
 * field.
 * ● Method named getArea without any parameters, it needs to return the calculated area
 * (width * length).
 */

public class Rectangle {

    //Instance variable
    double width;
    double length;

    //Constructor with parameter
    public Rectangle(double width, double length){
        this.width = (width < 0) ? 0 : width; //set value 0 if width less than  0
        this.length = (length < 0) ? 0 : length; // set value 0 if length less than 0
    }

    //method to get value of width
    public double getWidth(){
        return width;
    }

    //method to get value of length
    public double getLength(){
        return length;
    }

    //Method to calculate area
    public double getArea(){
        return width * length;
    }

}
