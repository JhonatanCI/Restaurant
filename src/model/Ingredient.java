package model;

public class Ingredient {
	private String name;
	private double weight;
	
	public Ingredient(String n, double w) {
		name = n;
		weight = w;
	}
	
	public String getName() {
		return name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void addWeight(double additionalW) {
		weight += additionalW;
	}
	
	public void removeWeight(double lesslW) {
		weight -= lesslW;
	}
	
}
