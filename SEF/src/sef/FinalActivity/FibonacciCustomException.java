package sef.FinalActivity;

public class FibonacciCustomException extends Exception{
    public String getMessage() {
        String msg = "You entered invalid number!";
        return msg;
    }
}
