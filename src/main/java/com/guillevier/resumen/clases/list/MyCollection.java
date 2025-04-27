package com.guillevier.resumen.clases.list;

import java.util.ArrayList;
import java.util.Iterator;

// LISTO
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
    while (it.hasNext()) {
      String valueToDelete = "Ford";
      String actualBrandName = it.next();
      if (actualBrandName.equals(valueToDelete)) it.remove();
    }
    System.out.println(carsAL);

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
    System.out.println(numbersAL);
  }
}