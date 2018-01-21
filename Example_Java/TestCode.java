package Example_Java;
import java.util.*;//for Scanner input by user

public class TestCode {
	public static void coffeeItems(){
		System.out.println("Awesome...select one of he following coffee items:");
		System.out.println("L for latte");
		System.out.println("M for mocha");
		System.out.println("E for expresso");
		System.out.println("X to previous mene");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("+----------------------------------+");
		System.out.println("|         Welcome to our           |");
		System.out.println("|        Menu Application          |");
		System.out.println("+----------------------------------+");
		
		System.out.println();
		System.out.println("Select one of the following:");
		
		char option = input.next().charAt(0);
		System.out.println();
		
		do{
			System.out.println("C for coffe");
			System.out.println("T for tea");
			System.out.println("H for help");
			System.out.println("Q to quit\n");
			
			switch(option){
				case 'C': coffeeItems();
			}
			
		}while(option !='Q');
		
	}

}
