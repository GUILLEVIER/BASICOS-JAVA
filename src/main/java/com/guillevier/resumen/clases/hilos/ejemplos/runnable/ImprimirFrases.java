package com.guillevier.resumen.clases.hilos.ejemplos.runnable;

public class ImprimirFrases implements Runnable {
  private String frase1, frase2;

  public ImprimirFrases(String frase1, String frase2) {
    this.frase1 = frase1;
    this.frase2 = frase2;
  }

  @Override
  public void run() {
    new ImprimirFrases(this.frase1, this.frase2);
  }
}