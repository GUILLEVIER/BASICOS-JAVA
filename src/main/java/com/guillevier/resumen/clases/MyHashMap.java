package com.guillevier.resumen.clases;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// LISTO
// Almacenar y manipular pares clave-valor.
public class MyHashMap {
  public static void main(String[] args) {
    // Se crea un nuevo HashMap llamado map que almacena pares de tipo String (clave) e Integer (valor).
    Map<String, Integer> map = new HashMap<>();
    // Se agregan varios pares clave-valor al mapa, como "manzana" con valor 10, "plátano" con valor 20 y "cereza" con valor 30.
    map.put("manzana", 10);
    map.put("plátano", 20);
    map.put("cereza", 30);
    // Se recuperan e imprimen los valores asociados a las claves "manzana", "plátano" y "cereza".
    System.out.println(map.get("manzana")); // Imprime 10
    System.out.println(map.get("plátano")); // Imprime 20
    System.out.println(map.get("cereza")); // Imprime 30
    // Se elimina el par clave-valor asociado a "plátano".
    map.remove("plátano");
    // Se verifica si ciertas claves están presentes en el mapa y se imprimen los resultados.
    System.out.println(map.containsKey("manzana")); // Imprime true
    System.out.println(map.containsKey("plátano")); // Imprime false
    // Se obtienen e imprimen todos los conjuntos de claves y valores del mapa.
    Set<String> keys = map.keySet();
    System.out.println(keys); // imprime [manzana, cereza]
    Collection<Integer> values = map.values();
    System.out.println(values); // imprime [10, 30]
    // Se itera sobre las entradas del mapa (pares clave-valor) y se imprimen.
    Set<Map.Entry<String, Integer>> entries = map.entrySet();
    for (Map.Entry<String, Integer> entry : entries) {
      System.out.println(entry.getKey() + ":" + entry.getValue());
    }
    System.out.println(map.size());

    // Se crean otros dos HashMap: people para almacenar nombres y edades, y capitalCities para almacenar países y sus capitales.
    HashMap<String, Integer> people = new HashMap<String, Integer>();
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    people.put("John", 32);
    people.put("Steve", 30);
    people.put("Angie", 33);
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");

    // Se imprimen las claves y valores de los mapas people y capitalCities utilizando bucles for.
    for (String p : people.keySet()) {
      System.out.println("key: " + p + " value: " + people.get(p));
    }

    for (String cCK : capitalCities.keySet()) {
      System.out.println("key: " + cCK + " value: " + capitalCities.get(cCK));
    }

    // Se elimina una entrada del mapa capitalCities y se limpian todos los elementos del mapa al final.
    capitalCities.remove("England");
    capitalCities.clear();
  }
}