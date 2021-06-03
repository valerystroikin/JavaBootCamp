package sef.module9.activity;
//Needs to be completed

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//1 - Type code to create a list of names. Use ArrayList.
		List myList = new ArrayList();
		myList.add("John");
		myList.add("Mary");
		myList.add("Michael");
		myList.add("Robert");


		//2 - Call print method to print the list passed as its parameter.

		print(myList);
		
	}
	
	static void print(List list)
	{
		//3 - Type code to print this list
		//Notice the order in which elements get printed.

		System.out.println("List of names:");
		{
			int i;
			for(i=0;i<list.size();i++){
				System.out.println((i+1)+". "+list.get(i));
			}

		}
		System.out.println("Total: "+ list.size());
	
	}
}
