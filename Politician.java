import javax.swing.JOptionPane;
public class Politician extends Person 
{
	private boolean honest = false;
	private char party = ' ';

	public Politician(String name, boolean honest, char party) 
	{
		super(name);
		setHonest(honest);	// passing honest variable through setter so that it is validated
		setParty(party);    // passing party variable through setter so that it is validated
	} 
	
// Setters and Getters =========================================================
	
	public boolean isHonest() 
	{
		return honest;
	}

	public void setHonest(boolean honest) 
	{
		this.honest = honest;
	}

	public char getParty() 
	{
		return party;
	}
	
	public void setParty(char party) 
	{
//		
		this.party = party;
	}
	
// toString Method ========================================================================================
	
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
	} 
	
// makePolitician Method =====================================================================================	
	
	public static Politician makePolitician()
	{
		Politician result; 
		boolean honest;
		char party = ' ';
		Person tempPerson = Person.makePerson();
		
		party = JOptionPane.showInputDialog(null, "Enter a Politician's party (Enter D, R, or I: ").charAt(0);
		boolean badParty = true;// Set to true then is set to false upon valid input.
		do{
			party = Character.toUpperCase(party);
			switch(party){
			case 'D':
				
			case 'R':
				
			case 'I':
				badParty = false;// since there are no breaks this only needed once
				break;
			default:
				party = JOptionPane.showInputDialog(null, "Invalid Party\n " + "Enter only a D, R, or I: ").charAt(0);
				
				break;
			} 
		}while(badParty);
		//party = Character.toUpperCase(party);
		
		
		honest = Boolean.parseBoolean(JOptionPane.showInputDialog(null, "Honest? True or False: "));
		
		result = new Politician(tempPerson.getName(), honest, party);
		return result;
	} 
	
	
} // end of Class
