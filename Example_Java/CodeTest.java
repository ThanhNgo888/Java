package Example_Java;

import java.util.Scanner;//for user input
import javax.swing.JOptionPane;

public class CodeTest{
	public static void mainLevel(){
		System.out.println("Happy 1 function");
		return;
	}
	public static void secondLevel(){
		System.out.println("\nHappy 2 function");
		return;
	}
	public static void invalidEntered(){
		System.out.println("\nHappy 3 function");
		return;
	}
	public static void printHeader(){
		System.out.println("+----------------------------------+");
		System.out.println("|         Welcome to our           |");
	    System.out.println("|        Menu Application          |");
		System.out.println("+----------------------------------+");
	}

   public static void main(String[] args){
	   printHeader();
	   
	   char quit ='n';//true, make sure single quote for character
		String input;
		char choice = 0;
		
		Scanner inputChoice = new Scanner(System.in);
		while(quit != 'y'){
			System.out.println("Please select one of the following:\n"
					+ "\nC for Coffee"
					+"\nT for Tea"
					+"\nH for Help"
					+"\nQ for Quit");
			choice = (char) inputChoice.nextInt();
			
			switch (choice){
				case 1:
					mainLevel();
					break;
				case 2:
					secondLevel();
					break;
				case 3:
					invalidEntered();
					break;
				default:
					System.out.println("That wasn't a choice.");
			}
			System.out.println("Would you like to quit y/n? ");
			input = inputChoice.next().toLowerCase();
			quit = input.charAt(0);
		}//end while loop
   }//end main method
}//end main class








