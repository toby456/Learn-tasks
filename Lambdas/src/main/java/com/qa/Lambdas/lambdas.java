package com.qa.Lambdas;

import java.util.Arrays;
import java.util.List;

public class lambdas {

	public static void main(String[] args) {
		
		doShit percentage = (a,b) -> (a * 100) / b;
		
		System.out.println(percentage.letsMath(3, 10));
		
				
		
		
		
	}
	
	
	static List<Integer> myList = Arrays.asList(3, 2, 2, 3, 7, 3, 5, 9, 8, 12);
	
	public static void experiment() {
		List<Integer> sums = myList.stream()percentage.letsmath(myList, 10);
		
	}
	
	interface doShit {
		int letsMath (int a, int b);
	}
}		


		
	
