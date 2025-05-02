package com.guillevier.resumen.clases.exercises;

import java.util.Arrays;
import java.util.function.Predicate;

/*
El objetivo de este ejercicio es verificar la presencia de un número en un arreglo.

Especificaciones:
- Los elementos son números enteros ordenados de menor a mayor.
- El arreglo puede contener hasta 1 millón de elementos.
- El arreglo nunca es null.

Implementar el método boolean A.exists(int[] ints, int k) para que devuelva
true si k pertenece a ints, en caso contrario, el método debe devolver false.

Ejemplo:
int[] ints = {-9, 14, 37, 102};
A.exists(ints, 102) devuelve true
A.exists(ints, 36) devuelve false
*/
public class A {
  // Implementando Streams que utiliza anyMatch().
  static boolean existsForma1(int[] ints, int k) {
    Predicate<Integer> validation = number -> number == k;
    // Arrays.stream(ints).anyMatch(number -> validation(number));
    return Arrays.stream(ints).anyMatch(validation::test);
  }

  // Utilizando un ciclo for para recorrer el arreglo y verificar si el número está presente.
  static boolean existsForma2(int[] ints, int k) {
    for (int i = 0; i < ints.length; i++) {
      if (ints[i] == k) {
        return true;
      }
    }
    return false;
  }

  // Utilizando un ciclo for-each.
  static boolean existsForma3(int[] ints, int k) {
    for (int number : ints) {
      if (number == k) {
        return true;
      }
    }
    return false;
  }

  // Dado que el arreglo está ordenado, puedes implementar una búsqueda binaria.
  // Este enfoque es mucho más eficiente, ya que reduce la complejidad de tiempo
  // de O(n) a O(log n).
  static boolean existsForma4(int[] ints, int k) {
    int left = 0;
    int right = ints.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (ints[mid] == k) {
        return true;
      }
      if (ints[mid] < k) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return false;
  }

  // Java proporciona un método incorporado que realiza una búsqueda binaria.
  // Esto es aún más eficiente y te permite escribir el código de manera aún más compacta.
  // Arrays.binarySearch() devuelve el índice del elemento si se encuentra,
  // o un valor negativo si no lo encuentra.
  // Por lo tanto, >= 0 indica que el número está presente.
  static boolean existsForma5(int[] ints, int k) {
    return Arrays.binarySearch(ints, k) >= 0;
  }

  public static void main(String[] args) {
    int[] ints = {-9, 14, 37, 102};
    System.out.println("RESULTADO PARA 10: " + existsForma1(ints, 10));
    System.out.println("RESULTADO PARA 102: " + existsForma2(ints, 102));
    System.out.println("RESULTADO PARA 36: " + existsForma3(ints, 36));
    System.out.println("RESULTADO PARA 37: " + existsForma4(ints, 37));
    System.out.println("RESULTADO PARA -9: " + existsForma5(ints, -9));
  }
}