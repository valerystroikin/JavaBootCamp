package sef.FinalActivity;

import java.util.Comparator;

public class SortByFirstName implements Comparator<Employee>  {
    public int compare(Employee a, Employee b)
    {
        return a.getFirstName().compareTo(b.getFirstName());
    }
}
