package com.guillevier.resumen.clases;

class IncrementDecrement {
  public static void main(String[] args) {
    int lives = 5;
    // lives = lives - 1;
    lives--;
    lives++;
    // Prefijo
    // Gana un regalo por ganar una vida.
    int gift = 100 + ++lives;
    System.out.print(gift);
    System.out.print(lives);
  }
}