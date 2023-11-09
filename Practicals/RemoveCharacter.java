package String;

	/*
	 * How to remove a particular character from a String.
	 */

public class RemoveCharacter
{

		public static void main(String[] args)
		{
			String name = "Good Morningg";
			
			System.out.println(charRemoveAt(name, 12));
		}
		
		public static String charRemoveAt(String str, int g)
		{
			return str.substring(0, g) + str.substring(g + 1);
			
		}  
}