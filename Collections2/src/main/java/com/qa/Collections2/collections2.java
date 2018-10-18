package com.qa.Collections2;

import java.util.ArrayList;
import java.util.List;

public class collections2 {

	public static void main(String[] args) {

		addList();

	}

	public static void addArray() {

		int[] collectionArray = new int[100];
		int x = 1;
		for (x = 1; x <= 100; x++) {
			collectionArray[x - 1] = x;

			System.out.println(collectionArray[x - 1]);

		}

	}

	public static void addList() {
		List<Integer> myList = new ArrayList<Integer>();
		int x = 1;
		for (x = 1; x <= 1000; x++) {
			if (x >= 100 && x <= 1000) {
				myList.add(x * 10);

			}

		}

		for (int i : myList) {

			i = i * 10;

		}

		System.out.println(myList);
	}
}
