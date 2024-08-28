package com.guillevier.resumen.clases;

import java.util.Scanner;

public class MyPOO {
  int x = 5;
  int y;
  int z = 40;
  String fname = "Guillermo";
  String lname = "Morales";

  static void myMethod() {
    System.out.println("HELLO WORLD!");
  }

  static class MyClass {
    public static void main(String[] args) {
      Scanner myObj = new Scanner(System.in);
      System.out.println("Enter username: ");
      String userName = myObj.nextLine();
      System.out.println("Username is: " + userName);
    }
  }

  public static void main(String[] args) {
    MyPOO myObj = new MyPOO();
    myObj.x = 10;
    myObj.y = 20;
    myObj.z = 30;
    System.out.println(myObj.x + myObj.y);
    Person myPerson = new Person();
    myPerson.setName("John"); // Set the value of the name variable to "John"
    System.out.println(myPerson.getName());
  }
}