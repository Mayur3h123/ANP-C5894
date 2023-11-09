package Loops;

import java.util.Scanner;

public class PositiveOrNegative {

		
			public static void main(String[] args)
			{
			//Scanner class to take input from the user
			Scanner s=new Scanner(System.in);
			System.out.println("Enter a value:");
			
			//integer input from the user 
			int a=s.nextInt();
			
			//condition
			if(a>0)
			{
				System.out.println("Positive");

			}
			else 
			{
				System.out.println("Negative");
			}s.close();
			}
}
