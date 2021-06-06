package sef.FinalActivity;

// Human_I is an interface
// Person_A is an abstract class that implements interface Human_I
// Employee_A is a class that extends Person_A
// Student_A is a class that extends Person_A

public class Employee_A extends Person_A{
    private String name;

    //Behavior - default constructor.
    public Employee_A()  {
        name = "unknown";
    }
    // Parameterized constructor
    public Employee_A(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void introduce(){
        System.out.println("I am an Employee and my name is "+this.getName());
    }

}
