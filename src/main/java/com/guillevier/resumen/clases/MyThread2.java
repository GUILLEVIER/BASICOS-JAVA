package com.guillevier.resumen.clases;

// LISTO
/*
Este código implementa la interfaz Runnable.
En este caso, MyThread2 no extiende Thread,
sino que implementa la interfaz Runnable, que requiere que se sobrescriba el método run().

Para ejecutar el hilo, se crea una instancia de Thread,
pasando la instancia de MyThread2 como argumento al constructor de Thread,
y luego se llama al método start() en la instancia de Thread.

Al implementar Runnable, puedes seguir extendiendo otra clase,
lo que proporciona más flexibilidad. Esto es útil si necesitas heredar de una clase base
y también quieres ejecutar código en un hilo.

Es más adecuado para situaciones donde se necesita pasar el mismo objeto
Runnable a múltiples hilos, lo que permite compartir el mismo código de ejecución entre
diferentes hilos.

También se imprime un mensaje adicional "This code is outside of the thread..."
en el hilo principal, lo que demuestra que el hilo principal y el hilo
creado están ejecutándose de manera concurrente.
 */
public class MyThread2 implements Runnable {
  @Override
  public void run() {
    System.out.println("This code is running in a thread...");
  }

  public static void main(String[] args) {
    MyThread2 obj = new MyThread2();
    Thread thread = new Thread(obj);
    thread.start();
    System.out.println("This code is outside of the thread...");
  }
}