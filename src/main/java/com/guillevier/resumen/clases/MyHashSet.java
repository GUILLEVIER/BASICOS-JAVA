package com.guillevier.resumen.clases;

import java.util.HashSet;

public class MyHashSet {
	public static void main(String[] args) {
		HashSet<String> carsHS = new HashSet<String>();
		carsHS.add("Volvo");
		carsHS.add("BMW");
		carsHS.add("Ford");
		carsHS.add("BMW");
		carsHS.add("Mazda");
		System.out.println(carsHS);
		carsHS.contains("Mazda");
		carsHS.remove("Volvo");
		carsHS.clear();
		carsHS.size();
	}
}