package com.guillevier.resumen.clases;

public class MyThread2 implements Runnable {
  public static void main(String[] args) {
    MyThread2 obj = new MyThread2();
    Thread thread = new Thread(obj);
    thread.start();
    System.out.println("This code is outside of the thread");
  }

  @Override
  public void run() {
    System.out.println("This code is running in a thread");
  }
}