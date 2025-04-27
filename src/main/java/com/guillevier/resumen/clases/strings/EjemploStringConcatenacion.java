package com.guillevier.resumen.clases.strings;

public class EjemploStringConcatenacion {
  public static void main(String[] args) {
    String curso = "Programación Java";
    String profesor = "Andrés Guzmán";
    String detalle = curso + " con el instructor " + profesor;
    System.out.println(detalle);
    int numeroA = 10;
    int numeroB = 5;
    System.out.println(detalle + (numeroA + numeroB));
    System.out.println(numeroA + numeroB + detalle);
    String detalle2 = curso.concat(" con el instructor ").concat(profesor);
    System.out.println("detalle2 = " + detalle2);
  }
}