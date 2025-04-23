package com.guillevier.resumen.clases.patrones.decorator.decorador;

import com.guillevier.resumen.clases.patrones.decorator.Formateable;

public class MayusculaDecorador extends TextoDecorador {
  public MayusculaDecorador(Formateable texto) {
    super(texto);
  }

  @Override
  public String darFormato() {
    return texto.darFormato().toUpperCase();
  }
}