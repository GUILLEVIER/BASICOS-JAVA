package com.guillevier.resumen.clases.models;

// LISTO
public abstract class Animal {
  private String name;

  public static void saludar() {
  }

  public abstract void hablar();

  public Animal(String name) {
    this.name = name;
  }
}