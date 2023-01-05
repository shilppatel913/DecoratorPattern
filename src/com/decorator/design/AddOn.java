package com.decorator.design;

/**Decorator **/
public abstract class AddOn extends Beverage{
	
	private Beverage beverage;
	
	public AddOn(Beverage beverageType,String description) {
		super(description);
		this.beverage=beverageType;
	}
	
	public abstract String description();
}
