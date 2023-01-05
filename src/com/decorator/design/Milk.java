package com.decorator.design;

public class Milk extends AddOn {

	public Milk(Beverage beverage,String description) {
		super(beverage,description);
	}

	@Override
	public String description() {
		return getDescription();
	}

	@Override
	public double cost() {
		System.out.println("Cost of Milk");
		return 20;
	}
	
}
