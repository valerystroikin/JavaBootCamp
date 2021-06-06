package sef.FinalActivity;

// Human_I is an interface
// Person_A is an abstract class that implements interface Human_I
// Employee_A is a class that extends Person_A
// Studen_A is a class that extends Person_A

abstract class Person_A implements Human_I {
public void introduce(){
    System.out.println("I am only human");
}
}
