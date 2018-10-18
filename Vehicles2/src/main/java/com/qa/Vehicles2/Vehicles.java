package com.qa.Vehicles2;

public abstract class Vehicles {
	
	private int numWheels;
	private String brand;
	private int numSeats;
	
	public Vehicles (String brand, int numWheels, int numSeats) {
		this.numWheels = numWheels;
		this.brand = brand;
		this.numSeats = numSeats;
		
	}
	
	
	public String goForward() {
		return "The vehicle has moved forwards";
	}
	
	public String goBackward() {
		return "The vehicle has moved backwards";
		
	}
	

}
