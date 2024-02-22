package com.guillevier.resumen.clases;

/*
La clase Perro hereda de la clase Animal. La clase Perro proporciona una implementación para el método hablar().
*/
public class Perro extends Animal {
  public Perro(String nombre) {
    super(nombre);
  }

  @Override
  public void hablar() {
    System.out.println(getNombre() + " ladra");
  }
}
