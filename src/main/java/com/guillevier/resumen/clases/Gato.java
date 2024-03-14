package com.guillevier.resumen.clases;

public class Gato extends Animal {
  @Override
  public void hablar() {
    System.out.println("Ladra");
  }

  public Gato(String name) {
    super(name);
  }
}
