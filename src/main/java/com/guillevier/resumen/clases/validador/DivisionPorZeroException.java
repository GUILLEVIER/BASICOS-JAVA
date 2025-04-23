package com.guillevier.resumen.clases.validador;

public class DivisionPorZeroException extends Exception {
  public DivisionPorZeroException(String mensaje) {
    super(mensaje);
  }
}