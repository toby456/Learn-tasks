package com.qa.Vehicles2;

import java.util.ArrayList;

import java.util.List;

public class Garage {

	List<Vehicles> garage = new ArrayList<Vehicles>();

	public void addVehicles(Vehicles newVehicle) {
		garage.add(newVehicle);
	}

	

	public void removeVehicles(Vehicles vehicle) {
		garage.remove(vehicle);

	}

	public void empty() {
		garage.clear();
	}

	private int bill;

	public String billCalculator(Vehicles vehicle) {

		int bill = 0;

		if (vehicle instanceof Car) {

			bill = (vehicle.getNumWheels() * 10000) + (vehicle.getNumSeats() * 5000);
			if (((Car) vehicle).isSatNav() == true) {
				bill = bill + 3000;
			}
			if (((Car) vehicle).isGearStick() == true) {
				bill = bill - 1000;
			}

			return "The cost of the car is " + bill;

		}

		if (vehicle instanceof Motorbike) {

			bill = (vehicle.getNumWheels() * 10000) + (vehicle.getNumSeats() * 5000);
			if (((Motorbike) vehicle).isRadio() == true) {
				bill = bill + 300;
			}
			if (((Motorbike) vehicle).isTurbo() == true) {
				bill = bill + 1000;
			}
			return "The cost of the motorbike is " + bill;
		}

		if (vehicle instanceof Boat) {
			bill = (vehicle.getNumWheels() * 10000) + (vehicle.getNumSeats() * 5000);
			if (((Boat) vehicle).isRadar() == true) {
				bill = bill + 1000;
			}
			bill = bill + (((Boat) vehicle).getNumPropellor() * 5000);
			return "The cost of the boat is " + bill;
		}

		return "";

	}

	public void calculateBillForEachG1() {
		for (Vehicles vehicle : garage) {

			System.out.println(billCalculator(vehicle));
		}

	}

	public int getBill() {
		return bill;
	}

	public void setBill(int bill) {
		this.bill = bill;
	}

}
