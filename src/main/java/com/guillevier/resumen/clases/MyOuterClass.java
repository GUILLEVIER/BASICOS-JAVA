package com.guillevier.resumen.clases;

public class MyOuterClass {
		static class OuterClass {
			private int a = 10;

			// INNER CLASSES
			class InnerClass {
				void display() {
					System.out.println("Value of a is: " + a);
				}
			}

			// LOCAL CLASSES
			void display() {
				class LocalClass {
					void print() {
						System.out.println("Inside local class.");
					}
				}
				LocalClass obj = new LocalClass();
				obj.print();
			}

			// ANONYMOUS CLASSES
			void displayTwo() {
				new Thread(new Runnable() {
					public void run() {
						System.out.println("Inside anonymous class.");
					}
				}).start();
			}

			// LOOP CLASSES
			void displayThree() {
				for (int i = 0; i < 10; i++)
					new Thread(new Runnable() {
						public void run() {
							System.out.println("Inside loop class.");
						}
					}).start();
			}
		}
}