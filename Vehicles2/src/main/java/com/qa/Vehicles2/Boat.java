package com.qa.Vehicles2;

public class Boat extends Vehicles{
	
	private boolean radar;
	private int numPropellor;
	
	
	public Boat(String model, String brand, int numWheels, int numSeats, boolean radar, int numPropellor) {
		super(model, brand,numWheels,numSeats); 
		this.radar = radar;
		this.numPropellor = numPropellor;
		
	}
	
	@Override
	public String goForward() {
		return "The boat has moved forwards";
	}
	
	
	@Override
	public String goBackward() {
		return "The boat has moved backwards";
		
	}

	public boolean isRadar() {
		return radar;
	}

	public void setRadar(boolean radar) {
		this.radar = radar;
	}

	public int getNumPropellor() {
		return numPropellor;
	}

	public void setNumPropellor(int numPropellor) {
		this.numPropellor = numPropellor;
	}
	
	
	
	

}
