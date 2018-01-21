package Example_Java;
import java.util.Scanner;
//Week 1 Exercise 2 Sample

public class MenuSample { //clas MenuSample
	
//	public static int showMenu(){
//		//Declaring var for user choice and default value as 0
//		int choice = 0;
//		
//		//printing menu to a screen
//		System.out.println("Select one of the following:");
//		System.out.println("C for coffee");
//		System.out.println("T for tea");
//		System.out.println("H for help");
//		System.out.println("Q for quit");
//		
//		//Getting user choice from the menu above
//		System.out.println("Awesome...select one of the following coffee items:\n");
//		System.out.println("L for latte");
//		System.out.println("M for mocha");
//		System.out.println("E for expresso");
//		System.out.println("X to previous menu");
//		
//		//Getting user choice from the coffee items
//		System.out.println("You have selected a Mocha -- $5.60");
//		System.out.println("Awesome...select one of the following c");
//	}
	public static void Coffee(){
		System.out.println("Happy 1 function");
		return;
	}
	public static void Happy2(){
		System.out.println("\nHappy 2 function");
		return;
	}
	public static void Happy3(){
		System.out.println("\nHappy 3 function");
		return;
	}

	static void main(String[] args) { //main method 
		//Scanner used for input within the program
		Scanner sc = new Scanner(System.in); // set an object sc for user input
		
		System.out.println("Select one of the following:");
		System.out.println("1. for coffee");
		System.out.println("2. for tea");
		System.out.println("3. for help");
		System.out.println("4. for quit");
	}

}
