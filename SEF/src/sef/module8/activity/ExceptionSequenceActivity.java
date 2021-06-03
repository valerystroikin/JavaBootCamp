package sef.module8.activity;
//Needs to be completed
//1 - Find out the error in this program and share your finding with the instructor
public class ExceptionSequenceActivity {

	public static void main(String[] args) {
		new ExceptionSequenceActivity().divide(25,0);
	}

	void divide(int num1, int num2) {
		try {
			System.out.println(num1 + "/" + num2 + " = " + num1 / num2);
		} catch (ArithmeticException eAr) {
			System.out.println("Data error occured: division by zero is not allowed");
			System.out.println("Details:");
			System.out.println("Num1 = " + num1 + ";");
			System.out.println("Num2 = " + num2 + ";");
		}
	}
}
