package com.guillevier.resumen.clases;

import java.util.ArrayList;

// LISTO
class ForLoop {
  public static void main(String[] args) {
    // for (inicialización; condición; incremento o decremento;) { // Instrucciones }
    // SENTENCIA BREAK
    // Break también se puede utilizar para salir de un bucle.
    for (int i = 0; i < 10; i++) {
      if (i == 5) {
        break;
      }
      System.out.println(i); // 4
    }
    // SENTENCIA CONTINUE
    // El bucle se saltará la impresión del valor de i y continuará con la siguiente iteración del bucle.
    for (int init = 0; init < 10; init++) {
      if (init == 5) {
        // Salta el valor 5.
        continue;
      }
      System.out.println(init);
    }

    // CICLOS FOR ANIDADOS
    // Si tenemos dos listas (list1 y list2) y queremos comparar todos
    // los elementos de una lista con todos los elementos de la otra lista.
    ArrayList<String> list1 = new ArrayList<String>();
    list1.add("A");
    list1.add("B");
    list1.add("C");
    ArrayList<String> list2 = new ArrayList<String>();
    list2.add("A");
    list2.add("B");
    list2.add("C");

    for (String element1 : list1) {
      for (String element2 : list2) {
        if (element1.equals(element2)) {
          System.out.println("SON ELEMENTOS IGUALES: " + element1 + " = " + element2);
        }
      }
    }
  }
}