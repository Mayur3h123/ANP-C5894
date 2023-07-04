package opps;

class Encapsulation 
{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

	

}
class Main
{
	public static void main(String[] args)
	{
		//Creating instance of class Encapsulation
		Encapsulation e=new Encapsulation();
		
		//Setting values
		e.setName("Mayuresh");
		e.setAge(24);
	
		//Print values
		System.out.println("Name is:" + e.getName());
		System.out.println("Age is:" + e.getAge());
		
	}
}