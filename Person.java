import java.util.*;
public class Person {
	private String name;

// Constructors =====================

	public Person(String name) {
		super();
		setName(name);
	} // end of constructor

// Setters and Getters ================
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name.toUpperCase();
	}
	
// toString method ===========================

	public String toString() {
		return "Name: " + name + ".\n";
	} // end toString

// makePerson method =======================
	
	
	public static Person makePerson(){
		Person result;
		String tempName;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a person's name: ");
		tempName = input.nextLine();
		result = new Person(tempName);
		return result;
	} // end of makePerson



} // end of Class
