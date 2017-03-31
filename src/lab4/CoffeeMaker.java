package lab4;

import java.util.*;

public class CoffeeMaker {

	private List<Recipe> recipeArray; // This is the array of recipes
	private int numRecipes = 0;
	private Inventory inventory; // This is our inventory in the coffee maker
	
	public CoffeeMaker() {
		//Setup inventory
		recipeArray = new ArrayList<Recipe>();
		numRecipes = 0;
		inventory = new Inventory();
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void addRecipe(Recipe rAdd) {
		recipeArray.add(rAdd);
	}

	public Recipe getRecipe(String recipeName) {
		Iterator<Recipe> i = recipeArray.iterator();
		while (i.hasNext()){
			if (recipeName == i.next().getRecipeName())
			{
				return i.next();
			}
		}
		return null;
	}

	public boolean deleteRecipe(String recipeName) {
		if (getRecipe(recipeName) != null){
			recipeArray.remove(getRecipe(recipeName));
			return true;
		}
		return false;
	}

	public boolean makeCoffee(String recipeName) {
		if (getRecipe(recipeName)!= null){	// has this recipe 
			// check the recipe components whether they are in the inventory
			Iterator<RecipeComponent> i = getRecipe(recipeName).getRecipeComponent().iterator();
			while (i.hasNext()){
				Iterator<InventoryComponent> j = inventory.getInventoryComponent().iterator();
				boolean[] hasStuff = new boolean[recipeArray.size()];
				Arrays.fill(hasStuff, Boolean.FALSE);
				int counter = 0;
				
				while (j.hasNext()){
					List<String> tempWord = Arrays.asList(i.next().getDescription().split(","));
					Iterator<String> tempIndex = tempWord.iterator();
					while(tempIndex.hasNext())
					{
						if (tempIndex.next() == j.next().getName())
						{
							// set flag, do the step later
							hasStuff[counter] = true;
						}
					}
				}
				
//				for (int index = 0; index <recipeArray.size();index++){
//					if(hasStuff[index]){
//						inventory.getInventoryComponent().get(index).setAmount(/**/
//								inventory.getInventoryComponent().get(index).getAmount()- i.next().)
//					}
//				}
			}
			
		}
		
		
		
/*		for (int i = 0; i <numRecipes; i++)
		{
			if(recipeName == recipeArray[i].getRecipeName())
			{
				if ((inventory.getCoffee() - getRecipe(recipeName).getCoffeeLevel() >=0) && 
						(inventory.getMilk() - getRecipe(recipeName).getMilkLevel() >=0) && 
						(inventory.getSugar() - getRecipe(recipeName).getSugarLevel() >=0))
					{
						inventory.setCoffee(inventory.getCoffee() - getRecipe(recipeName).getCoffeeLevel());
						inventory.setMilk(inventory.getMilk() - getRecipe(recipeName).getMilkLevel());
						inventory.setSugar(inventory.getSugar() - getRecipe(recipeName).getSugarLevel());
						return true;
					}
			}
		}
		return false;*/
		return false;
	}
}
