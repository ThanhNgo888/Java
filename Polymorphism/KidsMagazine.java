package Polymorphism;

public class KidsMagazine extends Publication {//class
	//field
	private int ageRequire;
	
	//constructor
	public KidsMagazine(String publisher,int numberOfPages,double price, String title, int ageRequire){
		super(publisher, numberOfPages, price,title);
		this.ageRequire = ageRequire;
	}
	//Mutator and Accessor methods
	public void setAge(int ageRequire){
		this.ageRequire = ageRequire;
	}
	public int getAge(){
		return ageRequire;
	}
	@Override
	public String toString(){
		return super.toString() + "KidsMagazine [Required Age" + ageRequire + "]";
	}
}
