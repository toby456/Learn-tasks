package com.qa.Vehicles2;

public class Motorbike extends Vehicles{
	
	private boolean radio;
	private boolean turbo;
	
	
	
	
	public Motorbike(String brand, int numWheels, int numSeats, boolean radio, boolean turbo) {
		super(brand,numWheels,numSeats); 
		this.radio = radio;
		this.turbo = turbo;
		
	}
	
	@Override
	public String goForward() {
		return "The motorbike has moved forwards";
	}
	
	
	@Override
	public String goBackward() {
		return "The motorbike has moved backwards";
		
	}

}
