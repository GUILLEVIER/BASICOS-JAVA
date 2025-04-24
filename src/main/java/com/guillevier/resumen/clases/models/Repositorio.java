package com.guillevier.resumen.clases.models;

import java.util.stream.Stream;

public interface Repositorio<T> {
  Stream<T> filtrar(String criterio);
}