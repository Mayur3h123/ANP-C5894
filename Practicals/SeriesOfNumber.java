package Loops;

/*Write a Java program that asks the user to enter a series of numbers (positive or negative) and
calculates their sum. The program should stop asking for input when the user enters 0.
Use a do-while loop to continuously ask for numbers and
keep adding them to the sum*/


import java.util.Scanner;

public class SeriesOfNumber 
{
	
	public static void main(String[] args) 
	{
	    // User Enter Series Of Number
		Scanner scanner  = new Scanner(System.in);
        int number;
        // initialization 
        int sum = 0;
        
        
        do {
            System.out.print("Enter a number (enter 0 to stop): ");
            number = scanner.nextInt();
            sum += number;
           }
        while (number != 0);
        
        
        System.out.println("The sum is: " + sum);
     }  
}


