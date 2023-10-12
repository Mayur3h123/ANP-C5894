package collection;

/*Question 2: HashSet Operations
Create a program that showcases the usage of a HashSet:
a) Add elements to the set.
b) Check whether a specific element exists in the set.
c) Remove an element from the set.
d) Print the elements of the set.*/

import java.util.HashSet;
import java.util.Set;
	public class HashSetOpsHO
{

		public static void main(String[] args)
		{
		Set<String> s=new HashSet<String>();	
		s.add("Dog");
		s.add("Elephant");
		s.add("Monkey");
		s.add("Lion");
		s.add("Tiger");
		s.add("Hyena");
		
		//printing the elements
		System.out.println("Elements Are:" +s);
		
        String d="Dog";
		
		//check whether the string is available or not
		System.out.println("Elements Contains:"+d+" " +s.contains(d));
		
		 s.remove("Dog");
		 System.out.println("Set After Removing Elements: "
                 + s);
		}
}