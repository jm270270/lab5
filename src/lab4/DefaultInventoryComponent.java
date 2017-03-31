package lab4;

public class DefaultInventoryComponent implements InventoryComponent{

	public int getAmount(){
		return 0;
	}
	public double getCost(){
		return 0;
	}
	public String getDescription(){
		return "";
	}
	public double changeCost(double n)
	{
		return n;
	}
	public String getName(){
		return "";
	}
	public int setAmount(int n){
		return n;
	}
}
