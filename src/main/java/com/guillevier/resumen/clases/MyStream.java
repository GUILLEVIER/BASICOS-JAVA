package com.guillevier.resumen.clases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MyStream {
	public static void main(String[] args) {
		// STREAM
		/*
		En este ejemplo, el método rangeClosed crea un Stream de números enteros en el rango [1, 100]. Luego, el método sum se utiliza para calcular la suma de todos los números en el Stream.
		*/
		/*
		5050
		[ALICE, BOB, CHARLIE, DAVID]
		[Alice]
		[2, 4, 6, 8, 10]
		LIST: [1, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10]
		ARRAY LIST: [1, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10]
		LISTA CON ELEMENTOS DUPLICADOS: [1, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10]
		LISTA SIN ELEMENTOS DUPLICADOS: [1, 2]
		[2, 4, 6, 8, 10]
		1
		2
		3
		4
		5
		6
		7
		8
		9
		10
		*/
		int sum = IntStream.rangeClosed(1, 100)
						.sum();
		System.out.println(sum);
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
		// Convertir los nombres a mayúsculas
		List<String> uppercaseNames = names.stream()
						.map(String::toUpperCase)
						.collect(Collectors.toList());
		System.out.println(uppercaseNames);
		String[] namesArray = {"Alice", "Bob", "Charlie", "David"};
		// Filtrar los nombres para obtener solo los nombres que comienzan con 'A'
		List<String> namesStartingWithA = Arrays.stream(namesArray)
						.filter(nameFilter -> nameFilter.startsWith("A"))
						.collect(Collectors.toList());
		System.out.println(namesStartingWithA);
		// FILTER
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		// Filtrar los números para obtener solo los números pares
		List<Integer> evenNumbers = numbers.stream()
						.filter(numberFilter -> numberFilter % 2 == 0)
						.collect(Collectors.toList());
		System.out.println(evenNumbers);
		List<Integer> numbersThreeList = Arrays.asList(1, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10);
		System.out.println("LIST: " + numbersThreeList);
		List<Integer> numbersThreeArrayList = new ArrayList<>(numbersThreeList);
		System.out.println("ARRAY LIST: " + numbersThreeArrayList);
		System.out.println("LISTA CON ELEMENTOS DUPLICADOS: " + numbersThreeArrayList);
		// Eliminar los elementos que se encuentren duplicados de la lista, dejando solo los elementos únicos.
		numbersThreeArrayList.removeIf(numbersRemoveIf -> Collections.frequency(numbersThreeArrayList, numbersRemoveIf) > 1);
		System.out.println("LISTA SIN ELEMENTOS DUPLICADOS: " + numbersThreeArrayList);
		// Crear un Predicate que verifica si un número es par
		Predicate<Integer> isEven = numberIsEven -> numberIsEven % 2 == 0;
		// Filtrar la lista de números utilizando el Predicate isEven
		List<Integer> evenNumbersTwo = numbers.stream().filter(isEven).collect(Collectors.toList());
		System.out.println(evenNumbersTwo);
		// Crear un Consumer que imprime un número en la consola
		Consumer<Integer> printNumber = System.out::println;
		// Aplicar el Consumer printNumber a cada elemento de la lista
		numbers.forEach(printNumber);
	}
}