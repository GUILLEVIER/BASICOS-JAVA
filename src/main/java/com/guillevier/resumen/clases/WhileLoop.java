package com.guillevier.resumen.clases;

class WhileLoop {
  static boolean isTurnOnLight = false;

  public static void main(String[] args) {
    turnOnOffLight();

    int i = 0;
    while (isTurnOnLight && i < 10) {
      printSOS();
      i++;
    }
  }

  public static void printSOS() {
    System.out.println("...___...");
  }

  public static void turnOnOffLight() {
    isTurnOnLight = !isTurnOnLight;
  }
}