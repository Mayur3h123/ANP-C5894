package ExceptionHandling;
/* List Sorting Write a Java program that sorts a list of strings in alphabetical order
 * using the Collections framework.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ListSortingFramework {
		public static void main(String[] args) 
		{
			
			//Creating ArryList
			List<String> fruits= new ArrayList<>();
			fruits.add("Mango");
			fruits.add("Orange");
			fruits.add("Banana");
			fruits.add("Apple");
	        fruits.add("Cherry");
	        
	        // Printing List Before Sorting
	        System.out.println("Fruits list" + fruits);
	        
	        // Printing List After Sorting
	        Collections.sort(fruits);
	        System.out.println("After Sorting" + fruits);

		}

	}


