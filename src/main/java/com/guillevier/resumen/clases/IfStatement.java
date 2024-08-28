package com.guillevier.resumen.clases;

class IfStatement {
  public static void main(String[] args) {
    boolean isBluetoothEnabled = true;
    int fileSended = 3;
    if (isBluetoothEnabled) {
      fileSended++;
      // VARIABLE CREADA DENTRO DE LLAVES, SOLO EXISTE DENTRO DEL IF.
      int i = 0;
      System.out.println("Bluetooth is enabled, enviando archivo...");
    } else {
      System.out.println("Bluetooth is disabled, por favor enciende tu Bluetooth para iniciar la transferencia.");
    }
    System.out.println(fileSended);
    // Fuera del scope.
    // System.out.println(i);

    String intensidadInternet = "nula";
    if (intensidadInternet.equals("nula"))
      System.out.println("No hay Internet");
    else if (intensidadInternet.equals("baja"))
      System.out.println("Tienes muy poquito Internet");
    else if (intensidadInternet.equals("media"))
      System.out.println("Casi casi, falta solo un poquito más");
    else
      System.out.println("¡Tienes suficiente Internet!");

    int x = 10;
    String r1 = (x > 5) ? "x is greater than 5" : "x is not greater than 5";
    System.out.println(r1);

    int time = 22;
    if (time < 10) {
      System.out.println("Good morning.");
    } else if (time < 18) {
      System.out.println("Good day.");
    } else {
      System.out.println("Good evening.");
    }
  }
}