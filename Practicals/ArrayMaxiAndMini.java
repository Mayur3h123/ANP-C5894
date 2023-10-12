package Array;
/*Given an array of integers 
 * write a Java program to find the maximum and minimum elements in the array.*/


import java.util.Scanner;

public class ArrayMaxiAndMini {

		public static void main(String[] args) 
		{
			//scanner class object
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the size of the array: ");
	        int size = sc.nextInt();
	        
	        int[] numbers = new int[size]; 
	        
	        System.out.println("Enter " + size + " integers:");
	        int i;
	        //initializing and declaring the values
	        for (i = 0; i < size; i++)
	        {
	            numbers[i] = sc.nextInt();
	        }
	        //displaying the elements
	       
	        int min = numbers[0];
	        int max = numbers[0];
	        for (i = 0; i < size; i++) {
	        if(numbers[i] > max)
	        {
	        	max = numbers[i];
	        }
	        if(numbers[i] < min) 
	        {
	        	min = numbers[i];
	        }
	        
		}
	        System.out.println("Maximum Number Is " + max);
	        System.out.println("Mininmum Number Is " + min);
	    
	        sc.close();
		}

	}