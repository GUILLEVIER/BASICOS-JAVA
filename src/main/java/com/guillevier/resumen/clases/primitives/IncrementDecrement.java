package com.guillevier.resumen.clases.primitives;

// LISTO
class IncrementDecrement {
  public static void main(String[] args) {
    int lives = 5;
    // SUFIJO
    lives--; // lives = lives - 1;
    lives++; // lives = lives + 1;
    // PREFIJO
    // Gana un regalo por ganar una vida.
    int gift = 100 + ++lives;
    System.out.print("GIFT: " + gift);
    System.out.println();
    System.out.print("LIVES: " + lives);
  }
}