package Array;
/* Write a Java program to find the average of all elements in an array of doubles. */


import java.util.Scanner;
	public class AverageArrayDoubles {

		public static void main(String[] args) 
		{
				//Scanner Class Object
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter The Size of The Array: ");
		        double size = sc.nextInt();
		        
		        double[] numbers = new double[(int) size]; 
		      
		        System.out.println("Enter " + size + " integers:");
		      //Initializing And Declaring The Values
		        for (double i = 0; i < size; i++)
		        {
		            numbers[(int) i] = sc.nextInt();
		        }
		      //Displaying The Elements
		        System.out.print("Elements in the array:");
		        for (double i = 0; i < size; i++)
		        {
		            System.out.print(numbers[(int) i] + " ");
		        }

		        
		        //Calculating The Average Of Arrays
		        int sum=0;
		        float avg=0;
		        for (int i = 0; i < size; i++)
		        {
		        	sum = (int) (sum+numbers[i]);
		        	avg = (float) (sum/size);
		        	System.out.println(" ");
		        }
		      //Displaying The Average Values
		        System.out.print("Avg of arrays is: " + avg);
		        
		      // Closing Scanner Class
		        sc.close();

			}

		}