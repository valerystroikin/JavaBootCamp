package sef.module9.activity;

//Needs to be completed
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetActivity {

	public static void main(String[] args) {
		//1 - Type code to create a set of names.
		//Names must be sorted by their natural order.
		//Do research to find if you already have such a class. 
		//Also try adding a few duplicate entries to this set.
		Set nameset = new HashSet();

		nameset.add("Aaron");
		nameset.add("Angela");
		nameset.add("Daniel");
		nameset.add("James");
		nameset.add("John");
		nameset.add("John");
		nameset.add("Liza");

		//2 - Call print method to print the set passed as its parameter.
		print(nameset);
	}
	
	static void print(Set set)
	{
		//3 - Type code to print this set
		//Notice the order in which elements get printed.
		Iterator i = set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
