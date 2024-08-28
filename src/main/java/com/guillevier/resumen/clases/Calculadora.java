package com.guillevier.resumen.clases;

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
    float resultFl = suma(result, (float) Main.PI);
    int randomNum = (int) (Math.random() * 101); // 0 to 100
    resultFl = suma(resultFl, 32);
    System.out.println("Valor de PI: " + Main.PI);
    System.out.println("Resultado final: " + resultFl);
    System.out.println(Math.PI);
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
    Math.max(5, 10);
    Math.min(5, 10);
    Math.sqrt(64);
    Math.abs(-4.7);
    System.out.println("Número random: " + Math.random());
    System.out.println("Número random: " + randomNum);
  }
}