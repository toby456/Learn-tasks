package com.qa.Vehicles2;

public class Car extends Vehicles{

	
	boolean satNav;
	boolean gearStick;
	
	public Car(String brand, int numWheels, int numSeats, boolean satNav, boolean gearStick) {
		super(brand,numWheels,numSeats); 
		this.satNav = satNav;
		this.gearStick = gearStick;
		
	}
	
	public String park() {
		return "The car has been parked";
	}
	
	@Override
	public String goForward() {
		return "The car has moved forwards";
	}
	
	
	@Override
	public String goBackward() {
		return "The car has moved backwards";
		
	}
	
}

