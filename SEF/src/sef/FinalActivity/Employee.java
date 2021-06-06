package sef.FinalActivity;

public class Employee extends Person {
    //Attributes
    private String id;
    private int salary;
    private String title;
    private String company;

    //Behavior - default constructor.
    public Employee()  {
        id = "0";
        salary = 0;
        title = "Not specified";
        company = "Not specified";
    }
    // Parameterized constructor
    public Employee(String firstName, String lastName, int age, String id, int salary, String title, String company) throws SetNameCustomException {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.id = id;
        this.salary = salary;
        this.title = title;
        this.company = company;
    }

    //Setters and getters
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public int  getSalary() {
        return this.salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getTitle() {
        return this.title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return this.company;
    }
    public void setCompany(String title) {
        this.company = title;
    }

    public String introduce(){
        String message = "My name is "+this.getFirstName()+" "+this.getLastName()+" and I am "+this.getAge()+" years old. I work as a "+this.getTitle()+" in "+getCompany();
        return message;

    }

}
