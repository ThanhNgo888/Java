//Thanh Ngo
//CSC 143 Winter 2018
//Programming Project 1 Part B, Polymorphism

package Polymorphism;

public class Client {

	public static void main(String[] args) {
		
		Publication pub[] = {new Magazine("ThomsonReuters", 500, 200, "Business India ", "Monthly"),
				new Magazine("Wolters Kluwer", 250, 150, "The Caravan", "Weekly"),
				new Magazine("Random House", 300, 75, "Dataquest", "Bi-weekly"),
				new Book("Paris Time Capsule", 287, 55, "From a Paris Bacolny", "Ella Carey"),
				new Book("Cengage", 100, 20, "PCQuest", "J.K Rowling"),
				new Book("Wiley", 150, 30, "Tehelka", "John"),
				new KidsMagazine(" Shueisha", 50, 10, "Reader's Digest", 12),
				new KidsMagazine("Kodansha", 70, 15, "Sportstar", 8),
				new KidsMagazine("Shogakukan", 30, 8, "Cartoons", 4),};
		
				for (int i = 1; i < pub.length; i++) {
				System.out.println(i + ". " + pub[i].toString());
				}
	}
}
