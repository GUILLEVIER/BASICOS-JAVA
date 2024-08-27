package com.guillevier.resumen.clases;

// CLASE PUBLICA ABSTRACTA Animal.
public abstract class Animal {
  private String name;

  // MÉTODO SIN NECESIDAD DE INSTANCIAR LA CLASE
  public static void saludar() {
  }

  public abstract void hablar();

  // MÉTODO CONSTRUCTOR
  public Animal(String name) {
    this.name = name;
  }
}
