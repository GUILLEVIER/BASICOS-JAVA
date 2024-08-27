package com.guillevier.resumen.clases;

import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {
	public static void main(String[] args) {
		// Crea un nuevo TreeMap
		Map<String, Integer> treeMap = new TreeMap<>();
		// Agrega pares clave-valor al mapa
		treeMap.put("manzana", 10);
		treeMap.put("plátano", 20);
		treeMap.put("cereza", 30);
		// Recupera valores del mapa
		System.out.println(treeMap.get("manzana")); // Imprime 10
		System.out.println(treeMap.get("plátano")); // Imprime 20
		System.out.println(treeMap.get("cereza")); // Imprime 30
		// Elimina un par clave-valor del mapa
		treeMap.remove("plátano");
		// Verifica si una clave está presente en el mapa
		System.out.println(treeMap.containsKey("manzana")); // Imprime true
		System.out.println(treeMap.containsKey("plátano")); // Imprime false
		// Imprime el tamaño del mapa
		System.out.println(treeMap.size()); // Imprime 2

		// 1. Doctor#1
		// - - - Fecha#1
		// - - - Fecha#2
		// 2. Doctor#2
		// - - - Fecha#1
		// - - - Fecha#2
		// 3. Doctor#3
		// - - - Fecha#1
		// - - - Fecha#2
		Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
	}
}