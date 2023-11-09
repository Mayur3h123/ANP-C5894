package String;

	/*
	write a java program to reverse each word in string 
	*/


public class StringReverse
{
	
		public static void main(String[] args) 
		{
			StringBuilder s = new StringBuilder();

	        s.append("Good Morning ");
	        s.append("Everyone "); // Appending another string
	        s.reverse(); // Reversing the string
	        System.out.println(s.toString());


		}
}