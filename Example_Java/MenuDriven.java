package Example_Java;
import java.util.*;//for Scanner input by user

public class MenuDriven {
	boolean Q;
	
	public static void main(String[] args) {
		MenuDriven menu = new MenuDriven();
		menu.runMenu();
	}
	
	public void runMenu(){
		printHeader();//print printHeader 1 time
		while(!Q){
			printMenu();
			int choice = getInput();
			performAction(choice);
		}
	}

	private void printHeader(){//private cant call without the class
		System.out.println("+----------------------------------+");
		System.out.println("|         Welcome to our           |");
		System.out.println("|        Menu Application          |");
		System.out.println("+----------------------------------+");
	}
	
	private void printMenu(){
		System.out.println("\nSelect one of the following:");
		System.out.println("C for Coffee");
		System.out.println("T for Tea");
		System.out.println("H for Help");
		System.out.println("Q for Quit");
	}
	
		
		Scanner user_input = new Scanner(System.in);
        
        char choice = (char) Integer.parseInt();
       
        
		while(choice < 0 || choice > 2){
			try{
				System.out.print("\nAwesome...Please enter your coffee items selection:");
				choice = (char) Integer.parseInt(user_input.nextLine());
			}
			catch(NumberFormatException e){
				System.out.println("Invalid selection. Please try again.");
			}
		}
		return choice;
	}
	private void performAction(int choice){
		switch(choice){
			case 0:
				Q = true;
				System.out.println("Thank you for using our application.");
				break;
			case 1:
				pickColor();
				break;
			case 2:
				pickShape();
				break;
			default:
				System.out.println("An unknow error has occured!");
				
		}
	}
	private void pickColor(){
		int num = (int)(Math.random() * 4);
		switch(num){
		case 0:
			System.out.println("Green");
			break;
		case 1:
			System.out.println("Red");
			break;
		case 2:
			System.out.println("Blue");
			break;
		case 3:
			System.out.println("White");
			break;
		default:
			System.out.println("Black");
		}
	}
	private void pickShape(){
		int num = (int)(Math.random() * 4);
		switch(num){
		case 0:
			System.out.println("Square");
			break;
		case 1:
			System.out.println("Circle");
			break;
		case 2:
			System.out.println("Triangle");
			break;
		case 3:
			System.out.println("Hexagon");
			break;
		default:
			System.out.println("Pyramid");
		}
	}


}











