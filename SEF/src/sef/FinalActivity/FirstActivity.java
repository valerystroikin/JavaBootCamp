package sef.FinalActivity;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class FirstActivity {
    public static void main(String arg[]) throws SetNameCustomException, IOException {
        ArrayList<Employee> employeeList = new ArrayList<>();
        // Create a person with invalid name. Exception SetNameCustomException is to be thrown and handled
        Person p1 = new Person();
        p1.setFirstName("J0hn"); // The name specified is invalid. Name should not contain digits.
        p1.setLastName("Doe");

        //Creating a few employees
        Employee emp0 = new Employee("Mary", "Doe",35,"1",999,"Manager","ABC Corp");
        employeeList.add(emp0);

        Employee emp1 = new Employee("John", "Doe",30,"2",2000,"CEO","Google");
        employeeList.add(emp1);

        Employee emp2 = new Employee("Barbara", "Brook",25,"3",1500,"Manager","MaryK");
        employeeList.add(emp2);

        Employee emp3 = new Employee("Bill", "Gates",60,"4",500,"Company owner","Microsoft");
        employeeList.add(emp3);

        // Introducing employees
        System.out.println("Employees introducing themselves:");

         System.out.println(emp0.introduce());
         System.out.println(emp1.introduce());
         System.out.println(emp2.introduce());
         System.out.println(emp3.introduce());

         // Printing unsorted Employee list to a file
        FileWriter writer = new FileWriter("employee_list.txt");
        try {
            int size = employeeList.size();
            for (int i = 0; i < size; i++) {   //for every ArrayList element
                String str = employeeList.get(i).getFirstName() + " " + employeeList.get(i).getLastName() + " " + employeeList.get(i).getSalary();
                writer.write(str);
                if (i < size - 1) {
                    writer.write("\n");
                }
            }
            writer.close();
        } finally {
            writer.close();
        }

        // Prints unsorted list
        System.out.println("");
        System.out.println("List of employes - unsorted:");
        for (int i = 0; i < employeeList.size(); i++)
            System.out.println(employeeList.get(i).getFirstName()+" "+employeeList.get(i).getLastName()+" "+employeeList.get(i).getSalary());

        // Performs sorting the list desc (by salary)
        Collections.sort(employeeList, new SortBySalary());
        // Prints sorted list
        System.out.println("");
        System.out.println("List of employes - sorted by salary:");
        for (int i = 0; i < employeeList.size(); i++)
            System.out.println(employeeList.get(i).getFirstName()+" "+employeeList.get(i).getLastName()+" "+employeeList.get(i).getSalary());

        // sort the list by the first and then by the last name
        Collections.sort(employeeList, new SortByFirstLastName());
        // Prints sorted list
        System.out.println("");
        System.out.println("List of employes - sorted by first+last name:");
        for (int i = 0; i < employeeList.size(); i++)
            System.out.println(employeeList.get(i).getFirstName()+" "+employeeList.get(i).getLastName()+" "+employeeList.get(i).getSalary());

        // Sort the list by first name
        Collections.sort(employeeList, new SortByFirstName());
        // Prints sorted list
        System.out.println("");
        System.out.println("List of employes - sorted by first name:");
        for (int i = 0; i < employeeList.size(); i++)
            System.out.println(employeeList.get(i).getFirstName()+" "+employeeList.get(i).getLastName()+" "+employeeList.get(i).getSalary());

        // Sort the list by the last name
        Collections.sort(employeeList, new SortByLastName());
        // Prints sorted list
        System.out.println("");
        System.out.println("List of employes - sorted by last name:");
        for (int i = 0; i < employeeList.size(); i++)
            System.out.println(employeeList.get(i).getFirstName()+" "+employeeList.get(i).getLastName()+" "+employeeList.get(i).getSalary());



        // Creating a couple of students
        // Student(String firstName, String lastName, String schoolName)
        Student st1 = new Student("Sarah","Smith","LU");
        Student st2 = new Student("Jane","Cruse","RTU");
        System.out.println("");
        System.out.println("Students introducing themselves:");


         System.out.println(st1.introduce());
         System.out.println(st2.introduce());

    }

}
