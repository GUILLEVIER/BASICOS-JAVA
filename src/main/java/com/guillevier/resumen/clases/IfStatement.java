package com.guillevier.resumen.clases;

class IfStatement {
  public static void main(String[] args) {
    boolean isBluetoothEnabled = true;
    int fileSended = 3;
    if (isBluetoothEnabled) {
      fileSended++;
      int i = 0;
      System.out.println("Bluetooth is enabled, enviando archivo...");
    } else {
      System.out.println("Bluetooth is disabled, por favor enciende tu Bluetooth para iniciar la transferencia.");
    }
    System.out.println(fileSended);
    // Fuera del scope, se define dentro de los bloques.
    // System.out.println(i);
  }
}