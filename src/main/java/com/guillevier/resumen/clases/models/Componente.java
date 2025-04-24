package com.guillevier.resumen.clases.models;

import java.util.ArrayList;
import java.util.List;

public class Componente {
  private String nombre;
  private List<Componente> hijos;
  private int nivel;

  public Componente(String nombre) {
    this.nombre = nombre;
    this.hijos = new ArrayList<>();
  }

  public String getNombre() {
    return nombre;
  }

  public List<Componente> getHijos() {
    return hijos;
  }

  public int getNivel() {
    return nivel;
  }

  public void setNivel(int nivel) {
    this.nivel = nivel;
  }

  public Componente addComponente(Componente componente) {
    hijos.add(componente);
    return this;
  }

  public boolean tieneHijos() {
    return !hijos.isEmpty();
  }
}