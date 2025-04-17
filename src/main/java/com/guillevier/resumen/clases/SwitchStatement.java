package com.guillevier.resumen.clases;

// LISTO
class SwitchStatement {
  public static void main(String[] args) {
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
  }
}