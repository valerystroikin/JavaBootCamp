package sef.FinalActivity;

import java.util.Comparator;

public class SortByFirstLastName implements Comparator<Employee> {
    public int compare(Employee a, Employee b)
    {
        String s1 = a.getFirstName()+a.getLastName();
        String s2 = b.getFirstName()+b.getLastName();
        return s1.compareTo(s2);
    }
}
