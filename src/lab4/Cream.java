package lab4;

public class Cream extends InventoryComponentDecorator{

	protected int tempAmount;
	protected double tempPrice = 0.25;
	protected String tempName = "Cream";
	public Cream(InventoryComponent i, int amount){
		super(i);
		tempAmount = amount;
		System.out.println("Cream is created. There are "+ tempAmount);
	}
	
	public String getDescription()
	{
		return "Cream currently contains " + getAmount() + " units \n$" + getCost() + "/unit";
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
