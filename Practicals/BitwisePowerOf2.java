package Operators;

/*Write a Java program that takes an integer input from the user and checks
if it is a power of 2 using bitwise operators.
Print "Yes" if it is a power of 2, and "No" otherwise*/

import java.util.*;
public class BitwisePowerOf2 {

	public static void main(String[] args) 
	{
	     Scanner sc = new Scanner(System.in);
	     System.out.print("Enter A Number: ");
	        //Input For User
	        int num = sc.nextInt();
	        
	            
	            if ((num&(num-1))==0)
	            {
	                System.out.println("Given Number is power of 2");
	            }
	            else 
	            {
	                System.out.println("Given number is not power of 2 ");
	            }
	        sc.close();

	}

}