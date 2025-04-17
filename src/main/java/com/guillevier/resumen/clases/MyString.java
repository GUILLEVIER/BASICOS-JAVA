package com.guillevier.resumen.clases;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// LISTO
public class MyString {
  public static void main(String[] args) {
    String originalStr = "Hello";
    StringBuilder reversedStr = new StringBuilder();
    for (int i = 0; i < originalStr.length(); i++) {
      reversedStr.insert(0, originalStr.charAt(i));
    }
    System.out.println("Reversed string: " + reversedStr);
    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println("The length of the txt string is: " + txt.length());
    System.out.println(txt.toUpperCase());
    System.out.println(txt.toLowerCase());
    String findLocate = "Please locate where 'locate' occurs!";
    System.out.println(findLocate.indexOf("locate"));
    System.out.println(txt + " " + findLocate);
    System.out.println(txt.concat(findLocate));
    System.out.println("We are the so-called \"Vikings\" from the north.");
    System.out.println("It's alright.");
    System.out.println("The character \\ is called backslash.");
    String serviceName = "ObtieneDatosInforme_2";
    String[] serviceNameArray = serviceName.split("_");
    System.out.println(Arrays.toString(serviceNameArray));
    Pattern pattern = Pattern.compile("Guillermo", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("Guillermo Morales");
    boolean matchFound = matcher.find();
    if (matchFound) {
      System.out.println("Match found");
    } else {
      System.out.println("Match not found");
    }
    // CORTAR PALABRAS
    String words = "One Two Three Four";
    int countWords = words.split("\\s").length;
    System.out.println(countWords);
  }
}