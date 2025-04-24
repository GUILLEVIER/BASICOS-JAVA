package com.guillevier.resumen.clases.hilos.ejemplos.threads;

// LISTO
/*
Este código extiende la clase Thread. Al hacerlo,
MyThread se convierte en una subclase de Thread,
y puedes sobrescribir el método run() para definir el comportamiento del hilo.

Para iniciar el hilo, se crea una instancia de MyThread y se llama al método start(),
que a su vez invoca el método run() en un nuevo hilo.

Al extender Thread, no puedes extender otra clase al mismo tiempo,
ya que Java no permite la herencia múltiple.
Esto puede ser una limitación si necesitas heredar de otra clase.

Es más simple y directo para casos donde solo necesitas un hilo
y no necesitas compartir el comportamiento del hilo entre diferentes clases.
 */
public class MyThread extends Thread {
  @Override
  public void run() {
    System.out.println("This code is running in a thread...");
  }

  public static void main(String[] args) {
    MyThread myThread = new MyThread();
    myThread.start();
  }
}