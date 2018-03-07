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

// Setters & Getters ============================
	
	public String getSpecialty() 
	{
		return specialty;
	}

	public void setSpecialty(String specialty) 
	{
		specialty = JOptionPane.showInputDialog("Enter your specialty:");
		this.specialty = specialty;
	}

	public String getLawSchool() {
		return lawSchool;
	}

	public void setLawSchool(String lawSchool) 
	{
		lawSchool = JOptionPane.showInputDialog("Enter the law school you attended:");
		this.lawSchool = lawSchool;
	}
	
// toString ===================================
	
	
	
	
	
	
	
	
	
	
	public static Lawyer makeLawyer()
	{
		
		return null;
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
