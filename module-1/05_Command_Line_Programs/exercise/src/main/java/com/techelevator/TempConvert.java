package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What temperature do you want to convert?");
		double tempToConvert = (double) scanner.nextInt();
		System.out.println("F or C");
		scanner.nextLine();
		String forC = scanner.nextLine();
		double convertedTemp = 0;
		if (forC.equals("F") ) {
			convertedTemp = (tempToConvert - 32) / 1.8;
			System.out.println(convertedTemp + "°C");
		}
		if (forC.equals("C")) {
			convertedTemp = tempToConvert * 1.8 + 32;
			System.out.println( tempToConvert + "°C is " +convertedTemp + "°F");
		}
	}

}
