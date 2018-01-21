package Chapter9Exercise;

//another subclass of Animal called Lion
public class Lion extends Animal {
	// a constructor that takes no arguments and calls the Animal constructor
	public Lion(){//constructor for Lion class that takes no arguments
		super();//calling the Animal constructor
	}
	
	//write a talk method that just prints the message “Roar!”. 
	@Override
	public void talk(){
		System.out.println("Roar!");
	}
	
	// Override the timePasses method in Lion with a method that increases hunger by 1
	//but also prints the message “The Lion paces hungrily."
	public void timePasses(){
		// To increase hunger, call the the timePasses method of Animal (using super.timePasses();
		super.timePasses();
		// if its new value is at least 3. 
		if(getHunger()<=3)
		System.out.println("The Lion paces hungrily.");
	}
	public String toString(){
		return "Lion";
	}

}
