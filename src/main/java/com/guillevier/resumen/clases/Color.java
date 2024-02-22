package com.guillevier.resumen.clases;

/*
Hemos agregado un método printInfo() a la enumeración Color. También hemos agregado un atributo description a cada constante de enumeración y hemos proporcionado un constructor y un método getDescription() para acceder a este atributo.
El método printInfo() se declara como abstracto en la enumeración Color, lo que significa que cada constante de enumeración debe proporcionar su propia implementación del método. Esto permite una mayor personalización y encapsulación de la funcionalidad dentro de cada constante de enumeración.
Al final, la enumeración Color ahora tiene un método printInfo() que se puede llamar para cada constante de enumeración, lo que imprimirá información sobre el color y su código hexadecimal.
*/
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
