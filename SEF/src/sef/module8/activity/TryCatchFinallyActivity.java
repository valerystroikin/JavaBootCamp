package sef.module8.activity;
//Needs to be completed
//The following program, when run, results in an exception.
//1 - Use try catch appropriately to make sure that the exception is caught and a user friendly message is displayed. 

public class TryCatchFinallyActivity {
public static void main(String[] args) {
	TryCatchFinallyActivity obj=new TryCatchFinallyActivity();
	obj.catchMeIfYouCan();
}

void catchMeIfYouCan()
{
	try {
		int [] arr={0,1,2,3,4,5,6,7,8,9};
		System.out.println("Printing array elements:");
		for(int i=0;i<=15;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	catch(ArrayIndexOutOfBoundsException eArray){
		System.out.println("");
		System.out.println("Data error in <Catch block>: Array index fault");
	}
	catch(Exception e) {
		System.out.println("<Catch block> says that something went wrong: other problems");
	}
	finally {
		System.out.println("Executing <Finally Block> code. Check your data and try again. ");
	}
}

}
