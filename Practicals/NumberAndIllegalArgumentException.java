package ExceptionHandling;
/*Hands-on:Develop a program that takes a user's age as input and determines
 * if they are eligible to vote (age >= 18).
 * If the user enters non-numeric text or a negative number,
 *catch the NumberFormatException and
 *IllegalArgumentException respectively, displaying appropriate error messages.*/

import java.util.Scanner;
public class NumberAndIllegalArgumentException
{
	public static void main(String[] args) 
	{
			{
		     Scanner sc = new Scanner(System.in);
		     System.out.print("Enter Your Age: ");
		        
		     //Input For User
		     String input = sc.nextLine();
		        
		     try {
		          int age = Integer.parseInt(input);

		     if(age==0)  
		     {
		    	 throw new IllegalArgumentException("Age cannot be zero or negative.");
		    	
		    	 
		    	// System.out.println("Age Cannot Be Zero");  
		    	 
		    	
		     } 
		     
		     if (age<0)
		         {
		     System.out.println("Age Cannot Be Negative");
		          }
		            
		     if (age >= 18) 
		          {
		     System.out.println("You Are Eligible To Vote!");
		           }
		    
		     else {
		         System.out.println("You Are Not Eligible To Vote.");
		           }
		     
		           } 
		     catch (NumberFormatException e) 
		     {
		     System.out.println("Error: Invalid Input. Please Enter Valid Age.");
		      } catch (IllegalArgumentException e)
		     {
		     System.out.println("Error: " + e.getMessage());
		     }sc.close();
		      
			}
	}	
}
