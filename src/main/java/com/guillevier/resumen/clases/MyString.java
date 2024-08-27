package com.guillevier.resumen.clases;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyString {

	public static void main(String[] args) {
		String originalStr = "Hello";
		String reversedStr = "";
		for (int i = 0; i < originalStr.length(); i++) {
			reversedStr = originalStr.charAt(i) + reversedStr;
		}
		System.out.println("Reversed string: " + reversedStr);

		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + txt.length());
		System.out.println(txt.toUpperCase()); // Outputs "HELLO WORLD"
		System.out.println(txt.toLowerCase()); // Outputs "hello world"
		String findLocate = "Please locate where 'locate' occurs!";
		System.out.println(findLocate.indexOf("locate"));

		System.out.println(txt + " " + findLocate);
		System.out.println(txt.concat(findLocate));

		String xStr = "10";
		String yStr = "20";
		String zStr = xStr + yStr; // z will be 1020 (a String)
		int yInt = 20;
		String zStr2 = xStr + yInt; // z will be 1020 (a String)

		System.out.println("We are the so-called \"Vikings\" from the north.");
		System.out.println("It's alright.");
		System.out.println("The character \\ is called backslash.");

		String serviceName = "ObtieneDatosInforme_2";
		String[] serviceNameArray = serviceName.split("_");
		System.out.println(Arrays.toString(serviceNameArray));

		Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("Visit W3Schools!");
		boolean matchFound = matcher.find();
		if (matchFound) {
			System.out.println("Match found");
		} else {
			System.out.println("Match not found");
		}
	}
}