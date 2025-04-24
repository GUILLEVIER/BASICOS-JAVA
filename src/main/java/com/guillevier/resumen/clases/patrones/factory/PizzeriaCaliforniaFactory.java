package com.guillevier.resumen.clases.patrones.factory;

import com.guillevier.resumen.clases.patrones.factory.producto.PizzaCaliforniaPepperoni;
import com.guillevier.resumen.clases.patrones.factory.producto.PizzaCaliforniaQueso;
import com.guillevier.resumen.clases.patrones.factory.producto.PizzaCaliforniaVegetariana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory {
  @Override
  PizzaProducto crearPizza(String tipo) {
    return switch (tipo) {
      case "queso" -> new PizzaCaliforniaQueso();
      case "pepperoni" -> new PizzaCaliforniaPepperoni();
      case "vegetariana" -> new PizzaCaliforniaVegetariana();
      default -> null;
    };
  }
}