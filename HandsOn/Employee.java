package opps;

class Employee {
	   private int Employee_ID;
	   private String name;
	   private int age;
	   private String address;
	   private int phone_no;
	   private String Location;
	public int getEmployee_ID() {
		return Employee_ID;
	}
	public void setEmployee_ID(int employee_ID) {
		Employee_ID = employee_ID;
	}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
}
	class Employee_main
	{
		public static void main(String[] args)
		{
			//Creating instance of class Encapsulation
		    Employee e=new Employee();
			//Setting values
			e.setEmployee_ID(001);
			e.setName("Mayuresh");
			e.setAge(24);
			e.setAddress("Mumbai");
			e.setPhone_no(123);
			e.setLocation("Mumbai");
			
			System.out.println("Employee Id:- " + e.getEmployee_ID());
			System.out.println("Name is: " + e.getName());
			System.out.println("Age is: " + e.getAge());
			System.out.println("Address: " + e.getAddress());
			System.out.println("Phone no:- " + e.getPhone_no());
			System.out.println("Location: " + e.getLocation());
	}

}
	
