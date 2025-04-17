package com.guillevier.resumen.clases;

// LISTO
// CLASE PUBLICA Car.
public class Car {
  // DEFINICIÓN DE ATRIBUTOS CON VALORES INICIALES.
  protected String brand = "Ford";
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

  // CONSTRUCTOR
  public Car() {

  }

  public Car(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public Car(String brand, int year, String name) {
    this.brand = brand;
    modelYear = year;
    modelName = name;
  }

  public int getYear() {
    return modelYear;
  }

  public String getName() {
    return modelName;
  }

  public static void main(String[] args) {
    Car myCar = new Car(); // Create a myCar object
    Car myCarTwo = new Car(1969, "Mustang");
    myCar.fullThrottle(); // Call the fullThrottle() method
    myCar.honk();
    myCarTwo.speed(200); // Call the speed() method
  }
}