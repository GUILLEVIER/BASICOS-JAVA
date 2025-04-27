package com.guillevier.resumen.clases.map;

import com.guillevier.resumen.clases.models.Car;

import java.util.Map;
import java.util.TreeMap;

// LISTO
public class MyTreeMap {
  public static void main(String[] args) {
    // Crea un nuevo TreeMap
    Map<String, Integer> treeMap = new TreeMap<>();
    // Agrega pares clave(String) - valor(Integer) al mapa
    treeMap.put("manzana", 10);
    treeMap.put("plátano", 20);
    treeMap.put("cereza", 30);
    // Recupera valores del mapa
    System.out.println(treeMap.get("manzana")); // Imprime 10
    System.out.println(treeMap.get("plátano")); // Imprime 20
    System.out.println(treeMap.get("cereza")); // Imprime 30
    // Elimina un par clave-valor del mapa
    treeMap.remove("plátano");
    // Verifica si una clave está presente en el mapa
    System.out.println(treeMap.containsKey("manzana")); // Imprime true
    System.out.println(treeMap.containsKey("plátano")); // Imprime false
    System.out.println(treeMap.containsKey("cereza")); // Imprime true
    // Imprime el tamaño del mapa
    System.out.println(treeMap.size()); // Imprime 2
    // Crea un nuevo TreeMap
    // clave: String
    // valor: Map --> clave: Integer, valor: Car (Object)
    Map<String, Map<Integer, Car>> concessionaire = new TreeMap<>();
    Car f150 = new Car(2025, "F-150"), ranger = new Car(2025, "Ranger"), bronco = new Car(2025, "Bronco");
    Map<Integer, Car> fordModels = new TreeMap<>();
    fordModels.put(1, f150);
    fordModels.put(2, ranger);
    fordModels.put(3, bronco);
    concessionaire.put("Ford", fordModels);
    // Imprimir el contenido del TreeMap concessionaire
    System.out.println("****Concesionario****");
    for (Map.Entry<String, Map<Integer, Car>> entry : concessionaire.entrySet()) {
      String brand = entry.getKey();
      Map<Integer, Car> models = entry.getValue();
      System.out.println("Marca: " + brand);
      for (Map.Entry<Integer, Car> modelEntry : models.entrySet()) {
        Integer modelId = modelEntry.getKey();
        Car car = modelEntry.getValue();
        System.out.println("  Modelo ID: " + modelId + ", Nombre: " + car.getName() + ", Año: " + car.getYear());
      }
    }
  }
}