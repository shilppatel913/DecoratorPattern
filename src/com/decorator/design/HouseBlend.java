package com.decorator.design;

public class HouseBlend extends Beverage {
	
	public HouseBlend(String description) {
		super(description);
	}

	@Override
	public double cost() {
		System.out.println("Price of House Blend is :");
		return 63.55;
	}
	
	
}
