package com.guillevier.resumen.clases;
import java.util.ArrayList;

class ForLoop {
  public static void main(String[] args) {
    // for (inicialización; condición; incremento o decremento;) { // Instrucciones
    // }
    // SENTENCIA BREAK
    // Break también se puede utilizar para salir de un bucle.
    for (int i2 = 0; i2 < 10; i2++) {
      if (i2 == 5) {
        break;
      }
      // 4
      System.out.println(i2);
    }

    // SENTENCIA CONTINUE
    // Si se tiene un bucle for y se desea saltar la impresión del valor de i
    // después de cumplir una condición.
    // En este ejemplo, después de encontrar la sentencia continue, el bucle se
    // saltará la impresión del valor de i y continuará con la siguiente iteración
    // del bucle.
    // Continue interrumpe una iteración (en el bucle), si se produce una condición
    // específica, y continúa con la siguiente iteración en el bucle.
    for (int i3 = 0; i3 < 10; i3++) {
      if (i3 == 5) {
        // Salta el valor 5.
        continue;
      }
      System.out.println(i3);
    }

    // CICLOS FOR ANIDADOS
    // Por ejemplo, si tenemos dos listas (list1 y list2) y queremos comparar todos
    // los elementos de una lista con todos los elementos de la otra lista.
    ArrayList<String> list1 = new ArrayList<String>();
    list1.add("A");
    list1.add("B");
    list1.add("C");
    ArrayList<String> list2 = new ArrayList<String>();
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
  }
}