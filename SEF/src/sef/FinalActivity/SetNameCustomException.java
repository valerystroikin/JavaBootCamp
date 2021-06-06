package sef.FinalActivity;

public class SetNameCustomException extends Exception{
    public String getMessage() {
        String msg = "The name specified is invalid. Name should not contain digits.";
        return msg;
    }
}
