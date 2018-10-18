package com.qa.ResultsRemade;

public class Results {


	public static void main(String[] args) {
		
		total();
		percentage();
		
		
	}
		
	

	

	 static double physics = 10;
	 static double chemistry = 150;
	 static double biology = 150;
	 static double total = 0;
	 static double percentage = 0;

	public static void total() {

		total = physics + chemistry + biology;
		System.out.println("Your physics mark = " + physics);
		System.out.println("Your chemistry mark = " + chemistry);
		System.out.println("Your biology mark = " + biology);
		System.out.println("Your total mark = " + total);

	}

	public static void percentage() {

		percentage = (((biology + chemistry + physics) * 100) / 450);
		if (percentage < 60) {
			
		} else if (percentage > 60 && ((chemistry * 100) / 150) > 60 && ((physics * 100) / 150) > 60
				&& ((biology * 100) / 150) > 60) {
			

		} else if (percentage < 60 || ((chemistry * 100) / 150) < 60 || ((physics * 100) / 150) < 60
				|| ((biology * 100) / 150) < 60) {
			

		}

		int failCount = 0;

		if (((biology * 100) / 150) < 60) {
			failCount = failCount + 1;

		}
		if (((physics * 100) / 150) < 60) {
			failCount = failCount + 1;
	}
		if (((chemistry * 100) / 150) < 60) {
			failCount = failCount + 1;
		}
		
		if (failCount == 1) {
			System.out.println("I'm sorry, you have failed");
		} else System.out.println("Well done you have passed");
		
		System.out.println("Your percentage = " + percentage);
		System.out.println("You have failed " + failCount + " exams");
		}
			
			
}





