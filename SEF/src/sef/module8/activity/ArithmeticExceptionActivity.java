package sef.module8.activity;
// Needs to be completed
public class ArithmeticExceptionActivity {
	//1 - Type main method and call catchMe with 10 and 0
	public static void main(String[] args){
		ArithmeticExceptionActivity obj = new ArithmeticExceptionActivity();
		catchMe(10,0);
		//catchMe(10,2);
	}

static void catchMe(int num1, int num2)
{
	//The following code results in an Exception.
	//2 - Identify the exception and write code to handle this exception.
	try{
		int result=num1/num2;
		System.out.println("The result is: " + num1 + "/"+ num2 + " = " + result);
	}
	catch(ArithmeticException eAr){
		System.out.println("Data error occurred: division by zero is not allowed in your country");
		System.out.println("Details:");
		System.out.println("Num1 = " + num1 + ";");
		System.out.println("Num2 = " + num2 + ";");
		System.out.println("The result cannot be calculated.");
	}
	//3 - After handling the exception, write a finally block which
	//prints a message "Thank you for using this program."
	finally {
		System.out.println("***********");
		System.out.println("Thank you for using this program.");
		System.out.println("Should you have any questions, please call 1-800-BUG-FREE");
	}

	//4- try to call catchMe with 10 and 2 now and see which messages get printed.

}

}
