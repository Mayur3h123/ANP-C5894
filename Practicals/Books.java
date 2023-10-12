package Array;


/*Create a Book class with the following attributes:
title (String)
author (String)
isbn (String)
year (int)
Implement three constructors for the Book class:

Default constructor that sets default values for title, author, isbn, and year.
Constructor that takes title, author, and isbn as parameters and sets the year to the current year (use java.time.Year).
Constructor that takes all four attributes as parameters.*/

//importing year to sets the year to the current year.
import java.time.Year;
public class Books 
{
    private String title;
    private String author;
    private String isbn;
    private int year;
    
    
    //Default constructor for title, author, isbn, and year.
	public Books() 
	{
		title =   "Jokes";
		author =  "Mr. Smile ";
		isbn=" 883-22-17663-7-4 ";
		year= 2012;
	}

	//Constructor for title, author, and isbn as parameters and sets the year to the current year
	public Books(String title, String author, String isbn) 
	{
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.year = Year.now().getValue();
	}
    
	//Constructor for title, author, isbn, and year.
	public Books(String title, String author, String isbn, int year) 
	{
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.year = year;
	}

	//getter methods for title
    public String getTitle()
    {
    	return title;
    }
    
    //getter methods for author
    public String getAuthor()
    {
    	return author;
    }
    
    //getter methods for isbn
    public String getIsbn()
    {
    	return isbn;
    }
    
    //getter methods for year
    public int getYear()
    {
    	return year;
    }

	public static void main(String[] args) 
	{
		// Creating objects using different constructors
		Books Book1 = new Books();//Default constructor
		Books Book2 = new Books("Nature's Medic ", "Dr. Samir Bhosle ", " 454-33-379442-5-9 ");// Constructor with title, author and isbn as parameter
		Books Book3 = new Books("Cook Book","Mr. Khana Khazana ", " 512-77-882570-0-1 ", 2022 );// Constructor with title, author,isbn, and year as parameters
		
		// Getting information using getter methods
		System.out.println("Title is: " + Book1.getTitle() + " Author is : " + Book1.getAuthor() + "isbn is :" + Book1.getIsbn() + "Year is: " + Book1.getYear());
		System.out.println("Title is: "+Book2.getTitle() + " Author is : " + Book2.getAuthor() + "isbn is :" + Book2.getIsbn() + "Year is: " + Book2.getYear());
		System.out.println("Title is: "+Book3.getTitle() + " Author is : " + Book3.getAuthor() + "isbn is :" + Book3.getIsbn() + "Year is: " + Book3.getYear());

	}
}