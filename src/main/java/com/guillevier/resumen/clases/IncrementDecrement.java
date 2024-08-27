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
    // Regalo: 105, vidas: 6
    System.out.print(gift);
    System.out.print(lives);
  }
}