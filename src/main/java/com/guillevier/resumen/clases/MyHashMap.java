package com.guillevier.resumen.clases;

import java.util.HashMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MyHashMap {
	public static void main(String[] args) {
		// Crea un nuevo HashMap
		Map<String, Integer> map = new HashMap<>();
		// Agrega pares clave-valor al mapa
		map.put("manzana", 10);
		map.put("plátano", 20);
		map.put("cereza", 30);
		// Recupera valores del mapa
		System.out.println(map.get("manzana")); // Imprime 10
		System.out.println(map.get("plátano")); // Imprime 20
		System.out.println(map.get("cereza")); // Imprime 30
		// Elimina un par clave-valor del mapa
		map.remove("plátano");
		// Verifica si una clave está presente en el mapa
		System.out.println(map.containsKey("manzana")); // Imprime true
		System.out.println(map.containsKey("plátano")); // Imprime false
		// Recupera un conjunto de todas las claves en el mapa
		Set<String> keys = map.keySet();
		System.out.println(keys); // imprime [manzana, cereza]
		// Recupera una colección de todos los valores en el mapa
		Collection<Integer> values = map.values();
		System.out.println(values); // imprime [10, 30]
		// Recupera un conjunto de todos los pares clave-valor en el mapa
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for (Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		System.out.println(map.size());

		// Create a HashMap object called people
		java.util.HashMap<String, Integer> people = new java.util.HashMap<String, Integer>();
		// Add keys and values (Name, Age)
		people.put("John", 32);
		people.put("Steve", 30);
		people.put("Angie", 33);
		for (String p : people.keySet()) {
			System.out.println("key: " + p + " value: " + people.get(p));
		}
		// Create a HashMap object called capitalCities
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		// Add keys and values (Country, City)
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		System.out.println(capitalCities);
		capitalCities.get("England");
		capitalCities.remove("England");
		capitalCities.clear();
		// Print keys
		for (String cCK : capitalCities.keySet()) {
			System.out.println(cCK);
		}
		// Print values
		for (String cCV : capitalCities.values()) {
			System.out.println(cCV);
		}
		// Print keys and values
		for (String cCK : capitalCities.keySet()) {
			System.out.println("key: " + cCK + " value: " + capitalCities.get(cCK));
		}
	}
}