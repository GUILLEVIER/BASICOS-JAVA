package com.guillevier.resumen.clases;

// LISTO
class Cast {
  public static void main(String[] args) {
    // En un año ubicar 30 perritos.
    // ¿Cuántos perritos ubiqué al mes?
    double monthlyDogs = 30.0 / 12.0;
    System.out.println(monthlyDogs);
    // monthlyDogs: 2.5 (Pero no es posible, ¡no rescatamos medio perrito!)

    // Estimación
    // Trunca la parte decimal.
    int estimatedMonthlyDogs = (int) monthlyDogs;
    System.out.println(estimatedMonthlyDogs);
    // estimatedMonthlyDogs: 2 (Recuerda que el casteo no redondea, solo quita los decimales)

    // Exactitud
    // Dato sea lo mas exacto posible.
    int a = 30;
    int b = 12;

    // Cast de manera no automática.
    // Se fuerza a que la división entregue como resultado un double.
    System.out.println((double) a / b); // 2.5

    // Cast de manera automática.
    // División entre 2 números enteros, pero se define el resultado como double.
    double c = a / b;
    System.out.println("Cast automático a entero: " + c); // 2.0

    char n = '1';
    System.out.println(n); // 1

    // RETORNA EL ASCII DEL CHAR 1
    int nI = (int) n;
    System.out.println(nI); // 49

    // RETORNA EL ASCII DEL CHAR 1
    short nS = (short) n;
    System.out.println(nS); // 49
  }
}