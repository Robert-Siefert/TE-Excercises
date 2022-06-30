package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		int[] nums = new int[]{ 9, 2, 3, 7, 5, 6, 4, 8, };
		int maxSoFar = 0;
		int minSoFar = 999;
		int rightIndex = -1;
		int leftIndex = -1;
		for(int i = 0; i < nums.length; i++){
			if (nums[i] > maxSoFar) {
				maxSoFar = nums[i];

			}
			if (nums[i] < maxSoFar) {
				rightIndex = i;
			}
		}
		for (int j = nums.length-1;j>=0;j--) {
			if (nums[j] < minSoFar) {
				minSoFar = nums[j];

			}
			if (nums[j] > minSoFar){
				leftIndex = j;
			}
		}

		System.out.println("First index:" + leftIndex + " SecondIndex:" + rightIndex);








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


