package Chapter9Exercise;

public class Monkey extends Animal {
	public Monkey(){//constructor for Monkey class that takes no arguments
		super();//This calls the constructor for Animal
	}

	@Override
	//overrides abstract talk method from the Animal class
	public void talk() {//subclass Monkey must implement an abstract method from superclass
		super.timePasses();
		if(getHunger()<=6)
		System.out.println("The Monkey is going crazy from hunger.");
		
	}
	public String toString(){
		return "Monkey";
	}

}
