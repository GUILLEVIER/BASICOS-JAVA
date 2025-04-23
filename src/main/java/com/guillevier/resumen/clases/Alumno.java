package com.guillevier.resumen.clases;

public class Alumno {
  private String nombre;
  private Integer indice;
  private String nota;

  public Alumno(String nombre, Integer indice) {
    this.nombre = nombre;
    this.indice = indice;
  }

  public Integer getIndice() {
    return indice;
  }

  public void setIndice(Integer indice) {
    this.indice = indice;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNota() {
    return nota;
  }

  public void setNota(String nota) {
    this.nota = nota;
  }
}