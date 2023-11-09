package Loops;
/*
Ques.Write a the program that asks the user for the number of iterations 
they want to perform. It then uses a for loop to iterate from 1 
to the specified number of iterations.
*/

import java.util.Scanner;

public class NoOfIterations
{
   public static void main(String[] args) 
   {
   	//input from the user
       Scanner sc = new Scanner(System.in);

       // Get the number of iterations from the user
       System.out.print("Enter the number of Limit: ");
       int Limit = sc.nextInt();

       // Perform a loop for the given number of iterations
       for (int i = 1; i <= Limit ; i++)
       {
           // Check if the current iteration is divisible by 3
           if (i % 3 == 0) 
           {
               // Skip this iteration and continue to the next one
               continue;
           }

        // Print the current number
           System.out.print(i + " ");

           // Check if the current number is greater than or equal to 10
           if (i >= 10) 
           {
               // Break the loop if the condition is true
               break;
           }
       }

       sc.close();
   }
}