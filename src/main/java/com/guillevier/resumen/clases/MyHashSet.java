package com.guillevier.resumen.clases;

import java.util.HashSet;
import java.util.Iterator;

// Proporciona una implementación de un conjunto (set) que no permite elementos duplicados.
// LISTO
public class MyHashSet {
  public static void main(String[] args) {
    HashSet<String> carNamesHS = new HashSet<String>();
    carNamesHS.add("Volvo");
    carNamesHS.add("BMW");
    carNamesHS.add("Ford");
    carNamesHS.add("BMW");
    carNamesHS.add("Mazda");
    carNamesHS.contains("Mazda");
    carNamesHS.remove("Volvo");
    System.out.println(carNamesHS.isEmpty());

    // Devuelve un iterador sobre los elementos en el conjunto. Esto permite recorrer los elementos del conjunto.
    Iterator<String> iterator = carNamesHS.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    // Agrega todos los elementos de la colección especificada al conjunto.
    HashSet<String> moreCars = new HashSet<>();
    moreCars.add("Audi");
    carNamesHS.addAll(moreCars);

    // Elimina del conjunto todos los elementos que están contenidos en la colección especificada.
    HashSet<String> carsToRemove = new HashSet<>();
    carsToRemove.add("BMW");
    carNamesHS.removeAll(carsToRemove);

    // Retiene solo los elementos en el conjunto que están contenidos en la colección especificada.
    HashSet<String> carsToRetain = new HashSet<>();
    carsToRetain.add("Ford");
    carNamesHS.retainAll(carsToRetain);
    System.out.println("CAR NAMES HS: " + carNamesHS);
    System.out.println("CAR NAMES TO RETAIN: " + carsToRetain);

    // Devuelve un arreglo que contiene todos los elementos del conjunto.
    String[] carArray = carNamesHS.toArray(new String[0]);
    System.out.println(carArray[0]);

    carNamesHS.size();
    carNamesHS.clear();
  }
}