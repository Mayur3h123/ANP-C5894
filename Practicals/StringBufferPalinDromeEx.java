package String;

public class StringBufferPalinDromeEx {

	public static void main(String[] args) {
//StringBuffer example
/*Write a Java program to check if a given string is a PalinDrome using StringBuffer. A PalinProme is a string that reads the same forwards and backwards.*/

		        String input = "radar"; // Change this string to test different cases
		        
		        if (isPalindrome(input)) {
		            System.out.println(input + " is a palindrome.");
		        } else {
		            System.out.println(input + " is not a palindrome.");
		        }
		    }
		    
		    // Function to check if a string is a PalinDrome
		    public static boolean isPalindrome(String str) {
		        StringBuffer reversed = new StringBuffer(str).reverse();
		        return str.equals(reversed.toString());
		    }
		}