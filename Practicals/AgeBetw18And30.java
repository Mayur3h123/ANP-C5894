package Operators;

/*Write a Java program that prompts the user to enter their age.
 * The program should check if the age is between 18 and 30 (inclusive) and
print "Eligible for Job" if true, or "Not Eligible for Job" otherwise.*/

import java.util.Scanner;
public class AgeBetw18And30
{
   public static void main(String[] args) 
   {
   	//input from the user
       Scanner sc = new Scanner(System.in);

     //input for the initial value
       System.out.print("Enter Your Age For Job Eligibility : ");
      
     //integer input from the user 
   	int age=sc.nextInt();
   	
   	//condition
   	if(age >= 18 && age <= 30)
   	{
   		System.out.println("Eligible For Job");
   	
   	}
   	else 
   	{
   		System.out.println("Not Eligible For Job");
   	}sc.close();
   	}
}
