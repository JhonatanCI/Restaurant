package model;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
	private List<Ingredient> ingredients;
	
	public Recipe() {
		ingredients = new ArrayList<Ingredient>();
	}
	
	public void addIngredient(String n, double w) {
		
		Ingredient searched = null;
		
		
		if(findIngredient(n)>=0) {
			searched=ingredients.get(findIngredient(n));
			searched.addWeight(w);
		}else {
			Ingredient newIngredient = new Ingredient(n, w);
			ingredients.add(newIngredient);
		}		
	}
	
	public boolean removeIngredient(String n) {
		
		boolean removed = false;
		if(findIngredient(n)>=0) {
			
			ingredients.remove(findIngredient(n));
			removed = true;
			
		}
		
		return removed;
	}
	
	public List<Ingredient> getIngredients(){
		return ingredients;
	}
	
	public int findIngredient(String name) {
		
		int finded= -1;
		for (int i = 0; i < ingredients.size() && finded==-1; i++) {
			Ingredient current = ingredients.get(i);
			if(current.getName().equals(name)) {
				finded = i;
			}
		}
		
		return finded;
		
	}
}
