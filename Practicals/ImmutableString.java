package String;

	/*
	 Java Program to prove that strings are immutable in java
	 */

public class ImmutableString {
		public static void main(String[] args)
	    {
	        String s1 = "Good";
	 
	        String s2 = "Morning";
	 
	        System.out.println(s1 == s2);      //Output : true
	 
	        s1 = s1 + "J2EE";
	 
	        System.out.println(s1 == s2);      //Output : false
	        
	    }
		
	}