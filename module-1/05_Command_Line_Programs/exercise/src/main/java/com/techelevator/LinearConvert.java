package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the length:");
		double lengthToConvert = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Is the measurement in (m)eter, or (f)eet?");
		String mOrf = scanner.nextLine();
		double convertedLength = 0;

		if(mOrf.equals("m"));{
			convertedLength = lengthToConvert*3.2808399;
			System.out.println(lengthToConvert+"m is "+ (int)convertedLength + "f");
		}
		if (mOrf.equals("f")) {
			convertedLength = lengthToConvert*0.3048;
			System.out.println(lengthToConvert+"f is "+ (int)convertedLength + "m");
		}
	}

}
