package com.guillevier.resumen.clases;

// LISTO
public interface MyInterface {
  // MÉTODO DEFAULT
  default void myMethod() {
    System.out.println("Hello from MyInterface");
  }

  // MÉTODO STATIC
  static void myStaticMethod() {
    System.out.println("Hello from MyInterface static method");
  }
}