package Loops;


import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value:");
		
		int k=s.nextInt();
		
		if(k%4==0)
		{
			System.out.println("Leap year");

		}
		else if(k%100==0) 
		{
			System.out.println("Leap Year");
		}
		else if(k%400==0)
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not a leap year");
		}s.close();


	}
}