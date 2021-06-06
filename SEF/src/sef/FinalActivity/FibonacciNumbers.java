package sef.FinalActivity;
import sef.module8.activity.CustomExceptionActivity;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String args[]) throws FibonacciCustomException {
        // crate variables
        int number1=0;
        int number2=1;
        int number3;
        int i;
        int count;

        // Print header

        System.out.println("*******************************************************");
        System.out.println("*               FIBONACCI GENERATOR                   *");
        System.out.println("*                      V.1.0                          *");
        System.out.println("*******************************************************");
        System.out.println();
        System.out.println("---------Welcome to Fibonacci Series generator!--------");
        System.out.println();


        try{
            Scanner input = new Scanner(System.in);
            System.out.print("How many numbers do you want (not less than 2): ");
            count = input.nextInt();
            if (count<2) {
                throw new FibonacciCustomException();  //wrong input exception
            }

            System.out.print(number1+" "+number2);  // printing first two numbers 0 and 1
            for(i=2;i<count;++i) {
                number3 = number1 + number2;               // calculating and printing the rest of the numbers
                System.out.print(" " + number3);
                number1 = number2;
                number2 = number3;
            }
        }
        catch(FibonacciCustomException fc){
            System.out.println(fc.getMessage());
        }
        catch(InputMismatchException im){
            System.out.println("Your input is not a number.");
        }
        finally {
            System.out.println("");
            System.out.println("**************");
            System.out.println("Thank you for using our program!");
        }
    }
}
