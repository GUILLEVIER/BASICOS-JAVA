package com.guillevier.resumen.clases;

/*
Hemos agregado un método printInfo() que se declara como abstracto en la enum Color, lo que significa que cada constante
de enumeración debe proporcionar su propia implementación del método. Esto permite una mayor personalización y encapsulación
de la funcionalidad dentro de cada constante de enumeración.
También hemos agregado un atributo description, proporcionado un constructor y un método getDescription() para acceder a este atributo.
Al final, la enumeración Color ahora tiene un método printInfo() que se puede llamar para cada constante de enumeración,
lo que imprimirá información sobre el color y su código hexadecimal.
*/
// LISTO
public enum Color {
  RED("Rojo") {
    @Override
    public void printInfo() {
      System.out.println("Color RED en hexadecimal: #FF0000");
    }
  },
  GREEN("Verde") {
    @Override
    public void printInfo() {
      System.out.println("Color GREEN en hexadecimal: #008000");
    }
  },
  BLUE("Azul") {
    @Override
    public void printInfo() {
      System.out.println("Color BLUE en hexadecimal: #0000FF");
    }
  };

  private final String description;

  Color(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }

  public abstract void printInfo();
}