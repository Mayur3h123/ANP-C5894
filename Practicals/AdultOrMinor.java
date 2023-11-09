package Operators;

/*Write a Java program that prompts the user to enter their age. 
The program should check if the age is greater than or equal to 18 and 
print "You are an adult" if true, or "You are a minor" otherwise.*/

import java.util.Scanner;
public class AdultOrMinor 
{

	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		
		
        System.out.print("Enter Your Age: ");
        //Input For User
        int age = sc.nextInt();
        if(age>=18)
        {
        	 System.out.println("You Are An Adult "); 
        	 boolean isgreater = age>=18;
        	 System.out.println( isgreater);
        }
        else {
        	 System.out.println("You Are A Minor "); 
        }
        sc.close();
	}

}