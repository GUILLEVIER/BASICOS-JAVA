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
    OuterClassTwo myOuter = new OuterClassTwo();
    OuterClassTwo.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.myInnerMethod());
  }
}