package com.guillevier.resumen.clases;

public class MyOuterClassTwo {
	public static void main() {
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
	}
}