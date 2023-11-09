package opps;

class Person
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
	
	class Main
	{
		public static void main(String[] args)
		{
			//Creating instance of class person
			Person p=new Person();
			
			//Setting name and age
			p.setName("Mayu");
			p.setAge(24);
		
			//Print values
			System.out.println("Name is:" + p.getName());
			System.out.println("Age is:" + p.getAge());
			
		}
	}
}
