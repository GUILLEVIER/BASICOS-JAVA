package com.guillevier.resumen.clases.models;

// LISTO
public interface MyInterface {
  // MÉTODO DEFAULT: Nos permite heredar la definición
  // de la función y también su implementación.
  default void myMethod() {
    System.out.println("Hello from MyInterface");
  }

  // MÉTODO STATIC:
  static void myStaticMethod() {
    System.out.println("Hello from MyInterface static method");
  }

  // MÉTODO PRIVATE: Nos permiten definir comportamiento,
  // pero solo se puede usar desde otras clases de esta
  // interfaz, no se hereda a la clase hija.
  private void myPrivateMethod() {
    System.out.println("Hello from MyInterface private method");
  }
}