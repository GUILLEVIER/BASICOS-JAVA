package com.guillevier.resumen.clases;

// LISTO
public class Gato extends Animal {
  @Override
  public void hablar() {
    System.out.println("Miaow");
  }

  public Gato(String name) {
    super(name);
  }
}