package lab4;

public abstract class InventoryComponentDecorator implements InventoryComponent{

	protected InventoryComponent temp;
	
	public InventoryComponentDecorator(InventoryComponent i)
	{
		temp = i;
	}
	
	public String getDescription()
	{
		return temp.getDescription();
	}
	
	public int getAmount()
	{
		return temp.getAmount();
	}
	public double getCost(){
		return temp.getCost();
	}
	public double changeCost(double n){
		return n;
	}
	public String getName(){
		return temp.getName();
	}
	public int setAmount(int n){
		return n;
	}
		
}
