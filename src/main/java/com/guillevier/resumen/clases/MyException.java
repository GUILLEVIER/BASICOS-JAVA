package com.guillevier.resumen.clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyException {
	public static void main(String[] args) {
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
	}
}