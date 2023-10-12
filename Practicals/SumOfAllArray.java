package Array;
/*Write a program that takes the size of the array as input from the user.
Then, prompt the user to enter elements of the array.
Calculate and display the sum of all elements in the array.*/


import java.util.Scanner;

public class SumOfAllArray {

		public static void main(String[] args) 
		{
			//Scanner Class Object
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter The Size Of The Array: ");
	        int size = sc.nextInt();
	        
	        int[] numbers = new int[size]; 
	        //int sum = 0;
	        System.out.println("Enter " + size + " integers:");

	        for (int i = 0; i < size; i++)
	        {
	            numbers[i] = sc.nextInt();
	        }

	        // Display the elements entered by the user
	        System.out.println("Elements In The Array:");
	        int sum=0;
	        for (int i = 0; i < size; i++)
	        {
	        	sum = sum+numbers[i];	
	        
	        }
	        System.out.print(sum);
	        
	        // Closing Scanner Class
	        sc.close();


		}

	}