package com.qa.Vehicles2;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		
	
	
	Car c1 = new Car("Toyota", 4, 4, true, true);
	Car c2 = new Car("Ford", 2, 4, true, false);
	Boat b1 = new Boat("Bertram", 0, 8, true, 2);
	Boat b2 = new Boat("Lund", 0, 3, false, 1);
	Motorbike m1 = new Motorbike("Honda", 2, 1, false, true);
	Motorbike m2 = new Motorbike("Toyota", 2, 1, true, true);
	
	List<Vehicles> garage = new ArrayList<Vehicles>();
	
	garage.add(c1);
	garage.add(b1);
	garage.add(m1);
	garage.add(c2);
	garage.add(b2);
	garage.add(m2);
	
	
	
	
	
	
	}


		
	} 


