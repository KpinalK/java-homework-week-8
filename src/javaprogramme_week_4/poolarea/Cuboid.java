package javaprogramme_week_4.poolarea;

/**
 * Write a class with the name Cuboid that extends Rectangle class. The class needs one field
 * (instance variable) with name height of type double.
 * The class needs to have one constructor with three parameters width, length, and height all of type
 * double. It needs to call the parent constructor and initialize a height field.
 * In case the height parameter is less than 0 it needs to set the height field value to 0.
 * Write the following methods (instance methods):
 * ● Method named getHeight without any parameters, it needs to return the value of height
 * field.
 * ● Method named getVolume without any parameters, it needs to return the calculated volume.
 * To calculate volume, multiply the area with height.
 */

public class Cuboid extends Rectangle {

    //Instance variable
    double height;

    //Constructor with parameter
    public Cuboid(double width, double length, double height){
        super(width, length);
        this.height = (height < 0) ? 0 : height; //set height value 0 if height less than 0
    }

    //Method to get value of height
    public double getHeight(){
        return height;
    }

    //Method to calculate volume
    public double getVolume(){
        return getArea() * height;
    }
}
