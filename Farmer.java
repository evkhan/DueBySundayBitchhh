import javax.swing.JOptionPane;

public class Farmer extends Politician
{
	private String farmType;
	private double noAcres;  // between 1 and 1000
	
// Constructor =================================================
	
	public Farmer(String name, boolean honest, char party, String farmType, double noAcres) 
	{
		super(name, honest, party);
		setFarmType(farmType);
		setNoAcres(noAcres);
	}

// Setters & Getters ============================================
	
	public String getFarmType() 
	{
		return farmType;
	}

	public void setFarmType(String farmType) 
	{
		farmType = JOptionPane.showInputDialog("Enter type of farm:");
		this.farmType = farmType;
	}

	public double getNoAcres() 
	{
		return noAcres;
	}

	public void setNoAcres(double noAcres) 
	{
		noAcres = Double.parseDouble(JOptionPane.showInputDialog("Enter amount of Acres:"));
		if(noAcres <= 0 || noAcres >= 500000)
		{
			JOptionPane.showMessageDialog(null, "Invalid input. Number must be between 0 and 500,000");
		} // incomplete -- this must return user to menu after message is displayed
		this.noAcres = noAcres;
	}
	
// toString =====================================================
	
	public String toString()
	{
		String result = null;
		
		return result;
	}
	
	public static Farmer makeFarmer()
	{
		
		return null;
	}


	

	
	
}
