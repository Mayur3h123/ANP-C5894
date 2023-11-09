package Loops;

/*Write a program that prints the Fibonacci series up to a specified limit entered by the user.
However, skip printing numbers that are divisible by 3.
Use the continue statement to skip such numbers.*/

import java.util.Scanner;

public class FionacciSeriesLimit {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter value of n:");
		 int n = sc.nextInt();
		 int i=1;
		 int num1=0;
		 int num2=1;
		 
		  System.out.println("Fibonacci Series till " + n + " terms:");
		
		 while(i<=n)
		 {
			 
		 int num3=num1+num2;
		  num1=num2;  
		  num2=num3;
		  i++;
		  if(num1%3 == 0) {
			  continue;
		  }
		  
		  System.out.print(num1 + ", ");
		 }sc.close();
		 
		 

	}

}