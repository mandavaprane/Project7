package com.phone.assignment;

public abstract class CarFactory {

	public abstract KiaBattFactory constructCar(String model);
	

	public KiaBattFactory produceCar(String model) {

		KiaBattFactory carModel = constructCar(model);
		carModel.collectparts();
		carModel.testparts();
		carModel.assembleparts();
		carModel.testbattery(); 
		carModel.ship();
		
		return carModel;
	}
}
