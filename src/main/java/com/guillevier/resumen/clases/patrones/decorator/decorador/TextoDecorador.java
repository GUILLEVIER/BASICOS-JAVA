package com.guillevier.resumen.clases.patrones.decorator.decorador;

import com.guillevier.resumen.clases.patrones.decorator.Formateable;

abstract public class TextoDecorador implements Formateable {
  protected Formateable texto;

  public TextoDecorador(Formateable texto) {
    this.texto = texto;
  }
}