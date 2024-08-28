package com.guillevier.resumen.clases;

class Variables {
  public static void main(String[] args) {
    // Declaring a variable
    int age;
    int speed;
    int salary = 1000;
    // Assigning a value to the variable
    age = 31;
    speed = 20;
    String employeeName = "Cindy Oñate";
    // Printing the value of the variable
    System.out.println("Nombre: " + employeeName + " Edad: " + age + " Velocidad de reacción: " + speed);
    int n = 1234567890;
    long nL = 1234567890123456789L;
    double nD = 123.4567890;
    float nF = 123.4567890F;
    int salaryEmployee = 10000;
    var pension = salary * 0.03;
    var totalSalary = salaryEmployee - pension;
    System.out.println("EMPLOYEE: " + employeeName + " SALARY " + totalSalary);
    int number = 5;
    // Find out if the number above is even or odd
    if (number % 2 == 0) {
      System.out.println(number + " is even.");
    } else {
      System.out.println(number + " is odd.");
    }
  }
}