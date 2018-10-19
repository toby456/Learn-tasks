package com.qa.Vehicles2;

public class Motorbike extends Vehicles{
	
	private boolean radio;
	private boolean turbo;
	
	
	
	
	public Motorbike(String model, String brand, int numWheels, int numSeats, boolean radio, boolean turbo) {
		super(model, brand,numWheels,numSeats); 
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

	public boolean isRadio() {
		return radio;
	}

	public void setRadio(boolean radio) {
		this.radio = radio;
	}

	public boolean isTurbo() {
		return turbo;
	}

	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}
	
	

}
