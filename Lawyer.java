import javax.swing.JOptionPane;
public class Lawyer extends Politician
{
	private String specialty;
	private String lawSchool;

// Constructors ================================
	
	public Lawyer(String name, boolean honest, char party, String specialty, String lawSchool) 
	{
		super(name, honest, party);
		setSpecialty(specialty);
		setLawSchool(lawSchool);
	}

// Setters & Getters =================================================================
	
	public String getSpecialty() 
	{
		return specialty;
	}

	public void setSpecialty(String specialty) 
	{
		this.specialty = specialty;
	}

	public String getLawSchool() {
		return lawSchool;
	}

	public void setLawSchool(String lawSchool) 
	{

		this.lawSchool = lawSchool;
	}
	
// toString ==========================================================================
	
	public String toString()
	{
		String result = null;
		result = super.toString();
		result += "My specialty is " + specialty + ".\n" + "I attended " + lawSchool + ".\n";
		return result;
	}
	
// makeLawyer Method =================================================================	
	
	public static Lawyer makeLawyer()
	{
		Lawyer result;
		String specialty = null;
		String lawSchool = null;
		Politician tempPolitician = Politician.makePolitician();
		
		lawSchool = JOptionPane.showInputDialog("Enter the law school you attended:");
		specialty = JOptionPane.showInputDialog("Enter your specialty:");
		result = new Lawyer(tempPolitician.getName(), tempPolitician.isHonest(), tempPolitician.getParty(), specialty, lawSchool);
		return result;
	}

	

}
