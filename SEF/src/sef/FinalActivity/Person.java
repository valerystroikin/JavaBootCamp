package sef.FinalActivity;

public class Person {
    // Attributes
    private String firstName;
    private String lastName;
    private int age;

    //Behavior - default constructor.
    public Person() {
        this.firstName = "Unknown";
        this.lastName  = "Unknown";
        this.age = 0;
    }
    // Parameterized constructor
    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    //Setters and getters
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) throws SetNameCustomException {
        try{
            if (firstName.contains("0")||firstName.contains("1")||firstName.contains("2")||firstName.contains("3")||firstName.contains("4")||firstName.contains("5")||firstName.contains("6")||firstName.contains("7")||firstName.contains("8")||firstName.contains("9")) {
                throw new SetNameCustomException();
            }
            this.firstName = firstName;
        }
        catch(SetNameCustomException sn){
            System.out.println(sn.getMessage());
        }
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        try{
            if (lastName.contains("0")||lastName.contains("1")||lastName.contains("2")||lastName.contains("3")||lastName.contains("4")||lastName.contains("5")||lastName.contains("6")||lastName.contains("7")||lastName.contains("8")||lastName.contains("9")) {
                throw new SetNameCustomException();
            }
            this.lastName = lastName;
        }
        catch(SetNameCustomException sn){
            System.out.println(sn.getMessage());
        }
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String introduce(){
        String message = "My name is "+this.getFirstName()+" "+this.getLastName()+" and I am "+this.getAge()+" years old.";
        return message;

    }
}
