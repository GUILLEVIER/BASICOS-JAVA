package com.guillevier.resumen.clases;

class IncrementDecrement {
  public static void main(String[] args) {
    int lives = 5;
    // SUFIJO
    // lives = lives - 1;
    lives--;
    lives++;
    // PREFIJO
    // Gana un regalo por ganar una vida.
    int gift = 100 + ++lives;
    System.out.print("GIFT: " + gift);
    System.out.print("LIVES: " + lives);
  }
}