package sef.FinalActivity;

public class Student extends Person{
    //Attributes
    private String schoolName;

    //Behavior - default constructor.
    public Student() throws SetNameCustomException {
        this.setFirstName("Unknown");
        this.setLastName("Unknown");
        schoolName = "Unknown";
    }
    // Parameterized constructor
    public Student(String firstName, String lastName, String schoolName) throws SetNameCustomException {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.schoolName = schoolName;
    }
    //Setters and getters
    public String getSchoolName() {
        return this.schoolName;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    //Introduce
    public String introduce(){
        String message = "My name is "+this.getFirstName()+" "+this.getLastName()+" and I study in university "+this.getSchoolName();
        return message;
    }
}
