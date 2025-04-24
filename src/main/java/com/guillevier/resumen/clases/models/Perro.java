package com.guillevier.resumen.clases.models;

// LISTO
public class Perro extends Animal {

  @Override
  public void hablar() {
    System.out.println("Ladra");
  }

  public Perro(String name) {
    super(name);
  }
}