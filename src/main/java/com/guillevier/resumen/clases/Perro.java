package com.guillevier.resumen.clases;

public class Perro extends Animal {

  @Override
  public void hablar() {
    System.out.println("Ladra");
  }

  public Perro(String name) {
    super(name);
  }
}
