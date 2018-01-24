package Polymorphism;

public class Book extends Publication {//class Book inherits from Publication class
	//fields
	private String author;
	
	//constructor	
	public Book(String publisher,int numberOfPages,double price, String title, String author){
		super(publisher, numberOfPages, price,title);
		this.author = author;
	}
	//Mutator and Accessor methods
	public void setAuthor(String author){
		this.author = author;
	}
	public String getAuthor(){
		return author;
	}
	@Override
	public String toString(){
		return super.toString() + "Book [author= " + author + "]";
	}

}
