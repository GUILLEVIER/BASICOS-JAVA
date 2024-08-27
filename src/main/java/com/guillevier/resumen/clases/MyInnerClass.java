package com.guillevier.resumen.clases;

class OuterClassTwo {
  int x = 10;

  class InnerClass {
    public int myInnerMethod() {
      return x;
    }
  }
}

public class MyInnerClass {
  public static void main(String[] args) {
    // PRIMERO SE CREA LA CLASE EXTERIOR.
    OuterClassTwo myOuter = new OuterClassTwo();
    // SEGUNDO SE CREA LA CLASE INTERIOR A PARTIR DE LA EXTERIOR.
    OuterClassTwo.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.myInnerMethod());
  }
}