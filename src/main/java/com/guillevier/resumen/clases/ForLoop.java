package com.guillevier.resumen.clases;

class ForLoop {
  static boolean isTurnOnLight = false;

  public static void main(String[] args) {
    turnOnOffLight();

    for (int i = 0; i < 10; i++) {
      printSOS();
    }
  }

  public static void printSOS() {
    System.out.println("...___...");
  }

  public static boolean turnOnOffLight() {
    isTurnOnLight = (isTurnOnLight) ? false : true;
    return isTurnOnLight;
  }
}