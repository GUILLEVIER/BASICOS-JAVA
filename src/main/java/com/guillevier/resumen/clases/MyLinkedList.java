package com.guillevier.resumen.clases;
// Import the LinkedList class
import java.util.LinkedList;

public class MyLinkedList {
  public static void main(String[] args) {
    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
  }
}