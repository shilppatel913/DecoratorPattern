package com.decorator.design;

public class Sugar extends AddOn{

	public Sugar(Beverage beverage,String description) {
		super(beverage,description);
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return getDescription();
	}

	@Override
	public double cost() {
		System.out.println("Cost of sugar");
		return 10;
	}
	
	
}
