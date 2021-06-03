package sef.module8.activity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

public class CustomExceptionActivityTest {

	//1 - Type main method and call validateUser() from it.
	//Call this method with different names to test it 
public static void main(String[] args) throws CustomExceptionActivity {

   try{
       System.out.println("Calling method for John");
       validateUser("John");

       System.out.println("Calling method for Shanti");
       validateUser("Shanti");

       System.out.println("Calling method for James");
       validateUser("James");

   }
   catch(CustomExceptionActivity c){
       System.out.println(c.getMessage());
    }
   finally{
       System.out.println("**************");
       System.out.println("Thank you for using our services!");
   }

}

public static void validateUser(String name) throws CustomExceptionActivity {
	//array of names
String []validUsers={"John","Mike","Shanti","Stacie"};
//flag stores 1 if a match is found else it should remain 0 
boolean found; // flag equivalent  (true of false)
found = false;

//2 - Write code to check if parameter name contains a value which is found in validUsers array and change flag's value accordingly
for(int i=0;i<4;i++)
{
    if(validUsers[i] == name) {
        found = true;
        System.out.println("Welcome to Payroll program");
        break;
    }
}

//3 - check if flag is zero, throw CustomExceptionActivity Exception.
//You may also have to declare this exception in the method call using throws.

    if(!found)    throw new CustomExceptionActivity();

//4 - else if flag is one, print a message "Welcome to Payroll program".

}

}
