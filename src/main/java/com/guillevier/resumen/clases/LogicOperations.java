package com.guillevier.resumen.clases;

class LogicOperations {
  public static void main(String[] args) {
    int a = 8;
    int b = 5;
    System.out.println("a es igual a b? -> " + (a == b));
    System.out.println("a es diferente de b? -> " + (a != b));
    System.out.println("a es mayor que b? -> " + (a > b));
    System.out.println("a es menor que b? -> " + (a < b));
    System.out.println("a es mayor o igual que b? -> " + (a >= b));
    System.out.println("a es menor o igual que b? -> " + (a <= b));
    System.out.println("a es distinto de b? -> " + (a != b));
    System.out.println("a es igual a b y b es igual a a? -> " + (a == b && b == a));
    System.out.println("a es igual a b o b es igual a a? -> " + (a == b || b == a));
    if (a == b) {
      System.out.println("a es igual a b");
    } else if (a != b) {
      System.out.println("a es diferente de b");
    } else if (a > b) {
      System.out.println("a es mayor que b");
    } else if (a < b) {
      System.out.println("a es menor que b");
    } else if (a >= b) {
      System.out.println("a es mayor o igual que b");
    } else if (a <= b) {
      System.out.println("a es menor o igual que b");
    } else if (a != b) {
      System.out.println("a es distinto de b");
    } else if (a == b && b == a) {
      System.out.println("a es igual a b y b es igual a a");
    } else if (a == b || b == a) {
      System.out.println("a es igual a b o b es igual a a");
    }
  }
}