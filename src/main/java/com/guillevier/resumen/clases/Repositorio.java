package com.guillevier.resumen.clases;

import java.util.stream.Stream;

public interface Repositorio<T> {
  Stream<T> filtrar(String criterio);
}