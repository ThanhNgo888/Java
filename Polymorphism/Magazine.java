package Polymorphism;

public class Magazine extends Publication {//class
	//fields
	private String pub_Unit;
	
	public Magazine(String publisher,int numberOfPages,double price, String title, String pub_Unit){
		super(publisher, numberOfPages, price,title);
		this.pub_Unit = pub_Unit;
	}
	//set Mutator and Accessor methods for pub_Unit instance
	public void setPub_Unit(String pub_Unit){
		this.pub_Unit = pub_Unit;
	}
	public String getPub_Unit(){
		return pub_Unit;
		
	}
	@Override
	public String toString(){
		return super.toString() + "Magazine [publication unit" + pub_Unit + "]";
	}

}

