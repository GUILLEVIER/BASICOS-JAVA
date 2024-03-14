package com.guillevier.resumen.clases;

// Create a Main class
class CarConstructor {
  int x; // Create a class attribute
  int y;
  int modelYear;
  String modelName;

  // Create a class constructor for the Main class
  public CarConstructor(int z, int year, String name) {
    x = 5; // Set the initial value for the class attribute x
    y = z;
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    CarConstructor myObj = new CarConstructor(10, 1969, "Mustang"); // Create an object of class Main (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x
    System.out.println(myObj.y);
  }
}