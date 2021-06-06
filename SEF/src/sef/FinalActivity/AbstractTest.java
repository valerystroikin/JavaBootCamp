package sef.FinalActivity;

// This is a SIMPLE example of working with abstractions and interfaces (Bonus activity 1)

// Human_I is an interface
// Person_A is an abstract class that implements interface Human_I
// Employee_A is a class that extends Person_A
// Student_A is a class that extends Person_A

public class AbstractTest {
    public static void main(String arg[]){
        Human_I obj1 = new Employee_A("John Doe");
        Human_I obj2 = new Employee_A();

        Human_I obj3 = new Student_A("Amie Brown");
        Human_I obj4 = new Student_A();

        obj1.introduce();
        obj2.introduce();
        obj3.introduce();
        obj4.introduce();

        obj2.setName("Robert Smith");
        obj4.setName("Elon Musk");

        System.out.println("");

        obj1.introduce();
        obj2.introduce();
        obj3.introduce();
        obj4.introduce();
    }
}
