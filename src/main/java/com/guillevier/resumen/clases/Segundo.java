package com.guillevier.resumen.clases;

public class Segundo {
  static void myMethod() {
    System.out.println("Hello World!");
  }

  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  public static void main(String[] args) {
    Primero myObj = new Primero();
    System.out.println(myObj.x);
    myObj.x = myObj.x + 20; // Will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
    myMethod();
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would compile an error
    Segundo myObjSegundo = new Segundo(); // Create an object of Segundo
    myObjSegundo.myPublicMethod(); // Call the public method on the object
  }
}