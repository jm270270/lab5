package lab4;

import java.util.*;

public class SampleCoffeeRecipe extends RecipeComponentDecorator{

	protected List<RecipeComponentLevel> recipeComponentLevel;
	
	public SampleCoffeeRecipe(RecipeComponent r){
		super(r);
		recipeComponentLevel = new ArrayList<RecipeComponentLevel>();
		recipeComponentLevel.add(new RecipeComponentLevel(1,"DarkRoast"));
		recipeComponentLevel.add(new RecipeComponentLevel(1,"Cream"));
		recipeComponentLevel.add(new RecipeComponentLevel(2,"Cinnamon"));
		
	}
	
	public String getDescription(){
		return "DarkRoast,Cream,Cinnamon";
	}
	public double getCost(){
		double total = 0;
//		Iterator<RecipeComponentLevel> i = recipeComponentLevel.iterator();
//		while (i.hasNext()){
//			if (i.next().getElement() == (new)
//		}
		return total;
	}
}
