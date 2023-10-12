package ExceptionHandling;

/*Hands-on:Write a program that takes two numbers and an operator (+, -, *, /) from the user.
Perform the corresponding arithmetic operation and display the result.
Handle exceptions for invalid operators and division by zero.*/

import java.util.*;
public class TwoNumberOperatorException
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
	    System.out.print("Enter The First Number: ");
	    int num1 = sc.nextInt();

	    System.out.print("Enter The Second Number: ");
	    int num2 = sc.nextInt();
		    	    
	    System.out.println("Operations:");

	    System.out.println("1. Addition");

	    System.out.println("2. Subtraction");

	    System.out.println("3. Multiplication");

	    System.out.println("4. Division");

        System.out.print("Enter The Operation Number: ");

	        // User Enter Operator
        int operation = sc.nextInt();

	    int result;
	    try 
	    {
	    
	    	switch (operation)
	    	{
	    case 1:

	    	result = num1 + num2;

	        System.out.println("The Result Of Addition Is: " + result);
	        break;

	    case 2:

            result = num1 - num2;

	        System.out.println("The Result Of Subtraction Is: " + result);
	        break;

	    case 3:

	        result = num1 * num2;

            System.out.println("The Result Of Multiplication Is: " + result);
            break;

	    case 4:

	        result = num1 / num2;

	        System.out.println("The Result Of Division Is: " + result);
	        break;
	        
	    default:

	        System.out.println("Error: Invalid Operation");
	        break;
		    }

		    }
		   
		    catch (ArithmeticException e)
		    {
		    System.out.println("An Exception Occurred: " + e.getMessage());
		    } 
		    sc.close();

}
}




