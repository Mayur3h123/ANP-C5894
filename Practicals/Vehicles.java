package collection;

/*
 Create an abstract class called "Vehicle" with abstract methods "start()" and "stop()". 
 Create two subclasses "Car" and "Motorcycle" that extend the "Vehicle" class 
 and implement the abstract methods. Write a Java program to demonstrate starting 
 and stopping operations for a car and a motorcycle.
 */

abstract class Vehicle1 
{
    //methods
	public abstract void start();
	public abstract void stop();
}
//subclass
class Car1 extends Vehicle1
{

	public void start() 
	{
		System.out.println("Car start in 10 sec");
		
	}

	public void stop() 
	{
		System.out.println("Car stop in 5 sec");
		
	}
	
}
class Motorcycle extends Vehicle1
{

	
	public void start() 
	{
		System.out.println("Motorcycle start in 5 sec");
		
	}

	
	public void stop() 
	{
		System.out.println("Motorcycle stop in 2 sec");
		
	}
	
}
class Vehicle1_main
{
	public static void main(String[] args) 
	{
		//start and stop operation
		Car1 c=new Car1();
		c.start();
		c.stop();
		Motorcycle m=new Motorcycle();
		m.start();
		m.stop();
	}
}

