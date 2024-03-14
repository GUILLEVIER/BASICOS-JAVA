package com.guillevier.resumen;

import com.guillevier.resumen.clases.*;

import java.util.function.IntSupplier;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Math;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Predicate;
import java.util.function.Consumer;

enum LevelExt {
  LOW,
  MEDIUM,
  HIGH
}

public class Resumen {
  static void checkAge(int age) {
    if (age < 18) throw new ArithmeticException("Access denied - You must be at least 18 years old.");
    else System.out.println("Access granted - You are old enough!");
  }

  enum LevelInt {
    LOW,
    MEDIUM,
    HIGH
  }

  public static void main(String[] args) {
    checkAge(15);
    LevelExt myVar = LevelExt.MEDIUM;
    switch (myVar) {
      case LOW:
        System.out.println("Low level");
        break;
      case MEDIUM:
        System.out.println("Medium level");
        break;
      case HIGH:
        System.out.println("High level");
        break;
    }
    LevelInt myLevel = LevelInt.MEDIUM;
    System.out.println(myLevel);
    System.out.println("Hola Mundo");
    int x2, y2, sum2;
    Scanner myObj = new Scanner(System.in); // Create a Scanner object
    System.out.println("Type a number:");
    x2 = myObj.nextInt(); // Read user input
    System.out.println("Type another number:");
    y2 = myObj.nextInt(); // Read user input
    sum2 = x2 + y2; // Calculate the sum of x + y
    System.out.println("Sum is: " + sum2); // Print the sum
    x2 = 5;
    y2 = 6;
    sum2 = x2 + y2;
    System.out.println(sum2); // Print the sum of x + y
    String words = "One Two Three Four";
    int countWords = words.split("\\s").length;
    System.out.println(countWords);
    String originalStr = "Hello";
    String reversedStr = "";
    for (int i = 0; i < originalStr.length(); i++) {
      reversedStr = originalStr.charAt(i) + reversedStr;
    }
    System.out.println("Reversed string: " + reversedStr);
    int[] myArray = {1, 5, 10, 25};
    sum2 = 0;
    int i;
    // Loop through the array elements and store the sum in the sum variable
    for (i = 0; i < myArray.length; i++) {
      sum2 += myArray[i];
    }
    System.out.println("The sum is: " + sum2);
    int length = 5;
    int width = 2;
    int area = length * width;
    System.out.println("Area of rectangle: " + area);
    int number = 5;
    // Find out if the number above is even or odd
    if (number % 2 == 0) {
      System.out.println(number + " is even.");
    } else {
      System.out.println(number + " is odd.");
    }
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
    boolean condition = true;
    int numero1 = 1;
    // Segundo nivel:
    if (condition) {
      // Podemos modificar variables del primer nivel,
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
    for (int i2 = 1; i2 <= 10; i2++) {
      printSOS();
    }
    // SENTENCIA BREAK
    for (int i2 = 0; i2 < 10; i2++) {
      if (i2 == 5) {
        break;
      }
      System.out.println(i);
    }
    int number2 = 5;
    switch (number2) {
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
    for (int i3 = 0; i3 < 10; i3++) {
      if (i3 == 5) {
        continue;
      }
      System.out.println(i3);
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
    // MANEJO DE ERRORES
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
      for (int i4 = 2; i4 <= 10; i4++) {
        resultFactorial *= i4;
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
    System.out.println("Hello World");
    System.out.println("Hello World!");
    System.out.println("I am learning Java.");
    System.out.println("It is awesome!");
    System.out.print("I will print on the same line.");
    System.out.println(3);
    System.out.println(358);
    System.out.println(50000);
    System.out.println(3 + 3);
    System.out.println(2 * 5);
    // This is a comment.
    System.out.println("Hello World"); // This is a comment
    /*
     * The code below will print the words Hello World
     * to the screen, and it is amazing
     */
    String nameTwo = "Guillermo";
    int age = 31;
    String birthday;
    birthday = "27 DE JUNIO DE 1992";
    age = 41; // Age is now 41
    final int constNumber = 31; // Declare const number.
    // constNumber = 41; // will generate an error: cannot assign a value to a final variable
    System.out.println(name);
    int myNum = 5;
    float myFloatNum = 5.99f;
    char myLetter = 'D';
    boolean myBool = true;
    String myText = "Hello";
    String firstName = "Guillermo";
    String lastName = "Morales";
    String fullName = firstName + lastName;
    System.out.println(fullName);
    int x3 = 5, y = 6, z = 50;
    System.out.println(x3 + y + z);
    x3 = y = z = 50;
    System.out.println(x3 + y + z);
    float f1 = 35e3f;
    double d1 = 12E4d;
    double myDouble = 19.99d;
    float myFloat = 5.75f;
    long myLong = 15000000000L;
    short myShort = 5000;
    byte myByte = 100;
    boolean isJavaFun = true;
    boolean isFishTasty = false;
    char myGrade = 'B';
    // ASCII
    char myVar1 = 65, myVar2 = 66, myVar3 = 67;
    int myInt = 9;
    myDouble = myInt; // Automatic casting: int to double.
    double myDouble2 = 9.78d;
    int myInt2 = (int) myDouble2;
    int sum1 = 100 + 50; // 150 (100 + 50)
    int sum4 = sum1 + 250; // 400 (150 + 250)
    int sum3 = sum4 + sum4; // 800 (400 + 400)
    String greeting = "Hello";
    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println("The length of the txt string is: " + txt.length());
    System.out.println(txt.toUpperCase()); // Outputs "HELLO WORLD"
    System.out.println(txt.toLowerCase()); // Outputs "hello world"
    String findLocate = "Please locate where 'locate' occurs!";
    System.out.println(findLocate.indexOf("locate"));
    System.out.println(firstName + " " + lastName);
    System.out.println(firstName.concat(lastName));
    String xStr = "10";
    String yStr = "20";
    String zStr = xStr + yStr; // z will be 1020 (a String)
    int yInt = 20;
    String zStr2 = xStr + yInt; // z will be 1020 (a String)
    System.out.println("We are the so-called \"Vikings\" from the north.");
    System.out.println("It's alright.");
    System.out.println("The character \\ is called backslash.");
    Math.max(5, 10);
    Math.min(5, 10);
    Math.sqrt(64);
    Math.abs(-4.7);
    Math.random();
    int randomNum = (int) (Math.random() * 101); // 0 to 100
    System.out.println(isJavaFun); // Outputs true
    System.out.println(isFishTasty); // Outputs false
    int myAge = 25;
    int votingAge = 18;
    int time = 22;
    if (time < 10) {
      System.out.println("Good morning.");
    } else if (time < 18) {
      System.out.println("Good day.");
    } else {
      System.out.println("Good evening.");
    }
    int day = 4;
    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
    }
    // Outputs "Thursday" (day 4)
    switch (day) {
      case 6:
        System.out.println("Today is Saturday");
        break;
      case 7:
        System.out.println("Today is Sunday");
        break;
      default:
        System.out.println("Looking forward to the Weekend");
    }
    // Outputs "Looking forward to the Weekend"
    int iWhile = 0;
    while (iWhile < 5) {
      System.out.println(iWhile);
      iWhile++;
    }
    iWhile = 0;
    do {
      System.out.println(iWhile);
      iWhile++;
    } while (iWhile < 5);
    for (int iWhile2 = 0; iWhile2 < 5; iWhile2++) {
      System.out.println(iWhile2);
    }
    for (int iWhile3 = 0; iWhile3 <= 10; iWhile3 = iWhile3 + 2) {
      System.out.println(iWhile3);
    }
    // Outer loop
    for (int iOL = 1; iOL <= 2; iOL++) {
      System.out.println("Outer: " + iOL); // Executes 2 times
      // Inner loop
      for (int j = 1; j <= 3; j++) {
        System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
      }
      /*
       * for (type variableName : arrayName) {
       * // code block to be executed
       * }
       */
      String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
      for (String car : cars) {
        System.out.println(car);
      }
      for (int iFL = 0; iFL < 10; iFL++) {
        if (iFL == 4) {
          break;
        }
        System.out.println(i);
      }
      // Break también se puede utilizar para salir de un bucle.
      for (int iB = 0; iB < 10; iB++) {
        if (iB == 4) {
          break;
        }
        System.out.println(iB);
      }
      // Continue interrumpe una iteración (en el bucle), si se produce una condición
      // específica, y continúa con la siguiente iteración en el bucle.
      for (int iC = 0; iC < 10; iC++) {
        if (iC == 4) {
          continue;
        }
        System.out.println(i);
      }
    }
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    int[] myNum2 = {10, 20, 30, 40};
    System.out.println(cars[0]);
    // Outputs Volvo
    cars[0] = "Opel";
    System.out.println(cars[0]);
    // Now outputs Opel instead of Volvo
    System.out.println(cars.length);
    // Outputs 4
    for (i = 0; i < cars.length; i++) {
      System.out.println(cars[i]);
    }
    for (String car : cars) {
      System.out.println(car);
    }
    int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
    System.out.println(myNumbers[1][2]); // Outputs 7
    myNumbers[1][2] = 9;
    System.out.println(myNumbers[1][2]); // Outputs 9 instead of 7
    for (i = 0; i < myNumbers.length; ++i) {
      for (int j = 0; j < myNumbers[i].length; ++j) {
        System.out.println(myNumbers[i][j]);
      }
    }
    // Create a HashMap object called people
    java.util.HashMap<String, Integer> people = new java.util.HashMap<String, Integer>();
    // Add keys and values (Name, Age)
    people.put("John", 32);
    people.put("Steve", 30);
    people.put("Angie", 33);
    for (String p : people.keySet()) {
      System.out.println("key: " + p + " value: " + people.get(p));
    }
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();
    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);
    capitalCities.get("England");
    capitalCities.remove("England");
    capitalCities.clear();
    // Print keys
    for (String cCK : capitalCities.keySet()) {
      System.out.println(cCK);
    }
    // Print values
    for (String cCV : capitalCities.values()) {
      System.out.println(cCV);
    }
    // Print keys and values
    for (String cCK : capitalCities.keySet()) {
      System.out.println("key: " + cCK + " value: " + capitalCities.get(cCK));
    }
    String colorModeSelected = "Dark";
    switch (colorModeSelected) {
      case "Light":
        System.out.println("Light mode selected");
        break;
      case "Dark":
        System.out.println("Dark mode selected");
        break;
      case "Blue":
        System.out.println("Blue mode selected");
        break;
      case "Black":
        System.out.println("Black mode selected");
        break;
      case "Grey":
        System.out.println("Grey mode selected");
        break;
      default:
        System.out.println("No mode selected");
    }
    String serviceName = "ObtieneDatosInforme_2";
    String[] serviceNameArray = serviceName.split("_");
    System.out.println(Arrays.toString(serviceNameArray));
    HashSet<String> carsHS = new HashSet<String>();
    carsHS.add("Volvo");
    carsHS.add("BMW");
    carsHS.add("Ford");
    carsHS.add("BMW");
    carsHS.add("Mazda");
    System.out.println(carsHS);
    carsHS.contains("Mazda");
    carsHS.remove("Volvo");
    carsHS.clear();
    carsHS.size();
    for (String car : cars) {
      System.out.println(car);
    }
    Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("Visit W3Schools!");
    boolean matchFound = matcher.find();
    if (matchFound) {
      System.out.println("Match found");
    } else {
      System.out.println("Match not found");
    }
    // Make a collection
    ArrayList<String> carsAL = new ArrayList<String>();
    carsAL.add("Volvo");
    carsAL.add("BMW");
    carsAL.add("Ford");
    carsAL.add("Mazda");
    // Get the iterator
    Iterator<String> it = carsAL.iterator();
    // Print the first item
    System.out.println(it.next());
    while (it.hasNext()) {
      System.out.println(it.next());
    }
    ArrayList<Integer> numbersAL = new ArrayList<Integer>();
    numbersAL.add(12);
    numbersAL.add(8);
    numbersAL.add(2);
    numbersAL.add(23);
    Iterator<Integer> numberIt = numbersAL.iterator();
    while (numberIt.hasNext()) {
      Integer intIt = numberIt.next();
      if (intIt < 10) {
        numberIt.remove();
      }
    }
    System.out.println(numbers);
    // Create a HashSet object called numbers
    HashSet<Integer> numbersHS = new HashSet<Integer>();
    // Add values to the set
    numbersHS.add(4);
    numbersHS.add(7);
    numbersHS.add(8);
    // Show which numbers between 1 and 10 are in the set
    for (i = 1; i <= 10; i++) {
      if (numbersHS.contains(i)) {
        System.out.println(i + " was found in the set.");
      } else {
        System.out.println(i + " was not found in the set.");
      }
    }
    try {
      int[] myNumbersObject = {1, 2, 3};
      System.out.println(myNumbersObject[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    } finally {
      System.out.println("The 'try catch' is finished.");
    }
    try {
      int[] myNumbers2 = {1, 2, 3};
      System.out.println(myNumbers2[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    }
    // Update amount and print its value
    int amount = 0;
    System.out.println("Main: " + amount);
    amount++;
    System.out.println("Main: " + amount);
    Scanner myObj2 = new Scanner(System.in); // Create a Scanner object
    System.out.println("Enter username");
    String userName = myObj2.nextLine(); // Read user input
    System.out.println("Username is: " + userName); // Output user input
    Scanner myObj3 = new Scanner(System.in);
    System.out.println("Enter name, age and salary:");
    // String input
    String nameNL = myObj3.nextLine();
    // Numerical input
    int ageNI = myObj3.nextInt();
    double salaryND = myObj3.nextDouble();
    // Output input by user
    System.out.println("Name: " + nameNL);
    System.out.println("Age: " + ageNI);
    System.out.println("Salary: " + salaryND);
    // Lower Camel Case
    int soyUnNumeroInt = 10;
    // Constant
    int _SOYUNACONSTANTE = 10;
    var salary2 = 1000; // INT
    var pension2 = salary2 * 0.03; // DOUBLE
    var totalSalary2 = salary2 - pension2; // DOUBLE
    // Incremento postfijo:
    int vidas2 = 5;
    int regalo2 = 100 + vidas2++;
    System.out.println("Regalo: " + regalo + ", vidas: " + vidas);
    // Regalo: 105, vidas: 6
    // Incremento prefijo:
    int vidas3 = 5;
    int regalo3 = 100 + ++vidas3;
    System.out.println("Regalo: " + regalo + ", vidas: " + vidas);
    // Regalo: 106, vidas: 6
// Estimación:
    int dogsQuantity2 = 30;
    double monthlyDogs2 = dogsQuantity2 / 12.0;
// monthlyDogs: 2.5 (pero no es posible, ¡no rescatamos medio perrito!)
    int estimatedMonthlyDogs2 = (int) monthlyDogs2;
// estimatedMonthlyDogs: 2

// HASTA JAVA 11
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
// DESDE JAVA 12
    int edadJ12 = 1;
    switch (edadJ12) {
      case 1 -> System.out.println("¡Tienes 1 año!");
      case 20 -> System.out.println("Tienes 20 años!");
      default -> System.out.println("Tu edad no es 1 ni 20");
    }
    switch (colorModeSelected) {
      case "Light":
        System.out.println("Seleccionaste Light Mode");
        break;
      case "Night": //Ambar
        System.out.println("Seleccionaste Night Mode");
        break;
      case "Blue Dark":
        System.out.println("Seleccionaste Blue Dark Mode");
        break;
    }
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
   *
   * @param quantity Descripción del parámetro quantity
   * @return Descripción del valor que devolvemos en esta función
   * @throws IllegalArgumentException if the age is negative
   * @author Guillermo Morales
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

  static class OuterClass {
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
      for (int i = 0; i < 10; i++)
        new Thread(new Runnable() {
          public void run() {
            System.out.println("Inside loop class.");
          }
        }).start();
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

    public void fullThrottle() {
      System.out.println("The car is going as fast as it can!");
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