package lab4;

public class Cinnamon extends InventoryComponentDecorator{

	protected int tempAmount;
	protected double tempPrice = 0.25;
	protected String tempName = "Cinnamon";
	public Cinnamon(InventoryComponent i, int amount){
		super(i);
		tempAmount = amount;
		System.out.println("Cinnamon is created. There are "+ tempAmount);
	}
	
	public String getDescription()
	{
		return "Cinnamon currently contains " + getAmount() + " units \n$" + getCost() + "/unit";
	}

	
	public double getCost()
	{
		
		return tempPrice;
	}
	
	public int getAmount(){
		return temp.getAmount()+tempAmount;
	}
	public double changeCost(double n){
		tempPrice = n;
		return tempPrice;
	}
	
	public String getName(){
		return tempName;
	}
	
	public int setAmount(int n){
		tempAmount = n;
		return tempAmount;
	}
}
