package com.guillevier.resumen.clases.operators;

public class PrecedenciaOperadores {
  public static void main(String[] args) {
    int i = 14;
    int j = 6;
    int k = 20;
    double promedio = (i + j + k) / 3d; // (14 + 6 + 20) / 3.0
    System.out.println("promedio = " + promedio); // 13.333333333333334
    System.out.println("3d = " + 3d);
    System.out.println("3d * 10 = " + 3d * 10);
    promedio = (i + j + k) / 3d * 10; // ((14 + 6 + 20) / 3.0) * 10
    System.out.println("promedio = " + promedio); // 133.33333333333334
    System.out.println("--i: " + --i); // 13
    System.out.println("j++: " + j++); // 6
    promedio = --i + j++ + k / 3d * 10; // (13 + 6 + ((20 / 3.0) * 10))
    System.out.println("promedio = " + promedio);
    System.out.println("i = " + i);
    System.out.println("j = " + j);
  }
}