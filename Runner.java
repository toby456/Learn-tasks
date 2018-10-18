package com.qa.PaintWizard;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {

		Paint CheapoMax = new Paint("CheapoMax", 10, 21, 19.99);
		Paint ThatOneWithTheDog = new Paint("ThatOneWithTheDog", 12, 40, 34.38);
		Paint AverageJoes = new Paint("AverageJoes", 11, 16, 17.99);
		Paint DuluxurousPaints = new Paint("DuluxurousPaints", 22, 10, 25);
		Room r1 = new Room(180);

		ArrayList<Paint> paints = new ArrayList<Paint>();
		paints.add(CheapoMax);
		paints.add(ThatOneWithTheDog);
		paints.add(AverageJoes);
		paints.add(DuluxurousPaints);



		int min = 100000;
		Object leastWaste = null;
		for (Paint p : paints) {
			p.calculateWastage(r1);
			if (p.getWastage() < min && p.getWastage() >= 0) {
				min = p.getWastage();
				leastWaste = p;
			}

		}
		System.out.println("The brand with the least wasted paint = " + leastWaste.toString());
		
		double minp = 10000;
		Object bestPrice = null;
		for (Paint p : paints ) {
			p.bestValue(r1);
			if (p.getPpl() < minp && p.getWastage() >=0 ) {
				minp = p.getPpl();
				bestPrice = p;			
			}
		}
		
		System.out.println("The brand with the best price = " + bestPrice.toString());
		
	}

}
