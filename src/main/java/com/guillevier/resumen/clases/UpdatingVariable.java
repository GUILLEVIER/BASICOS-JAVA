package com.guillevier.resumen.clases;

class UpdatingVariable {
  public static void main(String[] args) {
    int salary = 1000;
    // bono $500
    salary = salary + 500;
    // pension: $100 descuento
    salary = salary - 100;
    // 2 horas extra $150 c/u
    // Cupón de comida de $50
    salary = salary + (150 * 2) - 50;
    System.out.println(salary);
    // Actualizando cadenas de texto
    String employeeName = "Cindy Oñate";
    employeeName = employeeName + " - CEO";
    System.out.println(employeeName.toUpperCase());
    System.out.println(employeeName.toLowerCase());
    System.out.println(employeeName.length());
    System.out.println("RESULTADO: " + employeeName);
  }
}