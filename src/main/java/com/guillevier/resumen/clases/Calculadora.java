package com.guillevier.resumen.clases;

public class Calculadora {
  public static final double PI = 3.1415926;
  public static int valor = 0;
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
}