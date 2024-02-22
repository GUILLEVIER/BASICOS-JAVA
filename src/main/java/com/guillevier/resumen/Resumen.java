package com.guillevier.resumen;

import com.guillevier.resumen.clases.*;
import java.util.function.IntSupplier;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Math;
import java.util.*;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class Resumen {
  public static void main(String[] args) {
    System.out.println("Hola Mundo");

    // Declarar la variable speed de tipo int (números enteros)
    int speed;

    // Actualizar el contenido de la variable speed:
    speed = 10; // Si ya habías declarado la variable

    // Declarar una variable y asignarle un valor al mismo tiempo:
    int salary = 1000;

    // Crear una variable de tipo String:
    String employeeName = "Anahí Salgado";

    // Actualizar datos numéricos:
    salary = 2000;
    salary = salary + 200;
    System.out.println(salary); // 1200
    salary += 300;
    System.out.println(salary); // 1500

    // Actualizar variables de tipo String:
    employeeName = "Anahí";
    employeeName = employeeName + "Salgado";
    System.out.println(salary); // Anahí Salgado
    employeeName += "Díaz de la Vega";
    System.out.println(employeeName); // Anahí Salgado Díaz de la Vega
    employeeName = "Irene" + employeeName;
    System.out.println(employeeName); // Irene Anahí Salgado Díaz de la Vega
    int n = 1234567890;
    long nL = 123456789012345L;
    double nD = 123.456123456;
    float nF = 123.456F;
    var name = "Guillermo Morales";
    var pension = salary * 0.03;
    var totalSalary = salary - pension;

    // Incremento postfijo:
    int vidas = 5;
    int regalo = 100 + vidas++;
    System.out.println("Regalo: " + regalo + ", vidas: " + vidas);
    // Regalo: 105, vidas: 6

    // Incremento prefijo:
    vidas = 5;
    regalo = 100 + ++vidas;
    System.out.println("Regalo: " + regalo + ", vidas: " + vidas);
    // Regalo: 106, vidas: 6

    double pi = Math.PI; // 3.141592653589793
    var r = 20;
    var result = 0.0;
    // 3.0 (redondear hacia arriba)
    result = Math.ceil(2.1);
    // 2.0 (redondear hacia abajo)
    result = Math.floor(2.1);
    // 8.0 (número elevado a una potencia)
    result = Math.pow(2, 3);
    // 1.73... (raíz cuadrada)
    result = Math.sqrt(3);
    // 3.0 (el número más grande)
    result = Math.max(2, 3);
    // Área de un círculo (PI * r^2):
    double areaCirculo = pi * Math.pow(r, 2);
    // Área de una esfera (4 * PI * r^2):
    double areaEsfera = 4 * pi * Math.pow(r, 2);
    // Volumen de una esfera ( (4/3) * PI * r^3):
    double volumenEsfera = ((double) 4 / 3) * pi * Math.pow(r, 3);
    double dogsQuantity = 30;
    double monthlyDogs = dogsQuantity / 12.0;
    // monthlyDogs: 2.5 (pero no es posible, ¡no rescatamos medio perrito!)
    int estimatedMonthlyDogs = (int) monthlyDogs;
    // estimatedMonthlyDogs: 2
    // Recuerda que el casteo no redondea, solo quita los decimales:
    double sqrt2 = Math.sqrt(3); // 1.7320508075688772
    int sqrt = (int) Math.sqrt(3);// 1
    int a = 30;
    int b = 12;
    int resultOperation = a / b; // 2
    double resultOperationCast = (double) a / b; // 2.5

    // SENTENCIA IF
    boolean isBluetoothEnabled = true; // También podría ser false
    int filesSended = 3;
    if (isBluetoothEnabled) {
      filesSended++;
      System.out.println("Archivo enviado");
    } else {
      System.out.println("El Bluetooth no está activado");
    }

    // Primer nivel:
    boolean condicion = true;
    int numero1 = 1;
    // Segundo nivel:
    if (condicion) {
      // podemos modificar variables del primer nivel,
      // incluso desde el segundo nivel:
      numero1++;
      // También podemos crear y modificar
      // nuevas variables en este nivel:
      int numero2 = 10;
      numero2++;
    }

    // Si volvemos al primer nivel, podemos seguir usando
    // y modificando las primeras variables:
    numero1--;

    // Pero si salimos del segundo nivel no podemos volver a acceder
    // a las variables que creamos allí:
    // System.out.println(numero2); // ERROR!

    boolean condicionA = true; // verdadero
    boolean condicionB = false; // falso

    boolean condicionC = 2 + 2 == 4; // verdadero
    boolean condicionD = 2 + 2 == 5; // falso

    boolean condicionE = "Pepito" == "Pepito"; // verdadero
    boolean condicionF = "Pepito" == "Pepe"; // falso

    // SENTENCIA ELSE IF
    String intensidadInternet = "nula";
    if (intensidadInternet.equals("nula")) System.out.println("No hay Internet");
    else if (intensidadInternet.equals("baja")) System.out.println("Tienes muy poquito Internet");
    else if (intensidadInternet.equals("media")) System.out.println("Casi casi, falta solo un poquito más");
    else System.out.println("¡Tienes suficiente Internet!");

    // OPERADOR TERNARIO
    /*
    En este ejemplo, el resultado será "x is greater than 5" porque la condición (x > 5) es verdadera.
    Si la condición fuera falsa, el resultado sería "x is not greater than 5".
    (condición) ? valor_si_es_verdadero : valor_si_es_falso;
    */
    int x = 10;
    String r1 = (x > 5) ? "x is greater than 5" : "x is not greater than 5";
    System.out.println(r1);

    // SENTENCIA SWITCH
    String profe = "";
    switch (profe) {
      case "Anahí":
        System.out.println("¡Profesora de Java!");
        break;
      case "Oscar":
        System.out.println("¡Profesor de React.js!");
        break;
      case "JuanDC":
        System.out.println("Oye niño, ¿qué haces aquí?");
        break;
      default:
        System.out.println("¡Un nuevo profe!");
        break;
    }

    /* DESDE JAVA 12:
    int edad = 0;
    switch (edad) {
      case 1 -> System.out.println("¡Tienes 1 año!");
      case 20 -> System.out.println("Tienes 20 años!");
      default -> System.out.println("Tu edad no es 1 ni 20");
    }
    */

    // BUCLE WHILE
    boolean isTurnOnLight = true;
    while (isTurnOnLight) {
      printSOS();
      isTurnOnLight = (isTurnOnLight) ? false : true;
    }

    // BUCLE FOR
    // for (inicialización; condición; incremento o decremento;) { // Instrucciones }
    for (int i = 1; i <= 10; i++) {
      printSOS();
    }

    // SENTENCIA BREAK
    for (int i = 0; i < 10; i++) {
      if (i == 5) {
        break;
      }
      System.out.println(i);
    }

    int number = 5;
    switch (number) {
      case 1:
        System.out.println("One");
        break;
      case 2:
        System.out.println("Two");
        break;
      case 3:
        System.out.println("Three");
        break;
      case 4:
        System.out.println("Four");
        break;
      case 5:
        System.out.println("Five");
        break;
      default:
        System.out.println("Number not found");
        break;
    }

    // SENTENCIA CONTINUE
    // Si se tiene un bucle for y se desea saltar la impresión del valor de i después de cumplir una condición.
    // En este ejemplo, después de encontrar la sentencia continue, el bucle se saltará la impresión del valor de i y continuará con la siguiente iteración del bucle.
    for (int i = 0; i < 10; i++) {
      if (i == 5) {
        continue;
      }
      System.out.println(i);
    }


    // BUCLE DO WHILE
    int response = 0;
    Scanner sc = new Scanner(System.in);
    response = Integer.parseInt(sc.nextLine());


    // ARRAYS
    /*
    TipoDato[] nombreVariable1;
    TipoDato[] nombreVariable = new TipoDato[capacidad];
    TipoDato[][] cities = new String[númeroFilas][númeroColumnas];
    */

    // CICLOS FOR ANIDADOS
    // Por ejemplo, si tenemos dos listas (list1 y list2) y queremos comparar todos los elementos de una lista con todos los elementos de la otra lista.
    ArrayList<String> list1 = new ArrayList<>();
    list1.add("A");
    list1.add("B");
    list1.add("C");
    ArrayList<String> list2 = new ArrayList<>();
    list2.add("A");
    list2.add("B");
    list2.add("C");
    for (String s : list1) {
      for (String string : list2) {
        if (s.equals(string)) {
          System.out.println("SON ELEMENTOS IGUALES: " + s + " = " + string);
        }
      }
    }

    // POLIMORFISMO
    Animal miPerro = new Perro("Chopper");
    miPerro.hablar(); // Chopper ladra
    Animal miGato = new Gato("Tom");
    miGato.hablar(); // Tom maulla
    // miGato.saludar();
    // miPerro.saludar();
    /*
    En este ejemplo, la clase Perro hereda de la clase Animal.
    A pesar de esto, no puede acceder al método estático saludar() de la clase Animal utilizando una referencia a un objeto de la clase Perro.
    La única forma de acceder a este método es a través del nombre de la clase Animal.
    */
    Animal.saludar();
    Perro.saludar();
    Gato.saludar();


    // CLASES ANÓNIMAS CON UNA ÚNICA DECLARACIÓN
    Display obj = new Display() {
      public void display() {
        System.out.println("Inside anonymous class with single declaration.");
      }
    };
    obj.display();

    // CLASE INTERNA ESTÁTICA
    ClaseEnvolvente.ClaseInternaEstatica claseInterna = new ClaseEnvolvente.ClaseInternaEstatica();
    claseInterna.mostrarMensaje();

    // MAP - HASHMAP
    // Crea un nuevo HashMap
    Map<String, Integer> map = new HashMap<>();

    // Agrega pares clave-valor al mapa
    map.put("manzana", 10);
    map.put("plátano", 20);
    map.put("cereza", 30);

    // Recupera valores del mapa
    System.out.println(map.get("manzana")); // Imprime 10
    System.out.println(map.get("plátano")); // Imprime 20
    System.out.println(map.get("cereza")); // Imprime 30

    // Elimina un par clave-valor del mapa
    map.remove("plátano");

    // Verifica si una clave está presente en el mapa
    System.out.println(map.containsKey("manzana")); // Imprime true
    System.out.println(map.containsKey("plátano")); // Imprime false

    // Recupera un conjunto de todas las claves en el mapa
    Set<String> keys = map.keySet();
    System.out.println(keys); // imprime [manzana, cereza]

    // Recupera una colección de todos los valores en el mapa
    Collection<Integer> values = map.values();
    System.out.println(values); // imprime [10, 30]

    // Recupera un conjunto de todos los pares clave-valor en el mapa
    Set<Map.Entry<String, Integer>> entries = map.entrySet();
    for (Map.Entry<String, Integer> entry : entries) {
      System.out.println(entry.getKey() + ":" + entry.getValue());
    }
    System.out.println(map.size());

    // TREEMAP
    // Crea un nuevo TreeMap
    Map<String, Integer> treeMap = new TreeMap<>();
    // Agrega pares clave-valor al mapa
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

    // Imprime el tamaño del mapa
    System.out.println(treeMap.size()); // Imprime 2

    // 1. Doctor#1
    // - - - Fecha#1
    // - - - Fecha#2
    // 2. Doctor#2
    // - - - Fecha#1
    // - - - Fecha#2
    // 3. Doctor#3
    // - - - Fecha#1
    // - - - Fecha#2
    Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();

    // MANEJO DE ERORRES
    // try-catch-finally
    int num = 5;
    int divisor = 0;

    try {
      int resultado = num / divisor;
      System.out.println("Resultado: " + resultado);
    } catch (ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      System.out.println("Fin del bloque try-catch.");
    }

    // try-catch-resources
    /*
    El bloque try utiliza paréntesis para declarar e inicializar un objeto BufferedReader que implementa la interfaz Closeable.
    Cuando el bloque try finaliza (ya sea normalmente o debido a una excepción), el objeto BufferedReader se cerrará automáticamente.
    El bloque catch maneja cualquier excepción que pueda ocurrir durante la lectura del archivo.
    A diferencia del bloque try-catch-finally tradicional, el bloque finally no es necesario en este caso, ya que Try-with-resources se encarga de cerrar los recursos.
     */
    try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
      String line;
      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }

    MyFunctionalInterface myFunction = () -> System.out.println("Hola mundo!");
    myFunction.doSomething();

    String myString = "Hola mundo!";
    MyFunctionalInterface myFunctionTwo = myString::toUpperCase;
    myFunction.doSomething(); // "HOLA MUNDO!"

    Function<Integer, String> converter = numberTwo -> {
      if (numberTwo < 0) {
        return "minus " + Math.abs(numberTwo);
      } else if (numberTwo < 10) {
        return numberNames[numberTwo];
      } else if (numberTwo < 20) {
        return teenNames[numberTwo - 10];
      } else if (numberTwo < 100) {
        return numberNames[numberTwo / 10] + " " + numberTwo % 10;
      } else {
        return "Cannot convert number to words";
      }
    };
    System.out.println(converter.apply(123));
    IntSupplier factorial = () -> {
      int resultFactorial = 1;
      for (int i = 2; i <= 10; i++) {
        resultFactorial *= i;
      }
      return resultFactorial;
    };
    System.out.println(factorial.getAsInt());

    // STREAM
    /*
    En este ejemplo, el método rangeClosed crea un Stream de números enteros en el rango [1, 100]. Luego, el método sum se utiliza para calcular la suma de todos los números en el Stream.
    */
    int sum = IntStream.rangeClosed(1, 100)
            .sum();
    System.out.println(sum);
    List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
    // Convertir los nombres a mayúsculas
    List<String> uppercaseNames = names.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());
    System.out.println(uppercaseNames);
    String[] namesArray = {"Alice", "Bob", "Charlie", "David"};
    // Filtrar los nombres para obtener solo los nombres que comienzan con 'A'
    List<String> namesStartingWithA = Arrays.stream(namesArray)
            .filter(nameFilter -> nameFilter.startsWith("A"))
            .collect(Collectors.toList());
    System.out.println(namesStartingWithA);

    // FILTER
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    // Filtrar los números para obtener solo los números pares
    List<Integer> evenNumbers = numbers.stream()
            .filter(numberFilter -> numberFilter % 2 == 0)
            .collect(Collectors.toList());
    System.out.println(evenNumbers);
    List<Integer> numbersThreeList = Arrays.asList(1, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10);
    System.out.println("LIST: " + numbersThreeList);
    List<Integer> numbersThreeArrayList = new ArrayList<>(numbersThreeList);
    System.out.println("ARRAY LIST: " + numbersThreeArrayList);
    System.out.println("LISTA CON ELEMENTOS DUPLICADOS: " + numbersThreeArrayList);
    // Eliminar los elementos que se encuentren duplicados de la lista, dejando solo los elementos únicos.
    numbersThreeArrayList.removeIf(numbersRemoveIf -> Collections.frequency(numbersThreeArrayList, numbersRemoveIf) > 1);
    System.out.println("LISTA SIN ELEMENTOS DUPLICADOS: " + numbersThreeArrayList);
    // Crear un Predicate que verifica si un número es par
    Predicate<Integer> isEven = numberIsEven -> numberIsEven % 2 == 0;
    // Filtrar la lista de números utilizando el Predicate isEven
    List<Integer> evenNumbersTwo = numbers.stream().filter(isEven).collect(Collectors.toList());
    System.out.println(evenNumbersTwo);
    // Crear un Consumer que imprime un número en la consola
    Consumer<Integer> printNumber = System.out::println;
    // Aplicar el Consumer printNumber a cada elemento de la lista
    numbers.forEach(printNumber);
  }

  private static final String[] numberNames = {
          "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
  };

  private static final String[] teenNames = {
          "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
  };

  /**
   * Comentario para Java Docs
   */
  public static void printSOS() {
    System.out.println("LAMPARA SE ENCUENTRA ENCENDIDA");
  }

  /**
   * Descripción general de nuestra función.
   * @author Guillermo Morales
   * @version 1.0
   * @param quantity Descripción del parámetro quantity
   * @return Descripción del valor que devolvemos en esta función
   * @throws IllegalArgumentException if the age is negative
   * @see #printSOS()
   * @deprecated As of version 1.1
   */
  // Vamos a documentar la función convertToDolar. Recuerda que esta función devuelve un número double y recibe dos argumentos: quantity (de tipo double) y currency (de tipo String).
  public int convertToDolar(double quantity, String currency) {
    return 0;
  }

  public int suma(int a, int b) {
    return a + b;
  }

  class OuterClass {
    private int a = 10;
    // INNER CLASSES
    class InnerClass {
      void display() {
        System.out.println("Value of a is: " + a);
      }
    }

    // LOCAL CLASSES
    void display() {
      class LocalClass {
        void print() {
          System.out.println("Inside local class.");
        }
      }
      LocalClass obj = new LocalClass();
      obj.print();
    }

    // ANONYMOUS CLASSES
    void displayTwo() {
      new Thread(new Runnable() {
        public void run() {
          System.out.println("Inside anonymous class.");
        }
      }).start();
    }

    // LOOP CLASSES
    void displayThree() {
      for (int i = 0; i < 10; i++) {
        new Thread(new Runnable() {
          public void run() {
            System.out.println("Inside loop class.");
          }
        }).start();
      }
    }
  }

  // CLASES INTERNAS ESTÁTICAS
  class OuterClassTwo {
    static private int a = 10;

    static class InnerClass {
      void display() {
        System.out.println("Value of a is: " + a);
      }
    }
    void display() {
      for (int i = 0; i < 10; i++) {
        int finalI = i;
        new Thread(new Runnable() {
          public void run() {
            System.out.println("Inside loop class: " + finalI);
          }
        }).start();
      }
    }
  }

  /*
  En este ejemplo, Color es el nombre de la enumeración y RED, GREEN y BLUE son sus constantes.
  Las constantes de una enumeración se consideran instancias de la enumeración y se consideran del mismo tipo.
  */
  public enum ColorSimple {
    RED,
    GREEN,
    BLUE
  }
}
