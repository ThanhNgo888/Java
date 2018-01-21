//Thanh Ngo
//CSC 143 Winter 2018
//Programming Project 1
package Chapter9Exercise;

//abstract class exist to be extended, they cannot be instantiated
//Creating a class Animal
//Add abstract between public and class at the top of the file. 
//This tells the computer that you intend Animal to be an abstract class
public abstract class Animal {//abstract class Animal, base class, superclass, or parent class
	//Give the Animal a single private int attribute hunger to hold how hungry the Animal is
	private int hunger;//field
	public Animal(){//a constructor of class Animal that takes no arguments
		//sets this attribute to zero(not hungry)
		hunger = 0;
	} 
	// a method getHunger that returns it
	public int getHunger(){
		return hunger;
	}
	
	//Add a method timePasses to Animal that increases the hunger attribute by one
	//The idea is that this is called each unit of time so the animals gradually 
	//get hungrier over time
	public void timePasses(){
		hunger++;
	}
	// Add a method feed to Animal that sets hunger back to 0. 
	public void feed(){
		hunger = 0;
	}	
	//write an abstract method talk that takes no arguments and returns nothing
	//an abstract method must be declared to be an abstract class
	public abstract void talk();

}
