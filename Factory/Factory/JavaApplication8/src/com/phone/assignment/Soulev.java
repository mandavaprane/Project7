package com.phone.assignment;

public class Soulev extends KiaBattFactory {

	Soulev(String Cells, String Casing, String Controller,String Charger) {
		// TODO Auto-generated constructor stub
		System.out.println("Invoking Soulev with the configuration as Cells ("+Cells +"), Casing (" + Casing + "), Controller( " + Controller + "), Charger (" + Charger + ")");
		
	}
	@Override
	public void collectparts() {
		// TODO Auto-generated method stub
        System.out.println("Collect Parts for Soulev");
		
	}

	@Override
	public void testparts() {
		// TODO Auto-generated method stub
		 System.out.println("Test Parts for Soulev");
		
	}

	@Override
	public void assembleparts() {
		// TODO Auto-generated method stub
		 System.out.println("Assemble Parts for Soulev");
		
	}

	@Override
	public void testbattery() {
		// TODO Auto-generated method stub
		 System.out.println("Test Battery for Soulev");
		
	}

	@Override
	public void ship() {
		// TODO Auto-generated method stub
		 System.out.println("Ship for Soulev");
		
	}
}
