package ExceptionHandling;
import java.util.Scanner;

/*Write  a Java program that reads a string input from the user. 
 * Convert the string to an integer using the Integer.parseInt() method. 
 * Handle the NumberFormatException that can occur if the input cannot be parsed as an integer. 
 * Display a message indicating that the input is not a valid integer. */

public class NumberFormatExceptionHO {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
		try 
	        {
	            System.out.print("Enter a number: ");
	            int number = Integer.parseInt(sc.nextLine()); // This line can throw NumberFormatException
		        System.out.println("You entered: " + number);
		    } 
		catch (NumberFormatException e)
            {
			System.out.println("Invalid is not a valid number.");
		    }   
	        sc.close();

			}

		}
