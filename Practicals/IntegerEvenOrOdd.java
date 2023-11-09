package Operators;

import java.util.Scanner;
public class IntegerEvenOrOdd {

	 /*Write a Java program that takes an integer input from the user
	and checks if it is even or odd using bitwise operators.
	Print "Even" if the number is even, and "Odd" if the number is odd.*/

	  public static void main(String args[])
	  {
	    //To take input from the user 
	    //Create an object of scanner class
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a number: ");
	    int num = sc.nextInt();
	    //Check Using Bitwise XOR
	    if ((num ^ 1) == num + 1)
	    { 
	         System.out.println("The entered number "+ num +" is Even"); 
	    } 
	    else 
	    { 
	        System.out.println("The entered number "+ num +" is Odd"); 
	    }
	    sc.close();
	        
	  }
	}