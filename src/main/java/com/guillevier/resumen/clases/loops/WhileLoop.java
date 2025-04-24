package com.guillevier.resumen.clases.loops;

// LISTO
class WhileLoop {
  public static void main(String[] args) {
    int i = 0;
    while (i < 10) {
      printSOS();
      i++;
    }
  }

  public static void printSOS() {
    System.out.println("...___...");
  }
}