package com.phone.assignment;


public class OptimaHybrid extends KiaBattFactory {

	public OptimaHybrid(String Cells, String Casing, String Controller,String Charger) {
		// TODO Auto-generated constructor stub
		System.out.println("Invoking Optima_hybrid with the configuration as Cells ("+Cells +"), Casing (" + Casing + "), Controller( " + Controller + "), Charger (" + Charger + ")");
		
	}
	
	
	@Override
	public void collectparts() {
		// TODO Auto-generated method stub
        System.out.println("Collect Parts for Optima Hybrid");
		
	}

	@Override
	public void testparts() {
		// TODO Auto-generated method stub
		 System.out.println("Test Parts for Optima Hybrid");
		
	}

	@Override
	public void assembleparts() {
		// TODO Auto-generated method stub
		 System.out.println("Assemble Parts for Optima Hybrid");
		
	}

	@Override
	public void testbattery() {
		// TODO Auto-generated method stub
		 System.out.println("Test Battery for Optima Hybrid");
		
	}

	@Override
	public void ship() {
		// TODO Auto-generated method stub
		 System.out.println("Ship for Optima Hybrid");
		
	}
}
