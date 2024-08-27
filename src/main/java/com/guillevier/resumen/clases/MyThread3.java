package com.guillevier.resumen.clases;

public class MyThread3 extends Thread {
  public static void main(String[] args) {
    MyThread3 thread = new MyThread3();
    thread.start();
    System.out.println("This code is outside of the thread");
  }

  @Override
  public void run() {
    System.out.println("This code is running in a thread");
  }
}