package com.guillevier.resumen.clases;

public class Car {
  // Create a fullThrottle() method
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  // Create a speed() method and add a parameter
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  protected String brand = "Ford"; // Vehicle attribute

  public void honk() { // Vehicle method
    System.out.println("Tuut, tuut!");
  }

  // Inside main, call the methods on the myCar object
  public static void main(String[] args) {
    Car myCar = new Car(); // Create a myCar object
    myCar.fullThrottle(); // Call the fullThrottle() method
    myCar.speed(200); // Call the speed() method
  }
}