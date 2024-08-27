package com.guillevier.resumen.clases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;

public class MyCollection {
	public static void main(String[] args) {
		// Make a collection
		ArrayList<String> carsAL = new ArrayList<String>();
		carsAL.add("Volvo");
		carsAL.add("BMW");
		carsAL.add("Ford");
		carsAL.add("Mazda");
		// Get the iterator
		Iterator<String> it = carsAL.iterator();
		// Print the first item
		System.out.println(it.next());
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		ArrayList<Integer> numbersAL = new ArrayList<Integer>();
		numbersAL.add(12);
		numbersAL.add(8);
		numbersAL.add(2);
		numbersAL.add(23);
		Iterator<Integer> numberIt = numbersAL.iterator();
		while (numberIt.hasNext()) {
			Integer intIt = numberIt.next();
			if (intIt < 10) {
				numberIt.remove();
			}
		}
		// Create a HashSet object called numbers
		HashSet<Integer> numbersHS = new HashSet<Integer>();
		// Add values to the set
		numbersHS.add(4);
		numbersHS.add(7);
		numbersHS.add(8);
		// Show which numbers between 1 and 10 are in the set
		for (int i = 1; i <= 10; i++) {
			if (numbersHS.contains(i)) {
				System.out.println(i + " was found in the set.");
			} else {
				System.out.println(i + " was not found in the set.");
			}
		}
		try {
			int[] myNumbersObject = {1, 2, 3};
			System.out.println(myNumbersObject[10]);
		} catch (Exception e) {
			System.out.println("Something went wrong.");
		} finally {
			System.out.println("The 'try catch' is finished.");
		}
		try {
			int[] myNumbers2 = {1, 2, 3};
			System.out.println(myNumbers2[10]);
		} catch (Exception e) {
			System.out.println("Something went wrong.");
		}
	}
}