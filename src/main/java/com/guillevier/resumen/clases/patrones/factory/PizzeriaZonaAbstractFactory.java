package com.guillevier.resumen.clases.patrones.factory;

abstract public class PizzeriaZonaAbstractFactory {

  // MÉTODO ABSTRACTO: Recuerda que todos los métodos son
  // abstractos por defecto...
  public PizzaProducto ordenarPizza(String tipo) {
    PizzaProducto pizza = crearPizza(tipo);
    System.out.println("------Fabricando la pizza " + pizza.getNombre() + "------");
    pizza.preparar();
    pizza.cocinar();
    pizza.cortar();
    pizza.empaquetar();
    return pizza;
  }

  abstract PizzaProducto crearPizza(String tipo);
}