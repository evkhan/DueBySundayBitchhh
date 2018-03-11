// ***************************************************************************
// Written by..: Ester Aguilera & Blake Cannoe
// Program Name: MakeAPeep
// Purpose.....: Create a person, politician, farmer, lawyer or doctor & view 
// their respective info based on user input.
// ***************************************************************************
import java.util.*;
import javax.swing.JOptionPane;

public class MainClass 
{
	public static void main(String[] args) 
	{
		// my single array that will hold all my values
		ArrayList<Person>myArray = new ArrayList<Person>(1000); 
		char choice = 0;
		
		/* Do-while loop to display message at least once before user makes a choice;
		 * loop continues to run as long as choice is not 'Q'
		 */
		do {
			String menu;
			String message = "A. Add a Person.\n";
			message += "B. Add a Politician.\n";
			message += "C. Add a Farmer.\n";
			message += "D. Add a Lawyer.\n";
			message += "E. Add a Doctor.\n";
			message += "F. Display all People.\n";
			message += "G. Display all Politicians.\n";
			message += "H. Display all Lawyers.\n";
			message += "I. Display all Doctors.\n";
			message += "Q. Exit Program.\n";
			menu = JOptionPane.showInputDialog(message, "Enter your selection.");
			choice = menu.toUpperCase().charAt(0);
			
		// Switch Case within for loop to determine which methods to call based on user's input
		switch(choice) {
		case 'A':// Add a Person
			Person person = new Person(" ");
			person = Person.makePerson();
			myArray.add(person);
			break;
			
		case 'B':// Add a Politician
			Politician politician = Politician.makePolitician();
			myArray.add(politician);
			break;
			
		case 'C':// Add a Farmer
			Farmer farmer = Farmer.makeFarmer();
			myArray.add(farmer);
			break;
			
		case 'D':// Add a Lawyer
			Lawyer lawyer = Lawyer.makeLawyer();
			myArray.add(lawyer);			
			break;
			
		case 'E':// Add a Doctor
			Doctor doctor = Doctor.makeDoctor();
			myArray.add(doctor);
			break;
			
		case 'F':// Display all People
			// for loop for running through array list 
			for(int i = 0; i < myArray.size(); i++) 
			{
				if(myArray.get(i) instanceof Person) // this tests if current object in array is of class type Person
					JOptionPane.showMessageDialog(null, myArray.get(i));
			}
			break;
			
		case 'G':// Display all Politicians
			for(int i = 0; i < myArray.size(); i++) 
			{
				if(myArray.get(i) instanceof Politician) // this tests if current object in array is of class type Politician
					JOptionPane.showMessageDialog(null, myArray.get(i));				
			}
			break;
			
		case 'H':// Display all Lawyers
			for(int i = 0; i < myArray.size(); i++) 
			{
				if(myArray.get(i) instanceof Lawyer) // this tests if current object in array is of class type Person
					JOptionPane.showMessageDialog(null, myArray.get(i));
			}
			break;
			
		case 'I':// Display all Doctors
			for(int i = 0; i < myArray.size(); i++) 
			{
				if(myArray.get(i) instanceof Doctor) // this tests if current object in array is of class type Person
					JOptionPane.showMessageDialog(null, myArray.get(i));
			}
			break;
			
		case 'Q':// Exit Program
			JOptionPane.showMessageDialog(null, "Don't come back.");
			break;
			
		default:// Invalid Entry
			JOptionPane.showMessageDialog(null, "Invalid");
			break;
		}
		
		
		}while (choice != 'Q');
		
	} 
	
// End of Menu ==============================================================================

	
} 



