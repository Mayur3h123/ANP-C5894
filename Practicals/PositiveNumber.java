package Operators;
/*Write a Java program that takes an integer as user input
and checks if it is a positive number.*/

import java.util.Scanner;
public class PositiveNumber 
{

	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		
		
        System.out.print("Enter A Number : ");
        //Input For User
        int num = sc.nextInt();

        if(num>0)
        {
        	 System.out.println("Number Is Positive "); 
        	 boolean isgreater = num>0;
        	 System.out.println( isgreater);
        }
        else {
        	 System.out.println("Number Is Negative "); 
        }
        sc.close();
	}
        
	}


