package com.guillevier.resumen.clases;
import java.util.ArrayList;

class ForLoop {

  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      printSOS();
    }

    // for (inicialización; condición; incremento o decremento;) { // Instrucciones }
    for (int i2 = 1; i2 <= 10; i2++) {
      printSOS();
    }
    
    // SENTENCIA BREAK
    for (int i2 = 0; i2 < 10; i2++) {
      if (i2 == 5) {
        break;
      }
      System.out.println(i2);
    }

    // SENTENCIA CONTINUE
    // Si se tiene un bucle for y se desea saltar la impresión del valor de i después de cumplir una condición.
    // En este ejemplo, después de encontrar la sentencia continue, el bucle se saltará la impresión del valor de i y continuará con la siguiente iteración del bucle.
    for (int i3 = 0; i3 < 10; i3++) {
      if (i3 == 5) {
        continue;
      }
      System.out.println(i3);
    }

    // CICLOS FOR ANIDADOS
    // Por ejemplo, si tenemos dos listas (list1 y list2) y queremos comparar todos los elementos de una lista con todos los elementos de la otra lista.
    ArrayList<String> list1 = new ArrayList<>();
    list1.add("A");
    list1.add("B");
    list1.add("C");
    ArrayList<String> list2 = new ArrayList<>();
    list2.add("A");
    list2.add("B");
    list2.add("C");
    for (String sList1 : list1) {
      for (String sList2 : list2) {
        if (sList1.equals(sList2)) {
          System.out.println("SON ELEMENTOS IGUALES: " + sList1 + " = " + sList2);
        }
      }
    }

    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    
    for (String car : cars) {
      System.out.println(car);
    }

    for (int i = 0; i < cars.length; i++) {
      System.out.println(cars[i]);
    }
    
    for (String car : cars) {
      System.out.println(car);
    }
    
    for (int iFL = 0; iFL < 10; iFL++) {
      if (iFL == 4) {
        break;
      }
    }
    
    // Break también se puede utilizar para salir de un bucle.
    for (int iB = 0; iB < 10; iB++) {
      if (iB == 4) {
        break;
      }
      System.out.println(iB);
    }
    
    // Continue interrumpe una iteración (en el bucle), si se produce una condición
    // específica, y continúa con la siguiente iteración en el bucle.
    for (int iC = 0; iC < 10; iC++) {
      if (iC == 4) {
        continue;
      }
    }

    int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
    System.out.println(myNumbers[1][2]); // Outputs 7
    myNumbers[1][2] = 9;
    System.out.println(myNumbers[1][2]); // Outputs 9 instead of 7
    for (int i = 0; i < myNumbers.length; ++i) {
      for (int j = 0; j < myNumbers[i].length; ++j) {
        System.out.println(myNumbers[i][j]);
      }
    }

    for (String car : cars) {
      System.out.println(car);
    }
  }

  public static void printSOS() {
    System.out.println("...___...");
  }
}