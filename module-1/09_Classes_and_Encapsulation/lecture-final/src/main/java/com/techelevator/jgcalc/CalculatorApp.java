package com.techelevator.jgcalc;

import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {


        Calculator calc = new Calculator();   // instantiating a calculator obj
        calc.setBrand("Casio");               // calling the setters to update the values
        calc.setModel("NUMBERS200");
        calc.setOn(true);

        String modelOfCalculator = calc.getModel();
        System.out.println(modelOfCalculator);

        // now lets add some numbers
        Scanner scanner = new Scanner(System.in);

        System.out.println("PLease enter first number");
        int num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter number 2");
        String num2 = scanner.nextLine();
        int num2AsInt = Integer.parseInt(num2);

        int sum = calc.add(num1, num2AsInt);
        System.out.println("first number " + num1 + " plus second number " + num2AsInt +  " equals --> " + sum);

        int[] numsToAdd = new int[] {12,23,32,12,43};

        System.out.println(calc.add(numsToAdd));


        int result = calc.add(numsToAdd);
        System.out.println(result);

    }

}
