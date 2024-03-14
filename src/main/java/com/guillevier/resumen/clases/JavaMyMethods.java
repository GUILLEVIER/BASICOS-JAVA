package com.guillevier.resumen.clases;

/*
Un método es un bloque de código que solo se ejecuta cuando se llama.
Puede pasar datos, conocidos como parámetros, a un método.
Los métodos se utilizan para realizar determinadas acciones y también se conocen como funciones.
¿Por qué utilizar métodos? Para reutilizar código: Defina el código una vez y utilícelo muchas veces.

myMethod() es el nombre del método
static significa que el método pertenece a la clase Main y no a un objeto de la clase Main.
void significa que este método no tiene un valor de retorno.
*/

public class JavaMyMethods {
  int atr1 = 10;
  static void myMethod() {
    System.out.println("I just got executed!");
  }
  static void myMethodWithParameter(String fname) {
    System.out.println(fname);
  }
  static int myMethodNumeric(int x) {
    return 5 + x;
  }
  // Create a checkAge() method with an integer variable called age
  static void checkAge(int age) {
    // If age is less than 18, print "access denied"
    // If age is greater than, or equal to, 18, print "access granted"
    if (age < 18) System.out.println("Access denied - You are not old enough!");
    else System.out.println("Access granted - You are old enough!");
  }

  int myMethod(int x) {
    return 0;
  }

  float myMethod(float x) {
    return 0;
  }

  double myMethod(double x, double y) {
    return 0;
  }

  static int plusMethodInt(int x, int y) {
    return x + y;
  }

  static double plusMethodDouble(double x, double y) {
    return x + y;
  }

  static int plusMethod(int x, int y) {
    return x + y;
  }

  static double plusMethod(double x, double y) {
    return x + y;
  }

  public static int sum(int k) {
    if (k > 0) return k + sum(k - 1);
    else return 0;
  }

  public static int sum(int start, int end) {
    if (end > start) return end + sum(start, end - 1);
    else return end;
  }

  public static void main(String[] args) {
    myMethod();
    myMethodWithParameter("Liam");
    int z = myMethodNumeric(10);
    System.out.println(z);
    checkAge(20); // Call the checkAge method and pass along an age of 20
    int myNum1 = plusMethodInt(8, 5);
    double myNum2 = plusMethodDouble(4.3, 6.26);
    System.out.println("int: " + myNum1);
    System.out.println("double: " + myNum2);
    // Code here CANNOT use x
    {
      // This is a block
      // Code here CANNOT use x
      int x = 100;
      // Code here CAN use x
      System.out.println(x);
    }
    // The block ends here
  }
}
