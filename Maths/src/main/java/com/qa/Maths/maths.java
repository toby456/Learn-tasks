package com.qa.Maths;

public class maths {

	public static void main(String[] args) {

		sum(4, 5);
		multiplication(8, 2);
		subtraction(10, 2);
		division(3, 6);

	}

	public static void sum(int x, int y) {
		x = x + y;
		System.out.println(x);

	}

	public static void multiplication(int x, int y) {
		x = x * y;
		System.out.println(x);
	}

	public static void subtraction(int x, int y) {
		x = x - y;
		System.out.println(x);
	}

	public static void division(double x, double y) {
		x = x / y;
		System.out.println(x);
	}

}
