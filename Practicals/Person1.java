package opps;

class Person1 
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
// inherit from Person
class Employee1 extends Person1
{

	           int salary;

             public int getSalary() {
				return salary;
			}

			public void setSalary(int salary) {
				this.salary = salary;
			}
}



class Manager extends Employee1
{
	          private String Department;

			public String getDepartment() {
				return Department;
			}

			public void setDepartment(String department) {
				Department = department;
			}
	          
}
class MainPerson1
{
	public static void main(String[]args)
	{
		Manager m=new Manager();
		
		m.setName("Mayuresh");
		m.setAge(21);
		m.setSalary(50000);
		m.setDepartment("Developer");
		
		System.out.println("Name is:"+ m.getName());
		System.out.println("Age is:"+ m.getAge());
		System.out.println("Salay is:"+ m.getSalary());
		System.out.println("Department is:"+ m.getDepartment());
	}
}



