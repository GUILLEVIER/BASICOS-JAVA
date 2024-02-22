package com.guillevier.resumen.clases;

/*
La clase Gato hereda de la clase Animal. La clase Gato proporciona una implementación para el método hablar().
*/
public class Gato extends Animal {
  public Gato(String nombre) {
    super(nombre);
  }

  @Override
  public void hablar() {
    System.out.println(getNombre() + " maulla");
  }
}
