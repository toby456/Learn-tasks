package com.qa.Vehicles2;

public abstract class Vehicles {
	
	private int numWheels;
	private String brand;
	private int numSeats;
	private String model;
	
	public Vehicles (String model, String brand, int numWheels, int numSeats) {
		this.model = model;
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


	public int getNumWheels() {
		return numWheels;
	}


	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getNumSeats() {
		return numSeats;
	}


	public void setNumSeats(int numSeats) {
		this.numSeats = numSeats;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}
	
	@Override
	public String toString() {
		return model;
	}
	

	
	
	
}
