package collection;
/*Question 1: ArrayList Operations
Write a Java program that demonstrates the
following operations using an ArrayList:
a) Adding elements to the list.
b) Removing an element from the list.
c) Updating an element in the list.
d) Displaying the contents of the list.*/

import java.util.LinkedList;
//LinkedList Example
public class ArrayListsOperHO 
{
    public static void main(String[] args) 
       {
        // Create a linked list of strings
        LinkedList<String> ls = new LinkedList<>();

        // Adding elements to the linked list
        ls.add("One");
        ls.add("Two");
        ls.add("Three");
        ls.add("Four");
        ls.add("Five");
        ls.add("Six");
        ls.add("Seven");
        
        // Accessing elements in the linked list
        System.out.println("Linked List: " + ls);

        // Removing element Six From List
        ls.remove("Seven");
        System.out.println("Linked List: " + ls);
        
        //Replacing Seven With Six 
        ls.set(5, "Six");
        
        // Printing elements in the linked list
        System.out.println("Linked List: " + ls);
        
        }
}