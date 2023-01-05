package com.decorator.design;
import java.util.Scanner;
public class Test {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		HouseBlend houseBlend=new HouseBlend("This is your houseblend coffee");
		System.out.println(houseBlend.getDescription());
		System.out.println(houseBlend.cost());
		System.out.println("-----------------------------------------");
		
		DarkRoast darkRoast=new DarkRoast("This is your darkroast coffee");
		System.out.println(darkRoast.getDescription());
		System.out.println(darkRoast.cost());
		System.out.println("-----------------------------------------");
		
	
		/** Sugar in HouseBlend **/
	/**	Sugar sugar=new Sugar(houseBlend,"Adding Sugar in HouseBlend");
		System.out.println(houseBlend.getDescription());
		System.out.println(houseBlend.cost());
		System.out.println(sugar.description());
		System.out.println(sugar.cost()); **/
		
		/**Milk in DarkRoast **/
		/**Milk milk=new Milk(darkRoast,"Adding Milk in DarkRoast");
		System.out.println(darkRoast.getDescription());
		System.out.println(darkRoast.cost());
		System.out.println(milk.cost());
		System.out.println(milk.description()); **/
		
		boolean flag=true;
		
		while(flag) {
		System.out.println("1.Add Milk");
		System.out.println("2.Add Sugar");
		System.out.println("3.Add Sugar and Milk");
		System.out.println("Enter your add-on");
		int ch=scan.nextInt();
		
		switch(ch) {
			case 1:
				System.out.println("Enter your beverage");
				String beverage=scan.next();
				if(beverage.equalsIgnoreCase("HouseBlend")) {
					Milk milk1=new Milk(houseBlend,"Adding Milk in HouseBlend");
					System.out.println(houseBlend.getDescription());
					System.out.println(houseBlend.cost());
					System.out.println(milk1.description());
					System.out.println(milk1.cost());
					System.out.println("Total cost :"+(houseBlend.cost()+milk1.cost()));
					
					
				}else if(beverage.equalsIgnoreCase("DarkRoast")) {
					Milk milk1=new Milk(darkRoast,"Adding Milk in DarkRoast");
					System.out.println(darkRoast.getDescription());
					System.out.println(darkRoast.cost());
					System.out.println(milk1.description());
					System.out.println(milk1.cost());
					System.out.println("Total cost :"+(darkRoast.cost()+milk1.cost()));
					
				}
				break;
				
			case 2:
				System.out.println("Enter your beverage");
				String bev=scan.next();
				if(bev.equalsIgnoreCase("HouseBlend")) {
					Sugar sugar=new Sugar(houseBlend,"Adding Sugar in HouseBlend");
					System.out.println(houseBlend.getDescription());
					System.out.println(houseBlend.cost());
					System.out.println(sugar.description());
					System.out.println(sugar.cost());
					System.out.println("Total cost :"+(houseBlend.cost()+sugar.cost()));
					
				}else if(bev.equalsIgnoreCase("DarkRoast")) {
					Sugar sugar=new Sugar(darkRoast,"Adding Sugar in DarkRoast");
					System.out.println(darkRoast.getDescription());
					System.out.println(darkRoast.cost());
					System.out.println(sugar.description());
					System.out.println(sugar.cost());
					System.out.println("Total cost :"+(darkRoast.cost()+sugar.cost()));
				}
				break;
			case 3:
				System.out.println("Enter your beverage");
				String b=scan.next();
				if(b.equalsIgnoreCase("HouseBlend")) {
					Milk milk1=new Milk(houseBlend,"Adding Milk in HouseBlend");
					System.out.println(houseBlend.getDescription());
					System.out.println(houseBlend.cost());
					System.out.println(milk1.description());
					System.out.println(milk1.cost());
				
					
					Sugar sugar=new Sugar(darkRoast,"Adding Sugar in HouseBlend");
					System.out.println(houseBlend.getDescription());
					System.out.println(houseBlend.cost());
					System.out.println(sugar.description());
					System.out.println(sugar.cost());
					
					System.out.println("Total cost :"+(houseBlend.cost()+milk1.cost()+sugar.cost()));
					
					
				}else if(b.equalsIgnoreCase("DarkRoast")) {
					
					Milk milk1=new Milk(darkRoast,"Adding Milk in DarkRoast");
					System.out.println(darkRoast.getDescription());
					System.out.println(darkRoast.cost());
					System.out.println(milk1.description());
					System.out.println(milk1.cost());
			
					
					Sugar sugar=new Sugar(darkRoast,"Adding Sugar in DarkRoast");
					System.out.println(darkRoast.getDescription());
					System.out.println(darkRoast.cost());
					System.out.println(sugar.description());
					System.out.println(sugar.cost());
					
					System.out.println("Total cost :"+(darkRoast.cost()+milk1.cost()+sugar.cost()));
				}
				break;
			default:
				flag=false;
				System.exit(0);
		}
		
		System.out.println("--------------------------------------------");
		
	}
		
		
	}
}
