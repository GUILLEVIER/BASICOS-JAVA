package com.guillevier.resumen.clases.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// LISTO
public class MyStream {
  public static void main(String[] args) {
    // Se crea un IntStream que abarca los números del 1 al 100 y se calcula la suma de todos esos números.
    int sum = IntStream.rangeClosed(1, 100)
            .sum();
    System.out.println(sum);

    // Se define una lista de nombres y se transforma cada nombre a mayúsculas utilizando el método map.
    List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
    List<String> uppercaseNames = names.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());
    System.out.println(uppercaseNames);

    // Se filtran los nombres de un arreglo para obtener solo aquellos que comienzan con la letra 'A'.
    String[] namesArray = {"Alice", "Bob", "Charlie", "David"};
    List<String> namesStartingWithA = Arrays.stream(namesArray)
            .filter(nameFilter -> nameFilter.startsWith("A"))
            .collect(Collectors.toList());
    System.out.println(namesStartingWithA);

    // Se define una lista de números y se filtran para obtener solo los números pares.
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> evenNumbers = numbers.stream()
            .filter(numberFilter -> numberFilter % 2 == 0)
            .collect(Collectors.toList());
    System.out.println(evenNumbers);

    // Se crea una lista con elementos duplicados y se eliminan los duplicados, dejando solo elementos únicos.
    List<Integer> numbersThreeList = Arrays.asList(1, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10);
    List<Integer> numbersThreeArrayList = new ArrayList<>(numbersThreeList);
    System.out.println("LISTA CON ELEMENTOS DUPLICADOS: " + numbersThreeArrayList);
    
    // Eliminar los elementos que se encuentren duplicados de la lista, dejando solo los elementos únicos.
    numbersThreeArrayList.removeIf(numbersRemoveIf -> Collections.frequency(numbersThreeArrayList, numbersRemoveIf) > 1);
    System.out.println("LISTA SIN ELEMENTOS DUPLICADOS: " + numbersThreeArrayList);

    // Se define un Predicate que verifica si un número es par y se utiliza para filtrar la lista de números.
    Predicate<Integer> isEven = numberIsEven -> numberIsEven % 2 == 0;
    List<Integer> evenNumbersTwo = numbers.stream().filter(isEven).collect(Collectors.toList());
    System.out.println(evenNumbersTwo);

    // Se define un Consumer que imprime un número en la consola y se aplica a cada elemento de la lista de números.
    Consumer<Integer> printNumber = System.out::println;
    // Aplicar el Consumer printNumber a cada elemento de la lista
    numbers.forEach(printNumber);
  }
}