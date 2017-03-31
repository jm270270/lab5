package lab4;

public interface InventoryComponent {
	public int getAmount();
	public double getCost();
	public String getDescription();
	public double changeCost(double n);
	public String getName();
	public int setAmount(int n);
}
