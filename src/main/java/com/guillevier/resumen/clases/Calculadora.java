package com.guillevier.resumen.clases;

import com.guillevier.resumen.clases.functionals.Functions;

// LISTO
public class Calculadora {
  // Definición de valores constantes.
  public static final double PI = 3.1415926;
  public static final double x = 2.1;
  public static final double y = 3.0;

  public static int suma(int a, int b) {
    return a + b;
  }

  // SOBRECARGA DE MÉTODOS.
  // Parametros de entrada de tipo FLOTANTE.
  public static float suma(float a, float b) {
    return a + b;
  }

  // Parametros de entrada de tipo ENTERO y FLOTANTE.
  public static float suma(int a, float b) {
    return a + b;
  }

  /*
   * Calculadora.suma(1, 2);
   * Calculadora.PI;
   * Calculadora.valor;
   */
  public static void main(String[] args) {
    int result = suma(10, 30);
    float resultFl = suma(result, (float) Calculadora.PI);
    resultFl = suma(resultFl, 32);
    System.out.println("Valor de PI: " + Calculadora.PI);
    System.out.println("Resultado final: " + resultFl);
    System.out.println(Math.PI);

    // UTILS CLASE MATH
    // Devuelve un entero hacia arriba
    System.out.println(Math.ceil(x));
    // Devuelve un entero hacia abajo
    System.out.println(Math.floor(x));
    // Devuelve el numero mayor
    System.out.println(Math.max(x, y));
    // Devuelve la raiz cuadrada
    System.out.println(Math.sqrt(x));
    // Área de un circulo
    System.out.println(Functions.circleArea(y));
    // Área de una esfera
    System.out.println(4 * Math.PI * Math.pow(x, 2));
    // Volumen de una esfera
    System.out.println((4 * Math.PI * Math.pow(x, 3)) / 3);
    // Devuelve el valor absoluto
    System.out.println(Math.abs(-4.7));
  }
}