package com.guillevier.resumen.clases;
import java.util.Scanner;

class DoWhileLoop {
  public static void main(String[] args) {
    int response;
    do {
      System.out.println("Selecciona el número de la opción deseada:");
      System.out.println("1. Movies.");
      System.out.println("2. Series.");
      System.out.println("0. Salir.");

      Scanner sc = new Scanner(System.in);
      response = Integer.parseInt(sc.nextLine());

      switch (response) {
        case 0 -> System.out.println("Saliendo del programa...");
        case 1 -> System.out.println("Movies selected.");
        case 2 -> System.out.println("Series selected.");
        default -> System.out.println("Opción inválida.");
      }
    } while (response != 0);
    System.out.println("Programa Finalizado.");
  }
}