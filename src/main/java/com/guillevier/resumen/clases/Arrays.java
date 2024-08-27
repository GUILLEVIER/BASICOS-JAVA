package com.guillevier.resumen.clases;

import java.util.ArrayList;
import java.util.Collections;

class Arrays {
  public static void main(String[] args) {
    // Si la cantidad de valores a almacenar es fija,
    // es recomendable utilizar arreglos para una variable.
    String[] androidVersions = new String[21];
    String[] days = new String[7];
    String[][] cities = new String[4][2];
    int[][][] numbers = new int[2][2][2];
    int[][][][] numbers4 = new int[2][2][2][2];
    // Crear un objeto de tipo ArrayList
    ArrayList<String> cars = new ArrayList<String>();
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(10);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(25);
    
    for (int i : myNumbers) {
      System.out.println(i);
    }
    
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
    cars.get(0);
    cars.set(0, "Opel");
    cars.size();
    
    for (String car : cars) {
      System.out.println(car);
    }
    
    Collections.sort(cars); // Sort cars
    
    for (String i : cars) {
      System.out.println(i);
    }
    
    cars.remove(0);
    cars.clear();
    Collections.sort(myNumbers); // Sort myNumbers
    
    for (int i : myNumbers) {
      System.out.println(i);
    }
    
    for (int i = 0; i < androidVersions.length; i++) {
      System.out.println(androidVersions[i]);
    }
    
    for (String androidVersion : androidVersions) {
      System.out.println(androidVersion);
    }
    
    for (int i = 0; i < days.length; i++) {
      System.out.println(days[i]);
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
    
    androidVersions[0] = "Apple Pie";
    androidVersions[1] = "Banana Bread";
    androidVersions[2] = "Cupcake";
    androidVersions[3] = "Donut";
    cities[0][0] = "Colombia";
    cities[0][1] = "Medellin";
    cities[1][0] = "Ecuador";
    cities[1][1] = "Quito";
    // [1][0][0][1]
    String[][][][] animals = new String[2][3][2][2];
    animals[1][0][0][1] = "Monkey";
    
    for (int i = 0; i <= 1; i++) {
      for (int j = 0; j <= 0; j++) {
        for (int k = 0; k <= 0; k++) {
          for (int l = 0; l <= 1; l++) {
            System.out.println(animals[i][j][k][l]);
          }
        }
      }
    }

    int[] myNumbersArray = {1, 5, 10, 25};
    int sum = 0;
    int i;
    // Loop through the array elements and store the sum in the sum variable
    for (i = 0; i < myNumbersArray.length; i++) {
        sum += myNumbersArray[i];
    }
    System.out.println("The sum is: " + sum);
  }
}
