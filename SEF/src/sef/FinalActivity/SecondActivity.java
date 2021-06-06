package sef.FinalActivity;

public class SecondActivity {
    public static void main(String[] args) {
        /*Instantiate Normal Calculator. Note that CALC_TYPE_NORMAL is a public static
         *final variable defined in Calculator class.
         */
        Calculator myCalc = new Calculator();


        // Add
        int result = myCalc.add(4, 5);
        System.out.println("1) Add result is " + result);


        // Multiply
        int[] mul = {2, 3, 4};
        result = myCalc.multiply(mul);
        System.out.println("2) Multiplication result is " + result);

        // Divide
        result = myCalc.divide(8,2);
        System.out.println("3) Division result is " + result);
        //

        // Subscract
        result = myCalc.subtract(10, 6);
        System.out.println("4) Substraction result is " + result);

    }
}
