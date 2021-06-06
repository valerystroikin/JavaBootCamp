package sef.FinalActivity;

public class CalcCustomException extends Exception {
    public String getMessage() {
        String msg = "You have entered invalid operation!";
        return msg;
    }
}
