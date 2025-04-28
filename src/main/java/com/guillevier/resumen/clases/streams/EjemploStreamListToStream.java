package com.guillevier.resumen.clases.streams;

import com.guillevier.resumen.clases.models.Usuario;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamListToStream {
  public static void main(String[] args) {
    List<Usuario> lista = new ArrayList<>();
    lista.add(new Usuario("Andrés", "Guzmán"));
    lista.add(new Usuario("Luci", "Martínez"));
    lista.add(new Usuario("Pepe", "Fernández"));
    lista.add(new Usuario("Cata", "Pérez"));
    lista.add(new Usuario("Lalo", "Mena"));
    lista.add(new Usuario("Exequiel", "Doe"));
    lista.add(new Usuario("Bruce", "Lee"));
    lista.add(new Usuario("Bruce", "Willis"));
    Stream<String> nombres = lista.stream()
            .map(u -> u.getNombre().toUpperCase()
                    .concat(" ")
                    .concat(u.getApellido().toUpperCase()))
            .flatMap(nombre -> {
              if (nombre.contains("bruce".toUpperCase())) {
                return Stream.of(nombre);
              }
              return Stream.empty();
            })
            .map(String::toLowerCase)
            .peek(System.out::println);
    System.out.println(nombres.count());

    System.out.println(lista.stream().anyMatch(usuario -> usuario.getApellido().equals("Martínez") && usuario.getNombre().equals("Luci")));
    System.out.println(lista.stream().noneMatch(usuario -> applyCriteria(usuario)));
    lista.stream().filter(usuario -> usuario.getNombre().startsWith("B")).forEach(usuario -> usuario.setApellido("Morales"));
    List<Usuario> listaOrdenada = lista.stream().filter(usuario -> usuario.getNombre().startsWith("E")).sorted(Comparator.comparing(Usuario::getId)).toList();
    System.out.println("Lista Ordenada: " + listaOrdenada);
  }

  private static boolean applyCriteria(Usuario user) {
    return user.getApellido().equals("Martínez") && user.getNombre().equals("Luci");
  }
}