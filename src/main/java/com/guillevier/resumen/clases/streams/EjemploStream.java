package com.guillevier.resumen.clases.streams;

import java.util.ArrayList;
import java.util.List;

public class EjemploStream {
  public static void main(String[] args) {
    List<String> lista = new ArrayList<>();
    lista.add("Pato");
    lista.add("Paco");
    lista.add("Pepe");
    lista.add("Pepa");
    lista.stream().forEach(System.out::println);
  }
}