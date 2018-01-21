package Chapter9Exercise;

//Create a class Zebra
// Make it a subclass of Animal by adding extends Animal 
//to the end of the line giving the class name
public class Zebra extends Animal {//Zebra class(subclass) inherits Animal class(superclass)
    //Write a constructor for Zebra that takes no arguments
	// The entire body of this method should be super(); 
	//That constructor then sets its attribute hunger to 0. 
	public Zebra(){//constructor for Zebra class that takes no arguments
		super();//This calls the constructor for Animal
	}
	// By inheriting from Animal, we promised to implement a talk method. 
	//Add a method talk that takes no arguments and returns nothing, 
	//just as promised in the Animal class. 
	//Make this method print the string “The Zebra quietly chews.”. 
	@Override
	//overrides abstract talk method from the Animal class
	public void talk() {//subclass Zebra must implement an abstract method from superclass
		System.out.println("The Zebra quietly chews.");
		
	}
	public void timePasses(){
		System.out.println("The Zebra paces hungrily.");
	}
	public String toString(){
		return "Zebra";
	}
}


