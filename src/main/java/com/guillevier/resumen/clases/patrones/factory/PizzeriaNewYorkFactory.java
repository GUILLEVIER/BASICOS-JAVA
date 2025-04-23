package com.guillevier.resumen.clases.patrones.factory;

import com.guillevier.resumen.clases.patrones.factory.producto.PizzaNewYorkItaliana;
import com.guillevier.resumen.clases.patrones.factory.producto.PizzaNewYorkPepperoni;
import com.guillevier.resumen.clases.patrones.factory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory {
  @Override
  PizzaProducto crearPizza(String tipo) {
    return switch (tipo) {
      case "vegetariana" -> new PizzaNewYorkVegetariana();
      case "pepperoni" -> new PizzaNewYorkPepperoni();
      case "italiana" -> new PizzaNewYorkItaliana();
      default -> null;
    };
  }
}