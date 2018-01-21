//Self Check: Chapter 8, Section 8.2
//#7)
//Thanh Ngo
//CSC 143
//Jan 6, 2018
//A Name object represents a person's name.
public class Name { //class header
 //fields representing the person's first name, last name, and middle initial.
 String firstName; //a sequence of characters. Strings are objects
 char middleInitial; // a single character value
 String lastName; /   /a sequence of characters. 
 
	//this method returns the person's name in normal order. For ex: "John Q. Public". 
    public String getNormalOrder(){
        return firstName + " " + middleInitial + " " + lastName;
    }
    
    //this method returns the person's name in a reverse order. For ex: "Public, John Q.". 
    public String getReverseOrder(){
        return lastName + " " + firstName + " " + middleInitial;
    }
}