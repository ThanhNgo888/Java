package Chapter9Exercise;

public class Tiger extends Animal {
	public Tiger(){//constructor for Tiger class that takes no arguments
		super();//This calls the constructor for Animal
	}

	@Override
	//overrides abstract talk method from the Animal class
	public void talk() {//subclass Tiger must implement an abstract method from superclass
		super.timePasses();
		System.out.println("Grrrr.......!!!!");
		
		if(getHunger()<=4)
		System.out.println("The Tiger is angrily hungry.");
		
	}
	public String toString(){
		return "Tiger";
	}

}
