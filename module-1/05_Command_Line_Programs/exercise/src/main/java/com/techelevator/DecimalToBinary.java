package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter in a series of decimal values (separated by spaces):");
        String decimalNumbers = scanner.nextLine();
        String[] splitDecimals = decimalNumbers.split(" ");
        int[] arrayOfDecimalsAsInt = new int[splitDecimals.length];

        for (int i = 0; i < splitDecimals.length; i++) {
            arrayOfDecimalsAsInt[i] = Integer.parseInt(splitDecimals[i]);
            int binary[] = new int[100];
            int lengthInBinary = 0;
            int num = arrayOfDecimalsAsInt[i];

            while (num>0)
            {
                binary[lengthInBinary] = num%2;
                num = num/2;
                lengthInBinary++;
            }
            System.out.print(arrayOfDecimalsAsInt[i] + " in binary is ");
            if (lengthInBinary ==0) {
                System.out.print(0);
            }
            else {
                for (int x = lengthInBinary - 1; x >= 0; x--) {
                    System.out.print(binary[x]);
                }
            }
            System.out.println();


        }


        }


        }












