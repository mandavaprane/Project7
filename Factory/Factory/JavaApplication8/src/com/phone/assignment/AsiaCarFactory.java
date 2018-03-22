package com.phone.assignment;

public class AsiaCarFactory extends CarFactory {

	@Override
	public KiaBattFactory constructCar(String model) {
		// TODO Auto-generated method stub
		KiaBattFactory kiaFactory = null;
		
		if (model.equalsIgnoreCase("Optima")) {
			kiaFactory = new OptimaHybrid("Dual Carbon", "Kevlar", "Xiaomi V2", "220 Volts" );		
		} else if (model.equalsIgnoreCase("Rio")) {
			
			kiaFactory = new Rio("Lead", "Bamboo", "Raspberry Pi", "Pedals");
				
		}
		else if (model.equalsIgnoreCase("Soulev")) {
		
			kiaFactory = new Soulev("Lithium","Aluminium","Xiaomi","220 Volts");
					
		}

		return kiaFactory;		
		
	}
}
