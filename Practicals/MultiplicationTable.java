package Loops;
/*Write a Java program that prompts the user to enter a number and
then prints the multiplication table of that number using a for loop.
The table should display multiplication from 1 to 10*/

import java.util.*;
public class MultiplicationTable 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		// User Enter Value
		System.out.print("Enter a number: ");
		int number = s.nextInt();
		
		// Condition
        for (int i = 1; i <= 10; i++)
        {

            System.out.println(number+" * "+i+" = "+number*i);
        	
        }s.close();
	}	
}