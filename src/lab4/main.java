package lab4;

import java.util.*;

public class main {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		
		InventoryComponent dark_roast = new DefaultInventoryComponent();
		InventoryComponent milk = new DefaultInventoryComponent();
		InventoryComponent cream = new DefaultInventoryComponent();
		InventoryComponent cinnamon = new DefaultInventoryComponent();
		
		dark_roast = new DarkRoast(dark_roast,30);
		System.out.println(dark_roast.getDescription());
		dark_roast = new DarkRoast(dark_roast,20);
		System.out.println(dark_roast.getDescription());
		
		dark_roast.changeCost(0.30);
		System.out.println(dark_roast.getDescription());
		
		milk = new Milk (milk,30);
		inventory.add(dark_roast);
		inventory.add(milk);
		inventory.info();
		
		Recipe recipe = new Recipe();
		RecipeComponent sampleCoffeeRecipe = new DefaultRecipeComponent();
		sampleCoffeeRecipe = new SampleCoffeeRecipe(sampleCoffeeRecipe);
		recipe.addRecipeComponent(sampleCoffeeRecipe);
		
		
	}
}
