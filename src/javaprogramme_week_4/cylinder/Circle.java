package javaprogramme_week_4.cylinder;

/**
 * Write a class with the name Circle. The class needs one field (instance variable) with name radius
 * of type double.
 * The class needs to have one constructor with parameter radius of type double and it needs to initialize
 * the fields.
 * In case the radius parameter is less than 0 it needs to set the radius field value to 0.
 * Write the following methods (instance methods):
 * ● Method named getRadius without any parameters, it needs to return the value of the radius
 * field.
 * ●  Method named getArea without any parameters, it needs to return the calculated area
 * (radius * radius * PI). For PI use Math.PI constant.
 */

public class Circle {

    //instance variable
    double radius;

    //constructor with parameter
    public Circle(double radius) {
        this.radius = (radius < 0) ? 0 : radius; //set value 0 if value is less than 0
    }

    //Method to get value of radius field
    public double getRadius() {
        return radius;
    }

    //Method to calculate area
    public double getArea() {
        return radius * radius * Math.PI;
    }
}
