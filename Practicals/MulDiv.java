package Operators;



/*
The user is prompted to enter the initial value,
increment value, and decrement value. 
These values are stored in the variables value, increment, 
and decrement, respectively.
*/
import java.util.Scanner;

public class MulDiv
{
   public static void main(String[] args) 
   {
   	//input from the user
       Scanner sc = new Scanner(System.in);

       //input for the initial value
       System.out.print("Enter the Initial value: ");
       int value = sc.nextInt();

       //input for the Multiplication value
       System.out.print("Enter the Multiplication value: ");
       int Mul = sc.nextInt();

       //input for the Division value
       System.out.print("Enter the Division value: ");
       int decrement = sc.nextInt();

       // Equivalent to: value = value + Multiplication;
       value *= Mul;
       System.out.println("After Multiplicationt: " + value); 

       // Equivalent to: value = value - Division;
       value /= decrement;
       System.out.println("After Division: " + value);
       sc.close();
   }
}