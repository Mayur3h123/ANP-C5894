package ExceptionHandling;

//DivideByZeroException example
import java.util.Scanner;
public class DivideByZeroExceptionEx
{
	 public static void main(String[] args) 
	  {
		 
		// Opening Scanner Class
	    Scanner sc = new Scanner(System.in);
	    
        // User Enter Number 1
	    System.out.print("Enter the numerator: ");
	    int numerator = sc.nextInt();
	    
        // User Enter Number 2
	    System.out.print("Enter the denominator: ");
	    int denominator = sc.nextInt();
	    
        // Exception Handling
	    try 
	    {
	            int result = numerator / denominator;
	    // Printing Result
	      
	            System.out.println("Result: " + result);
	    }
	    catch (ArithmeticException e)
	    {
	    // Printing Error Message
	            System.out.println("An exception occurred: " + e.getMessage());
	    }
	    // Closing Scanner Class
	    sc.close();
	    }
	}