package com.guillevier.resumen.clases;

class SwitchStatement {
	public static void main(String[] args) {
		String profe = "";
		switch (profe) {
			case "Anahí":
				System.out.println("¡Profesora de Java!");
				break;
			case "Oscar":
				System.out.println("¡Profesor de React.js!");
				break;
			case "JuanDC":
				System.out.println("Oye niño, ¿qué haces aquí?");
				break;
			default:
				System.out.println("¡Un nuevo profe!");
				break;
		}
		/* DESDE JAVA 12:
		int edad = 0;
		switch (edad) {
			case 1 -> System.out.println("¡Tienes 1 año!");
			case 20 -> System.out.println("Tienes 20 años!");
			default -> System.out.println("Tu edad no es 1 ni 20");
		}
		*/
		int number = 5;
		switch (number) {
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			default:
				System.out.println("Number not found");
				break;
		}

		int day = 4;
		switch (day) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
		}
		// Outputs "Thursday" (day 4)
		switch (day) {
			case 6:
				System.out.println("Today is Saturday");
				break;
			case 7:
				System.out.println("Today is Sunday");
				break;
			default:
				System.out.println("Looking forward to the Weekend");
		}
		// Outputs "Looking forward to the Weekend"

		String colorModeSelected = "Dark";
		switch (colorModeSelected) {
			case "Light":
				System.out.println("Light mode selected");
				break;
			case "Dark":
				System.out.println("Dark mode selected");
				break;
			case "Blue":
				System.out.println("Blue mode selected");
				break;
			case "Black":
				System.out.println("Black mode selected");
				break;
			case "Grey":
				System.out.println("Grey mode selected");
				break;
			default:
				System.out.println("No mode selected");
		}
	}
}