package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What value do you want to check");
		int numberToCheck = scanner.nextInt();
		int[] fibbonacciArray = new int[47];
		fibbonacciArray[0] = 0;
		fibbonacciArray[1] = 1;
		for (int i = 0; i < fibbonacciArray.length - 2; i++) {
			fibbonacciArray[i + 2] = fibbonacciArray[i] + fibbonacciArray[i + 1];
		}
		for (int i = 0; i < fibbonacciArray.length; i++) {
			if (fibbonacciArray[i] <= numberToCheck) {
				System.out.print(fibbonacciArray[i] + " ");
			}


		}

	}
}


