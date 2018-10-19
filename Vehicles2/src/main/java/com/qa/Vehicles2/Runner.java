package com.qa.Vehicles2;

public class Runner {

	public static void main(String[] args) {

		Car c1 = new Car("Yaris", "Toyota", 4, 4, true, true);
		Car c2 = new Car("ka", "Ford", 2, 4, true, false);
		Boat b1 = new Boat("SeaSnake", "Bertram", 0, 8, true, 2);
		Boat b2 = new Boat("Thundercat", "Lund", 0, 3, false, 1);
		Motorbike m1 = new Motorbike("Zoomster", "Honda", 2, 1, false, true);
		Motorbike m2 = new Motorbike("Roadster", "Toyota", 2, 1, true, true);

		Garage g1 = new Garage();

		g1.addVehicles(c1);
		g1.addVehicles(b1);
		g1.addVehicles(m1);
		g1.addVehicles(c2);
		g1.addVehicles(b2);
		g1.addVehicles(m2);

		g1.calculateBillForEachG1();
		
		System.out.println(g1.garage);
		
		g1.removeVehicles(c1);
		System.out.println(g1.garage);
		
		g1.removeVehicles(b2);
		System.out.println(g1.garage);
		
		
		
		
		
		
		
	
		
		
		
		
		
		

	}
}
