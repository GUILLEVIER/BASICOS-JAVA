package com.guillevier.resumen.clases.models;

public class Usuario {
  private Integer id;
  private String nombre;
  private String apellido;

  public Usuario() {
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public Usuario(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
}