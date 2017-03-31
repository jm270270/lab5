package lab4;

import java.util.*;

public class Recipe {
    private String recipeName;
    private List<RecipeComponent> recipeComponent;

    public Recipe()
    {
    	setRecipeName("");
    	recipeComponent = new ArrayList<RecipeComponent>();
    	
    }
    public Recipe(String recipeName,List<RecipeComponent> recipeComponent)
    {
    	this.setRecipeName(recipeName);
    	this.recipeComponent = recipeComponent;
    	
    }
	public String getRecipeName() {
		return recipeName;
	}
	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}
	
	public void addRecipeComponent(RecipeComponent r){
		recipeComponent.add(r);
	}
	public List<RecipeComponent> getRecipeComponent() {
		return recipeComponent;
	}
	public void setRecipeComponent(List<RecipeComponent> recipeComponent) {
		this.recipeComponent = recipeComponent;
	}
}
