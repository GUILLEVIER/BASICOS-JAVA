package com.guillevier.resumen.clases;

import java.util.ArrayList;
import java.util.function.Consumer;

class Lambdas2 {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);
    numbers.forEach(System.out::println);
    Consumer<Integer> method = System.out::println;
    numbers.forEach(method);
  }
}