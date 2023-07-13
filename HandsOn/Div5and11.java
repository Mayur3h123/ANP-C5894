package Loops;

import java.util.Scanner;

public class Div5and11
{
    public static void main(String[] args)
    {
    	//Scanner class to take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
      
        //integer input from the user
        int number = scanner.nextInt();
    	
        //condition
        if (number % 5 == 0 && number % 11 == 0)
        {
            System.out.println("Divisible");
        }
        else
        {
            System.out.println("Not Divisible");
        }
    }
}