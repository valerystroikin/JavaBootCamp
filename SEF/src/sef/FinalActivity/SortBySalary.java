package sef.FinalActivity;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee> {

    public int compare(Employee a, Employee b)
    {
        return b.getSalary() - a.getSalary();
    }
}
