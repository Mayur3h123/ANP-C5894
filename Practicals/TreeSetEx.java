package collection;

//TreeSet example
import java.util.TreeSet;
import java.util.Set;

public class TreeSetEx
{

	public static void main(String[] args)
	{
		Set<String> s=new TreeSet<String>();	
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("C");
		System.out.println("Elements are:" + s);

	}

}