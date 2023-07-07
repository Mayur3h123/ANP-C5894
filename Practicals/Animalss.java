package opps;
//Example of Abstraction
abstract class Animalss 
{
	//contains abstract method
	//Abstract method does not have body
	public abstract void sound();
	
	//can contain non abstract method
	public void sleep()
	{
		System.out.println("Animals Sleep....");
	}
}

//subclass inherits Animalss
class Monkey extends Animalss
{
	public void sound()
	{
		System.out.println("Monkey sounds like human....");
	}	
}
class AnimalssMain
{
	public static void main(String[] args)
	{
		Monkey m=new Monkey();
		m.sound();
		m.sleep();
	}
}
	