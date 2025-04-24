package com.guillevier.resumen.clases.list;

import java.util.LinkedList;

// LISTO
// Proporciona una implementación de una lista doblemente enlazada.
public class MyLinkedList {
  public static void main(String[] args) {
    LinkedList<String> carNames = new LinkedList<String>();
    // Agrega el elemento especificado al final de la lista.
    carNames.add("Volvo");
    carNames.add("BMW");
    carNames.add("Ford");
    carNames.add("Mazda");
    // Inserta el elemento especificado al principio de la lista.
    carNames.addFirst("Porshe");
    // Inserta el elemento especificado al final de la lista (equivalente a add).
    carNames.addLast("Chevrolet");
    System.out.println(carNames);
    // Devuelve el primer elemento de la lista, o null si la lista está vacía.
    System.out.println(carNames.peek());
    // Devuelve el elemento en la posición especificada en la lista.
    System.out.println(carNames.get(3));
    // Elimina el elemento en la posición especificada en la lista.
    carNames.remove(3);
    // Elimina la primera aparición del elemento especificado de la lista, si está presente.
    carNames.remove("Ford");
    // Reemplaza el elemento en la posición especificada en la lista con el elemento especificado.
    carNames.set(0, "Nissan");
    System.out.println(carNames);
    System.out.println(carNames.size());
    // Devuelve true si la lista no contiene elementos.
    System.out.println(carNames.isEmpty());
    // Devuelve true si la lista contiene el elemento especificado.
    System.out.println(carNames.contains("BMW"));
    // Recupera y elimina el primer elemento de la lista, o devuelve null si la lista está vacía.
    String firstCarName = carNames.poll();
    System.out.println(firstCarName);
    // Devuelve un arreglo que contiene todos los elementos de la lista en el orden correcto.
    String[] carNamesArray = carNames.toArray(new String[0]);
    System.out.println(carNamesArray[0]);
    System.out.println(carNamesArray[1]);
    System.out.println(carNamesArray[2]);
    System.out.println(carNamesArray[3]);
    // Elimina todos los elementos de la lista.
    carNames.clear();
  }
}