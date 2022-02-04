package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exception.NegativeNumberException;

class IngredientTest {
		
	Ingredient ing1;
	double add;
	
	public void setupStage1() {
		 ing1  = new Ingredient("Tomate",245);
	}
	
	@Test
	void test1() {
		add = 54;
		setupStage1();
		ing1.addWeight(add);
		assertEquals(299,ing1.getWeight());
		
	}

	
	@Test
	void test2() throws NegativeNumberException{
		setupStage1();
		add = -100;
		if (add<0) {
			throw new NegativeNumberException(add);
		}else {
			ing1.addWeight(add);
		}
		assertEquals(245,ing1.getWeight());
	}
	
	@Test
	void test3() {
		setupStage1();
		add = 45;
		ing1.removeWeight(add);
		assertEquals(200,ing1.getWeight());
		
	}
	@Test
	void test4() throws NegativeNumberException{
		setupStage1();
		add = -100;
		if (add<0) {
			throw new NegativeNumberException(add);
		}else {
			ing1.removeWeight(add);
		}
		assertEquals(245,ing1.getWeight());
		
	}
}
