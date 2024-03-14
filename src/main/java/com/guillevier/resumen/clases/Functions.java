package com.guillevier.resumen.clases;

class Functions {
  public static double circleArea(final double r) {
    return Math.PI * Math.pow(r, 2);
  }
  public static double sphereArea(final double r) {
    return 4 * Math.PI * Math.pow(r, 2);
  }
  public static double sphereVolumen(final double r) {
    return (4 * Math.PI * Math.pow(r, 3)) / 3;
  }

  /**
   * Descripción: Función que especificando su moneda convierte una cantidad de
   * dinero a dólares.
   * 
   * @param quantity - Cantidad de dinero.
   * @param currency - Moneda de la cantidad: Solo aceptar USD, EUR o GBP.
   * @return - Cantidad de dinero en dólares.
   */
  public static double convertToDolar(double quantity, String currency) {
    return switch (currency) {
      case "USD" -> quantity * 3.68;
      case "EUR" -> quantity * 4.15;
      case "GBP" -> quantity * 4.55;
      default -> 0;
    };
  }

  // Comentario dee una sola linea.
  /*
   * Comentario de varias lineas.
   */
}