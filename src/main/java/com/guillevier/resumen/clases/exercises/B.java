package com.guillevier.resumen.clases.exercises;

import java.util.ArrayList;
import java.util.Arrays;

/*
El objetivo de este ejercicio es restablecer
el arreglo de enteros solicitado como parametro de entrada
que en sus inicios es transformado a un string.

Ejemplo:
int[] ints = {-9, 14, 37, 102};
Se transforma a String, quedando: "[-9, 14, 37, 102]"
Debe retornar una booleano que comparé ambos arreglo de enteros
comprobando su igualdad.
*/
public class B {
  static boolean transformFromStringToIntForma1(int[] ints) {
    // Convertimos el Arreglo a String: "[-9, 14, 37, 102]"
    String intsString = Arrays.toString(ints);
    System.out.println("intsString: " + intsString);

    //***DESDE AQUÍ, INICIA LA RESTAURACIÓN***

    // Eliminamos los corchetes [ ] y separamos por coma
    String[] intsArrayString = intsString.substring(1, intsString.length() - 1).split(",");
    System.out.println("Arreglo de String: " + Arrays.toString(intsArrayString));

    int[] intsRestaurado = new int[ints.length];
    int i = 0;
    while (i < intsArrayString.length) {
      // Utilizamos .trim() para separar los espacios en blanco al principio y al final.
      intsRestaurado[i] = Integer.parseInt(intsArrayString[i].trim());
      i++;
    }

    //***AQUÍ, FINALIZA LA RESTAURACIÓN***

    return Arrays.equals(ints, intsRestaurado);
  }

  static boolean transformFromStringToIntForma2(int[] ints) {
    // Convertimos el Arreglo a String: "[-9, 14, 37, 102]"
    String intsString = Arrays.toString(ints);
    System.out.println("intsString: " + intsString);

    //***DESDE AQUÍ, INICIA LA RESTAURACIÓN***

    // Eliminamos los corchetes [ ] y separamos por coma
    String[] intsArrayString = intsString.substring(1, intsString.length() - 1).split(",");
    System.out.println("Arreglo de String: " + Arrays.toString(intsArrayString));

    int[] intsRestaurado = new int[ints.length];
    for (int i = 0; i < intsArrayString.length; i++) {
      // Utilizamos .trim() para separar los espacios en blanco al principio y al final.
      intsRestaurado[i] = Integer.parseInt(intsArrayString[i].trim());
    }

    //***AQUÍ, FINALIZA LA RESTAURACIÓN***

    return Arrays.equals(ints, intsRestaurado);
  }

  static boolean transformFromStringToIntForma3(int[] ints) {
    // Convertimos el Arreglo a String: "[-9, 14, 37, 102]"
    String intsString = Arrays.toString(ints);
    System.out.println("intsString: " + intsString);

    //***DESDE AQUÍ, INICIA LA RESTAURACIÓN***

    // Eliminamos los corchetes [ ] y separamos por coma
    String[] intsArrayString = intsString.substring(1, intsString.length() - 1).split(",");
    System.out.println("Arreglo de String: " + Arrays.toString(intsArrayString));

    ArrayList<Integer> intsRestauradoList = new ArrayList<>();
    for (String intsStringLoop : intsArrayString) {
      intsRestauradoList.add(Integer.parseInt(intsStringLoop.trim()));
    }
    // Por defecto el método toArray() da como resultado un Object[].
    Object[] intsRestauradoObject = intsRestauradoList.toArray();

    // Usando toArray(T[])
    Integer[] intsRestauradoInt = new Integer[intsRestauradoList.size()];
    intsRestauradoInt = intsRestauradoList.toArray(intsRestauradoInt);
    System.out.println("Arreglo Restaurado pero con diferente tipo de dato (Integer): " + Arrays.toString(intsRestauradoInt));

    // Para pasarlo al tipo de dato correspondiente, utilizaremos stream():
    // Utilizando el ArrayList<Integer> directamente:
    // int[] intsRestaurado = intsRestauradoList.stream().mapToInt(Integer::intValue).toArray();
    // Utilizando el Array de Integer[]:
    int[] intsRestaurado = Arrays.stream(intsRestauradoInt).mapToInt(Integer::intValue).toArray();

    //***AQUÍ, FINALIZA LA RESTAURACIÓN***

    return Arrays.equals(ints, intsRestaurado);
  }

  static boolean transformFromStringToIntForma4(int[] ints) {
    // Convertimos el Arreglo a String: "[-9, 14, 37, 102]"
    String intsString = Arrays.toString(ints);
    System.out.println("intsString: " + intsString);

    //***DESDE AQUÍ, INICIA LA RESTAURACIÓN***

    // Eliminamos los corchetes [ ] y separamos por coma
    String[] intsArrayString = intsString.substring(1, intsString.length() - 1).split(",");
    System.out.println("Arreglo de String: " + Arrays.toString(intsArrayString));

    // Transformar el Arreglo de String a un Stream, luego realizar un map para cada elemento del Stream, transformandolo
    // de String a Integer, luego realizar otro map para cada elemento del Stream de tipo Integer, obteniendo su valor int
    // y finalmente transformandolo a un Arreglo de tipo int.
    int[] intsRestaurado = Arrays.stream(intsArrayString).map(intsStringLoop -> Integer.parseInt(intsStringLoop.trim())).mapToInt(Integer::intValue).toArray();
    // VERSIÓN SIMPLIFICADA
    // int[] intsRestaurado = Arrays.stream(intsArrayString).map(String::trim).mapToInt(Integer::parseInt).toArray();

    //***AQUÍ, FINALIZA LA RESTAURACIÓN***

    return Arrays.equals(ints, intsRestaurado);
  }

  public static void main(String[] args) {
    int[] ints = {-9, 14, 37, 102};
    System.out.println("Arreglo Restaurado F1: " + transformFromStringToIntForma1(ints));
    System.out.println("Arreglo Restaurado F2: " + transformFromStringToIntForma2(ints));
    System.out.println("Arreglo Restaurado F3: " + transformFromStringToIntForma3(ints));
    System.out.println("Arreglo Restaurado F4: " + transformFromStringToIntForma4(ints));
  }
}