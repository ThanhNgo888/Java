package Chapter9Exercise;

//Create a new class called Zoo
//This one should not inherit from Animal since it doesn’t have an “is a” relationship with Animal.
public class Zoo {
	// give your Zoo a single attribute called cage which stores an Animal
	//Animail cage;
	
	// Rename cage to cage1 and add cage2 and cage3
	Animal cage1;//cage1 = attribute, Animal = Object
	Animal cage2;
	Animal cage3;
	
	//Give it a constructor that takes an Animal object and stores it in this attribute
	//Remove the argument to the constructor and just have it set all these variables to null. 
	//That means that the variable doesn’t reference any object
	public Zoo(){
		cage1 = null;
		cage2 = null;
		cage3 = null;
	}
	//create methods to set each of these (call them putInCage1, putInCage2, and putInCage3); 
	//the methods take an Animal object and set the appropriate variable
	public void putInCage1(Animal animal){
		cage1 = animal;
	}
	public void putInCage2(Animal animal){
		cage2 = animal;
	}
	public void putInCage3(Animal animal){
		cage3 = animal;
	}
	
	// write a method print that prints the message “The zoo contains a ” followed the animal’s type. 
	//Then modify print to print any of these that are not null in a format such as 
	//The zoo contains the following: 
	//Lion 
	//Zebra 
	public void print (){
		if(cage1 != null)
		System.out.println("The zoo contains the following:  " + cage1);//cage = animal's type
		if(cage2 != null)
			System.out.println("The zoo contains the following:  " + cage2);
		if(cage3 != null)
			System.out.println("The zoo contains the following:  " + cage3);
	}
	//write Zoo methods timePasses, allTalk, and feedAll 
	//that call the corresponding method for each (non-null) animal in the zoo. 
	public void timePasses(Animal animal){
		animal.timePasses();
	}
	// Add a method feed to Animal that sets hunger back to 0. 
	public void feedAll(Animal animal){
		if(cage1 !=null)
			cage1.feed();
		if(cage2 !=null)
			cage2.feed();
		if(cage3 !=null)
			cage3.feed();
	}	
	//write an abstract method talk that takes no arguments and returns nothing
	//an abstract method must be declared to be an abstract class
	public void allTalk(Animal animal){
		animal.talk();
	}

}
