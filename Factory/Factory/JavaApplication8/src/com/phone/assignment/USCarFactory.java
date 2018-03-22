package com.phone.assignment;

public class USCarFactory extends CarFactory {

	@Override
	public KiaBattFactory constructCar(String model) {
		// TODO Auto-generated method stub
		KiaBattFactory kiaFactory = null;
		
		if (model.equalsIgnoreCase("Optima")) {
			kiaFactory = new OptimaHybrid("Dual Carbon", "Kevlar", "Arduino V2", "110 Volts");
			
		
		} else if (model.equalsIgnoreCase("Rio")) {
			kiaFactory = new Rio("Lead","Particleboard","Raspberry Pi","Handcrank");
			
		}
		else if (model.equalsIgnoreCase("Soulev")) {
			kiaFactory = new Soulev("Lithium","Aluminium","Arduino","110 Volts");			
		}
		return kiaFactory;				
	}
}
