package com.guillevier.resumen.clases;

/* La clase Animal es declarada como abstracta.
La clase contiene un método abstracto llamado hablar().
Todas las clases que hereden de Animal deben proporcionar una implementación para el método hablar().
La clase Animal contiene un método concreto llamado getNombre().
*/

/**
 * This class is used to represent a cat or dog.
 * @author Guillermo Morales
 * @see Gato
 * @see Perro
 */

public abstract class Animal {
  private String nombre;

  public Animal(String nombre) {
    this.nombre = nombre;
  }

  public abstract void hablar();

  public String getNombre() {
    return nombre;
  }

  public static void saludar() {
    System.out.println("Hola, soy un animal");
  }
}
