package com.guillevier.resumen.clases;

public class MyThread extends Thread {
  @Override
  public void run() {
    System.out.println("This code is running in a thread");
  }
}