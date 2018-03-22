package com.phone.assignment;

public class EUCarFactory extends CarFactory {

	@Override
	public KiaBattFactory constructCar(String model) {
		// TODO Auto-generated method stub
		KiaBattFactory kiaFactory = null;
		
		if (model.equalsIgnoreCase("Optima")) {
			kiaFactory = new OptimaHybrid("Dual Carbon", "Kevlar", "Arduino V2", "230 Volts" );		
		} else if (model.equalsIgnoreCase("Rio")) {
		
			kiaFactory = new Rio("Lead", "Cardboard", "Raspberry Pi", "a Windmill");
						
		}
		else if (model.equalsIgnoreCase("Soulev")) {
			
			kiaFactory = new Soulev("Lithium", "Aluminium" ,"Arduino", "230 Volts");
						
		}

		return kiaFactory;		
		
	}
}
