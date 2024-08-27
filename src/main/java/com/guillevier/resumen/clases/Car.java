package com.guillevier.resumen.clases;

// CLASE PUBLICA Car.
public class Car {
  // DEFINICIÓN DE ATRIBUTOS CON VALORES INICIALES.
  protected String brand = "Ford";
  int x;
  int y;
  int modelYear;
  String modelName;

  // DEFINICIÓN DE MÉTODOS.
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  public void honk() {
    System.out.println("Tuut, tuut!");
  }

  public Car() {
    
  }

  public Car(int x, int y, int year, String name) {
    x = 5; // Set the initial value for the class attribute x
    y = y;
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Car myCar = new Car(); // Create a myCar object
    Car myCarTwo = new Car(10, 20, 1969, "Mustang");
    myCar.fullThrottle(); // Call the fullThrottle() method
    myCarTwo.speed(200); // Call the speed() method
  }
}