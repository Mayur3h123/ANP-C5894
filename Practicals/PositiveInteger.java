package Loops;

/*Write a Java program that prompts the user to enter a positive integer and
calculates its factorial using a while loop.
The program should display the factorial as the output.*/

import java.util.*;
public class PositiveInteger 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		// User Enter Value
		System.out.print("Enter a number to calculate its factorial: ");
		int number = s.nextInt();
		int factorial = 1;
	    int i = 1;
	    
	    // Condition
		while(i<=number)
		{
			factorial=factorial*i;
			i++;
			 
		}
		System.out.println("The factorial of " + number + " is: " + factorial);
      s.close();
	}
}
