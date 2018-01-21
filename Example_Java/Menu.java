//Thanh Ngo
//CSC 143 
//1/12/2018
//Week 2 Weekly Execise -- Menu driven console application


package Example_Java;
import java.util.Scanner;//import Scanner to take user's input

//Menu Program
public class Menu {//main class name Menu

	public static void intro(){//intro method which can be callled in the main method
		System.out.println("+----------------------------------+");//print to the new line statement
		System.out.println("|         Welcome to our           |");
		System.out.println("|        Menu Application          |");
		System.out.println("+----------------------------------+");
	}
	public static void printHeader(){//method printHeader which can be called in the main method
		System.out.println();//display and empty line(skip a line, white space)
		System.out.println("Select one of the following:");
		System.out.println("C for coffee");
		System.out.println("T for tea");
		System.out.println("H for help");
		System.out.println("Q to quit");
	}
	public static void coffeeItems(){//method coffeeItems which can be called in the main method
		System.out.println("Awesome...select one of the following coffee items:");
		System.out.println("L for latte");
		System.out.println("M for mocha");
		System.out.println("E for expresso");
		System.out.println("X to previous menu");
		System.out.println();
	}
	public static void mochaSelection(){
		System.out.println("You have selected a Mocha -- $5.60");
		coffeeItems();
		System.out.println();
	}
	public static void latteSelection(){
		System.out.println("You have selected a Latte -- $4.90");
		coffeeItems();
		System.out.println();
	}
	public static void expressoSelection(){
		System.out.println("You have selected an Expresso -- $3.50");
		coffeeItems();
		System.out.println();
	}
	public static void teaItems(){		
		System.out.println("All teas are $2.95! Please select one of the following tea items:");
		System.out.println("G for green tea");
		System.out.println("B for black tea");
		System.out.println("J for jasmin tea");
		System.out.println("X to previous menu");
		System.out.println();
	}
	public static void main(String [] args) throws Exception{//main method	
		intro();//method called intro
		printHeader();	//method called printHeader
		System.out.println();//skip an empty line
		
		Scanner input = new Scanner(System.in);//input by user method
		char choice;//var choice as a char character, 1 character 'e'
		int choice2 = 0;
		
		do{//do take user input and output selections before while loop iteration
			
			try{
				choice2 = input.nextInt();
			}
			catch(Exception e){
				System.out.println("Please enter your selection using upper case letters!");	
		}
			choice = input.next().charAt(0);
			if(choice == choice2)
				throw new Exception("Invalid");
			else
				System.out.println("Welcome to our menu program.");
				System.out.println();
			
		switch(choice){//switch statement method with parameter
			//Coffee Selections
			case 'C': coffeeItems();
			break;
			case 'M': mochaSelection();
			break;
			case 'L': latteSelection();
			break;
			case 'E': expressoSelection();
			break;
			
			//Tea Selections
			case 'T':teaItems();
			break;
			case 'B': System.out.println("Black Tea");
				      teaItems();
			break;
			case 'J': System.out.println("Jasmin Tea");
				      teaItems();
			break;
			case 'G': System.out.println("Green Tea");
					  teaItems();
			break;
			//Help Selection
			case 'H': System.out.println("Please see our cashiers for assistant, or preselect your selections. Thank You!");
				      coffeeItems();
			break;
			
			case 'Q': System.out.println("Thank you for using our cafe ordering system!");
					  System.out.println("To continue order please......");
					  printHeader();
			break;
			case 'X': System.out.println("Ok...taking back to main menu");
				 	  printHeader();
			break;
			
			//Selection that not listed in our cases will display a default message
			default: System.err.println("Your selection is not on the menu! Please select again.\n"
					                  + "Also our menu input is case sensitive, make sure you use upper case for your selections.");
										printHeader();
		}
		}while(choice !='Q');	//exit if user choose 'Q'	
	}
}//end of the program





