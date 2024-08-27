/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.guillevier.resumen;

import com.guillevier.resumen.clases.Animal;
import com.guillevier.resumen.clases.ClaseEnvolvente;
import com.guillevier.resumen.clases.Gato;
import com.guillevier.resumen.clases.MyFunctionalInterface;
import com.guillevier.resumen.clases.Perro;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.IntSupplier;

// LAS VARIABLES CONSTANTES SE DEFINES EN MAYUSCULAS Y _
enum LevelExt {
  LOW,
  MEDIUM,
  HIGH
}

/**
 *
 * @author Guillermo
 */
public class Resumen {
  /*
  En este ejemplo, Color es el nombre de la enumeración y RED, GREEN y BLUE son sus constantes.
  Las constantes de una enumeración se consideran instancias de la enumeración y se consideran del mismo tipo.
  */
  public enum ColorSimple {
    RED,
    GREEN,
    BLUE
  }

  enum LevelInt {
    LOW,
    MEDIUM,
    HIGH
  }

  public static void main(String[] args) {
    // Lower Camel Case
    int soyUnNumeroInt = 10;
    // Constant
    int _SOYUNACONSTANTE = 10;
    // ENUM Int, Ext
    LevelExt myVar = LevelExt.MEDIUM;
    switch (myVar) {
      case LOW -> System.out.println("Low level");
      case MEDIUM -> System.out.println("Medium level");
      case HIGH -> System.out.println("High level");
    }
    LevelInt myLevel = LevelInt.MEDIUM;
    System.out.println(myLevel);

    // SCANNER
    int x2, y2, sum2;
    Scanner myObj = new Scanner(System.in); // Create a Scanner object
    System.out.println("Type a number:");
    x2 = myObj.nextInt(); // Read user input
    System.out.println("Type another number:");
    y2 = myObj.nextInt(); // Read user input
    sum2 = x2 + y2; // Calculate the sum of x + y
    System.out.println("Sum is: " + sum2); // Print the sum

    // CORTAR PALABRAS
    String words = "One Two Three Four";
    int countWords = words.split("\\s").length;
    System.out.println(countWords);

    // POLIMORFISMO
    Animal miPerro = new Perro("Chopper");
    miPerro.hablar(); // Chopper ladra
    Animal miGato = new Gato("Tom");
    miGato.hablar(); // Tom maulla
    // miGato.saludar();
    // miPerro.saludar();
    /*
    En este ejemplo, la clase Perro hereda de la clase Animal.
    A pesar de esto, no puede acceder al método estático saludar() de la clase Animal utilizando una referencia a un objeto de la clase Perro.
    La única forma de acceder a este método es a través del nombre de la clase Animal.
    */
    Animal.saludar();
    Perro.saludar();
    Gato.saludar();

    // CLASE INTERNA ESTÁTICA
    ClaseEnvolvente.ClaseInternaEstatica claseInterna = new ClaseEnvolvente.ClaseInternaEstatica();
    claseInterna.mostrarMensaje();

    MyFunctionalInterface myFunction = () -> System.out.println("Hola mundo!");
    myFunction.doSomething();
    
    String myString = "Hola mundo!";
    MyFunctionalInterface myFunctionTwo = myString::toUpperCase;
    myFunctionTwo.doSomething(); // "HOLA MUNDO!"

    Function<Integer, String> converter = numberTwo -> {
      if (numberTwo < 0) {
        return "Minus " + Math.abs(numberTwo);
      } else if (numberTwo < 10) {
        return numberNames[numberTwo];
      } else if (numberTwo < 20) {
        return teenNames[numberTwo - 10];
      } else if (numberTwo < 100) {
        return numberNames[numberTwo / 10] + " " + numberTwo % 10;
      } else {
        return "Cannot convert number to words";
      }
    };
    System.out.println(converter.apply(123));

    IntSupplier factorial = () -> {
      int resultFactorial = 1;
      for (int i = 2; i <= 10; i++) {
        resultFactorial *= i;
      }
      return resultFactorial;
    };
    System.out.println(factorial.getAsInt());
  }

  private static final String[] numberNames = {
          "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
  };
  
  private static final String[] teenNames = {
          "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
  };
}
