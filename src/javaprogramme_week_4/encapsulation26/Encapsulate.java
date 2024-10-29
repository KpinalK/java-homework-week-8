package javaprogramme_week_4.encapsulation26;

public class Encapsulate {

    //Private variables declared these can only be accessed by public methods of class

    private String name;
    private int rollNo;
    private int age;

    //get method for name to access private variable name
    public String getName(){
        return name;
    }

    //Set method for name to access private variable name
    public void setName(String name){
        this.name =name;
    }

    //Get method for roll to access private variable rollno
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }

    //Get method for age to access private variable age
    public int getAge(){
        return age;
    }

    //Set method for age to access private variable age
    public void setAge(int age){
        this.age = age;
    }
}
