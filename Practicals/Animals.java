package opps;

class Animals {
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
	class Dogs extends Animals
	{
		private String breed;
		
		public String getBreed() {
			return breed;
		}
		public void setBreed(String breed) {
			this.breed = breed;
		}
	}
	class Animalsmain
	{
		
		public static void main(String[] args) {
			Dogs d=new Dogs();
			
			d.setName("Tom");
			d.setAge(2);
			d.setBreed("Doberman");		
			
			System.out.println("Name is:"+ d.getName());
			System.out.println("Age is:"+ d.getAge());
			System.out.println("Breed is:"+ d.getBreed());
			
		}
	
}