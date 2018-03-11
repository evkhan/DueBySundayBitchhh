import javax.swing.JOptionPane;
public class Doctor extends Politician
{
	private boolean surgeon = false; 
	private double studentLoanDebt; // between 0 and 500,000
	
// Constructors ===============================================
	
	public Doctor(String name, boolean honest, char party, boolean surgeon, double studentLoanDebt) {
		super(name, honest, party);
		setSurgeon(surgeon);
		setStudentLoanDebt(studentLoanDebt);
	}
	
// Setters & Getters ==========================================
	
	public boolean isSurgeon() {
		return surgeon;
	}
	public void setSurgeon(boolean surgeon) 
	{
		this.surgeon = surgeon;
	}
	public double getStudentLoanDebt() 
	{
		return studentLoanDebt;
	}
	public void setStudentLoanDebt(double studentLoanDebt) 
	{
		this.studentLoanDebt = studentLoanDebt;
	}
	
// toString ===================================================
	
	public String toString()
	{
		String result = null;
		result = super.toString();
		if(surgeon == true)
		{
			result += "I am a surgeon.\n";
		}
		else
			result += "I am not a surgeon.\n";
		result += "My student loan debt amounts to: " + studentLoanDebt;
		return result;
	}
	
// makeDoctor Method =================================================================================	
	
	public static Doctor makeDoctor()
	{
		Doctor result;
		boolean surgeon = false; // don't know if setting this to false is correct
		double studentLoanDebt = 0;
		Politician tempPolitician = Politician.makePolitician();
		surgeon = Boolean.parseBoolean(JOptionPane.showInputDialog("Are you a surgeon? (true or false)"));
		studentLoanDebt = Double.parseDouble(JOptionPane.showInputDialog("How much money do you owe in student loan debt?"));
		result = new Doctor(tempPolitician.getName(), tempPolitician.isHonest(), tempPolitician.getParty(), surgeon, studentLoanDebt);
		return result;
	}

}
