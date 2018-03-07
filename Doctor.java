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
		surgeon = Boolean.parseBoolean(JOptionPane.showInputDialog("Are you a surgeon? (true or false)"));
		System.out.println(surgeon);
		this.surgeon = surgeon;
	}
	public double getStudentLoanDebt() {
		return studentLoanDebt;
	}
	public void setStudentLoanDebt(double studentLoanDebt) {
		this.studentLoanDebt = studentLoanDebt;
	}
	
// toString ===================================================
	
	
	
	
	
	
	
	
	public static Doctor makeDoctor()
	{
		
		return null;
	}

}
