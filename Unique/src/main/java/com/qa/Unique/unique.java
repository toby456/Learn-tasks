package com.qa.Unique;

public class unique {
	
	public static void main(String[] args) {
		
		ttt(2,2,2);
		
	}
	
	
	

	public static void ttt(int a, int b, int c) {
		
		if (a==b && a!=c && b != c) {
			System.out.println(a + c);			
		}
		if (a==c && a != b && b!= c) {
			System.out.println(a + b);
		}
		if (b==c && a != b && a != c) {
			System.out.println(a + b);
			
		if (a == b && a == c) {
			System.out.println(a);
		}
		
		if (b == a && b == c ) {
			System.out.println(b);
		}
		
		if (c == a && c == b ) {
			System.out.println(c);
		}
		
		
		} else if (a!= b && a != c && b != c) {
			System.out.println(a + b + c);
		}
		
		
		
		
	}
	

}
