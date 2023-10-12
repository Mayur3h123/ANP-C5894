package Thread;

public class StaticDemo {
// Local Variable
// Instance Variable
// Static Variable
	
	
	
//	int a; // Class Variable // Instance Variable
	static int a; // Static Variable
	public void Display()
	{
		//inta=0; // Local Variable
		System.out.println(a);
	}
	
	public static void main(String[] args) {
	StaticDemo sd=new StaticDemo();
	sd.Display();

	}

}
