package opps;
/*
Person class that demonstrates constructor overloading
*/
public class Personss 
{
	//fields or attributes
   private String name;
   private int age;

   // Default constructor - without parameter
   public Personss() 
   {
       name = "Raj";
       age = 30;
   }

   // Constructor with name parameter
   public Personss(String name) 
   {
       this.name = name;
       age = 30; // Default age
   }

   // Constructor with name and age parameters
   public Personss(String name, int age) 
   {
       this.name = name;
       this.age = age;
   }

   // Getter methods for name and age
   public String getName() {
       return name;
   }

   public int getAge() {
       return age;
   }
}
class PersonssMain {
   public static void main(String[] args) {
       // Creating objects using different constructors
       Personss person1 = new Personss(); // Default constructor
       Personss person2 = new Personss("Alice"); // Constructor with name parameter
       Personss person3 = new Personss("Bob", 25); // Constructor with name and age parameters

       // Getting information using getter methods
       System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
       System.out.println(person2.getName() + " is " + person2.getAge() + " years old.");
       System.out.println(person3.getName() + " is " + person3.getAge() + " years old.");
   }
}