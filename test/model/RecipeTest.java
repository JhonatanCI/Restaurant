package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecipeTest {
	
	Recipe none, recipeWithIng;
	String[ ] names = new  String[] {"Cebolla","Ajo","Arroz"};
	double[ ] weights = new double[]{315,58,520};
	
	public void setupStage1() {
		 none  = new Recipe();
	}
	
	public void setupStage2() {
		 recipeWithIng = new Recipe();
		 for (int i = 0; i<3;i++ ) {
			 recipeWithIng.addIngredient(names[i],weights[i]);
		}
		 
		 
	}

	@Test
	void test() {
		setupStage1();
		String name = "Sal";
		double weight = 12;
		none.addIngredient(name,weight);
		assertEquals(1,none.getIngredients().size());
		assertTrue(none.findIngredient(name)>=0);
	}
	
	@Test
	void test2() {
		setupStage2();
		String name = "Pimienta";
		double weight = 6;
		recipeWithIng.addIngredient(name,weight);
		assertEquals(4,recipeWithIng.getIngredients().size());
		assertTrue(recipeWithIng.findIngredient(name)>=0);
		assertEquals(recipeWithIng.getIngredients().get(recipeWithIng.findIngredient(name)).getWeight(),6);
	}
	
	@Test
	void test3() {
		setupStage2();
		String name = "Ajo";
		double weight = 21;
		recipeWithIng.addIngredient(name,weight);
		assertEquals(3,recipeWithIng.getIngredients().size());
		assertEquals(recipeWithIng.getIngredients().get(recipeWithIng.findIngredient(name)).getWeight(),79);
	}
	
	@Test
	void test4() {
		setupStage2();
		String name = "Ajo";
		recipeWithIng.removeIngredient(name);
		assertEquals(2,recipeWithIng.getIngredients().size());
		assertTrue(recipeWithIng.findIngredient(names[0])>=0);
		assertTrue(recipeWithIng.findIngredient(names[2])>=0);
		
		
	}

}
