package Polymorphism;

public abstract class Publication {//superclass, base class or parent class
	//fields
	private String publisher;
	private int numberOfPages;
	private double price;
	private String title;
	
	//constructor of Publication class
	public Publication(String publisher,int numberOfPages,double price, String title){
		this.publisher = publisher;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.title = title;
		
	}
	//Mutators and Accessors methods
	//setter and getter methods for pulisher instance
	public void setPublisher(String publisher){
		this.publisher = publisher;
	}
	public String getPublisher(){
		return publisher;
	}
	//setter and getter methods for numberOfPages instance
	public void setNumberOfPages(int numberOfPages){
		this.numberOfPages = numberOfPages;
	}
	public int getNumberOfPages(){
		return numberOfPages;
	}
	//setter and getter methods for price instance
	public void setPrice(double price){
		this.price = price;
	}
	public double getPrice(){
		return price;
	}
	//setter and getter methods for title instance
	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return title;
	}	

	public String toString(){
		return "Publication [" + publisher + " " + numberOfPages + " " + price + " " + title +"]";
	}

}
