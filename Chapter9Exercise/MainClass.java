package Chapter9Exercise;

public class MainClass {

	public static void main(String[] args) {
		// Create a Zebra object 
		// methods are able to invoke on the Zebra object – talk and getHunger
		 //Call both methods to verify that talk prints out the message about chewing 
		//and that getHunger returns 0
		Zebra zebra = new Zebra();
		System.out.println(zebra);
		zebra.talk();
		System.out.println("Hunger level is: " + zebra.getHunger());
		System.out.println("****************************************************");
		
		
		Lion lion = new Lion();
		System.out.println(lion);
		lion.talk();
		System.out.println("Hunger level is: " + lion.getHunger());
		System.out.println("****************************************************");
		
		Tiger tiger = new Tiger();
		System.out.println(tiger);
		tiger.talk();
		System.out.println("Hunger level is: " + tiger.getHunger());
		System.out.println("****************************************************");
		
		Monkey monkey = new Monkey();
		System.out.println(monkey);
		monkey.talk();
		System.out.println("Hunger level is: " + monkey.getHunger());
		System.out.println("****************************************************");
		
		
		//Zoo zoo = new Zoo();
		System.out.print("The zoo contains the following: " + zebra + "," + lion + "," + tiger + ", and " + monkey );
		
	}

}
