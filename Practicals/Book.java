package Operators;
/* Create a Book class with the following attributes:

title (String)
author (String)
isbn (String)
year (int)
Implement three constructors for the Book class:

Default constructor that sets default values for title, author, isbn, and year.
Constructor that takes title, author, and isbn as parameters and sets the year to the current year (use java.time.Year).
Constructor that takes all four attributes as parameters.*/
import java.time.Year;
public class Book 
{
	//fields or attributes
    private String title;
    private String author;
    private String isbn;
    private static Year year;
    // Default constructor - without parameter
    public Book() 
    {
        title = "Jokes";
        author = "Smith";
        isbn = "123";
        year = Year.now();
    }
    // Constructor with title parameter
    public Book(String title)
    {
    	this.title = title;
    	author = "Smith";
        isbn = "123";
        year = Year.now();
    	
    }
    // Constructor with title and author parameters
    public Book(String title, String author)
    {
    	this.title=title;
    	this.author=author;
    	isbn = "123";
        year = Year.now();
    	
    }
    public Book(String title, String author, String isbn)
    {
    	this.title=title;
    	this.author=author;
    	this.isbn=isbn;
    	year = Year.now();
    	
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getIsbn() {
        return isbn;
    }
    public static Year getYear() {
    	return year;
    }
class BookMain{
	public static void main(String[] args) {
		 // Creating objects using different constructors
        Book Book1 = new Book();
        Book Book2 = new Book("Jokes"); // Constructor with name parameter
        Book Book3 = new Book("Science", "Tony");// Constructor with name and age parameters
        Book Book4 = new Book("History", "Willams", "24888");

     // Getting information using getter methods
        System.out.println("The " + Book1.getTitle()+"'s" + " book " + " is wriiten by "  + Book1.getAuthor()  + " " + Book1.getIsbn() + " " +  getYear());
        System.out.println("The " + Book2.getTitle()+"'s" + " book " + " is wriiten by "  + Book2.getAuthor() + " " + Book2.getIsbn() + " " +  getYear());
        System.out.println("The " + Book3.getTitle()+"'s" + " book " + " is wriiten by "  + Book3.getAuthor() + " " + Book3.getIsbn() + " " + getYear());
        System.out.println("The " + Book4.getTitle() +"'s" + " book "+ " is wriiten by "  + Book4.getAuthor() + " " + Book4.getIsbn() + " " + getYear());
	}
	
}
}