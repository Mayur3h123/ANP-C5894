package String;
import java.util.Scanner;

/*Java Program to capitalize each word in String */

public class CapitalizeWords 
{
	    	public static void main(String[] args) 
	  		 {
	  		 // create a string    			 
	    	 Scanner sc = new Scanner(System.in);
	    	        
	    	 System.out.println("Enter a String ");
	         String name = sc.nextLine();
	         name = name.toUpperCase();
	             
	  	     System.out.println("Word: " + name);
	         sc.close();
	          }
	    		
}