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
		this.farmType = farmType;
	}

	public double getNoAcres() 
	{
		return noAcres;
	}

	public void setNoAcres(double noAcres) 
	{
		do {
		if(noAcres <= 0 || noAcres >= 500000)
		{ // why do you curly brace like this, this is wrong
			noAcres = Double.parseDouble(JOptionPane.showInputDialog(null, "Invalid input. please enter a number between 0 and 500,000"));
		} 
		} while(noAcres <= 0 || noAcres >= 500000);//forces user to enter valid input
		this.noAcres = noAcres;
	}
	
// toString =====================================================
	
	public String toString()
	{
		String result = null;
		result = super.toString();
		result += "I own a " + farmType + " farm.\n" + "My farm has " + noAcres + " acres.\n";
		return result;
	}

// makeFarmer Method =============================================
	
	public static Farmer makeFarmer()
	{
		Farmer result;
		String farmType;
		double noAcres;
		Politician tempPolitician = Politician.makePolitician();
		
		farmType = JOptionPane.showInputDialog("Enter type of farm:");
		noAcres = Double.parseDouble(JOptionPane.showInputDialog("Enter amount of Acres:"));
		
		result = new Farmer( tempPolitician.getName(), tempPolitician.isHonest(), tempPolitician.getParty(), farmType, noAcres);

		return result;
	}


}
