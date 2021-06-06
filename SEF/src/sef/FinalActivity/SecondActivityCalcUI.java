package sef.FinalActivity;

import java.util.Scanner;

public class SecondActivityCalcUI  {
    public static void main(String[] args) throws CalcCustomException {
        /*Instantiate Calculator. */
        Calculator myCalc = new Calculator();
        int num1;
        int num2;
        int operation;
        int result;


        System.out.println("*******************************************************");
        System.out.println("*               USER FRIENDLY CALCULATOR              *");
        System.out.println("*                      V.1.0.1                        *");
        System.out.println("*******************************************************");
        System.out.println();
        System.out.println("-Welcome to the world's most user-friendly calculator!-");
        System.out.println("p.s. well, I'm still learning ;-)");
        System.out.println();
        try{
            Scanner input = new Scanner(System.in);
            System.out.print("Enter first int  number: ");
            num1 = input.nextInt();
            System.out.print("Enter second int number: ");
            num2 = input.nextInt();
            System.out.println("Now choose you operation:");
            System.out.println("Enter 1 to add");
            System.out.println("Enter 2 to multiply");
            System.out.println("Enter 3 to divide");
            System.out.println("Enter 4 to subtract");
            System.out.print("What is your choice? -> ");
            operation = input.nextInt();
            System.out.println();

            if (operation<1 || operation >4 ){
                throw new CalcCustomException();
            }

            switch(operation){
                case 1: // add
                    result = myCalc.add(num1,num2);
                    System.out.println(num1+" + "+num2+" = " + result);
                    break;
                case 2: // multiply
                    int[] mul = {num1, num2};
                    result = myCalc.multiply(mul);
                    System.out.println(num1+" * "+num2+" = " + result);
                    break;
                case 3: // divide
                    result = myCalc.divide(num1, num2);
                    System.out.println(num1+" : "+num2+" = " + result);
                    break;
                case 4: //subtract
                    result = myCalc.subtract(num1, num2);
                    if(num2>num1) result = - result;  //adjusting substract() method logic
                    System.out.println(num1+" - "+num2+" = " + result);
                    break;
            }
            System.out.println("");
        }
        catch(CalcCustomException ce){
            System.out.println(ce.getMessage());
            System.out.println("");
        }
        finally{
            System.out.println("Thank you for using our calculator!");
        }
    }
}
