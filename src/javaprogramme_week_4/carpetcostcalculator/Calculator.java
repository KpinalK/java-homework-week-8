package javaprogramme_week_4.carpetcostcalculator;

/**
 * Write a class with the name Carpet. The class needs one field (instance variable) with name cost of
 * type double.
 * The class needs to have one constructor with parameter cost of type double and it needs to initialize
 * the field.
 * In case the cost parameter is less than 0 it needs to set the cost field value to 0.
 * Write the following methods (instance methods):
 * ●  Method named getCost without any parameters, it needs to return the value of cost field
 */

public class Calculator {

    //instance variable
    Floor floor;
    Carpet carpet;

    //Constructor with parameter
    public Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }

    //Create instance method
    public double getTotalCost(){
        return floor.getArea() * carpet.getCost(); // total cost =  area of the floor * cost of the carpet
    }
}
