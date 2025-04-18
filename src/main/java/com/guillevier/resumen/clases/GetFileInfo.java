package com.guillevier.resumen.clases;

import java.io.File;

// LISTO
public class GetFileInfo {
  public static void main(String[] args) {
    File myFile = new File("filename.txt");
    if (myFile.exists()) {
      System.out.println("File name: " + myFile.getName());
      System.out.println("Absolute path: " + myFile.getAbsolutePath());
      System.out.println("Writeable: " + myFile.canWrite());
      System.out.println("Readable " + myFile.canRead());
      System.out.println("File size in bytes " + myFile.length());
    } else {
      System.out.println("The file does not exist.");
    }
  }
}