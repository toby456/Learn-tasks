package com.qa.Vehicles2;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	List<Vehicles> garage = new ArrayList<Vehicles>();
	
	
	public void addVehicle(Object vehicle) {
		garage.add((Vehicles) vehicle);
		
	}

}
