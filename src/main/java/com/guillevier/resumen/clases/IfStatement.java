package com.guillevier.resumen.clases;

// LISTO
class IfStatement {
  public static void main(String[] args) {
    String intensidadInternet = "nula";
    if (intensidadInternet.equals("nula")) {
      // VARIABLE CREADA DENTRO DE LLAVES, SOLO EXISTE DENTRO DEL IF.
      int i = 0;
      i++;
      System.out.println("No hay Internet");
    } else if (intensidadInternet.equals("baja"))
      System.out.println("Tienes muy poquito Internet");
    else if (intensidadInternet.equals("media"))
      System.out.println("Casi casi, falta solo un poquito más");
    else
      System.out.println("¡Tienes suficiente Internet!");
    // Fuera del scope.
    // System.out.println(i);

    // TERNARIA
    int x = 10;
    String r = (x > 5) ? "x is greater than 5" : "x is not greater than 5";
    System.out.println(r);
  }
}