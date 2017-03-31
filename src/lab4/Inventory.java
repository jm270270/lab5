package lab4;

import java.util.*;

public class Inventory {

	private List<InventoryComponent> inventoryComponent;
	public Inventory()
	{
		inventoryComponent = new ArrayList<InventoryComponent>(); 
	}
	public List<InventoryComponent> getInventoryComponent() {
		return inventoryComponent;
	}
	public void setInventoryComponent(List<InventoryComponent> inventoryComponent) {
		this.inventoryComponent = inventoryComponent;
	}
	public void info(){
		System.out.println("\nThe following is the information of Inventory:");
		Iterator<InventoryComponent> i = inventoryComponent.iterator();
		while (i.hasNext())
		{
			System.out.println(i.next().getDescription());
		}
	}
	public void add(InventoryComponent e){
		inventoryComponent.add(e);
	}
	public void delete(InventoryComponent e){
		inventoryComponent.remove(e);
	}
	
}
