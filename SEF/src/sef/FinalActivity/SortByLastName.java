package sef.FinalActivity;

import java.util.Comparator;

public class SortByLastName implements Comparator<Employee> {
    public int compare(Employee a, Employee b)
    {
        return a.getLastName().compareTo(b.getLastName());
    }
}
