package com.guillevier.resumen.clases;

public class MathematicOperations {
  public static void main(final String[] args) {
    final double x = 2.1;
    final double y = 3.0;
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
    Math.random();
    int randomNum = (int) (Math.random() * 101); // 0 to 100
  }
}