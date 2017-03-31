package lab4;

public abstract class RecipeComponentDecorator implements RecipeComponent{

	protected RecipeComponent temp;
	
	public RecipeComponentDecorator(RecipeComponent i){
		temp = i;
	}
	public String getDescription()
	{
		return temp.getDescription();
	}
	public double getCost(){
		return temp.getCost();
	}
	public int getAmount(){
		return temp.getAmount();
	}
}
