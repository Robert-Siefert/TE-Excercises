package com.techelevator;

import java.util.Scanner;

public class BartsVacation {

    public static void main(String[] args) {

        Scanner keyboardInput = new Scanner(System.in);



        boolean isThere = false;

        while (!isThere) {

            System.out.println("Are we there yet? (Y) or (N)");

            String answer = keyboardInput.nextLine();


            System.out.println("You answered: " + answer);

            if (answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("Y")) {
                System.out.println("Cowabunga!!!!");
                isThere = true;
            }
            else {
                System.out.println("Eat my shorts!");
            }

        }

        System.out.println("Exiting!!!");





    }


}
