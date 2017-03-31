package lab4;

public class RecipeComponentLevel {

	private int level;
	private String element;
	
	public RecipeComponentLevel(){
		level=0;
		element = "";
	}
	public RecipeComponentLevel(int level, String element){
		this.level = level;
		this.element = element;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getElement() {
		return element;
	}
	public void setElement(String element) {
		this.element = element;
	}
}
