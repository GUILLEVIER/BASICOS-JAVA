package com.guillevier.resumen.clases;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

// LISTO
public class LocalDate {
  public static void main(String[] args) {
    // 2024-08-28
    java.time.LocalDate localDate = java.time.LocalDate.now(); // Create a date object
    System.out.println(localDate); // Display the current date

    // 05:39:48.389961544
    LocalTime localTime = LocalTime.now();
    System.out.println(localTime);

    // 2024-08-28T05:40:12.818515987
    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime);

    /*
    Before formatting: 2024-08-28T05:40:42.257691453
    After formatting: 28-08-2024 05:40:42
    */
    LocalDateTime date = LocalDateTime.now();
    System.out.println("Before formatting: " + date);
    DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String formattedDate = date.format(formatDate);
    System.out.println("After formatting: " + formattedDate);
  }
}