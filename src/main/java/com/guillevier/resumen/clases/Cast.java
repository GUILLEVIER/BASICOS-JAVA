package com.guillevier.resumen.clases;

class Cast {
  public static void main(String[] args) {
    // En un año ubicar 30 perritos.
    // ¿Cuántos perritos ubiqué al mes?
    double monthlyDogs = 30.0 / 12.0;
    System.out.println(monthlyDogs);

    // Estimación
    // Trunca la parte decimal.
    int estimatedMonthlyDogs = (int) monthlyDogs;
    System.out.println(estimatedMonthlyDogs);

    // Exactitud
    // Dato sea lo mas exacto posible.
    int a = 30;
    int b = 12;

    // Cast de manera no automática.
    System.out.println((double) a / b);

    // Cast de manera automática.
    double c = a / b;
    System.out.println(c);

    char n = '1';
    int nI = n;

    // Retorna el ASCII de un char.
    System.out.println(nI);

    short nS = (short) n;
    System.out.println(nS);
  }
}