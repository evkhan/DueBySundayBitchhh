import java.util.*;
public class Politician extends Person {
	private boolean honest = false;
	private char party = ' ';
	
	public Politician(String name, boolean honest, char party) {
		super(name);
		setHonest(honest);
		setParty(party);
	} // end of Constructor
	
	// Setters and Getters ==========================
	public boolean isHonest() {
		return honest;
	}

	public void setHonest(boolean honest) {
		this.honest = honest;
	}

	public char getParty() {
		return party;
	}
	
	public void setParty(char party) {
		Scanner input = new Scanner(System.in);
		boolean badParty = false;
		do{
			party = Character.toUpperCase(party);
			switch(party){
			case 'D':
			case 'R':
			case 'I':
				break;
			default:
				System.out.print("Invalid Party\n "
						+ "Enter only a D, R, or I: ");
				party = input.nextLine().charAt(0);
				badParty = true;
				break;
			} // end switch
		}while(badParty);
		
		
		
		
		
		this.party = party;
	}
	// ================================================
	
	@Override
	public String toString() {
		String result;
		result = super.toString();
		if(party == 'R'){
			result += "Party: Republican.\n";
		} else if(party == 'D'){
			result += "Party: Democrat.\n";
		} else
			result += "Party: Independent.\n";
		// end if/else statement
		if(honest){
			result += "I am honest.\n";
		} else
			result += "I am not honest.\n";
		return result;
	} // end toString
	
	public static Politician makePolitician(){
		Politician result;
		boolean honest;
		char party = ' ';
		Person tempPerson = Person.makePerson();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a politician's party: ");
		party = input.nextLine().charAt(0);
		System.out.print("Honest? True or False: ");
		honest = input.nextBoolean();
		result = new Politician(tempPerson.getName(), 
				honest, party);
		return result;
	} // end of makePerson
	
	
	
} // end of Class
