package com.guillevier.resumen.clases.streams;

import com.guillevier.resumen.clases.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFlatMap {
  public static void main(String[] args) {
    Stream<Usuario> nombres = Stream
            .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                    "Pepe Garcia")
            .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
            .flatMap(u -> {
              if (u.getNombre().equalsIgnoreCase("Pepe")) {
                return Stream.of(u);
              }
              return Stream.empty();
            })
            .peek(System.out::println);
    System.out.println(nombres.count());
  }
}