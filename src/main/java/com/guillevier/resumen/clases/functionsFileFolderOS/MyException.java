package com.guillevier.resumen.clases.functionsFileFolderOS;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// LISTO
public class MyException {
  // try-catch-finally: Se utiliza para manejar excepciones y ejecutar código de limpieza (como cerrar recursos) en el bloque finally.
  // try-with-resources: Se utiliza para manejar recursos que deben cerrarse automáticamente, simplificando el manejo de excepciones y la gestión de recursos.
  public static void main(String[] args) {
    // try-catch-finally
    int num = 5;
    int divisor = 0;
    try {
      int resultado = num / divisor;
      System.out.println("Resultado: " + resultado);
    } catch (ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      // El bloque finally se ejecuta siempre, independientemente de si se lanzó o no una excepción.
      System.out.println("Fin del bloque try-catch.");
    }

    // try-catch-resources
		/*
		El bloque try utiliza paréntesis para declarar e inicializar un objeto BufferedReader que implementa la interfaz Closeable.
		Cuando el bloque try finaliza (ya sea normalmente o debido a una excepción), el objeto BufferedReader se cerrará automáticamente.
		A diferencia del bloque try-catch-finally tradicional, el bloque finally no es necesario en este caso, ya que try-with-resources se encarga de cerrar los recursos.
		El bloque try-with-resources se utiliza para manejar recursos que deben cerrarse después de su uso, como archivos, sockets, conexiones de base de datos, etc.
		En este caso, el BufferedReader se declara e inicializa dentro de los paréntesis del bloque try.
		Cuando el bloque try finaliza, el BufferedReader se cierra automáticamente, incluso si ocurre una excepción.
		Esto elimina la necesidad de un bloque finally para cerrar el recurso.
		*/
    try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
      String line;
      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}