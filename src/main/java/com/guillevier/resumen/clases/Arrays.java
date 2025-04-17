package com.guillevier.resumen.clases;

import java.util.ArrayList;
import java.util.Collections;

// LISTO
class Arrays {
  public static void main(String[] args) {
    // Si la cantidad de valores a almacenar es fija,
    // es recomendable utilizar arreglos para una variable.
    // Esto es más eficiente que utilizar una lista.

    // Arreglo de una sola dimensión:
    String[] androidVersions = new String[10];
    androidVersions[0] = "Apple Pie";
    androidVersions[1] = "Banana Bread";
    androidVersions[2] = "Cupcake";
    androidVersions[3] = "Donut";
    // ...

    // Arreglo de dos dimensiones:
    String[][] cities = new String[4][2];
    cities[0][0] = "Colombia";
    cities[0][1] = "Medellin";
    cities[1][0] = "Ecuador";
    cities[1][1] = "Quito";

    // Arreglo de tres dimensiones:
    int[][][] numbers3 = new int[2][2][2];

    // Arreglo de cuatro dimensiones:
    int[][][][] numbers4 = new int[2][2][2][2];

    // [1][0][0][1]
    String[][][][] animals = new String[2][2][2][2];
    animals[1][0][0][1] = "Monkey";

    // Crear un OBJETO de tipo ArrayList.
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    // Cantidad de elementos en el ArrayList es ilimitada.
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(10);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(25);

    // Recorrer un ArrayList:
    for (int i : myNumbers) {
      System.out.println(i);
    }

    // Al realizar un print, se imprime el objeto en su forma de string.
    // [Volvo, BMW, Ford, Mazda]
    System.out.println(cars);

    // Obtener un valor en especifico del ArrayList:
    cars.get(0);

    // Setear un valor en una posición especifica del ArrayList:
    cars.set(0, "Opel");

    // Cantidad total de elementos de un ArrayList:
    cars.size();

    // Eliminar un elemento del ArrayList:
    cars.remove(0);

    // Recorrer un ArrayList:
    for (String car : cars) {
      System.out.println(car);
    }

    // Orden alfabetico del ArrayList: cars
    // Para esto se convierte en una Collections:
    Collections.sort(cars);
    Collections.sort(myNumbers);

    for (int i : myNumbers) {
      System.out.println(i);
    }

    for (int i = 0; i < androidVersions.length; i++) {
      System.out.println(androidVersions[i]);
    }

    for (String androidVersion : androidVersions) {
      System.out.println(androidVersion);
    }

    for (int i = 0; i < cities.length; i++) {
      for (int j = 0; j < cities[0].length; j++) {
        System.out.println(cities[i][j]);
      }
    }

    for (String[] pair : cities) {
      for (String name : pair) {
        System.out.println(name);
      }
    }

    for (int i = 0; i <= 1; i++) {
      for (int j = 0; j <= 0; j++) {
        for (int k = 0; k <= 0; k++) {
          for (int l = 0; l <= 1; l++) {
            System.out.println(animals[i][j][k][l]);
          }
        }
      }
    }

    // Definición de un Arreglo de números:
    int[] myNumbersArray = {1, 5, 10, 25};
    int sum = 0;
    int i;

    // Calcula la suma de los valores del Arreglo:
    for (i = 0; i < myNumbersArray.length; i++) {
      sum += myNumbersArray[i];
    }
    System.out.println("The sum is: " + sum);
  }
}