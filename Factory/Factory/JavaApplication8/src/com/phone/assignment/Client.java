package com.phone.assignment;

public class Client {

	public static void main(String[] args) {

		System.out.println("*************************************");
		CarFactory factory = new USCarFactory();
		factory.produceCar("Optima");
		
		System.out.println("*************************************");
		factory = new USCarFactory();
		factory.produceCar("Rio");		
		
		System.out.println("*************************************");
		factory = new USCarFactory();
		factory.produceCar("Soulev");	
		
		
		System.out.println("*************************************");
		factory = new EUCarFactory();
		factory.produceCar("Rio");	
		
		
		System.out.println("*************************************");
		factory = new EUCarFactory();
		factory.produceCar("Soulev");	
				
		System.out.println("*************************************");
		factory = new EUCarFactory();
		factory.produceCar("Optima");	
                
                System.out.println("*************************************");
		factory = new AsiaCarFactory();
		factory.produceCar("Rio");	
		
		
		System.out.println("*************************************");
		factory = new AsiaCarFactory();
		factory.produceCar("Soulev");	
				
		System.out.println("*************************************");
		factory = new AsiaCarFactory();
		factory.produceCar("Optima");	
                
		
	}
}